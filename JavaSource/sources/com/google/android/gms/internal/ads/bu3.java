package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: MyApplication */
public final class bu3 implements it3 {

    /* renamed from: a, reason: collision with root package name */
    private long f6008a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f6009b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f6010c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f6011d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f6012e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f6013f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f6014g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f6015h = -1;

    /* renamed from: i, reason: collision with root package name */
    private final long f6016i = SystemClock.uptimeMillis();

    public bu3(sh3 sh3Var) {
    }

    private static boolean a(View view) {
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
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    private static DisplayMetrics e(Context context) {
        boolean isUiContext;
        if (Build.VERSION.SDK_INT >= 33) {
            isUiContext = context.isUiContext();
            if (!isUiContext) {
                return null;
            }
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return null;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    private final void f(Map map) {
        map.put("tcq", Long.valueOf(this.f6008a));
        map.put("tpq", Long.valueOf(this.f6009b));
        map.put("tcc", Long.valueOf(this.f6014g));
        map.put("tpc", Long.valueOf(this.f6015h));
        map.put("tpv", Long.valueOf(this.f6011d));
        map.put("tcv", Long.valueOf(this.f6010c));
        map.put("tchv", Long.valueOf(this.f6012e));
        map.put("tphv", Long.valueOf(this.f6013f));
        map.put("tst", Long.valueOf(this.f6016i));
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final synchronized void b(Map map) {
        this.f6015h = this.f6014g;
        this.f6014g = SystemClock.uptimeMillis();
        f(map);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final synchronized void c(Map map) {
        this.f6009b = this.f6008a;
        this.f6008a = SystemClock.uptimeMillis();
        f(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (a(r8) != false) goto L19;
     */
    @Override // com.google.android.gms.internal.ads.it3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.util.Map r6, android.content.Context r7, android.view.View r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f6010c     // Catch: java.lang.Throwable -> L16
            r5.f6011d = r0     // Catch: java.lang.Throwable -> L16
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L16
            r5.f6010c = r0     // Catch: java.lang.Throwable -> L16
            long r0 = r5.f6012e     // Catch: java.lang.Throwable -> L16
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            r5.f6013f = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r6 = move-exception
            goto L54
        L18:
            android.util.DisplayMetrics r7 = e(r7)     // Catch: java.lang.Throwable -> L16
            if (r7 != 0) goto L1f
            goto L4d
        L1f:
            int r0 = r7.widthPixels     // Catch: java.lang.Throwable -> L16
            int r1 = r7.heightPixels     // Catch: java.lang.Throwable -> L16
            int r0 = r0 * r1
            if (r8 == 0) goto L4d
            int r1 = r8.getWidth()     // Catch: java.lang.Throwable -> L16
            int r4 = r7.widthPixels     // Catch: java.lang.Throwable -> L16
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L16
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L16
            int r7 = r7.heightPixels     // Catch: java.lang.Throwable -> L16
            int r7 = java.lang.Math.min(r4, r7)     // Catch: java.lang.Throwable -> L16
            int r1 = r1 * r7
            int r7 = r1 + r1
            if (r7 < r0) goto L40
            goto L48
        L40:
            if (r1 != 0) goto L4d
            boolean r7 = a(r8)     // Catch: java.lang.Throwable -> L16
            if (r7 == 0) goto L4d
        L48:
            long r7 = r5.f6010c     // Catch: java.lang.Throwable -> L16
            r5.f6012e = r7     // Catch: java.lang.Throwable -> L16
            goto L4f
        L4d:
            r5.f6012e = r2     // Catch: java.lang.Throwable -> L16
        L4f:
            r5.f(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r5)
            return
        L54:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L16
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bu3.d(java.util.Map, android.content.Context, android.view.View):void");
    }
}
