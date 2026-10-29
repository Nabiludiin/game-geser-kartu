package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: MyApplication */
public final class f22 extends sf3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7979a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f7980b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f7981c;

    /* renamed from: d, reason: collision with root package name */
    private long f7982d;

    /* renamed from: e, reason: collision with root package name */
    private int f7983e;

    /* renamed from: f, reason: collision with root package name */
    private e22 f7984f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7985g;

    f22(Context context) {
        super("ShakeDetector", "ads");
        this.f7979a = context;
    }

    @Override // com.google.android.gms.internal.ads.sf3
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) s2.b0.c().d(uy.Y9)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f8 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10))) >= ((Float) s2.b0.c().d(uy.Z9)).floatValue()) {
                long a8 = r2.t.o().a();
                if (this.f7982d + ((Integer) s2.b0.c().d(uy.aa)).intValue() <= a8) {
                    if (this.f7982d + ((Integer) s2.b0.c().d(uy.ba)).intValue() < a8) {
                        this.f7983e = 0;
                    }
                    v2.n1.k("Shake detected.");
                    this.f7982d = a8;
                    int i7 = this.f7983e + 1;
                    this.f7983e = i7;
                    e22 e22Var = this.f7984f;
                    if (e22Var != null) {
                        if (i7 == ((Integer) s2.b0.c().d(uy.ca)).intValue()) {
                            b12 b12Var = (b12) e22Var;
                            b12Var.p(new y02(b12Var), a12.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b(e22 e22Var) {
        this.f7984f = e22Var;
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) s2.b0.c().d(uy.Y9)).booleanValue()) {
                    if (this.f7980b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f7979a.getSystemService("sensor");
                        this.f7980b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i7 = v2.n1.f26802b;
                            w2.p.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f7981c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f7985g && (sensorManager = this.f7980b) != null && (sensor = this.f7981c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f7982d = r2.t.o().a() - ((Integer) s2.b0.c().d(uy.aa)).intValue();
                        this.f7985g = true;
                        v2.n1.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f7985g) {
                    SensorManager sensorManager = this.f7980b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f7981c);
                        v2.n1.k("Stopped listening for shake gestures.");
                    }
                    this.f7985g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
