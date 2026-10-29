package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* compiled from: MyApplication */
public final class lo {

    /* renamed from: a, reason: collision with root package name */
    private long f11690a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f11691b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f11692c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f11693d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f11694e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f11695f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f11696g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f11697h = -1;

    private static boolean l(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics m(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    public final void a() {
        this.f11691b = this.f11690a;
        this.f11690a = SystemClock.uptimeMillis();
    }

    public final void b(Context context, View view) {
        this.f11693d = this.f11692c;
        this.f11692c = SystemClock.uptimeMillis();
        long j7 = this.f11694e;
        if (j7 != -1) {
            this.f11695f = j7;
        }
        DisplayMetrics m7 = m(context);
        int i7 = m7.widthPixels * m7.heightPixels;
        if (view != null) {
            int min = Math.min(view.getWidth(), m7.widthPixels) * Math.min(view.getHeight(), m7.heightPixels);
            if (min + min >= i7 || (min == 0 && l(view))) {
                this.f11694e = this.f11692c;
                return;
            }
        }
        this.f11694e = -1L;
    }

    public final void c() {
        this.f11697h = this.f11696g;
        this.f11696g = SystemClock.uptimeMillis();
    }

    public final long d() {
        return this.f11691b;
    }

    public final long e() {
        return this.f11690a;
    }

    public final long f() {
        return this.f11692c;
    }

    public final long g() {
        return this.f11693d;
    }

    public final long h() {
        return this.f11695f;
    }

    public final long i() {
        return this.f11694e;
    }

    public final long j() {
        return this.f11696g;
    }

    public final long k() {
        return this.f11697h;
    }
}
