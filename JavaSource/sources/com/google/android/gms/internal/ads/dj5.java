package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: MyApplication */
public final class dj5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7129a;

    /* renamed from: b, reason: collision with root package name */
    private final cj5 f7130b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f7131c;

    /* renamed from: d, reason: collision with root package name */
    private final zi5 f7132d;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f7133e;

    /* renamed from: f, reason: collision with root package name */
    private final aj5 f7134f;

    /* renamed from: g, reason: collision with root package name */
    private yi5 f7135g;

    /* renamed from: h, reason: collision with root package name */
    private AudioDeviceInfo f7136h;

    /* renamed from: i, reason: collision with root package name */
    private mb1 f7137i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7138j;

    /* JADX WARN: Multi-variable type inference failed */
    public dj5(Context context, cj5 cj5Var, mb1 mb1Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f7129a = applicationContext;
        this.f7130b = cj5Var;
        this.f7137i = mb1Var;
        this.f7136h = audioDeviceInfo;
        Handler handler = new Handler(hi2.B(), null);
        this.f7131c = handler;
        this.f7132d = new zi5(this, 0 == true ? 1 : 0);
        this.f7133e = new bj5(this, 0 == true ? 1 : 0);
        Uri c8 = yi5.c();
        this.f7134f = c8 != null ? new aj5(this, handler, applicationContext.getContentResolver(), c8) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void f(yi5 yi5Var) {
        if (!this.f7138j || yi5Var.equals(this.f7135g)) {
            return;
        }
        this.f7135g = yi5Var;
        this.f7130b.a(yi5Var);
    }

    public final void a(yi5 yi5Var) {
        f(yi5Var);
    }

    public final void b(mb1 mb1Var) {
        this.f7137i = mb1Var;
        f(yi5.a(this.f7129a, mb1Var, this.f7136h));
    }

    public final void c(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.f7136h)) {
            return;
        }
        this.f7136h = audioDeviceInfo;
        f(yi5.a(this.f7129a, this.f7137i, audioDeviceInfo));
    }

    public final yi5 d() {
        if (this.f7138j) {
            yi5 yi5Var = this.f7135g;
            yi5Var.getClass();
            return yi5Var;
        }
        this.f7138j = true;
        aj5 aj5Var = this.f7134f;
        if (aj5Var != null) {
            aj5Var.a();
        }
        Context context = this.f7129a;
        zi5 zi5Var = this.f7132d;
        Handler handler = this.f7131c;
        gl0.a(context).registerAudioDeviceCallback(zi5Var, handler);
        yi5 b8 = yi5.b(context, context.registerReceiver(this.f7133e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f7137i, this.f7136h);
        this.f7135g = b8;
        return b8;
    }

    public final void e() {
        if (this.f7138j) {
            this.f7135g = null;
            Context context = this.f7129a;
            gl0.a(context).unregisterAudioDeviceCallback(this.f7132d);
            context.unregisterReceiver(this.f7133e);
            aj5 aj5Var = this.f7134f;
            if (aj5Var != null) {
                aj5Var.b();
            }
            this.f7138j = false;
        }
    }

    final /* synthetic */ Context g() {
        return this.f7129a;
    }

    final /* synthetic */ AudioDeviceInfo h() {
        return this.f7136h;
    }

    final /* synthetic */ void i(AudioDeviceInfo audioDeviceInfo) {
        this.f7136h = null;
    }

    final /* synthetic */ mb1 j() {
        return this.f7137i;
    }
}
