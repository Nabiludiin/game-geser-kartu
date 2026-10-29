package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class vn0 {

    /* renamed from: b, reason: collision with root package name */
    private long f17679b;

    /* renamed from: a, reason: collision with root package name */
    private final long f17678a = TimeUnit.MILLISECONDS.toNanos(((Long) s2.b0.c().d(uy.Y)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f17680c = true;

    vn0() {
    }

    public final void a() {
        this.f17680c = true;
    }

    public final void b(SurfaceTexture surfaceTexture, final fn0 fn0Var) {
        if (fn0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f17680c) {
            long j7 = timestamp - this.f17679b;
            if (Math.abs(j7) < this.f17678a) {
                return;
            }
        }
        this.f17680c = false;
        this.f17679b = timestamp;
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.un0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fn0.this.j();
            }
        });
    }
}
