package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* compiled from: MyApplication */
final class gl5 extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kl5 f9023a;

    gl5(kl5 kl5Var) {
        Objects.requireNonNull(kl5Var);
        this.f9023a = kl5Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        sl5 sl5Var = this.f9023a.f11117c;
        if (audioTrack.equals(sl5Var.F()) && sl5Var.D() != null && sl5Var.H()) {
            sl5Var.D().a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        sl5 sl5Var = this.f9023a.f11117c;
        if (audioTrack.equals(sl5Var.F())) {
            sl5Var.G(true);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        sl5 sl5Var = this.f9023a.f11117c;
        if (audioTrack.equals(sl5Var.F()) && sl5Var.D() != null && sl5Var.H()) {
            sl5Var.D().a();
        }
    }
}
