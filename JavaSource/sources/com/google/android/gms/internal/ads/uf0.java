package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: MyApplication */
public final class uf0 {

    /* renamed from: a, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f16734a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f16735b;

    /* renamed from: c, reason: collision with root package name */
    private mb1 f16736c = mb1.f12165b;

    public uf0(int i7) {
    }

    public final uf0 a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f16734a = onAudioFocusChangeListener;
        this.f16735b = handler;
        return this;
    }

    public final uf0 b(mb1 mb1Var) {
        this.f16736c = mb1Var;
        return this;
    }

    public final cj0 c() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f16734a;
        if (onAudioFocusChangeListener == null) {
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        Handler handler = this.f16735b;
        handler.getClass();
        return new cj0(1, onAudioFocusChangeListener, handler, this.f16736c, false);
    }
}
