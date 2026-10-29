package q6;

import java.io.Serializable;

/* compiled from: MyApplication */
public abstract class a implements u6.a, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f25687w = C0123a.f25694q;

    /* renamed from: q, reason: collision with root package name */
    private transient u6.a f25688q;

    /* renamed from: r, reason: collision with root package name */
    protected final Object f25689r;

    /* renamed from: s, reason: collision with root package name */
    private final Class f25690s;

    /* renamed from: t, reason: collision with root package name */
    private final String f25691t;

    /* renamed from: u, reason: collision with root package name */
    private final String f25692u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f25693v;

    /* compiled from: MyApplication */
    /* renamed from: q6.a$a, reason: collision with other inner class name */
    private static class C0123a implements Serializable {

        /* renamed from: q, reason: collision with root package name */
        private static final C0123a f25694q = new C0123a();

        private C0123a() {
        }
    }

    protected a(Object obj, Class cls, String str, String str2, boolean z7) {
        this.f25689r = obj;
        this.f25690s = cls;
        this.f25691t = str;
        this.f25692u = str2;
        this.f25693v = z7;
    }

    public u6.a c() {
        u6.a aVar = this.f25688q;
        if (aVar != null) {
            return aVar;
        }
        u6.a d8 = d();
        this.f25688q = d8;
        return d8;
    }

    protected abstract u6.a d();

    public Object f() {
        return this.f25689r;
    }

    public String h() {
        return this.f25691t;
    }

    public u6.c j() {
        Class cls = this.f25690s;
        if (cls == null) {
            return null;
        }
        return this.f25693v ? q.c(cls) : q.b(cls);
    }

    public String k() {
        return this.f25692u;
    }
}
