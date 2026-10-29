package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class wv3 extends tu3 {

    /* renamed from: q, reason: collision with root package name */
    private final dw3 f18444q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ yv3 f18445r;

    wv3(yv3 yv3Var, dw3 dw3Var) {
        Objects.requireNonNull(yv3Var);
        this.f18445r = yv3Var;
        this.f18444q = dw3Var;
    }

    @Override // com.google.android.gms.internal.ads.uu3
    public final void P0(Bundle bundle) {
        int i7 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i8 = bundle.getInt("uiMode", 0);
        bw3 d8 = cw3.d();
        d8.a(i7);
        if (string != null) {
            d8.b(string);
        }
        d8.c(i8);
        this.f18444q.a(d8.d());
        if (i7 == 8157) {
            this.f18445r.d();
        }
    }
}
