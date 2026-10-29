package k1;

import android.content.Context;

/* compiled from: MyApplication */
public class h {

    /* renamed from: e, reason: collision with root package name */
    private static h f24369e;

    /* renamed from: a, reason: collision with root package name */
    private a f24370a;

    /* renamed from: b, reason: collision with root package name */
    private b f24371b;

    /* renamed from: c, reason: collision with root package name */
    private f f24372c;

    /* renamed from: d, reason: collision with root package name */
    private g f24373d;

    private h(Context context, o1.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f24370a = new a(applicationContext, aVar);
        this.f24371b = new b(applicationContext, aVar);
        this.f24372c = new f(applicationContext, aVar);
        this.f24373d = new g(applicationContext, aVar);
    }

    public static synchronized h c(Context context, o1.a aVar) {
        h hVar;
        synchronized (h.class) {
            try {
                if (f24369e == null) {
                    f24369e = new h(context, aVar);
                }
                hVar = f24369e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public a a() {
        return this.f24370a;
    }

    public b b() {
        return this.f24371b;
    }

    public f d() {
        return this.f24372c;
    }

    public g e() {
        return this.f24373d;
    }
}
