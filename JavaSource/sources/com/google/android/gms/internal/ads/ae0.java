package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: MyApplication */
final class ae0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f4896q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ zzbub f4897r;

    ae0(zzbub zzbubVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f4896q = adOverlayInfoParcel;
        Objects.requireNonNull(zzbubVar);
        this.f4897r = zzbubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r2.t.f();
        u2.b0.a(this.f4897r.a(), this.f4896q, true, null);
    }
}
