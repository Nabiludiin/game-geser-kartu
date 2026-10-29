package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class zu3 extends bw3 {

    /* renamed from: a, reason: collision with root package name */
    private int f20353a;

    /* renamed from: b, reason: collision with root package name */
    private String f20354b;

    /* renamed from: c, reason: collision with root package name */
    private int f20355c;

    /* renamed from: d, reason: collision with root package name */
    private byte f20356d;

    zu3() {
    }

    @Override // com.google.android.gms.internal.ads.bw3
    public final bw3 a(int i7) {
        this.f20353a = i7;
        this.f20356d = (byte) (this.f20356d | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bw3
    public final bw3 b(String str) {
        this.f20354b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bw3
    public final bw3 c(int i7) {
        this.f20355c = i7;
        this.f20356d = (byte) (this.f20356d | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bw3
    public final cw3 d() {
        if (this.f20356d == 3) {
            return new av3(this.f20353a, this.f20354b, this.f20355c, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f20356d & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.f20356d & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
