package x1;

import x1.k;

/* compiled from: MyApplication */
final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final k.b f27272a;

    /* renamed from: b, reason: collision with root package name */
    private final x1.a f27273b;

    /* compiled from: MyApplication */
    static final class b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private k.b f27274a;

        /* renamed from: b, reason: collision with root package name */
        private x1.a f27275b;

        b() {
        }

        @Override // x1.k.a
        public k a() {
            return new e(this.f27274a, this.f27275b);
        }

        @Override // x1.k.a
        public k.a b(x1.a aVar) {
            this.f27275b = aVar;
            return this;
        }

        @Override // x1.k.a
        public k.a c(k.b bVar) {
            this.f27274a = bVar;
            return this;
        }
    }

    @Override // x1.k
    public x1.a b() {
        return this.f27273b;
    }

    @Override // x1.k
    public k.b c() {
        return this.f27272a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f27272a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                x1.a aVar = this.f27273b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f27272a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        x1.a aVar = this.f27273b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f27272a + ", androidClientInfo=" + this.f27273b + "}";
    }

    private e(k.b bVar, x1.a aVar) {
        this.f27272a = bVar;
        this.f27273b = aVar;
    }
}
