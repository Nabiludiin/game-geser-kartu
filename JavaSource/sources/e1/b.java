package e1;

import android.os.Build;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final b f23138i = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private k f23139a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23140b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23141c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23142d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23143e;

    /* renamed from: f, reason: collision with root package name */
    private long f23144f;

    /* renamed from: g, reason: collision with root package name */
    private long f23145g;

    /* renamed from: h, reason: collision with root package name */
    private c f23146h;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f23147a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f23148b = false;

        /* renamed from: c, reason: collision with root package name */
        k f23149c = k.NOT_REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        boolean f23150d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f23151e = false;

        /* renamed from: f, reason: collision with root package name */
        long f23152f = -1;

        /* renamed from: g, reason: collision with root package name */
        long f23153g = -1;

        /* renamed from: h, reason: collision with root package name */
        c f23154h = new c();

        public b a() {
            return new b(this);
        }

        public a b(k kVar) {
            this.f23149c = kVar;
            return this;
        }
    }

    public b() {
        this.f23139a = k.NOT_REQUIRED;
        this.f23144f = -1L;
        this.f23145g = -1L;
        this.f23146h = new c();
    }

    public c a() {
        return this.f23146h;
    }

    public k b() {
        return this.f23139a;
    }

    public long c() {
        return this.f23144f;
    }

    public long d() {
        return this.f23145g;
    }

    public boolean e() {
        return this.f23146h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f23140b == bVar.f23140b && this.f23141c == bVar.f23141c && this.f23142d == bVar.f23142d && this.f23143e == bVar.f23143e && this.f23144f == bVar.f23144f && this.f23145g == bVar.f23145g && this.f23139a == bVar.f23139a) {
            return this.f23146h.equals(bVar.f23146h);
        }
        return false;
    }

    public boolean f() {
        return this.f23142d;
    }

    public boolean g() {
        return this.f23140b;
    }

    public boolean h() {
        return this.f23141c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f23139a.hashCode() * 31) + (this.f23140b ? 1 : 0)) * 31) + (this.f23141c ? 1 : 0)) * 31) + (this.f23142d ? 1 : 0)) * 31) + (this.f23143e ? 1 : 0)) * 31;
        long j7 = this.f23144f;
        int i7 = (hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f23145g;
        return ((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f23146h.hashCode();
    }

    public boolean i() {
        return this.f23143e;
    }

    public void j(c cVar) {
        this.f23146h = cVar;
    }

    public void k(k kVar) {
        this.f23139a = kVar;
    }

    public void l(boolean z7) {
        this.f23142d = z7;
    }

    public void m(boolean z7) {
        this.f23140b = z7;
    }

    public void n(boolean z7) {
        this.f23141c = z7;
    }

    public void o(boolean z7) {
        this.f23143e = z7;
    }

    public void p(long j7) {
        this.f23144f = j7;
    }

    public void q(long j7) {
        this.f23145g = j7;
    }

    b(a aVar) {
        this.f23139a = k.NOT_REQUIRED;
        this.f23144f = -1L;
        this.f23145g = -1L;
        this.f23146h = new c();
        this.f23140b = aVar.f23147a;
        int i7 = Build.VERSION.SDK_INT;
        this.f23141c = aVar.f23148b;
        this.f23139a = aVar.f23149c;
        this.f23142d = aVar.f23150d;
        this.f23143e = aVar.f23151e;
        if (i7 >= 24) {
            this.f23146h = aVar.f23154h;
            this.f23144f = aVar.f23152f;
            this.f23145g = aVar.f23153g;
        }
    }

    public b(b bVar) {
        this.f23139a = k.NOT_REQUIRED;
        this.f23144f = -1L;
        this.f23145g = -1L;
        this.f23146h = new c();
        this.f23140b = bVar.f23140b;
        this.f23141c = bVar.f23141c;
        this.f23139a = bVar.f23139a;
        this.f23142d = bVar.f23142d;
        this.f23143e = bVar.f23143e;
        this.f23146h = bVar.f23146h;
    }
}
