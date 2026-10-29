package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: MyApplication */
final class l0 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: v, reason: collision with root package name */
    private static final l0 f11309v = new l0();

    /* renamed from: q, reason: collision with root package name */
    public volatile long f11310q = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f11311r;

    /* renamed from: s, reason: collision with root package name */
    private final HandlerThread f11312s;

    /* renamed from: t, reason: collision with root package name */
    private Choreographer f11313t;

    /* renamed from: u, reason: collision with root package name */
    private int f11314u;

    private l0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f11312s = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = hi2.f9535a;
        Handler handler = new Handler(looper, this);
        this.f11311r = handler;
        handler.sendEmptyMessage(1);
    }

    public static l0 a() {
        return f11309v;
    }

    public final void b() {
        this.f11311r.sendEmptyMessage(2);
    }

    public final void c() {
        this.f11311r.sendEmptyMessage(3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f11310q = j7;
        Choreographer choreographer = this.f11313t;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            try {
                this.f11313t = Choreographer.getInstance();
            } catch (RuntimeException e8) {
                gv1.d("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
            return true;
        }
        if (i7 == 2) {
            Choreographer choreographer = this.f11313t;
            if (choreographer != null) {
                int i8 = this.f11314u + 1;
                this.f11314u = i8;
                if (i8 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f11313t;
        if (choreographer2 != null) {
            int i9 = this.f11314u - 1;
            this.f11314u = i9;
            if (i9 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f11310q = -9223372036854775807L;
            }
        }
        return true;
    }
}
