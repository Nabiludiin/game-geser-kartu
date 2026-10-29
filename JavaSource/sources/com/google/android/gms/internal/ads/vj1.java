package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* compiled from: MyApplication */
public final class vj1 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f17646w = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: q, reason: collision with root package name */
    private final Handler f17647q;

    /* renamed from: r, reason: collision with root package name */
    private final int[] f17648r = new int[1];

    /* renamed from: s, reason: collision with root package name */
    private EGLDisplay f17649s;

    /* renamed from: t, reason: collision with root package name */
    private EGLContext f17650t;

    /* renamed from: u, reason: collision with root package name */
    private EGLSurface f17651u;

    /* renamed from: v, reason: collision with root package name */
    private SurfaceTexture f17652v;

    public vj1(Handler handler, ui1 ui1Var) {
        this.f17647q = handler;
    }

    public final void a(int i7) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        xl1.f(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        xl1.f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f17649s = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f17646w, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z7 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = hi2.f9535a;
        xl1.f(z7, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f17649s, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        xl1.f(eglCreateContext != null, "eglCreateContext failed");
        this.f17650t = eglCreateContext;
        EGLDisplay eGLDisplay = this.f17649s;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            xl1.f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        xl1.f(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
        this.f17651u = eglCreatePbufferSurface;
        int[] iArr3 = this.f17648r;
        GLES20.glGenTextures(1, iArr3, 0);
        xl1.e();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f17652v = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void b() {
        this.f17647q.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f17652v;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f17648r, 0);
            }
            EGLDisplay eGLDisplay = this.f17649s;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f17649s;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f17651u;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f17649s, this.f17651u);
            }
            EGLContext eGLContext = this.f17650t;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f17649s, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f17649s;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f17649s);
            }
            this.f17649s = null;
            this.f17650t = null;
            this.f17651u = null;
            this.f17652v = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f17649s;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f17649s;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f17651u;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f17649s, this.f17651u);
            }
            EGLContext eGLContext2 = this.f17650t;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f17649s, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f17649s;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f17649s);
            }
            this.f17649s = null;
            this.f17650t = null;
            this.f17651u = null;
            this.f17652v = null;
            throw th;
        }
    }

    public final SurfaceTexture c() {
        SurfaceTexture surfaceTexture = this.f17652v;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f17647q.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f17652v;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
