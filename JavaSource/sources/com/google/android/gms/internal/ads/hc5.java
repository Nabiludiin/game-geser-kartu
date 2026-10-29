package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: MyApplication */
public final class hc5 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9436a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Looper f9437b = null;

    /* renamed from: c, reason: collision with root package name */
    private HandlerThread f9438c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f9439d = 0;

    public hc5(Looper looper) {
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.f9436a) {
            try {
                if (this.f9437b == null) {
                    boolean z7 = false;
                    if (this.f9439d == 0 && this.f9438c == null) {
                        z7 = true;
                    }
                    rx3.h(z7);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f9438c = handlerThread;
                    handlerThread.start();
                    this.f9437b = this.f9438c.getLooper();
                }
                this.f9439d++;
                looper = this.f9437b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f9436a) {
            try {
                rx3.h(this.f9439d > 0);
                int i7 = this.f9439d - 1;
                this.f9439d = i7;
                if (i7 == 0 && (handlerThread = this.f9438c) != null) {
                    handlerThread.quit();
                    this.f9438c = null;
                    this.f9437b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
