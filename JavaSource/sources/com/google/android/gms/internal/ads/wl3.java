package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.Map;

/* compiled from: MyApplication */
public final class wl3 {

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f18292b;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f18291a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private ul3 f18293c = new ul3();

    wl3() {
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.f18292b = MotionEvent.obtain(motionEvent);
            }
            this.f18293c.a(motionEvent);
            ArrayDeque arrayDeque = this.f18291a;
            if (arrayDeque.size() >= 6) {
                arrayDeque.remove();
            }
            arrayDeque.add(new vl3(motionEvent));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        try {
            MotionEvent motionEvent = this.f18292b;
            if (motionEvent != null) {
                map.put("nv", motionEvent);
            }
            map.put("oe", this.f18293c);
            ArrayDeque arrayDeque = this.f18291a;
            map.put("ro", arrayDeque.toArray(new vl3[arrayDeque.size()]));
            this.f18293c = new ul3();
            arrayDeque.clear();
            MotionEvent motionEvent2 = this.f18292b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.f18292b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
