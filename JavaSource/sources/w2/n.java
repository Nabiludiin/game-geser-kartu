package w2;

/* compiled from: MyApplication */
final class n extends x {

    /* renamed from: a, reason: collision with root package name */
    private final int f27087a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27088b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27089c;

    n(int i7, int i8, boolean z7) {
        this.f27087a = i7;
        this.f27088b = i8;
        this.f27089c = z7;
    }

    @Override // w2.x
    public final int a() {
        return this.f27087a;
    }

    @Override // w2.x
    public final int b() {
        return this.f27088b;
    }

    @Override // w2.x
    public final boolean c() {
        return this.f27089c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f27087a == xVar.a() && this.f27088b == xVar.b() && this.f27089c == xVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f27089c ? 1237 : 1231) ^ ((((this.f27087a ^ 1000003) * 1000003) ^ this.f27088b) * 1000003);
    }

    public final String toString() {
        int i7 = this.f27087a;
        int length = String.valueOf(i7).length();
        int i8 = this.f27088b;
        int length2 = String.valueOf(i8).length();
        boolean z7 = this.f27089c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z7).length() + 1);
        sb.append("OfflineAdConfig{impressionPrerequisite=");
        sb.append(i7);
        sb.append(", clickPrerequisite=");
        sb.append(i8);
        sb.append(", notificationFlowEnabled=");
        sb.append(z7);
        sb.append("}");
        return sb.toString();
    }
}
