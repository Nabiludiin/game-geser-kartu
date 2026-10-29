package u2;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.da2;
import com.google.android.gms.internal.ads.fa2;
import com.google.android.gms.internal.ads.iy3;
import com.google.android.gms.internal.ads.j92;
import com.google.android.gms.internal.ads.k92;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.me0;
import com.google.android.gms.internal.ads.mr0;
import com.google.android.gms.internal.ads.of3;
import com.google.android.gms.internal.ads.qx1;
import com.google.android.gms.internal.ads.rx1;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.ve0;
import java.util.Collections;
import v2.f2;
import v2.n1;

/* compiled from: MyApplication */
public abstract class a0 extends bf0 implements i {
    static final int M = Color.argb(0, 0, 0, 0);
    s A;
    private Runnable E;
    private boolean F;
    private boolean G;
    private Toolbar K;

    /* renamed from: q, reason: collision with root package name */
    protected final Activity f26489q;

    /* renamed from: r, reason: collision with root package name */
    AdOverlayInfoParcel f26490r;

    /* renamed from: s, reason: collision with root package name */
    mr0 f26491s;

    /* renamed from: t, reason: collision with root package name */
    t f26492t;

    /* renamed from: u, reason: collision with root package name */
    f0 f26493u;

    /* renamed from: w, reason: collision with root package name */
    FrameLayout f26495w;

    /* renamed from: x, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f26496x;

    /* renamed from: v, reason: collision with root package name */
    boolean f26494v = false;

    /* renamed from: y, reason: collision with root package name */
    boolean f26497y = false;

    /* renamed from: z, reason: collision with root package name */
    boolean f26498z = false;
    boolean B = false;
    int L = 1;
    private final Object C = new Object();
    private final View.OnClickListener D = new n(this);
    private boolean H = false;
    private boolean I = false;
    private boolean J = true;

