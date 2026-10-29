package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class mp1 {

    /* renamed from: a, reason: collision with root package name */
    private final ku1 f12353a;

    /* renamed from: b, reason: collision with root package name */
    private final xs1 f12354b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f12355c = null;

    public mp1(ku1 ku1Var, xs1 xs1Var) {
        this.f12353a = ku1Var;
        this.f12354b = xs1Var;
    }

    private static final int f(Context context, String str, int i7) {
        try {
            i7 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        s2.z.a();
        return w2.g.c(context, i7);
    }

    public final View a(final View view, final WindowManager windowManager) {
        mr0 a8 = this.f12353a.a(s2.g5.N0(), null, null);
        a8.Z().setVisibility(4);
        a8.Z().setContentDescription("policy_validator");
        a8.O0("/sendMessageToSdk", new y50() { // from class: com.google.android.gms.internal.ads.lp1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mp1.this.b((mr0) obj, map);
            }
        });
        a8.O0("/hideValidatorOverlay", new y50() { // from class: com.google.android.gms.internal.ads.gp1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mp1.this.c(windowManager, view, (mr0) obj, map);
            }
        });
        a8.O0("/open", new m60(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(a8);
        y50 y50Var = new y50() { // from class: com.google.android.gms.internal.ads.hp1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                mp1.this.d(view, windowManager, (mr0) obj, map);
            }
        };
        xs1 xs1Var = this.f12354b;
        xs1Var.h(weakReference, "/loadNativeAdPolicyViolations", y50Var);
        xs1Var.h(new WeakReference(a8), "/showValidatorOverlay", ip1.f10113a);
        return a8.Z();
    }

    final /* synthetic */ void b(mr0 mr0Var, Map map) {
        this.f12354b.f("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, mr0 mr0Var, Map map) {
        int i7 = v2.n1.f26802b;
        w2.p.a("Hide native ad policy validator overlay.");
        mr0Var.Z().setVisibility(8);
        if (mr0Var.Z().getWindowToken() != null) {
            windowManager.removeView(mr0Var.Z());
        }
        mr0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f12355c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f12355c);
    }

    final /* synthetic */ void d(final View view, final WindowManager windowManager, mr0 mr0Var, final Map map) {
        final mr0 mr0Var2;
        mr0Var.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.kp1
            @Override // com.google.android.gms.internal.ads.mt0
            public final /* synthetic */ void a(boolean z7, int i7, String str, String str2) {
                mp1.this.e(map, z7, i7, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int f8 = f(context, (String) map.get("validator_width"), ((Integer) s2.b0.c().d(uy.W8)).intValue());
        int f9 = f(context, (String) map.get("validator_height"), ((Integer) s2.b0.c().d(uy.X8)).intValue());
        int f10 = f(context, (String) map.get("validator_x"), 0);
        int f11 = f(context, (String) map.get("validator_y"), 0);
        mr0Var.T0(bu0.c(f8, f9));
        try {
            mr0Var.Q().getSettings().setUseWideViewPort(((Boolean) s2.b0.c().d(uy.Y8)).booleanValue());
            mr0Var.Q().getSettings().setLoadWithOverviewMode(((Boolean) s2.b0.c().d(uy.Z8)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams k7 = v2.u0.k();
        k7.x = f10;
        k7.y = f11;
        windowManager.updateViewLayout(mr0Var.Z(), k7);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i7 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - f11;
            mr0Var2 = mr0Var;
            this.f12355c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.jp1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        mr0 mr0Var3 = mr0Var2;
                        if (mr0Var3.Z().getWindowToken() == null) {
                            return;
                        }
                        int i8 = i7;
                        WindowManager.LayoutParams layoutParams = k7;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i8;
                        } else {
                            layoutParams.y = rect2.top - i8;
                        }
                        windowManager.updateViewLayout(mr0Var3.Z(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f12355c);
            }
        } else {
            mr0Var2 = mr0Var;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        mr0Var2.loadUrl(str2);
    }

    final /* synthetic */ void e(Map map, boolean z7, int i7, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f12354b.f("sendMessageToNativeJs", hashMap);
    }
}
