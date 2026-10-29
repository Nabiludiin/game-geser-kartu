package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bp2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f5887a;

    public bp2(Boolean bool) {
        this.f5887a = bool;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Boolean bool = this.f5887a;
        x81 x81Var = (x81) obj;
        if (bool != null) {
            x81Var.f18664a.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
