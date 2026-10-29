package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class oq1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f13442a;

    oq1(ar1 ar1Var, im0 im0Var) {
        this.f13442a = im0Var;
        Objects.requireNonNull(ar1Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        int i7 = v2.n1.f26802b;
        w2.p.c("Failed to load media data due to video view load failure.");
        this.f13442a.e(th);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        mr0 mr0Var = (mr0) obj;
        if (mr0Var == null) {
            this.f13442a.e(new ce2(1, "Missing webview from video view future."));
            return;
        }
        final im0 im0Var = this.f13442a;
        mr0Var.O0("/video", new bp0(new ap0() { // from class: com.google.android.gms.internal.ads.nq1
            @Override // com.google.android.gms.internal.ads.ap0
            public final /* synthetic */ void b(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str);
                im0.this.b(bundle);
            }
        }));
        mr0Var.U();
    }
}
