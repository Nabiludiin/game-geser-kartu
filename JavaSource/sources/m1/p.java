package m1;

/* compiled from: MyApplication */
public final class p {

    /* renamed from: s, reason: collision with root package name */
    private static final String f24707s = e1.j.f("WorkSpec");

    /* renamed from: t, reason: collision with root package name */
    public static final o.a f24708t = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f24709a;

    /* renamed from: b, reason: collision with root package name */
    public e1.s f24710b;

    /* renamed from: c, reason: collision with root package name */
    public String f24711c;

    /* renamed from: d, reason: collision with root package name */
    public String f24712d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.b f24713e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.b f24714f;

    /* renamed from: g, reason: collision with root package name */
    public long f24715g;

    /* renamed from: h, reason: collision with root package name */
    public long f24716h;

    /* renamed from: i, reason: collision with root package name */
    public long f24717i;

    /* renamed from: j, reason: collision with root package name */
    public e1.b f24718j;

    /* renamed from: k, reason: collision with root package name */
    public int f24719k;

    /* renamed from: l, reason: collision with root package name */
    public e1.a f24720l;

    /* renamed from: m, reason: collision with root package name */
    public long f24721m;

    /* renamed from: n, reason: collision with root package name */
    public long f24722n;

    /* renamed from: o, reason: collision with root package name */
    public long f24723o;

    /* renamed from: p, reason: collision with root package name */
    public long f24724p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24725q;

    /* renamed from: r, reason: collision with root package name */
    public e1.n f24726r;

    /* compiled from: MyApplication */
    class a implements o.a {
        a() {
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f24727a;

        /* renamed from: b, reason: collision with root package name */
        public e1.s f24728b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24728b != bVar.f24728b) {
                return false;
            }
            return this.f24727a.equals(bVar.f24727a);
        }

        public int hashCode() {
            return (this.f24727a.hashCode() * 31) + this.f24728b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f24710b = e1.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f2992c;
        this.f24713e = bVar;
        this.f24714f = bVar;
        this.f24718j = e1.b.f23138i;
        this.f24720l = e1.a.EXPONENTIAL;
        this.f24721m = 30000L;
        this.f24724p = -1L;
        this.f24726r = e1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24709a = str;
        this.f24711c = str2;
    }

    public long a() {
        if (c()) {
            return this.f24722n + Math.min(18000000L, this.f24720l == e1.a.LINEAR ? this.f24721m * this.f24719k : (long) Math.scalb(this.f24721m, this.f24719k - 1));
        }
        if (!d()) {
            long j7 = this.f24722n;
            if (j7 == 0) {
                j7 = System.currentTimeMillis();
            }
            return j7 + this.f24715g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j8 = this.f24722n;
        long j9 = j8 == 0 ? currentTimeMillis + this.f24715g : j8;
        long j10 = this.f24717i;
        long j11 = this.f24716h;
        if (j10 != j11) {
            return j9 + j11 + (j8 == 0 ? j10 * (-1) : 0L);
        }
        return j9 + (j8 != 0 ? j11 : 0L);
    }

    public boolean b() {
        return !e1.b.f23138i.equals(this.f24718j);
    }

    public boolean c() {
        return this.f24710b == e1.s.ENQUEUED && this.f24719k > 0;
    }

    public boolean d() {
        return this.f24716h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f24715g != pVar.f24715g || this.f24716h != pVar.f24716h || this.f24717i != pVar.f24717i || this.f24719k != pVar.f24719k || this.f24721m != pVar.f24721m || this.f24722n != pVar.f24722n || this.f24723o != pVar.f24723o || this.f24724p != pVar.f24724p || this.f24725q != pVar.f24725q || !this.f24709a.equals(pVar.f24709a) || this.f24710b != pVar.f24710b || !this.f24711c.equals(pVar.f24711c)) {
                return false;
            }
            String str = this.f24712d;
            if (str == null ? pVar.f24712d != null : !str.equals(pVar.f24712d)) {
                return false;
            }
            if (this.f24713e.equals(pVar.f24713e) && this.f24714f.equals(pVar.f24714f) && this.f24718j.equals(pVar.f24718j) && this.f24720l == pVar.f24720l && this.f24726r == pVar.f24726r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f24709a.hashCode() * 31) + this.f24710b.hashCode()) * 31) + this.f24711c.hashCode()) * 31;
        String str = this.f24712d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f24713e.hashCode()) * 31) + this.f24714f.hashCode()) * 31;
        long j7 = this.f24715g;
        int i7 = (hashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f24716h;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f24717i;
        int hashCode3 = (((((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.f24718j.hashCode()) * 31) + this.f24719k) * 31) + this.f24720l.hashCode()) * 31;
        long j10 = this.f24721m;
        int i9 = (hashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f24722n;
        int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f24723o;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f24724p;
        return ((((i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f24725q ? 1 : 0)) * 31) + this.f24726r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f24709a + "}";
    }

    public p(p pVar) {
        this.f24710b = e1.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f2992c;
        this.f24713e = bVar;
        this.f24714f = bVar;
        this.f24718j = e1.b.f23138i;
        this.f24720l = e1.a.EXPONENTIAL;
        this.f24721m = 30000L;
        this.f24724p = -1L;
        this.f24726r = e1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f24709a = pVar.f24709a;
        this.f24711c = pVar.f24711c;
        this.f24710b = pVar.f24710b;
        this.f24712d = pVar.f24712d;
        this.f24713e = new androidx.work.b(pVar.f24713e);
        this.f24714f = new androidx.work.b(pVar.f24714f);
        this.f24715g = pVar.f24715g;
        this.f24716h = pVar.f24716h;
        this.f24717i = pVar.f24717i;
        this.f24718j = new e1.b(pVar.f24718j);
        this.f24719k = pVar.f24719k;
        this.f24720l = pVar.f24720l;
        this.f24721m = pVar.f24721m;
        this.f24722n = pVar.f24722n;
        this.f24723o = pVar.f24723o;
        this.f24724p = pVar.f24724p;
        this.f24725q = pVar.f24725q;
        this.f24726r = pVar.f24726r;
    }
}
