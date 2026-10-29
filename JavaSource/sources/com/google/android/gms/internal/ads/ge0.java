package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

/* compiled from: MyApplication */
public final class ge0 extends me0 {

    /* renamed from: c, reason: collision with root package name */
    private String f8825c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8826d;

    /* renamed from: e, reason: collision with root package name */
    private int f8827e;

    /* renamed from: f, reason: collision with root package name */
    private int f8828f;

    /* renamed from: g, reason: collision with root package name */
    private int f8829g;

    /* renamed from: h, reason: collision with root package name */
    private int f8830h;

    /* renamed from: i, reason: collision with root package name */
    private int f8831i;

    /* renamed from: j, reason: collision with root package name */
    private int f8832j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f8833k;

    /* renamed from: l, reason: collision with root package name */
    private final mr0 f8834l;

    /* renamed from: m, reason: collision with root package name */
    private final Activity f8835m;

    /* renamed from: n, reason: collision with root package name */
    private bu0 f8836n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f8837o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f8838p;

    /* renamed from: q, reason: collision with root package name */
    private final ne0 f8839q;

    /* renamed from: r, reason: collision with root package name */
    private PopupWindow f8840r;

    /* renamed from: s, reason: collision with root package name */
    private RelativeLayout f8841s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f8842t;

    static {
        com.google.android.gms.common.util.f.f("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public ge0(mr0 mr0Var, ne0 ne0Var) {
        super(mr0Var, "resize");
        this.f8825c = "top-right";
        this.f8826d = true;
        this.f8827e = 0;
        this.f8828f = 0;
        this.f8829g = -1;
        this.f8830h = 0;
        this.f8831i = 0;
        this.f8832j = -1;
        this.f8833k = new Object();
        this.f8834l = mr0Var;
        this.f8835m = mr0Var.i();
        this.f8839q = ne0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void m(boolean z7) {
        if (((Boolean) s2.b0.c().d(uy.Rb)).booleanValue()) {
            this.f8841s.removeView((View) this.f8834l);
            this.f8840r.dismiss();
        } else {
            this.f8840r.dismiss();
            this.f8841s.removeView((View) this.f8834l);
        }
        if (((Boolean) s2.b0.c().d(uy.Sb)).booleanValue()) {
            View view = (View) this.f8834l;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f8842t;
        if (viewGroup != null) {
            viewGroup.removeView(this.f8837o);
            if (((Boolean) s2.b0.c().d(uy.Tb)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.f8842t;
                    mr0 mr0Var = this.f8834l;
                    viewGroup2.addView((View) mr0Var);
                    mr0Var.T0(this.f8836n);
                } catch (IllegalStateException e8) {
                    int i7 = v2.n1.f26802b;
                    w2.p.d("Unable to add webview back to view hierarchy.", e8);
                }
            } else {
                ViewGroup viewGroup3 = this.f8842t;
                mr0 mr0Var2 = this.f8834l;
                viewGroup3.addView((View) mr0Var2);
                mr0Var2.T0(this.f8836n);
            }
        }
        if (z7) {
            f("default");
            ne0 ne0Var = this.f8839q;
            if (ne0Var != null) {
                ne0Var.b();
            }
        }
        this.f8840r = null;
        this.f8841s = null;
        this.f8842t = null;
        this.f8838p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023a, code lost:
    
        b("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0240, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041a A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0121, B:62:0x012d, B:64:0x023a, B:65:0x023f, B:67:0x0241, B:69:0x025e, B:71:0x026a, B:72:0x02a1, B:77:0x0313, B:78:0x036a, B:80:0x0382, B:81:0x039f, B:83:0x03a7, B:84:0x03ae, B:85:0x03d5, B:89:0x03d8, B:91:0x0406, B:92:0x0418, B:96:0x0322, B:99:0x0331, B:102:0x0340, B:105:0x034f, B:109:0x0360, B:110:0x0364, B:111:0x029e, B:112:0x041a, B:113:0x041f, B:115:0x0136, B:117:0x013a, B:121:0x014d, B:122:0x0158, B:125:0x01d2, B:127:0x01d5, B:129:0x01d9, B:132:0x01df, B:135:0x0165, B:136:0x0170, B:140:0x017f, B:143:0x0192, B:146:0x01a2, B:149:0x01b2, B:150:0x01c5, B:151:0x01ee, B:154:0x0214, B:157:0x0224, B:158:0x021a, B:160:0x0222, B:161:0x020c, B:163:0x0212, B:164:0x0229, B:165:0x0231, B:166:0x0421, B:167:0x0426, B:169:0x0428, B:170:0x042d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025e A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0030, B:18:0x0035, B:20:0x0037, B:22:0x003d, B:23:0x0042, B:25:0x0044, B:27:0x0052, B:28:0x0063, B:30:0x0071, B:31:0x0082, B:33:0x0090, B:34:0x00a1, B:36:0x00af, B:37:0x00c0, B:39:0x00ce, B:40:0x00dc, B:42:0x00ea, B:43:0x00ec, B:45:0x00f0, B:47:0x00f4, B:49:0x00fa, B:52:0x0102, B:56:0x0121, B:62:0x012d, B:64:0x023a, B:65:0x023f, B:67:0x0241, B:69:0x025e, B:71:0x026a, B:72:0x02a1, B:77:0x0313, B:78:0x036a, B:80:0x0382, B:81:0x039f, B:83:0x03a7, B:84:0x03ae, B:85:0x03d5, B:89:0x03d8, B:91:0x0406, B:92:0x0418, B:96:0x0322, B:99:0x0331, B:102:0x0340, B:105:0x034f, B:109:0x0360, B:110:0x0364, B:111:0x029e, B:112:0x041a, B:113:0x041f, B:115:0x0136, B:117:0x013a, B:121:0x014d, B:122:0x0158, B:125:0x01d2, B:127:0x01d5, B:129:0x01d9, B:132:0x01df, B:135:0x0165, B:136:0x0170, B:140:0x017f, B:143:0x0192, B:146:0x01a2, B:149:0x01b2, B:150:0x01c5, B:151:0x01ee, B:154:0x0214, B:157:0x0224, B:158:0x021a, B:160:0x0222, B:161:0x020c, B:163:0x0212, B:164:0x0229, B:165:0x0231, B:166:0x0421, B:167:0x0426, B:169:0x0428, B:170:0x042d), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ge0.h(java.util.Map):void");
    }

    public final void i(final boolean z7) {
        synchronized (this.f8833k) {
            try {
                if (this.f8840r != null) {
                    if (!((Boolean) s2.b0.c().d(uy.Qb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        m(z7);
                    } else {
                        cm0.f6505f.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.fe0
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                ge0.this.m(z7);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(int i7, int i8, boolean z7) {
        synchronized (this.f8833k) {
            this.f8827e = i7;
            this.f8828f = i8;
        }
    }

    public final boolean k() {
        boolean z7;
        synchronized (this.f8833k) {
            z7 = this.f8840r != null;
        }
        return z7;
    }

    public final void l(int i7, int i8) {
        this.f8827e = i7;
        this.f8828f = i8;
    }
}
