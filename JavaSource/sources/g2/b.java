package g2;

/* compiled from: MyApplication */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final long f23966a;

    /* renamed from: b, reason: collision with root package name */
    private final y1.o f23967b;

    /* renamed from: c, reason: collision with root package name */
    private final y1.i f23968c;

    b(long j7, y1.o oVar, y1.i iVar) {
        this.f23966a = j7;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f23967b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f23968c = iVar;
    }

    @Override // g2.k
    public y1.i b() {
        return this.f23968c;
    }

    @Override // g2.k
    public long c() {
        return this.f23966a;
    }

    @Override // g2.k
    public y1.o d() {
        return this.f23967b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f23966a == kVar.c() && this.f23967b.equals(kVar.d()) && this.f23968c.equals(kVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f23966a;
        return ((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f23967b.hashCode()) * 1000003) ^ this.f23968c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f23966a + ", transportContext=" + this.f23967b + ", event=" + this.f23968c + "}";
    }
}
