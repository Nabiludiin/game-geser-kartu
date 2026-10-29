package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: MyApplication */
final class wb2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f18170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c03 f18171b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ yb2 f18172c;

    wb2(yb2 yb2Var, im0 im0Var, c03 c03Var) {
        this.f18170a = im0Var;
        this.f18171b = c03Var;
        Objects.requireNonNull(yb2Var);
        this.f18172c = yb2Var;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        try {
            r2.t.f();
            u2.b0.a(context, (AdOverlayInfoParcel) this.f18170a.get(), true, this.f18172c.d());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f18171b;
    }
}
