package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p3.o;

/* compiled from: MyApplication */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f4581h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f4582i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f4583j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f4584k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f4585l;

    /* renamed from: q, reason: collision with root package name */
    private static m f4590q;

    /* renamed from: r, reason: collision with root package name */
    private static n f4591r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4592a;

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f4586m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f4587n = new com.google.android.gms.dynamite.b();

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f4588o = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final b f4575b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final b f4576c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final b f4577d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final b f4578e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final b f4579f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final b f4580g = new i();

    /* renamed from: p, reason: collision with root package name */
    public static final b f4589p = new j();

    /* compiled from: MyApplication */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* compiled from: MyApplication */
    public static class a extends Exception {
        /* synthetic */ a(String str, x3.e eVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, x3.e eVar) {
            super(str, th);
        }
    }

    /* compiled from: MyApplication */
    public interface b {

        /* compiled from: MyApplication */
        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z7);
        }

        /* compiled from: MyApplication */
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0078b {

            /* renamed from: a, reason: collision with root package name */
            public int f4593a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f4594b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f4595c = 0;
        }

        C0078b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        o.m(context);
        this.f4592a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (p3.n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    public static DynamiteModule e(Context context, b bVar, String str) {
        long j7;
        DynamiteModule h8;
        Boolean bool;
        w3.a D2;
        DynamiteModule dynamiteModule;
        n nVar;
        boolean z7;
        w3.a r02;
        Context applicationContext = context.getApplicationContext();
        x3.e eVar = null;
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f4586m;
        k kVar = (k) threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal threadLocal2 = f4587n;
        Long l7 = (Long) threadLocal2.get();
        long longValue = l7.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0078b a8 = bVar.a(context, str, f4588o);
            int i7 = a8.f4593a;
            j7 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i7 + " and remote module " + str + ":" + a8.f4594b);
                int i8 = a8.f4595c;
                if (i8 != 0) {
                    if (i8 == -1) {
                        if (a8.f4593a != 0) {
                            i8 = -1;
                        }
                    }
                    if (i8 != 1 || a8.f4594b != 0) {
                        if (i8 == -1) {
                            h8 = h(applicationContext, str);
                        } else {
                            if (i8 != 1) {
                                throw new a("VersionPolicy returned invalid code:" + i8, null);
                            }
                            try {
                                int i9 = a8.f4594b;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (!k(context)) {
                                            throw new a("Remote loading disabled", null);
                                        }
                                        bool = f4581h;
                                    }
                                    if (bool == null) {
                                        throw new a("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i9);
                                        synchronized (DynamiteModule.class) {
                                            nVar = f4591r;
                                        }
                                        if (nVar == null) {
                                            throw new a("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        k kVar3 = (k) threadLocal.get();
                                        if (kVar3 == null || kVar3.f4596a == null) {
                                            throw new a("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor = kVar3.f4596a;
                                        w3.b.C1(null);
                                        synchronized (DynamiteModule.class) {
                                            z7 = f4584k >= 2;
                                        }
                                        if (z7) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            r02 = nVar.C1(w3.b.C1(applicationContext2), str, i9, w3.b.C1(cursor));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            r02 = nVar.r0(w3.b.C1(applicationContext2), str, i9, w3.b.C1(cursor));
                                        }
                                        Context context2 = (Context) w3.b.r0(r02);
                                        if (context2 == null) {
                                            throw new a("Failed to get module context", eVar);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i9);
                                        m l8 = l(context);
                                        if (l8 == null) {
                                            throw new a("Failed to create IDynamiteLoader.", null);
                                        }
                                        int c8 = l8.c();
                                        if (c8 >= 3) {
                                            k kVar4 = (k) threadLocal.get();
                                            if (kVar4 == null) {
                                                throw new a("No cached result cursor holder", null);
                                            }
                                            D2 = l8.H2(w3.b.C1(context), str, i9, w3.b.C1(kVar4.f4596a));
                                        } else if (c8 == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            D2 = l8.v3(w3.b.C1(context), str, i9);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            D2 = l8.D2(w3.b.C1(context), str, i9);
                                        }
                                        Object r03 = w3.b.r0(D2);
                                        if (r03 == null) {
                                            throw new a("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) r03);
                                    }
                                    h8 = dynamiteModule;
                                } catch (RemoteException e8) {
                                    throw new a("Failed to load remote module.", e8, null);
                                } catch (a e9) {
                                    throw e9;
                                } catch (Throwable th) {
                                    com.google.android.gms.common.util.g.a(context, th);
                                    throw new a("Failed to load remote module.", th, null);
                                }
                            } catch (a e10) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e10.getMessage());
                                int i10 = a8.f4593a;
                                if (i10 == 0 || bVar.a(context, str, new l(i10, 0)).f4595c != -1) {
                                    throw new a("Remote load failed. No local fallback found.", e10, null);
                                }
                                h8 = h(applicationContext, str);
                            }
                        }
                        if (longValue == 0) {
                            f4587n.remove();
                        } else {
                            f4587n.set(l7);
                        }
                        Cursor cursor2 = kVar2.f4596a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        f4586m.set(kVar);
                        return h8;
                    }
                }
                throw new a("No acceptable module " + str + " found. Local version is " + a8.f4593a + " and remote version is " + a8.f4594b + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (longValue == j7) {
                    f4587n.remove();
                } else {
                    f4587n.set(l7);
                }
                Cursor cursor3 = kVar2.f4596a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f4586m.set(kVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j7 = 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c7 -> B:24:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01c9 -> B:24:0x01cc). Please report as a decompilation issue!!! */
    public static int f(Context context, String str, boolean z7) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f4581h;
                int i7 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e8) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e8.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!k(context)) {
                                return 0;
                            }
                            if (!f4583j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g8 = g(context, str, z7, true);
                                        String str2 = f4582i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a8 = x3.d.a();
                                            if (a8 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    x3.b.a();
                                                    String str3 = f4582i;
                                                    o.m(str3);
                                                    a8 = x3.a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f4582i;
                                                    o.m(str4);
                                                    a8 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a8);
                                            declaredField.set(null, a8);
                                            f4581h = bool2;
                                            return g8;
                                        }
                                        return g8;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f4581h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z7, false);
                    } catch (a e9) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e9.getMessage());
                        return 0;
                    }
                }
                m l7 = l(context);
                try {
                    if (l7 != null) {
                        try {
                            int c8 = l7.c();
                            if (c8 >= 3) {
                                k kVar = (k) f4586m.get();
                                if (kVar == null || (cursor = kVar.f4596a) == null) {
                                    Cursor cursor2 = (Cursor) w3.b.r0(l7.a4(w3.b.C1(context), str, z7, ((Long) f4587n.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i8 = cursor2.getInt(0);
                                                r2 = (i8 <= 0 || !j(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i7 = i8;
                                            }
                                        } catch (RemoteException e10) {
                                            remoteException = e10;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 == null) {
                                                throw th;
                                            }
                                            r2.close();
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i7 = cursor.getInt(0);
                                }
                            } else if (c8 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i7 = l7.C1(w3.b.C1(context), str, z7);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i7 = l7.r0(w3.b.C1(context), str, z7);
                            }
                        } catch (RemoteException e11) {
                            remoteException = e11;
                        }
                    }
                    return i7;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.common.util.g.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0148, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0144: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:325), block:B:115:0x0144 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        x3.e eVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f4591r = nVar;
        } catch (ClassNotFoundException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, eVar);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, eVar);
        } catch (InstantiationException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, eVar);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, eVar);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, eVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f4586m.get();
        if (kVar == null || kVar.f4596a != null) {
            return false;
        }
        kVar.f4596a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f4585l)) {
            return true;
        }
        boolean z7 = false;
        if (f4585l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != com.google.android.gms.common.util.n.h() ? 0 : 268435456);
            if (k3.h.h().j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z7 = true;
            }
            f4585l = Boolean.valueOf(z7);
            if (z7 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4583j = true;
            }
        }
        if (!z7) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z7;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f4590q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f4590q = mVar;
                    return mVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.f4592a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f4592a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }
}
