package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class qe3 extends ye3 {

    /* renamed from: a, reason: collision with root package name */
    private String f14410a;

    /* renamed from: b, reason: collision with root package name */
    private byte f14411b;

    /* renamed from: c, reason: collision with root package name */
    private int f14412c;

    /* renamed from: d, reason: collision with root package name */
    private int f14413d;

    qe3() {
    }

    @Override // com.google.android.gms.internal.ads.ye3
    public final ye3 a(boolean z7) {
        this.f14411b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ye3
    public final ze3 b() {
        if (this.f14411b == 1 && this.f14410a != null && this.f14412c != 0 && this.f14413d != 0) {
            return new re3(this.f14410a, false, this.f14412c, null, null, this.f14413d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14410a == null) {
            sb.append(" fileOwner");
        }
        if (this.f14411b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f14412c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f14413d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.ye3
    final ye3 c(int i7) {
        this.f14412c = i7;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ye3
    public final ye3 d(int i7) {
        this.f14413d = 1;
        return this;
    }

    public final ye3 e(String str) {
        this.f14410a = "";
        return this;
    }
}
