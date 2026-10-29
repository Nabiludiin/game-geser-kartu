package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class mq5 extends bu5 {

    /* renamed from: b, reason: collision with root package name */
    private final b00 f12380b;

    public mq5(zt5 zt5Var, b00 b00Var) {
        super(zt5Var);
        this.f12380b = b00Var;
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final b00 a() {
        return this.f12380b;
    }

    @Override // com.google.android.gms.internal.ads.eu5
    public final eq5 b(int i7) {
        return this.f12380b.a(e().B(i7));
    }

    @Override // com.google.android.gms.internal.ads.zt5
    public final eq5 d() {
        return this.f12380b.a(e().g());
    }

    @Override // com.google.android.gms.internal.ads.bu5
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof mq5)) {
            return this.f12380b.equals(((mq5) obj).f12380b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bu5
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f12380b.hashCode();
    }
}
