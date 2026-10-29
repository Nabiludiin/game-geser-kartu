package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.i;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static final r.f f1783a = new r.f(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f1784b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f1785c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final r.h f1786d = new r.h();

    /* compiled from: MyApplication */
    class a implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1788b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1789c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1790d;

        a(String str, Context context, androidx.core.provider.e eVar, int i7) {
            this.f1787a = str;
            this.f1788b = context;
            this.f1789c = eVar;
            this.f1790d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f1787a, this.f1788b, this.f1789c, this.f1790d);
        }
    }

    /* compiled from: MyApplication */
    class b implements androidx.core.util.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.a f1791a;

        b(androidx.core.provider.a aVar) {
            this.f1791a = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f1791a.b(eVar);
        }
    }

    /* compiled from: MyApplication */
    class c implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1792a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f1793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.provider.e f1794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1795d;

        c(String str, Context context, androidx.core.provider.e eVar, int i7) {
            this.f1792a = str;
            this.f1793b = context;
            this.f1794c = eVar;
            this.f1795d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f1792a, this.f1793b, this.f1794c, this.f1795d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* compiled from: MyApplication */
    class d implements androidx.core.util.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1796a;

        d(String str) {
            this.f1796a = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f1785c) {
                try {
                    r.h hVar = f.f1786d;
                    ArrayList arrayList = (ArrayList) hVar.get(this.f1796a);
                    if (arrayList == null) {
                        return;
                    }
                    hVar.remove(this.f1796a);
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((androidx.core.util.a) arrayList.get(i7)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(androidx.core.provider.e eVar, int i7) {
        return eVar.d() + "-" + i7;
    }

    private static int b(g.a aVar) {
        int i7 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b8 = aVar.b();
        if (b8 != null && b8.length != 0) {
            i7 = 0;
            for (g.b bVar : b8) {
                int b9 = bVar.b();
                if (b9 != 0) {
                    if (b9 < 0) {
                        return -3;
                    }
                    return b9;
                }
            }
        }
        return i7;
    }

    static e c(String str, Context context, androidx.core.provider.e eVar, int i7) {
        r.f fVar = f1783a;
        Typeface typeface = (Typeface) fVar.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e8 = androidx.core.provider.d.e(context, eVar, null);
            int b8 = b(e8);
            if (b8 != 0) {
                return new e(b8);
            }
            Typeface b9 = i.b(context, null, e8.b(), i7);
            if (b9 == null) {
                return new e(-3);
            }
            fVar.d(str, b9);
            return new e(b9);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, androidx.core.provider.e eVar, int i7, Executor executor, androidx.core.provider.a aVar) {
        String a8 = a(eVar, i7);
        Typeface typeface = (Typeface) f1783a.c(a8);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f1785c) {
            try {
                r.h hVar = f1786d;
                ArrayList arrayList = (ArrayList) hVar.get(a8);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                hVar.put(a8, arrayList2);
                c cVar = new c(a8, context, eVar, i7);
                if (executor == null) {
                    executor = f1784b;
                }
                h.b(executor, cVar, new d(a8));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i7, int i8) {
        String a8 = a(eVar, i7);
        Typeface typeface = (Typeface) f1783a.c(a8);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i8 == -1) {
            e c8 = c(a8, context, eVar, i7);
            aVar.b(c8);
            return c8.f1797a;
        }
        try {
            e eVar2 = (e) h.c(f1784b, new a(a8, context, eVar, i7), i8);
            aVar.b(eVar2);
            return eVar2.f1797a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    /* compiled from: MyApplication */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f1797a;

        /* renamed from: b, reason: collision with root package name */
        final int f1798b;

        e(int i7) {
            this.f1797a = null;
            this.f1798b = i7;
        }

        boolean a() {
            return this.f1798b == 0;
        }

        e(Typeface typeface) {
            this.f1797a = typeface;
            this.f1798b = 0;
        }
    }
}