    public a0(Activity activity) {
        this.f26489q = activity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.X0)).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.W0)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o8(android.content.res.Configuration r7) {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f26490r
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r2.l r0 = r0.E
            if (r0 == 0) goto L10
            boolean r0 = r0.f25812r
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r6.f26489q
            v2.x2 r4 = r2.t.j()
            boolean r7 = r4.d(r3, r7)
            boolean r4 = r6.f26498z
            if (r4 == 0) goto L37
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.X0
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r0 = r4.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L37
        L34:
            r7 = r2
        L35:
            r0 = r7
            goto L5b
        L37:
            if (r7 == 0) goto L4b
            com.google.android.gms.internal.ads.ly r7 = com.google.android.gms.internal.ads.uy.W0
            com.google.android.gms.internal.ads.sy r0 = s2.b0.c()
            java.lang.Object r7 = r0.d(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L34
        L4b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r6.f26490r
            if (r7 == 0) goto L59
            r2.l r7 = r7.E
            if (r7 == 0) goto L59
            boolean r7 = r7.f25817w
            if (r7 == 0) goto L59
            r7 = r1
            goto L35
        L59:
            r7 = r1
            r0 = r2
        L5b:
            android.view.Window r3 = r3.getWindow()
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.f17231w1
            com.google.android.gms.internal.ads.sy r5 = s2.b0.c()
            java.lang.Object r4 = r5.d(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L87
            android.view.View r4 = r3.getDecorView()
            if (r7 == 0) goto L80
            if (r0 == 0) goto L7d
            r7 = 5894(0x1706, float:8.259E-42)
        L7b:
            r0 = r1
            goto L83
        L7d:
            r7 = 5380(0x1504, float:7.539E-42)
            goto L7b
        L80:
            r7 = 256(0x100, float:3.59E-43)
            r0 = r2
        L83:
            r4.setSystemUiVisibility(r7)
            goto La7
        L87:
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La0
            r3.addFlags(r5)
            r3.clearFlags(r4)
            if (r0 == 0) goto L9e
            android.view.View r7 = r3.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r7.setSystemUiVisibility(r0)
        L9e:
            r0 = r1
            goto La7
        La0:
            r3.addFlags(r4)
            r3.clearFlags(r5)
            r0 = r2
        La7:
            com.google.android.gms.internal.ads.ly r7 = com.google.android.gms.internal.ads.uy.re
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r7 = r4.d(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lcf
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r7 > r4) goto Lcf
            r4 = 28
            if (r7 < r4) goto Lcf
            if (r0 == 0) goto Lcf
            android.view.WindowManager$LayoutParams r7 = r3.getAttributes()
            u2.w.a(r7, r1)
            androidx.core.view.o0.a(r3, r2)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.o8(android.content.res.Configuration):void");
    }

    private final void p8(View view) {
        fa2 k02;
        da2 A0;
        mr0 mr0Var = this.f26491s;
        if (mr0Var == null) {
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && (A0 = mr0Var.A0()) != null) {
            A0.f(view);
        } else if (((Boolean) s2.b0.c().d(uy.R5)).booleanValue() && (k02 = mr0Var.k0()) != null && k02.b()) {
            r2.t.y().c(k02.a(), view);
        }
    }

    private static final void q8(fa2 fa2Var, View view) {
        if (fa2Var == null || view == null) {
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.R5)).booleanValue() && fa2Var.b()) {
            return;
        }
        r2.t.y().a(fa2Var.a(), view);
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void K2(int i7, String[] strArr, int[] iArr) {
        if (i7 == 12345) {
            Activity activity = this.f26489q;
            j92 e8 = k92.e();
            e8.a(activity);
            e8.b(this.f26490r.A == 5 ? this : null);
            try {
                this.f26490r.L.c6(strArr, iArr, w3.b.C1(e8.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    protected final void Q() {
        this.f26491s.U();
    }

    public final void R0(boolean z7) {
        if (this.f26490r.M) {
            return;
        }
        int intValue = ((Integer) s2.b0.c().d(uy.I5)).intValue();
        boolean z8 = ((Boolean) s2.b0.c().d(uy.f17199s1)).booleanValue() || z7;
        e0 e0Var = new e0();
        e0Var.f26512d = 50;
        e0Var.f26509a = true != z8 ? 0 : intValue;
        e0Var.f26510b = true != z8 ? intValue : 0;
        e0Var.f26511c = intValue;
        this.f26493u = new f0(this.f26489q, e0Var, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z8 ? 9 : 11);
        r8(z7, this.f26490r.f4346w);
        this.A.addView(this.f26493u, layoutParams);
        p8(this.f26493u);
    }

    public final void T() {
        if (this.B) {
            this.B = false;
            Q();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void V2(int i7, int i8, Intent intent) {
        rx1 U;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i7 == 236) {
            ly lyVar = uy.he;
            if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i8);
                n1.k(sb.toString());
                mr0 mr0Var = this.f26491s;
                if (mr0Var == null || mr0Var.s0() == null || (U = mr0Var.s0().U()) == null || (adOverlayInfoParcel = this.f26490r) == null || !((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                    return;
                }
                qx1 a8 = U.a();
                a8.c("action", "hilca");
                a8.c("gqi", iy3.a(adOverlayInfoParcel.G));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length());
                sb2.append(i8);
                a8.c("hilr", sb2.toString());
                if (i8 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        a8.c("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        a8.c("hills", stringExtra2);
                    }
                }
                a8.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void X(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f26497y);
    }

    public final void Z() {
        this.A.f26540r = true;
    }

    public final void b() {
        this.L = 3;
        Activity activity = this.f26489q;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.A != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        mr0 mr0Var = this.f26491s;
        if (mr0Var != null) {
            mr0Var.N0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void c() {
        this.L = 1;
    }

    public final void d() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel != null && this.f26494v) {
            s8(adOverlayInfoParcel.f4349z);
        }
        if (this.f26495w != null) {
            this.f26489q.setContentView(this.A);
            this.G = true;
            this.f26495w.removeAllViews();
            this.f26495w = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f26496x;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f26496x = null;
        }
        this.f26494v = false;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void e() {
        c0 c0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel == null || (c0Var = adOverlayInfoParcel.f4342s) == null) {
            return;
        }
        c0Var.t7();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean f() {
        this.L = 1;
        if (this.f26491s == null) {
            return true;
        }
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && this.f26491s.canGoBack()) {
            this.f26491s.goBack();
            return false;
        }
        boolean n02 = this.f26491s.n0();
        if (!n02) {
            this.f26491s.B("onbackblocked", Collections.EMPTY_MAP);
        }
        return n02;
    }

    @Override // u2.i
    public final void h() {
        this.L = 2;
        this.f26489q.finish();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void i() {
        c0 c0Var;
        if (((Boolean) s2.b0.c().d(uy.F5)).booleanValue()) {
            mr0 mr0Var = this.f26491s;
            if (mr0Var == null || mr0Var.q0()) {
                int i7 = n1.f26802b;
                w2.p.f("The webview does not exist. Ignoring action.");
            } else {
                this.f26491s.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel == null || (c0Var = adOverlayInfoParcel.f4342s) == null) {
            return;
        }
        c0Var.Z4();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void j() {
        c0 c0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel == null || (c0Var = adOverlayInfoParcel.f4342s) == null) {
            return;
        }
        c0Var.T5();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void j0(w3.a aVar) {
        o8((Configuration) w3.b.r0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void k() {
        c0 c0Var;
        d();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel != null && (c0Var = adOverlayInfoParcel.f4342s) != null) {
            c0Var.P4();
        }
        if (!((Boolean) s2.b0.c().d(uy.F5)).booleanValue() && this.f26491s != null && (!this.f26489q.isFinishing() || this.f26492t == null)) {
            this.f26491s.onPause();
        }
        k8();
    }

    protected final void k8() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        c0 c0Var;
        if (!this.f26489q.isFinishing() || this.H) {
            return;
        }
        this.H = true;
        mr0 mr0Var = this.f26491s;
        if (mr0Var != null) {
            mr0Var.h1(this.L - 1);
            synchronized (this.C) {
                try {
                    if (!this.F && this.f26491s.E0()) {
                        if (((Boolean) s2.b0.c().d(uy.D5)).booleanValue() && !this.I && (adOverlayInfoParcel = this.f26490r) != null && (c0Var = adOverlayInfoParcel.f4342s) != null) {
                            c0Var.H2();
                        }
                        Runnable runnable = new Runnable() { // from class: u2.p
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                a0.this.l8();
                            }
                        };
                        this.E = runnable;
                        f2.f26746l.postDelayed(runnable, ((Long) s2.b0.c().d(uy.f17175p1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        l8();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void l() {
        c0 c0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel != null && (c0Var = adOverlayInfoParcel.f4342s) != null) {
            c0Var.M5();
        }
        o8(this.f26489q.getResources().getConfiguration());
        if (((Boolean) s2.b0.c().d(uy.F5)).booleanValue()) {
            return;
        }
        mr0 mr0Var = this.f26491s;
        if (mr0Var != null && !mr0Var.q0()) {
            this.f26491s.onResume();
        } else {
            int i7 = n1.f26802b;
            w2.p.f("The webview does not exist. Ignoring action.");
        }
    }

    final void l8() {
        mr0 mr0Var;
        c0 c0Var;
        if (this.I) {
            return;
        }
        this.I = true;
        mr0 mr0Var2 = this.f26491s;
        if (mr0Var2 != null) {
            this.A.removeView(mr0Var2.Z());
            t tVar = this.f26492t;
            if (tVar != null) {
                this.f26491s.V0(tVar.f26544d);
                this.f26491s.q1(false);
                if (((Boolean) s2.b0.c().d(uy.Jd)).booleanValue() && this.f26491s.getParent() != null) {
                    ((ViewGroup) this.f26491s.getParent()).removeView(this.f26491s.Z());
                }
                ViewGroup viewGroup = this.f26492t.f26543c;
                View Z = this.f26491s.Z();
                t tVar2 = this.f26492t;
                viewGroup.addView(Z, tVar2.f26541a, tVar2.f26542b);
                this.f26492t = null;
            } else {
                Activity activity = this.f26489q;
                if (activity.getApplicationContext() != null) {
                    this.f26491s.V0(activity.getApplicationContext());
                }
            }
            this.f26491s = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel != null && (c0Var = adOverlayInfoParcel.f4342s) != null) {
            c0Var.V5(this.L);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f26490r;
        if (adOverlayInfoParcel2 == null || (mr0Var = adOverlayInfoParcel2.f4343t) == null) {
            return;
        }
        q8(mr0Var.k0(), this.f26490r.f4343t.Z());
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void m() {
        c0 c0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel != null && (c0Var = adOverlayInfoParcel.f4342s) != null) {
            c0Var.a4();
        }
        mr0 mr0Var = this.f26491s;
        if (mr0Var != null) {
            try {
                this.A.removeView(mr0Var.Z());
            } catch (NullPointerException unused) {
            }
        }
        k8();
    }

    public final void m8() {
        synchronized (this.C) {
            try {
                this.F = true;
                Runnable runnable = this.E;
                if (runnable != null) {
                    of3 of3Var = f2.f26746l;
                    of3Var.removeCallbacks(runnable);
                    of3Var.post(this.E);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n8(k92 k92Var) {
        ve0 ve0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel == null || (ve0Var = adOverlayInfoParcel.L) == null) {
            throw new r("noioou");
        }
        ve0Var.L0(w3.b.C1(k92Var));
    }

    public final void o1(boolean z7) {
        if (z7) {
            this.A.setBackgroundColor(0);
        } else {
            this.A.setBackgroundColor(-16777216);
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void p() {
        this.G = true;
    }

    public final void r8(boolean z7, boolean z8) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        r2.l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        r2.l lVar2;
        boolean z9 = true;
        boolean z10 = ((Boolean) s2.b0.c().d(uy.f17183q1)).booleanValue() && (adOverlayInfoParcel2 = this.f26490r) != null && (lVar2 = adOverlayInfoParcel2.E) != null && lVar2.f25818x;
        boolean z11 = ((Boolean) s2.b0.c().d(uy.f17191r1)).booleanValue() && (adOverlayInfoParcel = this.f26490r) != null && (lVar = adOverlayInfoParcel.E) != null && lVar.f25819y;
        if (z7 && z8 && z10 && !z11) {
            new me0(this.f26491s, "useCustomClose").b("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        f0 f0Var = this.f26493u;
        if (f0Var != null) {
            if (!z11 && (!z8 || z10)) {
                z9 = false;
            }
            f0Var.a(z9);
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void s() {
        c0 c0Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26490r;
        if (adOverlayInfoParcel != null && (c0Var = adOverlayInfoParcel.f4342s) != null) {
            c0Var.v3();
        }
        if (((Boolean) s2.b0.c().d(uy.F5)).booleanValue() && this.f26491s != null && (!this.f26489q.isFinishing() || this.f26492t == null)) {
            this.f26491s.onPause();
        }
        k8();
    }

    public final void s8(int i7) {
        Activity activity = this.f26489q;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) s2.b0.c().d(uy.A6)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) s2.b0.c().d(uy.B6)).intValue()) {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= ((Integer) s2.b0.c().d(uy.C6)).intValue()) {
                    if (i8 <= ((Integer) s2.b0.c().d(uy.D6)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i7);
        } catch (Throwable th) {
            r2.t.l().j(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void t8(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f26489q;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f26495w = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f26495w.addView(view, -1, -1);
        activity.setContentView(this.f26495w);
        this.G = true;
        this.f26496x = customViewCallback;
        this.f26494v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void u8(boolean r44) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.u8(boolean):void");
    }

    public final void v8(String str) {
        Toolbar toolbar = this.K;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: r -> 0x0037, TryCatch #0 {r -> 0x0037, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003a, B:19:0x0043, B:21:0x004e, B:22:0x0050, B:24:0x0056, B:25:0x0062, B:27:0x0069, B:30:0x0076, B:32:0x007a, B:34:0x007f, B:36:0x008d, B:38:0x0091, B:40:0x0097, B:41:0x009a, B:43:0x00a0, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b0, B:51:0x00b6, B:52:0x00b9, B:54:0x00bd, B:56:0x00c1, B:57:0x00c4, B:64:0x00ef, B:67:0x00f3, B:68:0x00fa, B:69:0x00fb, B:71:0x00ff, B:73:0x010c, B:75:0x0070, B:77:0x0074, B:78:0x0089, B:79:0x0110, B:80:0x0117), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd A[Catch: r -> 0x0037, TryCatch #0 {r -> 0x0037, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003a, B:19:0x0043, B:21:0x004e, B:22:0x0050, B:24:0x0056, B:25:0x0062, B:27:0x0069, B:30:0x0076, B:32:0x007a, B:34:0x007f, B:36:0x008d, B:38:0x0091, B:40:0x0097, B:41:0x009a, B:43:0x00a0, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b0, B:51:0x00b6, B:52:0x00b9, B:54:0x00bd, B:56:0x00c1, B:57:0x00c4, B:64:0x00ef, B:67:0x00f3, B:68:0x00fa, B:69:0x00fb, B:71:0x00ff, B:73:0x010c, B:75:0x0070, B:77:0x0074, B:78:0x0089, B:79:0x0110, B:80:0x0117), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c A[Catch: r -> 0x0037, TryCatch #0 {r -> 0x0037, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003a, B:19:0x0043, B:21:0x004e, B:22:0x0050, B:24:0x0056, B:25:0x0062, B:27:0x0069, B:30:0x0076, B:32:0x007a, B:34:0x007f, B:36:0x008d, B:38:0x0091, B:40:0x0097, B:41:0x009a, B:43:0x00a0, B:44:0x00a3, B:46:0x00a9, B:48:0x00ad, B:49:0x00b0, B:51:0x00b6, B:52:0x00b9, B:54:0x00bd, B:56:0x00c1, B:57:0x00c4, B:64:0x00ef, B:67:0x00f3, B:68:0x00fa, B:69:0x00fb, B:71:0x00ff, B:73:0x010c, B:75:0x0070, B:77:0x0074, B:78:0x0089, B:79:0x0110, B:80:0x0117), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.cf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x7(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.a0.x7(android.os.Bundle):void");
    }

    public final void z() {
        this.A.removeView(this.f26493u);
        R0(true);
    }
}
