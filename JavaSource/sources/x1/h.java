package x1;

/* compiled from: MyApplication */
final class h extends n {

    /* renamed from: a, reason: collision with root package name */
    private final long f27304a;

    h(long j7) {
        this.f27304a = j7;
    }

    @Override // x1.n
    public long c() {
        return this.f27304a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f27304a == ((n) obj).c();
    }

    public int hashCode() {
        long j7 = this.f27304a;
        return ((int) (j7 ^ (j7 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f27304a + "}";
    }
}
