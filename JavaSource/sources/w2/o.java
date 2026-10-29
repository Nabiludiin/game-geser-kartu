package w2;

/* compiled from: MyApplication */
final class o extends y {

    /* renamed from: a, reason: collision with root package name */
    private final int f27090a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27091b;

    /* renamed from: c, reason: collision with root package name */
    private final double f27092c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27093d;

    o(int i7, int i8, double d8, boolean z7) {
        this.f27090a = i7;
        this.f27091b = i8;
        this.f27092c = d8;
        this.f27093d = z7;
    }

    @Override // w2.y
    public final int a() {
        return this.f27090a;
    }

    @Override // w2.y
    public final int b() {
        return this.f27091b;
    }

    @Override // w2.y
    public final double c() {
        return this.f27092c;
    }

    @Override // w2.y
    public final boolean d() {
        return this.f27093d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f27090a == yVar.a() && this.f27091b == yVar.b() && Double.doubleToLongBits(this.f27092c) == Double.doubleToLongBits(yVar.c()) && this.f27093d == yVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d8 = this.f27092c;
        return ((((int) (Double.doubleToLongBits(d8) ^ (Double.doubleToLongBits(d8) >>> 32))) ^ ((((this.f27090a ^ 1000003) * 1000003) ^ this.f27091b) * 1000003)) * 1000003) ^ (true != this.f27093d ? 1237 : 1231);
    }

    public final String toString() {
        int i7 = this.f27090a;
        int length = String.valueOf(i7).length();
        int i8 = this.f27091b;
        int length2 = String.valueOf(i8).length();
        double d8 = this.f27092c;
        int length3 = String.valueOf(d8).length();
        boolean z7 = this.f27093d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z7).length() + 1);
        sb.append("PingStrategy{maxAttempts=");
        sb.append(i7);
        sb.append(", initialBackoffMs=");
        sb.append(i8);
        sb.append(", backoffMultiplier=");
        sb.append(d8);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
