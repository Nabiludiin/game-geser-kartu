package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class ag0 implements cg0 {

    /* renamed from: l, reason: collision with root package name */
    private static final Object f4922l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static cg0 f4923m;

    /* renamed from: n, reason: collision with root package name */
    static cg0 f4924n;

    /* renamed from: o, reason: collision with root package name */
    static cg0 f4925o;

    /* renamed from: p, reason: collision with root package name */
    static Boolean f4926p;

    /* renamed from: a, reason: collision with root package name */
    private final Object f4927a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4928b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f4929c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f4930d;

    /* renamed from: e, reason: collision with root package name */
    private final w2.a f4931e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f4932f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4933g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4934h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f4935i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4936j;

    /* renamed from: k, reason: collision with root package name */
    private Set f4937k;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected ag0(android.content.Context r3, w2.a r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f4927a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f4929c = r0
            com.google.android.gms.internal.ads.nf3.a()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f4930d = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f4935i = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.f4928b = r3
            r2.f4931e = r4
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.E8
            com.google.android.gms.internal.ads.sy r0 = s2.b0.c()
            java.lang.Object r4 = r0.d(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = w2.g.f27064b
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            u3.d r4 = u3.e.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.f(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.f4932f = r3
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.s8
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r4 = r4.d(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L82
            android.os.Handler r4 = w2.g.f27064b
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L83
        L82:
            r4 = r1
        L83:
            r2.f4933g = r4
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r3 = r4.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb2
            android.content.Context r3 = r2.f4928b
            android.os.Handler r4 = w2.g.f27064b
            if (r3 != 0) goto L9c
            goto Lb3
        L9c:
            u3.d r3 = u3.e.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.f(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            if (r3 != 0) goto Lab
            goto Lb3
        Lab:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            goto Lb3
        Lb2:
            r0 = r1
        Lb3:
            r2.f4934h = r0
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.o8
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r3 = r4.d(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto Lce
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f4937k = r3
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ag0.<init>(android.content.Context, w2.a):void");
    }

    public static cg0 c(Context context) {
        synchronized (f4922l) {
            try {
                if (f4923m == null) {
                    if (j(context)) {
                        f4923m = new ag0(context, w2.a.M0());
                    } else {
                        f4923m = new bg0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4923m;
    }

    public static cg0 d(Context context, w2.a aVar) {
        synchronized (f4922l) {
            try {
                if (f4925o == null) {
                    boolean z7 = false;
                    if (((Boolean) o00.f13123c.e()).booleanValue()) {
                        if (!((Boolean) s2.b0.c().d(uy.m8)).booleanValue() || ((Boolean) o00.f13121a.e()).booleanValue()) {
                            z7 = true;
                        }
                    }
                    if (j(context)) {
                        ag0 ag0Var = new ag0(context, aVar);
                        ag0Var.l();
                        ag0Var.k();
                        f4925o = ag0Var;
                    } else if (!z7 || context == null) {
                        f4925o = new bg0();
                    } else {
                        ag0 ag0Var2 = new ag0(context, aVar, true);
                        ag0Var2.l();
                        ag0Var2.k();
                        f4925o = ag0Var2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4925o;
    }

    public static cg0 e(Context context) {
        synchronized (f4922l) {
            try {
                if (f4924n == null) {
                    if (((Boolean) s2.b0.c().d(uy.n8)).booleanValue()) {
                        if (!((Boolean) s2.b0.c().d(uy.m8)).booleanValue()) {
                            f4924n = new ag0(context, w2.a.M0());
                        }
                    }
                    f4924n = new bg0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4924n;
    }

    public static cg0 f(Context context, w2.a aVar) {
        synchronized (f4922l) {
            try {
                if (f4924n == null) {
                    if (((Boolean) s2.b0.c().d(uy.n8)).booleanValue()) {
                        if (!((Boolean) s2.b0.c().d(uy.m8)).booleanValue()) {
                            f4924n = new ag0(context, aVar);
                        }
                    }
                    f4924n = new bg0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4924n;
    }

    public static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String h(Throwable th) {
        return iy3.a(w2.g.p(g(th)));
    }

    private static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (f4922l) {
            try {
                if (f4926p == null) {
                    f4926p = Boolean.valueOf(s2.z.e().nextInt(100) < ((Integer) s2.b0.c().d(uy.Ld)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f4926p.booleanValue()) {
            if (!((Boolean) s2.b0.c().d(uy.m8)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void k() {
        Thread.setDefaultUncaughtExceptionHandler(new xf0(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void l() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f4927a) {
            this.f4929c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new yf0(this, thread.getUncaughtExceptionHandler()));
    }

    @Override // com.google.android.gms.internal.ads.cg0
    public final void a(Throwable th, String str) {
        if (this.f4936j) {
            return;
        }
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.cg0
    public final void b(Throwable th, String str, float f8) {
        Throwable th2;
        boolean z7;
        String str2;
        PackageInfo f9;
        ActivityManager.MemoryInfo n7;
        if (this.f4936j) {
            return;
        }
        Handler handler = w2.g.f27064b;
        int i7 = 0;
        if (((Boolean) f10.f7959e.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z8 = ((Boolean) s2.b0.c().d(uy.H2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && w2.g.w(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (w2.g.w(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z8 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z8) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String g8 = g(th);
            String h8 = ((Boolean) s2.b0.c().d(uy.J9)).booleanValue() ? h(th) : "";
            double d8 = f8;
            double random = Math.random();
            int i8 = f8 > 0.0f ? (int) (1.0f / f8) : 1;
            if (random < d8) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    z7 = u3.e.a(this.f4928b).g();
                } catch (Throwable th5) {
                    w2.p.d("Error fetching instant app info", th5);
                    z7 = false;
                }
                try {
                    str2 = this.f4928b.getPackageName();
                } catch (Throwable unused) {
                    w2.p.f("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z7)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i9 = Build.VERSION.SDK_INT;
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i9));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + str4.length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str4);
                w2.a aVar = this.f4931e;
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", aVar.f27051q).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", g8).appendQueryParameter("eids", TextUtils.join(",", s2.b0.b().e())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "811902923").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i8)).appendQueryParameter("pb_tm", String.valueOf(f10.f7957c.e()));
                Context context = this.f4928b;
                Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(k3.h.h().b(context))).appendQueryParameter("lite", true != aVar.f27055u ? "0" : "1");
                if (!TextUtils.isEmpty(h8)) {
                    appendQueryParameter5.appendQueryParameter("hash", h8);
                }
                if (((Boolean) s2.b0.c().d(uy.t8)).booleanValue() && (n7 = w2.g.n(context)) != null) {
                    appendQueryParameter5.appendQueryParameter("available_memory", Long.toString(n7.availMem));
                    appendQueryParameter5.appendQueryParameter("total_memory", Long.toString(n7.totalMem));
                    appendQueryParameter5.appendQueryParameter("is_low_memory", true != n7.lowMemory ? "0" : "1");
                }
                if (((Boolean) s2.b0.c().d(uy.s8)).booleanValue()) {
                    String str5 = this.f4933g;
                    if (!TextUtils.isEmpty(str5)) {
                        appendQueryParameter5.appendQueryParameter("countrycode", str5);
                    }
                    String str6 = this.f4934h;
                    if (!TextUtils.isEmpty(str6)) {
                        appendQueryParameter5.appendQueryParameter("psv", str6);
                    }
                    if (i9 >= 26) {
                        f9 = WebView.getCurrentWebViewPackage();
                    } else {
                        if (context != null) {
                            try {
                                f9 = u3.e.a(context).f("com.android.webview", 128);
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        f9 = null;
                    }
                    if (f9 != null) {
                        appendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(f9.versionCode));
                        appendQueryParameter5.appendQueryParameter("wvvn", f9.versionName);
                        appendQueryParameter5.appendQueryParameter("wvpn", f9.packageName);
                    }
                }
                PackageInfo packageInfo = this.f4932f;
                if (packageInfo != null) {
                    appendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    appendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(appendQueryParameter5.toString());
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    final String str7 = (String) obj;
                    final w2.v vVar = new w2.v(this.f4928b, null);
                    this.f4930d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zf0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            w2.v.this.c(str7, null);
                        }
                    });
                }
            }
        }
    }

    protected final void i(Thread thread, Throwable th) {
        if (th != null) {
            boolean z7 = false;
            boolean z8 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z7 |= w2.g.w(stackTraceElement.getClassName());
                    z8 |= ag0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) s2.b0.c().d(uy.o8)).intValue();
            if (intValue > 0) {
                if (this.f4937k.size() >= intValue) {
                    return;
                }
                String h8 = h(th);
                if (this.f4937k.contains(h8)) {
                    return;
                } else {
                    this.f4937k.add(h8);
                }
            }
            if (!z7 || z8) {
                return;
            }
            if (!this.f4936j) {
                a(th, "");
            }
            if (this.f4935i.getAndSet(true) || !((Boolean) o00.f13123c.e()).booleanValue()) {
                return;
            }
            fy.b(this.f4928b);
        }
    }

    protected ag0(Context context, w2.a aVar, boolean z7) {
        this(context, aVar);
        this.f4936j = true;
    }
}
