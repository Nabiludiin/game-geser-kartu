package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ty1 extends xy1 {

    /* renamed from: a, reason: collision with root package name */
    private long f16487a;

    /* renamed from: b, reason: collision with root package name */
    private int f16488b;

    /* renamed from: c, reason: collision with root package name */
    private byte f16489c;

    ty1() {
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final xy1 a(long j7) {
        this.f16487a = j7;
        this.f16489c = (byte) (this.f16489c | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final xy1 b(int i7) {
        this.f16488b = i7;
        this.f16489c = (byte) (this.f16489c | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xy1
    public final yy1 c() {
        if (this.f16489c == 3) {
            return new uy1(this.f16487a, this.f16488b, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f16489c & 1) == 0) {
            sb.append(" id");
        }
        if ((this.f16489c & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
