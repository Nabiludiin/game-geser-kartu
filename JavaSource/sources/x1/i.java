package x1;

import x1.o;

/* compiled from: MyApplication */
final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.c f27305a;

    /* renamed from: b, reason: collision with root package name */
    private final o.b f27306b;

    /* compiled from: MyApplication */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.c f27307a;

        /* renamed from: b, reason: collision with root package name */
        private o.b f27308b;

        b() {
        }

        @Override // x1.o.a
        public o a() {
            return new i(this.f27307a, this.f27308b);
        }

        @Override // x1.o.a
        public o.a b(o.b bVar) {
            this.f27308b = bVar;
            return this;
        }

        @Override // x1.o.a
        public o.a c(o.c cVar) {
            this.f27307a = cVar;
            return this;
        }
    }

    @Override // x1.o
    public o.b b() {
        return this.f27306b;
    }

    @Override // x1.o
    public o.c c() {
        return this.f27305a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f27305a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f27306b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f27305a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f27306b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f27305a + ", mobileSubtype=" + this.f27306b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f27305a = cVar;
        this.f27306b = bVar;
    }
}
