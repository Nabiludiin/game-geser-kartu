package z1;

import z1.g;

/* compiled from: MyApplication */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f27817a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27818b;

    b(g.a aVar, long j7) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f27817a = aVar;
        this.f27818b = j7;
    }

    @Override // z1.g
    public long b() {
        return this.f27818b;
    }

    @Override // z1.g
    public g.a c() {
        return this.f27817a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f27817a.equals(gVar.c()) && this.f27818b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f27817a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f27818b;
        return hashCode ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f27817a + ", nextRequestWaitMillis=" + this.f27818b + "}";
    }
}
