package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vl5 implements zj5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wl5 f17669a;

    /* synthetic */ vl5(wl5 wl5Var, byte[] bArr) {
        Objects.requireNonNull(wl5Var);
        this.f17669a = wl5Var;
    }

    @Override // com.google.android.gms.internal.ads.zj5
    public final void a() {
        nc5 F0;
        F0 = this.f17669a.F0();
        if (F0 != null) {
            F0.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zj5
    public final void b(wj5 wj5Var) {
        this.f17669a.x1().l(wj5Var);
    }

    @Override // com.google.android.gms.internal.ads.zj5
    public final void c(Exception exc) {
        gv1.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.f17669a.x1().i(exc);
    }
}
