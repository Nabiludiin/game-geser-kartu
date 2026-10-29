package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* compiled from: MyApplication */
public final class cj0 {

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f6443b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f6444c;

    /* renamed from: d, reason: collision with root package name */
    private final mb1 f6445d;

    /* renamed from: f, reason: collision with root package name */
    private final Object f6447f;

    /* renamed from: a, reason: collision with root package name */
    private final int f6442a = 1;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6446e = false;

    cj0(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, mb1 mb1Var, boolean z7) {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        this.f6444c = handler;
        this.f6445d = mb1Var;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 26) {
            this.f6443b = new vh0(onAudioFocusChangeListener, handler);
        } else {
            this.f6443b = onAudioFocusChangeListener;
        }
        if (i8 >= 26) {
            audioAttributes = aj0.a(1).setAudioAttributes(mb1Var.a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(false);
            onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
            audioFocusRequest = onAudioFocusChangeListener2.build();
        } else {
            audioFocusRequest = null;
        }
        this.f6447f = audioFocusRequest;
    }

    public final mb1 a() {
        return this.f6445d;
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return this.f6443b;
    }

    final AudioFocusRequest c() {
        Object obj = this.f6447f;
        obj.getClass();
        return bj0.a(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj0)) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        return Objects.equals(this.f6443b, cj0Var.f6443b) && Objects.equals(this.f6444c, cj0Var.f6444c) && Objects.equals(this.f6445d, cj0Var.f6445d);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f6443b, this.f6444c, this.f6445d, Boolean.FALSE);
    }
}
