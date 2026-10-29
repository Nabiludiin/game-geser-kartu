package y1;

import y1.n;

/* compiled from: MyApplication */
final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    private final o f27578a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27579b;

    /* renamed from: c, reason: collision with root package name */
    private final w1.c f27580c;

    /* renamed from: d, reason: collision with root package name */
    private final w1.e f27581d;

    /* renamed from: e, reason: collision with root package name */
    private final w1.b f27582e;

    /* compiled from: MyApplication */
    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private o f27583a;

        /* renamed from: b, reason: collision with root package name */
        private String f27584b;

        /* renamed from: c, reason: collision with root package name */
        private w1.c f27585c;

        /* renamed from: d, reason: collision with root package name */
        private w1.e f27586d;

        /* renamed from: e, reason: collision with root package name */
        private w1.b f27587e;

        b() {
        }

        @Override // y1.n.a
        public n a() {
            String str = "";
            if (this.f27583a == null) {
                str = " transportContext";
            }
            if (this.f27584b == null) {
                str = str + " transportName";
            }
            if (this.f27585c == null) {
                str = str + " event";
            }
            if (this.f27586d == null) {
                str = str + " transformer";
            }
            if (this.f27587e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f27583a, this.f27584b, this.f27585c, this.f27586d, this.f27587e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y1.n.a
        n.a b(w1.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f27587e = bVar;
            return this;
        }

        @Override // y1.n.a
        n.a c(w1.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f27585c = cVar;
            return this;
        }

        @Override // y1.n.a
        n.a d(w1.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f27586d = eVar;
            return this;
        }

        @Override // y1.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f27583a = oVar;
            return this;
        }

        @Override // y1.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f27584b = str;
            return this;
        }
    }

    @Override // y1.n
    public w1.b b() {
        return this.f27582e;
    }

    @Override // y1.n
    w1.c c() {
        return this.f27580c;
    }

    @Override // y1.n
    w1.e e() {
        return this.f27581d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f27578a.equals(nVar.f()) && this.f27579b.equals(nVar.g()) && this.f27580c.equals(nVar.c()) && this.f27581d.equals(nVar.e()) && this.f27582e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // y1.n
    public o f() {
        return this.f27578a;
    }

    @Override // y1.n
    public String g() {
        return this.f27579b;
    }

    public int hashCode() {
        return ((((((((this.f27578a.hashCode() ^ 1000003) * 1000003) ^ this.f27579b.hashCode()) * 1000003) ^ this.f27580c.hashCode()) * 1000003) ^ this.f27581d.hashCode()) * 1000003) ^ this.f27582e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f27578a + ", transportName=" + this.f27579b + ", event=" + this.f27580c + ", transformer=" + this.f27581d + ", encoding=" + this.f27582e + "}";
    }

    private c(o oVar, String str, w1.c cVar, w1.e eVar, w1.b bVar) {
        this.f27578a = oVar;
        this.f27579b = str;
        this.f27580c = cVar;
        this.f27581d = eVar;
        this.f27582e = bVar;
    }
}
