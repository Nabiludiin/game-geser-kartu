package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class ok2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13357a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13358b;

    public ok2(String str, boolean z7) {
        this.f13357a = str;
        this.f13358b = z7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        String str = this.f13357a;
        x81 x81Var = (x81) obj;
        if (str != null) {
            Bundle a8 = m13.a(x81Var.f18664a, "pii");
            a8.putString("afai", str);
            a8.putBoolean("is_afai_lat", this.f13358b);
        }
    }
}
