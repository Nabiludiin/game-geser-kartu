package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class x0 extends d1 {

    /* renamed from: a, reason: collision with root package name */
    private String f21430a;

    /* renamed from: b, reason: collision with root package name */
    private byte f21431b;

    /* renamed from: c, reason: collision with root package name */
    private int f21432c;

    /* renamed from: d, reason: collision with root package name */
    private int f21433d;

    x0() {
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final d1 a(boolean z7) {
        this.f21431b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final f1 b() {
        if (this.f21431b == 1 && this.f21430a != null && this.f21432c != 0 && this.f21433d != 0) {
            return new y0(this.f21430a, false, this.f21432c, null, null, this.f21433d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f21430a == null) {
            sb.append(" fileOwner");
        }
        if (this.f21431b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f21432c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f21433d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.d1
    final d1 c(int i7) {
        this.f21432c = i7;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final d1 d(int i7) {
        this.f21433d = 1;
        return this;
    }

    public final d1 e(String str) {
        this.f21430a = "";
        return this;
    }
}
