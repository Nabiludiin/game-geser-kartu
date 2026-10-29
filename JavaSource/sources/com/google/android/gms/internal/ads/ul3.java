package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: MyApplication */
public final class ul3 {

    /* renamed from: a, reason: collision with root package name */
    public long f16814a;

    /* renamed from: b, reason: collision with root package name */
    public long f16815b;

    /* renamed from: c, reason: collision with root package name */
    public long f16816c;

    /* renamed from: d, reason: collision with root package name */
    public long f16817d;

    /* renamed from: e, reason: collision with root package name */
    private double f16818e;

    /* renamed from: f, reason: collision with root package name */
    private double f16819f;

    /* renamed from: g, reason: collision with root package name */
    public double f16820g;

    /* renamed from: h, reason: collision with root package name */
    public float f16821h;

    /* renamed from: i, reason: collision with root package name */
    public float f16822i;

    /* renamed from: j, reason: collision with root package name */
    public float f16823j;

    /* renamed from: k, reason: collision with root package name */
    public float f16824k;

    private static double b(MotionEvent motionEvent, double d8, double d9, double d10) {
        return d10 + Math.hypot(motionEvent.getRawX() - d8, motionEvent.getRawY() - d9);
    }

    final /* synthetic */ void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f16814a++;
            this.f16820g = 0.0d;
            this.f16818e = motionEvent.getRawX();
            this.f16819f = motionEvent.getRawY();
            this.f16821h = motionEvent.getX();
            this.f16822i = motionEvent.getY();
            this.f16823j = motionEvent.getRawX();
            this.f16824k = motionEvent.getRawY();
            return;
        }
        if (action == 1) {
            this.f16816c++;
            this.f16820g = b(motionEvent, this.f16818e, this.f16819f, this.f16820g);
            this.f16818e = motionEvent.getRawX();
            this.f16819f = motionEvent.getRawY();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            this.f16817d++;
        } else {
            this.f16815b += motionEvent.getHistorySize() + 1;
            this.f16820g = b(motionEvent, this.f16818e, this.f16819f, this.f16820g);
            this.f16818e = motionEvent.getRawX();
            this.f16819f = motionEvent.getRawY();
        }
    }
}
