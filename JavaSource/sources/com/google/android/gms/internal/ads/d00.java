package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class d00 {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f6877a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f6878b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f6879c;

    public d00(Context context, ScheduledExecutorService scheduledExecutorService, f00 f00Var, b63 b63Var) {
        this.f6879c = scheduledExecutorService;
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f6877a.getEventTime()) {
            this.f6877a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f6878b.getEventTime()) {
                return;
            }
            this.f6878b = MotionEvent.obtain(motionEvent);
        }
    }

    public final a5.d b() {
        return (h64) p64.i(h64.C(p64.a(null)), ((Long) v00.f17301c.e()).longValue(), TimeUnit.MILLISECONDS, this.f6879c);
    }
}
