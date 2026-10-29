package c5;

/* compiled from: MyApplication */
final class a extends m {

    /* renamed from: a, reason: collision with root package name */
    private final long f3514a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3515b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3516c;

    a(long j7, long j8, long j9) {
        this.f3514a = j7;
        this.f3515b = j8;
        this.f3516c = j9;
    }

    @Override // c5.m
    public long b() {
        return this.f3515b;
    }

    @Override // c5.m
    public long c() {
        return this.f3514a;
    }

    @Override // c5.m
    public long d() {
        return this.f3516c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f3514a == mVar.c() && this.f3515b == mVar.b() && this.f3516c == mVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j7 = this.f3514a;
        long j8 = this.f3515b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f3516c;
        return i7 ^ ((int) ((j9 >>> 32) ^ j9));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f3514a + ", elapsedRealtime=" + this.f3515b + ", uptimeMillis=" + this.f3516c + "}";
    }
}
