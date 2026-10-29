package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;

/* compiled from: MyApplication */
public abstract class xl1 {
    public static boolean a(Context context) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 24) {
            return false;
        }
        if (i7 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return g("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean b() {
        return g("EGL_KHR_surfaceless_context");
    }

    public static boolean c(int i7) {
        if (i7 == 6) {
            return d();
        }
        if (i7 == 7) {
            return g("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 33 && g("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void e() {
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z7 = true;
        }
        if (z7) {
            throw new wk1(sb.toString());
        }
    }

    public static void f(boolean z7, String str) {
        if (!z7) {
            throw new wk1(str);
        }
    }

    private static boolean g(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        f(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        f(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        e();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }
}
