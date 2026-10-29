package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: MyApplication */
public final class zn0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, xn0 {
    private static final float[] R = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private float A;
    private int B;
    private int C;
    private SurfaceTexture D;
    private SurfaceTexture E;
    private int F;
    private int G;
    private int H;
    private final FloatBuffer I;
    private final CountDownLatch J;
    private final Object K;
    private EGL10 L;
    private EGLDisplay M;
    private EGLContext N;
    private EGLSurface O;
    private volatile boolean P;
    private volatile boolean Q;

    /* renamed from: q, reason: collision with root package name */
    private final yn0 f20234q;

    /* renamed from: r, reason: collision with root package name */
    private final float[] f20235r;

    /* renamed from: s, reason: collision with root package name */
    private final float[] f20236s;

    /* renamed from: t, reason: collision with root package name */
    private final float[] f20237t;

    /* renamed from: u, reason: collision with root package name */
    private final float[] f20238u;

    /* renamed from: v, reason: collision with root package name */
    private final float[] f20239v;

    /* renamed from: w, reason: collision with root package name */
    private final float[] f20240w;

    /* renamed from: x, reason: collision with root package name */
    private final float[] f20241x;

    /* renamed from: y, reason: collision with root package name */
    private float f20242y;

    /* renamed from: z, reason: collision with root package name */
    private float f20243z;

    public zn0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = R;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.I = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f20235r = new float[9];
        this.f20236s = new float[9];
        this.f20237t = new float[9];
        this.f20238u = new float[9];
        this.f20239v = new float[9];
        this.f20240w = new float[9];
        this.f20241x = new float[9];
        this.f20242y = Float.NaN;
        yn0 yn0Var = new yn0(context);
        this.f20234q = yn0Var;
        yn0Var.d(this);
        this.J = new CountDownLatch(1);
        this.K = new Object();
    }

    private static final void h(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(glGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static final void i(float[] fArr, float[] fArr2, float[] fArr3) {
        float f8 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f8 + (f9 * f10) + (f11 * f12);
        float f13 = fArr2[0];
        float f14 = fArr3[1] * f13;
        float f15 = fArr3[4];
        float f16 = fArr3[7];
        fArr[1] = f14 + (f9 * f15) + (f11 * f16);
        float f17 = f13 * fArr3[2];
        float f18 = fArr2[1];
        float f19 = fArr3[5];
        float f20 = fArr3[8];
        fArr[2] = f17 + (f18 * f19) + (f11 * f20);
        float f21 = fArr2[3];
        float f22 = fArr3[0];
        float f23 = fArr2[4];
        float f24 = fArr2[5];
        fArr[3] = (f21 * f22) + (f10 * f23) + (f24 * f12);
        float f25 = fArr2[3];
        float f26 = fArr3[1];
        fArr[4] = (f25 * f26) + (f23 * f15) + (f24 * f16);
        float f27 = fArr3[2];
        fArr[5] = (f25 * f27) + (fArr2[4] * f19) + (f24 * f20);
        float f28 = fArr2[6] * f22;
        float f29 = fArr2[7];
        float f30 = fArr3[3] * f29;
        float f31 = fArr2[8];
        fArr[6] = f28 + f30 + (f12 * f31);
        float f32 = fArr2[6];
        fArr[7] = (f26 * f32) + (f29 * fArr3[4]) + (f16 * f31);
        fArr[8] = (f32 * f27) + (fArr2[7] * fArr3[5]) + (f31 * f20);
    }

    private static final void j(float[] fArr, float f8) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d8 = f8;
        fArr[4] = (float) Math.cos(d8);
        fArr[5] = (float) (-Math.sin(d8));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d8);
        fArr[8] = (float) Math.cos(d8);
    }

    private static final void k(float[] fArr, float f8) {
        double d8 = f8;
        fArr[0] = (float) Math.cos(d8);
        fArr[1] = (float) (-Math.sin(d8));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d8);
        fArr[4] = (float) Math.cos(d8);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int l(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        h("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            h("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            h("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            h("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i7);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                h("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void a() {
        Object obj = this.K;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.C = i7;
        this.B = i8;
        this.E = surfaceTexture;
    }

    public final void c(int i7, int i8) {
        Object obj = this.K;
        synchronized (obj) {
            this.C = i7;
            this.B = i8;
            this.P = true;
            obj.notifyAll();
        }
    }

    public final void d() {
        Object obj = this.K;
        synchronized (obj) {
            this.Q = true;
            this.E = null;
            obj.notifyAll();
        }
    }

    public final SurfaceTexture e() {
        if (this.E == null) {
            return null;
        }
        try {
            this.J.await();
        } catch (InterruptedException unused) {
        }
        return this.D;
    }

    public final void f(float f8, float f9) {
        int i7 = this.C;
        int i8 = this.B;
        if (i7 <= i8) {
            i7 = i8;
        }
        float f10 = i7;
        this.f20243z -= (f8 * 1.7453293f) / f10;
        float f11 = this.A - ((f9 * 1.7453293f) / f10);
        this.A = f11;
        if (f11 < -1.5707964f) {
            this.A = -1.5707964f;
            f11 = -1.5707964f;
        }
        if (f11 > 1.5707964f) {
            this.A = 1.5707964f;
        }
    }

    final boolean g() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.O;
        boolean z7 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z7 = this.L.eglDestroySurface(this.M, this.O) | this.L.eglMakeCurrent(this.M, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.O = null;
        }
        EGLContext eGLContext = this.N;
        if (eGLContext != null) {
            z7 |= this.L.eglDestroyContext(this.M, eGLContext);
            this.N = null;
        }
        EGLDisplay eGLDisplay = this.M;
        if (eGLDisplay == null) {
            return z7;
        }
        boolean eglTerminate = this.L.eglTerminate(eGLDisplay) | z7;
        this.M = null;
        return eglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.H++;
        Object obj = this.K;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zn0.run():void");
    }
}
