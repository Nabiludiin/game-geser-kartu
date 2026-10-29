package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: MyApplication */
final class ps3 implements as3 {

    /* renamed from: a, reason: collision with root package name */
    private final sj3 f14089a;

    /* renamed from: b, reason: collision with root package name */
    private final sj3 f14090b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f14091c;

    /* renamed from: d, reason: collision with root package name */
    private final nu3 f14092d;

    ps3(sj3 sj3Var, sj3 sj3Var2, h85 h85Var, nu3 nu3Var) {
        this.f14089a = sj3Var;
        this.f14090b = sj3Var2;
        this.f14091c = h85Var;
        this.f14092d = nu3Var;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d a() {
        a5.d b8 = this.f14089a.b();
        this.f14092d.e(20302, b8);
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d b(xk3 xk3Var) {
        a5.d c8 = this.f14089a.c(xk3Var);
        this.f14092d.e(20303, c8);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final File c() {
        return this.f14090b.a();
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d d() {
        a5.d b8 = this.f14090b.b();
        this.f14092d.e(20304, b8);
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d e(byte[] bArr) {
        a5.d c8 = this.f14090b.c(bArr);
        this.f14092d.e(20305, c8);
        return c8;
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final File f() {
        return ((sj3) this.f14091c.b()).a();
    }

    @Override // com.google.android.gms.internal.ads.as3
    public final a5.d g(byte[] bArr) {
        a5.d c8 = ((sj3) this.f14091c.b()).c(bArr);
        this.f14092d.e(20307, c8);
        return c8;
    }
}
