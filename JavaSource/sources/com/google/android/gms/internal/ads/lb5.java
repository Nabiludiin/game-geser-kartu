package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lb5 {

    /* renamed from: a, reason: collision with root package name */
    private long f11516a;

    /* renamed from: b, reason: collision with root package name */
    private float f11517b;

    /* renamed from: c, reason: collision with root package name */
    private long f11518c;

    public lb5() {
        this.f11516a = -9223372036854775807L;
        this.f11517b = -3.4028235E38f;
        this.f11518c = -9223372036854775807L;
    }

    public final lb5 a(long j7) {
        this.f11516a = j7;
        return this;
    }

    public final lb5 b(float f8) {
        boolean z7 = true;
        if (f8 <= 0.0f && f8 != -3.4028235E38f) {
            z7 = false;
        }
        rx3.a(z7);
        this.f11517b = f8;
        return this;
    }

    public final lb5 c(long j7) {
        boolean z7 = true;
        if (j7 < 0) {
            if (j7 == -9223372036854775807L) {
                j7 = -9223372036854775807L;
            } else {
                z7 = false;
            }
        }
        rx3.a(z7);
        this.f11518c = j7;
        return this;
    }

    public final mb5 d() {
        return new mb5(this, null);
    }

    final /* synthetic */ long e() {
        return this.f11516a;
    }

    final /* synthetic */ float f() {
        return this.f11517b;
    }

    final /* synthetic */ long g() {
        return this.f11518c;
    }

    /* synthetic */ lb5(mb5 mb5Var, byte[] bArr) {
        this.f11516a = mb5Var.f12175a;
        this.f11517b = mb5Var.f12176b;
        this.f11518c = mb5Var.f12177c;
    }
}
