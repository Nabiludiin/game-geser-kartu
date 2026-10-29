package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: MyApplication */
final class yn0 extends sf3 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f19677a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19678b;

    /* renamed from: c, reason: collision with root package name */
    private final Display f19679c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f19680d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f19681e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f19682f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f19683g;

    /* renamed from: h, reason: collision with root package name */
    private xn0 f19684h;

    yn0(Context context) {
        super("OrientationMonitor", "ads");
        this.f19677a = (SensorManager) context.getSystemService("sensor");
        this.f19679c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f19680d = new float[9];
        this.f19681e = new float[9];
        this.f19678b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.sf3
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f19678b) {
            try {
                if (this.f19682f == null) {
                    this.f19682f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f19680d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f19679c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.f19681e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.f19681e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f19681e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f19681e);
        }
        float[] fArr3 = this.f19681e;
        float f8 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f8;
        float f9 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f9;
        float f10 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f10;
        synchronized (this.f19678b) {
            System.arraycopy(fArr3, 0, this.f19682f, 0, 9);
        }
        xn0 xn0Var = this.f19684h;
        if (xn0Var != null) {
            xn0Var.a();
        }
    }

    final void b() {
        if (this.f19683g != null) {
            return;
        }
        SensorManager sensorManager = this.f19677a;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        of3 of3Var = new of3(handlerThread.getLooper());
        this.f19683g = of3Var;
        if (sensorManager.registerListener(this, defaultSensor, 0, of3Var)) {
            return;
        }
        int i8 = v2.n1.f26802b;
        w2.p.c("SensorManager.registerListener failed.");
        c();
    }

    final void c() {
        if (this.f19683g == null) {
            return;
        }
        this.f19677a.unregisterListener(this);
        this.f19683g.post(new wn0(this));
        this.f19683g = null;
    }

    final void d(xn0 xn0Var) {
        this.f19684h = xn0Var;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f19678b) {
            try {
                float[] fArr2 = this.f19682f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
