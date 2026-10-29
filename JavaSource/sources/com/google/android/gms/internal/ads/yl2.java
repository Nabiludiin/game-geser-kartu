package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class yl2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final zw2 f19640a;

    yl2(zw2 zw2Var) {
        this.f19640a = zw2Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        zw2 zw2Var = this.f19640a;
        if (zw2Var == null) {
            return p64.a(new xl2(null));
        }
        String a8 = zw2Var.a();
        return com.google.android.gms.common.util.s.a(a8) ? p64.a(new xl2(null)) : p64.a(new xl2(a8));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 15;
    }
}
