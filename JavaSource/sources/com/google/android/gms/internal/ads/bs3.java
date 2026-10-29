package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
final class bs3 implements as3 {

    /* renamed from: a, reason: collision with root package name */
    private final sj3 f5981a;

    /* renamed from: b, reason: collision with root package name */
    private final sj3 f5982b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f5983c;

    /* renamed from: d, reason: collision with root package name */
    private final nu3 f5984d;

    bs3(sj3 sj3Var, sj3 sj3Var2, h85 h85Var, nu3 nu3Var) {
        this.f5981a = sj3Var;
        this.f5982b = sj3Var2;
        this.f5983c = h85Var;
        this.f5984d = nu3Var;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d a() {
        a5.d b8 = this.f5981a.b();
        this.f5984d.e(15302, b8);
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d b(xk3 xk3Var) {
        a5.d c8 = this.f5981a.c(xk3Var);
        this.f5984d.e(15303, c8);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final File c() {
        return this.f5982b.a();
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d d() {
        a5.d b8 = this.f5982b.b();
        this.f5984d.e(15304, b8);
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d e(byte[] bArr) {
        a5.d c8 = this.f5982b.c(bArr);
        this.f5984d.e(15305, c8);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final File f() {
        return ((sj3) this.f5983c.b()).a();
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d g(byte[] bArr) {
        a5.d c8 = ((sj3) this.f5983c.b()).c(bArr);
        this.f5984d.e(15307, c8);
        return c8;
    }
}
