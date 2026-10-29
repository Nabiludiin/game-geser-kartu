package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: MyApplication */
public final class n02 extends sf3 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f12519a;

    /* renamed from: b, reason: collision with root package name */
    private final Sensor f12520b;

    /* renamed from: c, reason: collision with root package name */
    private float f12521c;

    /* renamed from: d, reason: collision with root package name */
    private Float f12522d;

    /* renamed from: e, reason: collision with root package name */
    private long f12523e;

    /* renamed from: f, reason: collision with root package name */
    private int f12524f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12525g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12526h;

    /* renamed from: i, reason: collision with root package name */
    private l02 f12527i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12528j;

    n02(Context context) {
        super("FlickDetector", "ads");
        this.f12521c = 0.0f;
        this.f12522d = Float.valueOf(0.0f);
        this.f12523e = r2.t.o().a();
        this.f12524f = 0;
        this.f12525g = false;
        this.f12526h = false;
        this.f12527i = null;
        this.f12528j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f12519a = sensorManager;
        if (sensorManager != null) {
            this.f12520b = sensorManager.getDefaultSensor(4);
        } else {
            this.f12520b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sf3
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) s2.b0.c().d(uy.da)).booleanValue()) {
            long a8 = r2.t.o().a();
            if (this.f12523e + ((Integer) s2.b0.c().d(uy.fa)).intValue() < a8) {
                this.f12524f = 0;
                this.f12523e = a8;
                this.f12525g = false;
                this.f12526h = false;
                this.f12521c = this.f12522d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f12522d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f12522d = valueOf;
            float floatValue = valueOf.floatValue();
            float f8 = this.f12521c;
            ly lyVar = uy.ea;
            if (floatValue > f8 + ((Float) s2.b0.c().d(lyVar)).floatValue()) {
                this.f12521c = this.f12522d.floatValue();
                this.f12526h = true;
            } else if (this.f12522d.floatValue() < this.f12521c - ((Float) s2.b0.c().d(lyVar)).floatValue()) {
                this.f12521c = this.f12522d.floatValue();
                this.f12525g = true;
            }
            if (this.f12522d.isInfinite()) {
                this.f12522d = Float.valueOf(0.0f);
                this.f12521c = 0.0f;
            }
            if (this.f12525g && this.f12526h) {
                v2.n1.k("Flick detected.");
                this.f12523e = a8;
                int i7 = this.f12524f + 1;
                this.f12524f = i7;
                this.f12525g = false;
                this.f12526h = false;
                l02 l02Var = this.f12527i;
                if (l02Var != null) {
                    if (i7 == ((Integer) s2.b0.c().d(uy.ga)).intValue()) {
                        b12 b12Var = (b12) l02Var;
                        b12Var.p(new z02(b12Var), a12.GESTURE);
                    }
                }
            }
        }
    }

    public final void b(l02 l02Var) {
        this.f12527i = l02Var;
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) s2.b0.c().d(uy.da)).booleanValue()) {
                    if (!this.f12528j && (sensorManager = this.f12519a) != null && (sensor = this.f12520b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f12528j = true;
                        v2.n1.k("Listening for flick gestures.");
                    }
                    if (this.f12519a == null || this.f12520b == null) {
                        int i7 = v2.n1.f26802b;
                        w2.p.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f12528j && (sensorManager = this.f12519a) != null && (sensor = this.f12520b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f12528j = false;
                    v2.n1.k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
