package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: MyApplication */
public final class fo0 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f8358a;

    /* renamed from: b, reason: collision with root package name */
    private final eo0 f8359b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8360c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8361d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8362e;

    /* renamed from: f, reason: collision with root package name */
    private float f8363f = 1.0f;

    public fo0(Context context, eo0 eo0Var) {
        this.f8358a = (AudioManager) context.getSystemService("audio");
        this.f8359b = eo0Var;
    }

    private final void f() {
        if (!this.f8361d || this.f8362e || this.f8363f <= 0.0f) {
            if (this.f8360c) {
                AudioManager audioManager = this.f8358a;
                if (audioManager != null) {
                    this.f8360c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f8359b.m();
                return;
            }
            return;
        }
        if (this.f8360c) {
            return;
        }
        AudioManager audioManager2 = this.f8358a;
        if (audioManager2 != null) {
            this.f8360c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f8359b.m();
    }

    public final void a(boolean z7) {
        this.f8362e = z7;
        f();
    }

    public final void b(float f8) {
        this.f8363f = f8;
        f();
    }

    public final float c() {
        float f8 = this.f8362e ? 0.0f : this.f8363f;
        if (this.f8360c) {
            return f8;
        }
        return 0.0f;
    }

    public final void d() {
        this.f8361d = true;
        f();
    }

    public final void e() {
        this.f8361d = false;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f8360c = i7 > 0;
        this.f8359b.m();
    }
}
