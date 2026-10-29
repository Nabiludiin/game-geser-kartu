package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: MyApplication */
final class vh0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17612a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f17613b;

    vh0(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f17613b = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = hi2.f9535a;
        this.f17612a = new Handler(looper, null);
    }

    final /* synthetic */ void a(int i7) {
        this.f17613b.onAudioFocusChange(i7);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i7) {
        hi2.A(this.f17612a, new Runnable() { // from class: com.google.android.gms.internal.ads.ug0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vh0.this.a(i7);
            }
        });
    }
}
