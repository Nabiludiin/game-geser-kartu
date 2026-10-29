package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.p0;

/* compiled from: MyApplication */
public final class yj2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final yr2 f19615a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f19616b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19617c;

    /* renamed from: d, reason: collision with root package name */
    private final ql0 f19618d;

    yj2(dm2 dm2Var, w03 w03Var, Context context, ql0 ql0Var) {
        this.f19615a = dm2Var;
        this.f19616b = w03Var;
        this.f19617c = context;
        this.f19618d = ql0Var;
    }

    private final androidx.core.graphics.f d(float f8) {
        Window window;
        View decorView;
        androidx.core.view.p0 u7;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int statusBars;
        int displayCutout;
        int navigationBars;
        int captionBar;
        Insets insets;
        if (f8 == 0.0f) {
            return androidx.core.graphics.f.f1710e;
        }
        androidx.core.graphics.f fVar = androidx.core.graphics.f.f1710e;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) this.f19617c.getSystemService("window");
            if (windowManager != null) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                statusBars = WindowInsets.Type.statusBars();
                displayCutout = WindowInsets.Type.displayCutout();
                int i7 = statusBars | displayCutout;
                navigationBars = WindowInsets.Type.navigationBars();
                int i8 = i7 | navigationBars;
                captionBar = WindowInsets.Type.captionBar();
                insets = windowInsets.getInsets(i8 | captionBar);
                fVar = androidx.core.graphics.f.d(insets);
            }
        } else {
            Activity d8 = r2.t.k().d();
            if (d8 != null && (window = d8.getWindow()) != null && (decorView = window.getDecorView()) != null && (u7 = androidx.core.view.e0.u(decorView)) != null) {
                fVar = u7.f(p0.m.c() | p0.m.a());
            }
        }
        return androidx.core.graphics.f.b((int) Math.ceil(fVar.f1711a / f8), (int) Math.ceil(fVar.f1712b / f8), (int) Math.ceil(fVar.f1713c / f8), (int) Math.ceil(fVar.f1714d / f8));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return p64.k(this.f19615a.a(), new hx3() { // from class: com.google.android.gms.internal.ads.uj2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return yj2.this.c((hs2) obj);
            }
        }, cm0.f6506g);
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 7;
    }

    final /* synthetic */ zj2 c(hs2 hs2Var) {
        String str;
        boolean z7;
        int i7;
        String str2;
        float f8;
        int i8;
        int i9;
        int i10;
        WindowManager windowManager;
        int i11;
        int i12;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Rect bounds2;
        DisplayMetrics displayMetrics;
        w03 w03Var = this.f19616b;
        s2.g5 g5Var = w03Var.f17960f;
        s2.g5[] g5VarArr = g5Var.f26101w;
        if (g5VarArr != null) {
            str = null;
            z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            for (s2.g5 g5Var2 : g5VarArr) {
                boolean z10 = g5Var2.f26103y;
                if (!z10 && !z8) {
                    str = g5Var2.f26095q;
                    z8 = true;
                }
                if (z10) {
                    if (!z9) {
                        z7 = true;
                    }
                    z9 = true;
                }
                if (z8 && z9) {
                    break;
                }
            }
        } else {
            str = g5Var.f26095q;
            z7 = g5Var.f26103y;
        }
        Context context = this.f19617c;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i7 = 0;
            str2 = null;
            f8 = 0.0f;
            i8 = 0;
        } else {
            ql0 ql0Var = this.f19618d;
            f8 = displayMetrics.density;
            i8 = displayMetrics.widthPixels;
            i7 = displayMetrics.heightPixels;
            str2 = ql0Var.q().t();
        }
        androidx.core.graphics.f d8 = (!((Boolean) s2.b0.c().d(uy.qe)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : d(f8);
        if (((Boolean) s2.b0.c().d(uy.re)).booleanValue() && (i10 = Build.VERSION.SDK_INT) <= 34 && i10 >= 28 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            if (i10 >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                i11 = bounds.width();
                bounds2 = currentWindowMetrics.getBounds();
                i12 = bounds2.height();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                i11 = point.x;
                i12 = point.y;
            }
            i7 = i12;
            i8 = i11;
            d8 = d(f8);
        }
        int i13 = i7;
        StringBuilder sb = new StringBuilder();
        if (g5VarArr != null) {
            boolean z11 = false;
            for (s2.g5 g5Var3 : g5VarArr) {
                if (g5Var3.f26103y) {
                    z11 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i14 = g5Var3.f26099u;
                    if (i14 == -1) {
                        i14 = f8 != 0.0f ? (int) (g5Var3.f26100v / f8) : -1;
                    }
                    sb.append(i14);
                    sb.append("x");
                    int i15 = g5Var3.f26096r;
                    if (i15 == -2) {
                        i15 = f8 != 0.0f ? (int) (g5Var3.f26097s / f8) : -2;
                    }
                    sb.append(i15);
                }
            }
            if (z11) {
                if (sb.length() != 0) {
                    i9 = 0;
                    sb.insert(0, "|");
                } else {
                    i9 = 0;
                }
                sb.insert(i9, "320x50");
            }
        }
        return new zj2(g5Var, str, z7, sb.toString(), f8, i8, i13, str2, w03Var.f17972r, d8);
    }
}
