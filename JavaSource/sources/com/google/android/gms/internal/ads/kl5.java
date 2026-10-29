package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class kl5 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11115a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f11116b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ sl5 f11117c;

    public kl5(sl5 sl5Var) {
        Objects.requireNonNull(sl5Var);
        this.f11117c = sl5Var;
        this.f11115a = new Handler(Looper.myLooper());
        this.f11116b = new gl5(this);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.f11115a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.hl5
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f11116b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f11116b);
        this.f11115a.removeCallbacksAndMessages(null);
    }
}
