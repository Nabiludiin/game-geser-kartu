package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* compiled from: MyApplication */
final class um0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f16826q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ en0 f16827r;

    um0(en0 en0Var, MediaPlayer mediaPlayer) {
        this.f16826q = mediaPlayer;
        Objects.requireNonNull(en0Var);
        this.f16827r = en0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        en0 en0Var = this.f16827r;
        en0Var.H(this.f16826q);
        if (en0Var.I() != null) {
            en0Var.I().b();
        }
    }
}
