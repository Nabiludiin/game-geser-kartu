package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class lt5 {

    /* renamed from: a, reason: collision with root package name */
    private final Spatializer f11796a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11797b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f11798c;

    /* renamed from: d, reason: collision with root package name */
    private final Spatializer$OnSpatializerStateChangedListener f11799d;

    public lt5(Context context, xt5 xt5Var, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager a8 = context == null ? null : gl0.a(context);
        if (a8 == null || (bool != null && bool.booleanValue())) {
            this.f11796a = null;
            this.f11797b = false;
            this.f11798c = null;
            this.f11799d = null;
            return;
        }
        spatializer = a8.getSpatializer();
        this.f11796a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f11797b = immersiveAudioLevel != 0;
        bt5 bt5Var = new bt5(this, xt5Var);
        this.f11799d = bt5Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        final Handler handler = new Handler(myLooper);
        this.f11798c = handler;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.ct5
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, bt5Var);
    }

    public final boolean a() {
        return this.f11797b;
    }

    public final boolean b() {
        boolean isAvailable;
        Spatializer spatializer = this.f11796a;
        spatializer.getClass();
        isAvailable = dt5.a(spatializer).isAvailable();
        return isAvailable;
    }

    public final boolean c() {
        boolean isEnabled;
        Spatializer spatializer = this.f11796a;
        spatializer.getClass();
        isEnabled = dt5.a(spatializer).isEnabled();
        return isEnabled;
    }

    public final boolean d(mb1 mb1Var, eq5 eq5Var) {
        int i7;
        boolean canBeSpatialized;
        String str = eq5Var.f7775o;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i7 = eq5Var.G;
            if (i7 == 16) {
                i7 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i7 = eq5Var.G;
            if (i7 == -1) {
                i7 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i7 = eq5Var.G;
            if (i7 == 18 || i7 == 21) {
                i7 = 24;
            }
        } else {
            i7 = eq5Var.G;
        }
        int b8 = hi2.b(i7);
        if (b8 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(b8);
        int i8 = eq5Var.H;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        Spatializer spatializer = this.f11796a;
        spatializer.getClass();
        canBeSpatialized = dt5.a(spatializer).canBeSpatialized(mb1Var.a(), channelMask.build());
        return canBeSpatialized;
    }

    public final void e() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.f11796a;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f11799d) == null || (handler = this.f11798c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }
}
