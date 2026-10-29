package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class rs0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, mr0 {

    /* renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f15175s0 = 0;
    private f03 A;
    private boolean B;
    private boolean C;
    private yr0 D;
    private u2.a0 E;
    private fa2 F;
    private da2 G;
    private bu0 H;
    private final String I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private Boolean N;
    private boolean O;
    private final String P;
    private us0 Q;
    private boolean R;
    private boolean S;
    private x10 T;
    private u10 U;
    private vs V;
    private int W;

    /* renamed from: a0, reason: collision with root package name */
    private int f15176a0;

    /* renamed from: b0, reason: collision with root package name */
    private hz f15177b0;

    /* renamed from: c0, reason: collision with root package name */
    private final hz f15178c0;

    /* renamed from: d0, reason: collision with root package name */
    private hz f15179d0;

    /* renamed from: e0, reason: collision with root package name */
    private final iz f15180e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f15181f0;

    /* renamed from: g0, reason: collision with root package name */
    private u2.a0 f15182g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f15183h0;

    /* renamed from: i0, reason: collision with root package name */
    private final v2.l1 f15184i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f15185j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f15186k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f15187l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f15188m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f15189n0;

    /* renamed from: o0, reason: collision with root package name */
    private Map f15190o0;

    /* renamed from: p0, reason: collision with root package name */
    private final WindowManager f15191p0;

    /* renamed from: q, reason: collision with root package name */
    private final tt0 f15192q;

    /* renamed from: q0, reason: collision with root package name */
    private final iu f15193q0;

    /* renamed from: r, reason: collision with root package name */
    private final fn f15194r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f15195r0;

    /* renamed from: s, reason: collision with root package name */
    private final a13 f15196s;

    /* renamed from: t, reason: collision with root package name */
    private final d00 f15197t;

    /* renamed from: u, reason: collision with root package name */
    private final w2.a f15198u;

    /* renamed from: v, reason: collision with root package name */
    private r2.n f15199v;

    /* renamed from: w, reason: collision with root package name */
    private final r2.a f15200w;

    /* renamed from: x, reason: collision with root package name */
    private final DisplayMetrics f15201x;

    /* renamed from: y, reason: collision with root package name */
    private final float f15202y;

    /* renamed from: z, reason: collision with root package name */
    private c03 f15203z;

    protected rs0(tt0 tt0Var, bu0 bu0Var, String str, boolean z7, boolean z8, fn fnVar, d00 d00Var, w2.a aVar, kz kzVar, r2.n nVar, r2.a aVar2, iu iuVar, c03 c03Var, f03 f03Var, a13 a13Var) {
        super(tt0Var);
        f03 f03Var2;
        this.B = false;
        this.C = false;
        this.O = true;
        this.P = "";
        this.f15185j0 = -1;
        this.f15186k0 = -1;
        this.f15187l0 = -1;
        this.f15188m0 = -1;
        this.f15189n0 = -1;
        this.f15192q = tt0Var;
        this.H = bu0Var;
        this.I = str;
        this.L = z7;
        this.f15194r = fnVar;
        this.f15196s = a13Var;
        this.f15197t = d00Var;
        this.f15198u = aVar;
        this.f15199v = nVar;
        this.f15200w = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f15191p0 = windowManager;
        r2.t.g();
        DisplayMetrics j02 = v2.f2.j0(windowManager);
        this.f15201x = j02;
        this.f15202y = j02.density;
        this.f15193q0 = iuVar;
        this.f15203z = c03Var;
        this.A = f03Var;
        this.f15184i0 = new v2.l1(tt0Var.b(), this, this, null);
        this.f15195r0 = false;
        setBackgroundColor(0);
        if (((Boolean) s2.b0.c().d(uy.Ec)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Unable to enable Javascript.", e8);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) s2.b0.c().d(uy.Dc)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) s2.b0.c().d(uy.ke)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(r2.t.g().Q(tt0Var, aVar.f27051q));
        r2.t.g();
        v2.f2.d0(getContext(), settings);
        setDownloadListener(this);
        F1();
        addJavascriptInterface(new zs0(this, new ys0() { // from class: com.google.android.gms.internal.ads.xs0
            @Override // com.google.android.gms.internal.ads.ys0
            public final /* synthetic */ void a(Uri uri) {
                yr0 v12 = ((rs0) mr0.this).v1();
                if (v12 != null) {
                    v12.e0(uri);
                } else {
                    int i8 = v2.n1.f26802b;
                    w2.p.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        K1();
        iz izVar = new iz(new kz(true, "make_wv", this.I));
        this.f15180e0 = izVar;
        izVar.c().a(null);
        if (((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue() && (f03Var2 = this.A) != null && f03Var2.f7926b != null) {
            izVar.c().d("gqi", this.A.f7926b);
        }
        izVar.c();
        hz f8 = kz.f();
        this.f15178c0 = f8;
        izVar.a("native:view_create", f8);
        this.f15179d0 = null;
        this.f15177b0 = null;
        v2.h1.a().b(tt0Var);
        r2.t.l().l();
    }

    private final synchronized void C1(String str) {
        final String str2 = "about:blank";
        try {
            v2.f2.f26746l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.ns0

                /* renamed from: r, reason: collision with root package name */
                private final /* synthetic */ String f12879r = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    rs0.this.z1(this.f12879r);
                }
            });
        } catch (Throwable th) {
            r2.t.l().i(th, "AdWebViewImpl.loadUrlUnsafe");
            int i7 = v2.n1.f26802b;
            w2.p.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void D1() {
        Boolean e8 = r2.t.l().e();
        this.N = e8;
        if (e8 == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                t1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                t1(Boolean.FALSE);
            }
        }
    }

    private final void E1() {
        cz.a(this.f15180e0.c(), this.f15178c0, "aeh2");
    }

    private final synchronized void F1() {
        c03 c03Var = this.f15203z;
        if (c03Var != null && c03Var.f6175m0) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Disabling hardware acceleration on an overlay.");
            G1();
            return;
        }
        if (!this.L && !this.H.g()) {
            int i8 = v2.n1.f26802b;
            w2.p.a("Enabling hardware acceleration on an AdView.");
            H1();
            return;
        }
        int i9 = v2.n1.f26802b;
        w2.p.a("Enabling hardware acceleration on an overlay.");
        H1();
    }

    private final synchronized void G1() {
        try {
            if (!this.M) {
                setLayerType(1, null);
            }
            this.M = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void H1() {
        try {
            if (this.M) {
                setLayerType(0, null);
            }
            this.M = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void I1() {
        if (this.f15183h0) {
            return;
        }
        this.f15183h0 = true;
        r2.t.l().m();
    }

    private final synchronized void J1() {
        try {
            Map map = this.f15190o0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((qp0) it.next()).a();
                }
            }
            this.f15190o0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void K1() {
        iz izVar = this.f15180e0;
        if (izVar == null) {
            return;
        }
        kz c8 = izVar.c();
        zy c9 = r2.t.l().c();
        if (c9 != null) {
            c9.b(c8);
        }
    }

    private final void L1(boolean z7) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z7 ? "0" : "1");
        B("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized da2 A0() {
        return this.G;
    }

    final /* synthetic */ int A1() {
        return this.f15176a0;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public final void B(String str, Map map) {
        try {
            a(str, s2.z.a().s(map));
        } catch (JSONException unused) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void B0() {
        setBackgroundColor(0);
    }

    final /* synthetic */ void B1(int i7) {
        this.f15176a0 = i7;
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void C(u2.m mVar, boolean z7, boolean z8, String str) {
        this.D.y0(mVar, z7, z8, str);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final a13 C0() {
        return this.f15196s;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final List D() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final synchronized qp0 D0(String str) {
        Map map = this.f15190o0;
        if (map == null) {
            return null;
        }
        return (qp0) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final int E() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized boolean E0() {
        return this.W > 0;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized x10 F0() {
        return this.T;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final WebViewClient G0() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final int H() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final synchronized void H0(us0 us0Var) {
        if (this.Q == null) {
            this.Q = us0Var;
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized boolean I0() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void J0(int i7) {
        u2.a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.s8(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void L0(u2.a0 a0Var) {
        this.f15182g0 = a0Var;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void M() {
        yr0 yr0Var = this.D;
        if (yr0Var != null) {
            yr0Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void M0(x10 x10Var) {
        this.T = x10Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void N0(u2.a0 a0Var) {
        this.E = a0Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized u2.a0 O() {
        return this.E;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void O0(String str, y50 y50Var) {
        yr0 yr0Var = this.D;
        if (yr0Var != null) {
            yr0Var.b(str, y50Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.jt0
    public final fn P() {
        return this.f15194r;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void P0(c03 c03Var, f03 f03Var) {
        this.f15203z = c03Var;
        this.A = f03Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void Q0(vs vsVar) {
        this.V = vsVar;
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.it0
    public final synchronized bu0 R() {
        return this.H;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final a5.d R0() {
        d00 d00Var = this.f15197t;
        return d00Var == null ? p64.a(null) : d00Var.b();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final Context S() {
        return this.f15192q.c();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void S0(boolean z7) {
        u2.a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.r8(this.D.l(), z7);
        } else {
            this.J = z7;
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.dr0
    public final c03 T() {
        return this.f15203z;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void T0(bu0 bu0Var) {
        this.H = bu0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void U() {
        if (this.f15177b0 == null) {
            iz izVar = this.f15180e0;
            cz.a(izVar.c(), this.f15178c0, "aes2");
            izVar.c();
            hz f8 = kz.f();
            this.f15177b0 = f8;
            izVar.a("native:view_show", f8);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f15198u.f27051q);
        B("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void U0(boolean z7) {
        this.D.j(false);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void V() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(r2.t.m().d()));
        hashMap.put("app_volume", String.valueOf(r2.t.m().b()));
        hashMap.put("device_volume", String.valueOf(v2.b.e(getContext())));
        B("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void V0(Context context) {
        tt0 tt0Var = this.f15192q;
        tt0Var.setBaseContext(context);
        this.f15184i0.a(tt0Var.b());
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized boolean W() {
        return this.L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10.f15189n0 != r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10.f15189n0 != r9) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.yr0 r0 = r10.D
            boolean r0 = r0.l()
            r1 = 0
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.yr0 r0 = r10.D
            boolean r0 = r0.X()
            if (r0 == 0) goto L86
        L11:
            s2.z.a()
            android.util.DisplayMetrics r0 = r10.f15201x
            int r2 = r0.widthPixels
            int r4 = w2.g.a(r0, r2)
            s2.z.a()
            int r2 = r0.heightPixels
            int r5 = w2.g.a(r0, r2)
            com.google.android.gms.internal.ads.tt0 r2 = r10.f15192q
            android.app.Activity r2 = r2.b()
            r3 = 1
            if (r2 == 0) goto L50
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L35
            goto L50
        L35:
            r2.t.g()
            int[] r2 = v2.f2.w(r2)
            s2.z.a()
            r6 = r2[r1]
            int r6 = w2.g.a(r0, r6)
            s2.z.a()
            r2 = r2[r3]
            int r2 = w2.g.a(r0, r2)
            r7 = r2
            goto L52
        L50:
            r6 = r4
            r7 = r5
        L52:
            r2.t.g()
            android.view.WindowManager r2 = r10.f15191p0
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.f15186k0
            if (r2 != r4) goto L87
            int r2 = r10.f15185j0
            if (r2 != r5) goto L87
            int r2 = r10.f15187l0
            if (r2 != r6) goto L87
            int r2 = r10.f15188m0
            if (r2 != r7) goto L87
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.f17150m0
            com.google.android.gms.internal.ads.sy r8 = s2.b0.c()
            java.lang.Object r2 = r8.d(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L86
            int r2 = r10.f15189n0
            if (r2 == r9) goto L86
            goto L87
        L86:
            return r1
        L87:
            int r2 = r10.f15186k0
            if (r2 != r4) goto La5
            int r2 = r10.f15185j0
            if (r2 != r5) goto La5
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.f17150m0
            com.google.android.gms.internal.ads.sy r8 = s2.b0.c()
            java.lang.Object r2 = r8.d(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La6
            int r2 = r10.f15189n0
            if (r2 == r9) goto La6
        La5:
            r1 = r3
        La6:
            r10.f15186k0 = r4
            r10.f15185j0 = r5
            r10.f15187l0 = r6
            r10.f15188m0 = r7
            r10.f15189n0 = r9
            com.google.android.gms.internal.ads.me0 r3 = new com.google.android.gms.internal.ads.me0
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.g(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs0.X():boolean");
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final synchronized void Y0(int i7) {
        this.f15181f0 = i7;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void Z0(boolean z7) {
        u2.a0 a0Var;
        int i7 = this.W + (true != z7 ? -1 : 1);
        this.W = i7;
        if (i7 > 0 || (a0Var = this.E) == null) {
            return;
        }
        a0Var.m8();
    }

    @Override // com.google.android.gms.internal.ads.q80, com.google.android.gms.internal.ads.s80
    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i7 = v2.n1.f26802b;
        w2.p.a("Dispatching AFMA event: ".concat(sb2));
        c1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void a1(String str, String str2, String str3) {
        Throwable th;
        String str4;
        try {
            try {
                if (q0()) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) s2.b0.c().d(uy.f17126j0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e8) {
                    int i8 = v2.n1.f26802b;
                    w2.p.g("Unable to build MRAID_ENV", e8);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, ht0.a(str2, str4), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.e90, com.google.android.gms.internal.ads.s80
    public final void b(String str) {
        c1(str);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void b1(boolean z7, long j7) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z7 ? "0" : "1");
        hashMap.put("duration", Long.toString(j7));
        B("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.e90
    public final void c(String str, JSONObject jSONObject) {
        h(str, jSONObject.toString());
    }

    @Override // s2.a
    public final void c0() {
        yr0 yr0Var = this.D;
        if (yr0Var != null) {
            yr0Var.c0();
        }
    }

    protected final void c1(String str) {
        if (u1() == null) {
            D1();
        }
        if (u1().booleanValue()) {
            l0(str, null);
        } else {
            d0("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void d(boolean z7, int i7, String str, String str2, boolean z8) {
        this.D.W0(z7, i7, str, str2, z8);
    }

    protected final synchronized void d0(String str) {
        if (!q0()) {
            loadUrl(str);
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void d1(u10 u10Var) {
        this.U = u10Var;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final synchronized void destroy() {
        try {
            K1();
            this.f15184i0.c();
            u2.a0 a0Var = this.E;
            if (a0Var != null) {
                a0Var.b();
                this.E.m();
                this.E = null;
            }
            this.F = null;
            this.G = null;
            this.D.f();
            this.V = null;
            this.f15199v = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.K) {
                return;
            }
            r2.t.b().c(this);
            J1();
            this.K = true;
            if (!((Boolean) s2.b0.c().d(uy.Ob)).booleanValue()) {
                v2.n1.k("Destroying the WebView immediately...");
                m0();
                return;
            }
            Activity b8 = this.f15192q.b();
            if (b8 != null && b8.isDestroyed()) {
                v2.n1.k("Destroying the WebView immediately...");
                m0();
            } else {
                v2.n1.k("Initiating WebView self destruct sequence in 3...");
                v2.n1.k("Loading blank page in WebView, 2...");
                C1("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // r2.n
    public final synchronized void e() {
        r2.n nVar = this.f15199v;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void e1(da2 da2Var) {
        this.G = da2Var;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (q0()) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) s2.b0.c().d(uy.Pb)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            cm0.f6505f.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.qs0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    rs0.this.x1(str, valueCallback);
                }
            });
        }
    }

    @Override // r2.n
    public final synchronized void f() {
        r2.n nVar = this.f15199v;
        if (nVar != null) {
            nVar.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized String f0() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void f1(boolean z7) {
        this.f15195r0 = true;
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.K) {
                        this.D.f();
                        r2.t.b().c(this);
                        J1();
                        I1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final synchronized us0 g() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void g0() {
        E1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f15198u.f27051q);
        B("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.e90, com.google.android.gms.internal.ads.s80
    public final void h(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        c1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void h1(int i7) {
        if (i7 == 0) {
            iz izVar = this.f15180e0;
            cz.a(izVar.c(), this.f15178c0, "aebb2");
        }
        E1();
        iz izVar2 = this.f15180e0;
        izVar2.c();
        izVar2.c().d("close_type", String.valueOf(i7));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i7));
        hashMap.put("version", this.f15198u.f27051q);
        B("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.at0, com.google.android.gms.internal.ads.bo0
    public final Activity i() {
        return this.f15192q.b();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean i1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final hz j() {
        return this.f15178c0;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void j1(fa2 fa2Var) {
        this.F = fa2Var;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void k() {
        u2.a0 O = O();
        if (O != null) {
            O.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized fa2 k0() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final r2.a l() {
        return this.f15200w;
    }

    protected final synchronized void l0(String str, ValueCallback valueCallback) {
        if (!q0()) {
            evaluateJavascript(str, null);
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void l1(boolean z7) {
        this.D.k(z7);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!q0()) {
            super.loadData(str, str2, str3);
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!q0()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final synchronized void loadUrl(final String str) {
        if (q0()) {
            int i7 = v2.n1.f26802b;
            w2.p.f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ms0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    rs0.this.y1(str);
                }
            });
        } catch (Throwable th) {
            r2.t.l().i(th, "AdWebViewImpl.loadUrl");
            int i8 = v2.n1.f26802b;
            w2.p.g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final iz m() {
        return this.f15180e0;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void m0() {
        v2.n1.k("Destroying WebView!");
        I1();
        v2.f2.f26746l.post(new ls0(this));
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final synchronized String n() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized boolean n0() {
        return this.O;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final boolean n1(final boolean z7, final int i7) {
        destroy();
        hu huVar = new hu() { // from class: com.google.android.gms.internal.ads.os0
            @Override // com.google.android.gms.internal.ads.hu
            public final /* synthetic */ void a(qx qxVar) {
                int i8 = rs0.f15175s0;
                ww f02 = xw.f0();
                boolean E = f02.E();
                boolean z8 = z7;
                if (E != z8) {
                    f02.F(z8);
                }
                f02.G(i7);
                qxVar.L((xw) f02.A());
            }
        };
        iu iuVar = this.f15193q0;
        iuVar.b(huVar);
        iuVar.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final synchronized String o() {
        f03 f03Var = this.A;
        if (f03Var == null) {
            return null;
        }
        return f03Var.f7926b;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void o0() {
        if (this.f15179d0 == null) {
            iz izVar = this.f15180e0;
            izVar.c();
            hz f8 = kz.f();
            this.f15179d0 = f8;
            izVar.a("native:view_load", f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void o1(String str, com.google.android.gms.common.util.o oVar) {
        yr0 yr0Var = this.D;
        if (yr0Var != null) {
            yr0Var.e(str, oVar);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!q0()) {
                this.f15184i0.d();
            }
            if (this.f15195r0) {
                onResume();
                this.f15195r0 = false;
            }
            boolean z7 = this.R;
            yr0 yr0Var = this.D;
            if (yr0Var != null && yr0Var.X()) {
                if (!this.S) {
                    this.D.l0();
                    this.D.p0();
                    this.S = true;
                }
                X();
                z7 = true;
            }
            L1(z7);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        yr0 yr0Var;
        synchronized (this) {
            try {
                if (!q0()) {
                    this.f15184i0.e();
                }
                super.onDetachedFromWindow();
                if (this.S && (yr0Var = this.D) != null && yr0Var.X() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.D.l0();
                    this.D.p0();
                    this.S = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        L1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) s2.b0.c().d(uy.dc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            r2.t.g();
            v2.f2.z(getContext(), intent);
        } catch (ActivityNotFoundException e8) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String sb2 = sb.toString();
            int i7 = v2.n1.f26802b;
            w2.p.a(sb2);
            r2.t.l().i(e8, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (q0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean X = X();
        u2.a0 O = O();
        if (O == null || !X) {
            return;
        }
        O.T();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e7 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d0, B:96:0x01d3, B:98:0x01da, B:103:0x01e7, B:105:0x01ed, B:106:0x01f0, B:108:0x01f4, B:109:0x01fd, B:115:0x0208), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d0, B:96:0x01d3, B:98:0x01da, B:103:0x01e7, B:105:0x01ed, B:106:0x01f0, B:108:0x01f4, B:109:0x01fd, B:115:0x0208), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d0, B:96:0x01d3, B:98:0x01da, B:103:0x01e7, B:105:0x01ed, B:106:0x01f0, B:108:0x01f4, B:109:0x01fd, B:115:0x0208), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rs0.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final void onPause() {
        if (q0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) s2.b0.c().d(uy.Ed)).booleanValue() && c1.h.a("MUTE_AUDIO")) {
                int i7 = v2.n1.f26802b;
                w2.p.a("Muting webview");
                c1.g.m(this, true);
            }
        } catch (Exception e8) {
            int i8 = v2.n1.f26802b;
            w2.p.d("Could not pause webview.", e8);
            if (((Boolean) s2.b0.c().d(uy.Hd)).booleanValue()) {
                r2.t.l().i(e8, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final void onResume() {
        if (q0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) s2.b0.c().d(uy.Ed)).booleanValue() && c1.h.a("MUTE_AUDIO")) {
                int i7 = v2.n1.f26802b;
                w2.p.a("Unmuting webview");
                c1.g.m(this, false);
            }
        } catch (Exception e8) {
            int i8 = v2.n1.f26802b;
            w2.p.d("Could not resume webview.", e8);
            if (((Boolean) s2.b0.c().d(uy.Hd)).booleanValue()) {
                r2.t.l().i(e8, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7 = ((Boolean) s2.b0.c().d(uy.f17050a4)).booleanValue() && this.D.a0();
        if ((!this.D.X() || this.D.d0()) && !z7) {
            fn fnVar = this.f15194r;
            if (fnVar != null) {
                fnVar.c(motionEvent);
            }
            d00 d00Var = this.f15197t;
            if (d00Var != null) {
                d00Var.a(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    x10 x10Var = this.T;
                    if (x10Var != null) {
                        x10Var.b(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (q0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.kt0, com.google.android.gms.internal.ads.bo0
    public final w2.a p() {
        return this.f15198u;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void p1(boolean z7) {
        if (z7) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        u2.a0 a0Var = this.E;
        if (a0Var != null) {
            a0Var.o1(z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void q(String str, String str2, int i7) {
        this.D.D0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized boolean q0() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void q1(boolean z7) {
        try {
            boolean z8 = this.L;
            this.L = z7;
            F1();
            if (z7 != z8) {
                if (((Boolean) s2.b0.c().d(uy.f17134k0)).booleanValue()) {
                    if (!this.H.g()) {
                    }
                }
                new me0(this, "").f(true != z7 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void r0() {
        this.f15184i0.b();
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized void r1(boolean z7) {
        this.O = z7;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final synchronized int s() {
        return this.f15181f0;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final /* synthetic */ ot0 s0() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void s1(String str, y50 y50Var) {
        yr0 yr0Var = this.D;
        if (yr0Var != null) {
            yr0Var.c(str, y50Var);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.mr0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof yr0) {
            this.D = (yr0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (q0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Could not stop loading webview.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        boolean z7;
        synchronized (this) {
            z7 = frVar.f8430j;
            this.R = z7;
        }
        L1(z7);
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.vs0
    public final f03 t0() {
        return this.A;
    }

    final void t1(Boolean bool) {
        synchronized (this) {
            this.N = bool;
        }
        r2.t.l().d(bool);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final void u0() {
        v2.n1.k("Cannot add text view to inner AdWebView");
    }

    final synchronized Boolean u1() {
        return this.N;
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void v(boolean z7, int i7, boolean z8) {
        this.D.K0(z7, i7, z8);
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized u2.a0 v0() {
        return this.f15182g0;
    }

    public final yr0 v1() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final synchronized void x() {
        u10 u10Var = this.U;
        if (u10Var != null) {
            u10Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final synchronized vs x0() {
        return this.V;
    }

    final /* synthetic */ void x1(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.gt0
    public final void y(boolean z7, int i7, String str, boolean z8, boolean z9) {
        this.D.U0(z7, i7, str, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final qn0 y0() {
        return null;
    }

    final /* synthetic */ void y1(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void z() {
        yr0 yr0Var = this.D;
        if (yr0Var != null) {
            yr0Var.z();
        }
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.bo0
    public final synchronized void z0(String str, qp0 qp0Var) {
        try {
            if (this.f15190o0 == null) {
                this.f15190o0 = new HashMap();
            }
            this.f15190o0.put(str, qp0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void z1(String str) {
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.mr0
    public final WebView Q() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mr0, com.google.android.gms.internal.ads.lt0
    public final View Z() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void K0(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void W0(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.bo0
    public final void w0(int i7) {
    }
}
