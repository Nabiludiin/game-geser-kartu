package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MyApplication */
public abstract class yr0 extends WebViewClient implements ot0 {
    public static final /* synthetic */ int X = 0;
    private pi1 A;
    private boolean B;
    private boolean C;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private u2.e K;
    private le0 L;
    private r2.b M;
    protected vj0 O;
    private rx1 P;
    private boolean Q;
    private boolean R;
    private int S;
    private boolean T;
    private final i92 V;
    private View.OnAttachStateChangeListener W;

    /* renamed from: q, reason: collision with root package name */
    protected final mr0 f19732q;

    /* renamed from: r, reason: collision with root package name */
    private final iu f19733r;

    /* renamed from: u, reason: collision with root package name */
    private s2.a f19736u;

    /* renamed from: v, reason: collision with root package name */
    private u2.c0 f19737v;

    /* renamed from: w, reason: collision with root package name */
    private mt0 f19738w;

    /* renamed from: x, reason: collision with root package name */
    private nt0 f19739x;

    /* renamed from: y, reason: collision with root package name */
    private n40 f19740y;

    /* renamed from: z, reason: collision with root package name */
    private p40 f19741z;

    /* renamed from: s, reason: collision with root package name */
    private final HashMap f19734s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private final Object f19735t = new Object();
    private int D = 0;
    private String E = "";
    private String F = "";
    private ge0 N = null;
    private final HashSet U = new HashSet(Arrays.asList(((String) s2.b0.c().d(uy.f17156m6)).split(",")));

    public yr0(mr0 mr0Var, iu iuVar, boolean z7, le0 le0Var, ge0 ge0Var, i92 i92Var) {
        this.f19733r = iuVar;
        this.f19732q = mr0Var;
        this.G = z7;
        this.L = le0Var;
        this.V = i92Var;
    }

    private static WebResourceResponse B() {
        if (((Boolean) s2.b0.c().d(uy.f17056b1)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
    
        r2.t.g();
        r2.t.g();
        r0 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
    
        r2.t.g();
        r0 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0138, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0170, code lost:
    
        r0 = r13.getHeaderFields();
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0189, code lost:
    
        if (r0.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018b, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0195, code lost:
    
        if (r2.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019b, code lost:
    
        if (r2.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a7, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a9, code lost:
    
        r1.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bf, code lost:
    
        r9 = r2.t.j().c(r15, r16, r13.getResponseCode(), r13.getResponseMessage(), r1, r13.getInputStream());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013d, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        if (r1 >= r0.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        r2 = r0[r1].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0164, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0166, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016d, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0122, code lost:
    
        r15 = r0.split(";")[0].trim();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse C(java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yr0.C(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void v(Map map, List list, String str) {
        if (v2.n1.m()) {
            v2.n1.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                v2.n1.k(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((y50) it.next()).a(this.f19732q, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void t(boolean z7, long j7) {
        this.f19732q.b1(z7, j7);
    }

    private static final boolean J(mr0 mr0Var) {
        return mr0Var.T() != null && mr0Var.T().b();
    }

    private static final boolean K(boolean z7, mr0 mr0Var) {
        return (!z7 || mr0Var.R().g() || mr0Var.f0().equals("interstitial_mb")) ? false : true;
    }

    private final void x(final View view, final vj0 vj0Var, final int i7) {
        if (!vj0Var.d() || i7 <= 0) {
            return;
        }
        vj0Var.b(view);
        if (vj0Var.d()) {
            v2.f2.f26746l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.wr0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    yr0.this.n(view, vj0Var, i7);
                }
            }, 100L);
        }
    }

    private final void y() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.W;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f19732q).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void A(c03 c03Var) {
        mr0 mr0Var = this.f19732q;
        if (r2.t.d().a(mr0Var.getContext())) {
            d("/logScionEvent");
            new HashMap();
            b("/logScionEvent", new f60(mr0Var.getContext(), c03Var.f6195w0));
        }
    }

    public final void D0(String str, String str2, int i7) {
        i92 i92Var = this.V;
        mr0 mr0Var = this.f19732q;
        a(new AdOverlayInfoParcel(mr0Var, mr0Var.p(), str, str2, 14, i92Var));
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void F(int i7, int i8) {
        ge0 ge0Var = this.N;
        if (ge0Var != null) {
            ge0Var.l(i7, i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void G(r2.b bVar) {
        this.M = bVar;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void I(boolean z7) {
        synchronized (this.f19735t) {
            this.I = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.ve0] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void K0(boolean z7, int i7, boolean z8) {
        s2.a aVar;
        pi1 pi1Var;
        ?? r9;
        int i8;
        s2.a aVar2;
        boolean z9;
        mr0 mr0Var = this.f19732q;
        boolean K = K(mr0Var.W(), mr0Var);
        boolean z10 = true;
        if (!K && z8) {
            z10 = false;
        }
        if (K) {
            aVar = null;
            pi1Var = null;
        } else {
            aVar = this.f19736u;
            pi1Var = null;
        }
        u2.c0 c0Var = this.f19737v;
        pi1 pi1Var2 = pi1Var;
        u2.e eVar = this.K;
        w2.a p7 = mr0Var.p();
        pi1 pi1Var3 = z10 ? pi1Var2 : this.A;
        if (J(mr0Var)) {
            r9 = this.V;
            z9 = z7;
            i8 = i7;
            aVar2 = aVar;
        } else {
            r9 = pi1Var2;
            i8 = i7;
            aVar2 = aVar;
            z9 = z7;
        }
        a(new AdOverlayInfoParcel(aVar2, c0Var, eVar, mr0Var, z9, i8, p7, pi1Var3, r9));
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void L(s2.a aVar, n40 n40Var, u2.c0 c0Var, p40 p40Var, u2.e eVar, boolean z7, c60 c60Var, r2.b bVar, ne0 ne0Var, vj0 vj0Var, v82 v82Var, x73 x73Var, rx1 rx1Var, u60 u60Var, pi1 pi1Var, t60 t60Var, n60 n60Var, z50 z50Var, d01 d01Var, vy1 vy1Var, u81 u81Var) {
        r2.b bVar2 = bVar == null ? new r2.b(this.f19732q.getContext(), vj0Var, null) : bVar;
        mr0 mr0Var = this.f19732q;
        this.N = new ge0(mr0Var, ne0Var);
        this.O = vj0Var;
        if (((Boolean) s2.b0.c().d(uy.f17135k1)).booleanValue()) {
            b("/adMetadata", new m40(n40Var));
        }
        if (p40Var != null) {
            b("/appEvent", new o40(p40Var));
        }
        b("/backButton", x50.f18551j);
        b("/refresh", x50.f18552k);
        b("/canOpenApp", x50.f18543b);
        b("/canOpenURLs", x50.f18542a);
        b("/canOpenIntents", x50.f18544c);
        b("/close", x50.f18545d);
        b("/customClose", x50.f18546e);
        b("/instrument", x50.f18555n);
        b("/delayPageLoaded", x50.f18557p);
        b("/delayPageClosed", x50.f18558q);
        b("/getLocationInfo", x50.f18559r);
        b("/log", x50.f18548g);
        b("/mraid", new g60(bVar2, this.N, ne0Var));
        le0 le0Var = this.L;
        if (le0Var != null) {
            b("/mraidLoaded", le0Var);
        }
        r2.b bVar3 = bVar2;
        b("/open", new m60(bVar3, this.N, v82Var, rx1Var, d01Var, u81Var));
        b("/precache", new rp0());
        b("/touch", x50.f18550i);
        b("/video", x50.f18553l);
        b("/videoMeta", x50.f18554m);
        if (v82Var == null || x73Var == null) {
            b("/click", x50.b(pi1Var, d01Var));
            b("/httpTrack", x50.f18547f);
        } else {
            b("/click", h13.a(v82Var, x73Var, d01Var, pi1Var));
            b("/httpTrack", h13.b(v82Var, x73Var));
        }
        if (r2.t.d().a(mr0Var.getContext())) {
            Map hashMap = new HashMap();
            if (mr0Var.T() != null) {
                hashMap = mr0Var.T().f6195w0;
            }
            b("/logScionEvent", new f60(mr0Var.getContext(), hashMap));
        }
        if (c60Var != null) {
            b("/setInterstitialProperties", new a60(c60Var));
        }
        if (u60Var != null) {
            if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue()) {
                b("/inspectorNetworkExtras", u60Var);
            }
        }
        if (((Boolean) s2.b0.c().d(uy.na)).booleanValue() && t60Var != null) {
            b("/shareSheet", t60Var);
        }
        if (((Boolean) s2.b0.c().d(uy.u8)).booleanValue() && vy1Var != null) {
            b("/onDeviceStorageEvent", new h60(vy1Var));
        }
        if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue() && n60Var != null) {
            b("/inspectorOutOfContextTest", n60Var);
        }
        if (((Boolean) s2.b0.c().d(uy.xa)).booleanValue() && z50Var != null) {
            b("/inspectorStorage", z50Var);
        }
        if (((Boolean) s2.b0.c().d(uy.Ac)).booleanValue()) {
            b("/bindPlayStoreOverlay", x50.f18562u);
            b("/presentPlayStoreOverlay", x50.f18563v);
            b("/expandPlayStoreOverlay", x50.f18564w);
            b("/collapsePlayStoreOverlay", x50.f18565x);
            b("/closePlayStoreOverlay", x50.f18566y);
        }
        if (((Boolean) s2.b0.c().d(uy.N3)).booleanValue()) {
            b("/setPAIDPersonalizationEnabled", x50.A);
            b("/resetPAID", x50.f18567z);
        }
        if (((Boolean) s2.b0.c().d(uy.Uc)).booleanValue() && mr0Var.T() != null && mr0Var.T().f6185r0) {
            b("/writeToLocalStorage", x50.B);
            b("/clearLocalStorageKeys", x50.C);
        }
        this.f19736u = aVar;
        this.f19737v = c0Var;
        this.f19740y = n40Var;
        this.f19741z = p40Var;
        this.K = eVar;
        this.M = bVar3;
        this.A = pi1Var;
        this.P = rx1Var;
        this.B = z7;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void M() {
        pi1 pi1Var = this.A;
        if (pi1Var != null) {
            pi1Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void N(boolean z7) {
        synchronized (this.f19735t) {
            this.J = z7;
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void O() {
        synchronized (this.f19735t) {
            this.B = false;
            this.G = true;
            cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ur0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    mr0 mr0Var = yr0.this.f19732q;
                    mr0Var.r0();
                    u2.a0 O = mr0Var.O();
                    if (O != null) {
                        O.z();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final rx1 U() {
        return this.P;
    }

    public final void U0(boolean z7, int i7, String str, boolean z8, boolean z9) {
        mr0 mr0Var = this.f19732q;
        boolean W = mr0Var.W();
        boolean K = K(W, mr0Var);
        boolean z10 = true;
        if (!K && z8) {
            z10 = false;
        }
        s2.a aVar = K ? null : this.f19736u;
        xr0 xr0Var = W ? null : new xr0(mr0Var, this.f19737v);
        n40 n40Var = this.f19740y;
        i92 i92Var = null;
        p40 p40Var = this.f19741z;
        boolean z11 = z10;
        xr0 xr0Var2 = xr0Var;
        u2.e eVar = this.K;
        w2.a p7 = mr0Var.p();
        pi1 pi1Var = z11 ? null : this.A;
        if (J(mr0Var)) {
            i92Var = this.V;
        }
        a(new AdOverlayInfoParcel(aVar, xr0Var2, n40Var, p40Var, eVar, mr0Var, z7, i7, str, p7, pi1Var, i92Var, z9));
    }

    public final void W0(boolean z7, int i7, String str, String str2, boolean z8) {
        mr0 mr0Var = this.f19732q;
        boolean W = mr0Var.W();
        boolean K = K(W, mr0Var);
        boolean z9 = true;
        if (!K && z8) {
            z9 = false;
        }
        s2.a aVar = K ? null : this.f19736u;
        xr0 xr0Var = W ? null : new xr0(mr0Var, this.f19737v);
        n40 n40Var = this.f19740y;
        i92 i92Var = null;
        p40 p40Var = this.f19741z;
        boolean z10 = z9;
        xr0 xr0Var2 = xr0Var;
        u2.e eVar = this.K;
        w2.a p7 = mr0Var.p();
        pi1 pi1Var = z10 ? null : this.A;
        if (J(mr0Var)) {
            i92Var = this.V;
        }
        a(new AdOverlayInfoParcel(aVar, xr0Var2, n40Var, p40Var, eVar, mr0Var, z7, i7, str, str2, p7, pi1Var, i92Var));
    }

    public final boolean X() {
        boolean z7;
        synchronized (this.f19735t) {
            z7 = this.H;
        }
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void Y(nt0 nt0Var) {
        this.f19739x = nt0Var;
    }

    public final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        u2.m mVar;
        ge0 ge0Var = this.N;
        boolean k7 = ge0Var != null ? ge0Var.k() : false;
        r2.t.f();
        u2.b0.a(this.f19732q.getContext(), adOverlayInfoParcel, !k7, this.P);
        vj0 vj0Var = this.O;
        if (vj0Var != null) {
            String str = adOverlayInfoParcel.B;
            if (str == null && (mVar = adOverlayInfoParcel.f4340q) != null) {
                str = mVar.f26526r;
            }
            vj0Var.v(str);
        }
    }

    public final boolean a0() {
        boolean z7;
        synchronized (this.f19735t) {
            z7 = this.I;
        }
        return z7;
    }

    public final void b(String str, y50 y50Var) {
        synchronized (this.f19735t) {
            try {
                HashMap hashMap = this.f19734s;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(y50Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void b0(vj0 vj0Var) {
        this.O = vj0Var;
    }

    public final void c(String str, y50 y50Var) {
        synchronized (this.f19735t) {
            try {
                List list = (List) this.f19734s.get(str);
                if (list == null) {
                    return;
                }
                list.remove(y50Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s2.a
    public final void c0() {
        s2.a aVar = this.f19736u;
        if (aVar != null) {
            aVar.c0();
        }
    }

    public final void d(String str) {
        synchronized (this.f19735t) {
            try {
                List list = (List) this.f19734s.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d0() {
        boolean z7;
        synchronized (this.f19735t) {
            z7 = this.J;
        }
        return z7;
    }

    public final void e(String str, com.google.android.gms.common.util.o oVar) {
        synchronized (this.f19735t) {
            try {
                List<y50> list = (List) this.f19734s.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (y50 y50Var : list) {
                    if (oVar.apply(y50Var)) {
                        arrayList.add(y50Var);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void e0(Uri uri) {
        v2.n1.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.f19734s;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            v2.n1.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) s2.b0.c().d(uy.l7)).booleanValue() || r2.t.l().c() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vr0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i7 = yr0.X;
                    r2.t.l().c().e(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) s2.b0.c().d(uy.f17148l6)).booleanValue() && this.U.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) s2.b0.c().d(uy.f17164n6)).intValue()) {
                v2.n1.k("Parsing gmsg query params on BG thread: ".concat(path));
                p64.r(r2.t.g().R(uri), new pr0(this, list, path, uri), cm0.f6505f);
                return;
            }
        }
        r2.t.g();
        v(v2.f2.u(uri), list, path);
    }

    public final void f() {
        vj0 vj0Var = this.O;
        if (vj0Var != null) {
            vj0Var.e();
            this.O = null;
        }
        y();
        synchronized (this.f19735t) {
            try {
                this.f19734s.clear();
                this.f19736u = null;
                this.f19737v = null;
                this.f19738w = null;
                this.f19739x = null;
                this.f19740y = null;
                this.f19741z = null;
                this.B = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.K = null;
                this.M = null;
                this.L = null;
                ge0 ge0Var = this.N;
                if (ge0Var != null) {
                    ge0Var.i(true);
                    this.N = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final r2.b g() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void g1(mt0 mt0Var) {
        this.f19738w = mt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TRY_ENTER, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01c8, B:48:0x017c, B:51:0x02cd, B:53:0x02dd, B:55:0x02e3, B:57:0x02f1, B:72:0x024b, B:73:0x027e, B:66:0x0219, B:68:0x014b, B:89:0x00db, B:90:0x027f, B:92:0x0289, B:94:0x028f, B:96:0x02c2), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02cd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01c8, B:48:0x017c, B:51:0x02cd, B:53:0x02dd, B:55:0x02e3, B:57:0x02f1, B:72:0x024b, B:73:0x027e, B:66:0x0219, B:68:0x014b, B:89:0x00db, B:90:0x027f, B:92:0x0289, B:94:0x028f, B:96:0x02c2), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01c8, B:48:0x017c, B:51:0x02cd, B:53:0x02dd, B:55:0x02e3, B:57:0x02f1, B:72:0x024b, B:73:0x027e, B:66:0x0219, B:68:0x014b, B:89:0x00db, B:90:0x027f, B:92:0x0289, B:94:0x028f, B:96:0x02c2), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020e A[Catch: all -> 0x01bb, TryCatch #12 {all -> 0x01bb, blocks: (B:42:0x01a0, B:44:0x01b2, B:46:0x01be, B:62:0x01fc, B:64:0x020e, B:65:0x0215), top: B:28:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027f A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b9, B:26:0x00cd, B:29:0x00e8, B:47:0x01c8, B:48:0x017c, B:51:0x02cd, B:53:0x02dd, B:55:0x02e3, B:57:0x02f1, B:72:0x024b, B:73:0x027e, B:66:0x0219, B:68:0x014b, B:89:0x00db, B:90:0x027f, B:92:0x0289, B:94:0x028f, B:96:0x02c2), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.webkit.WebResourceResponse h(java.lang.String r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yr0.h(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void h0(int i7, int i8, boolean z7) {
        le0 le0Var = this.L;
        if (le0Var != null) {
            le0Var.h(i7, i8);
        }
        ge0 ge0Var = this.N;
        if (ge0Var != null) {
            ge0Var.j(i7, i8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void i0(d01 d01Var, v82 v82Var, x73 x73Var) {
        d("/click");
        if (v82Var == null || x73Var == null) {
            b("/click", x50.b(this.A, d01Var));
        } else {
            b("/click", h13.a(v82Var, x73Var, d01Var, this.A));
        }
    }

    public final void j(boolean z7) {
        this.B = false;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void j0(d01 d01Var, v82 v82Var, rx1 rx1Var) {
        d("/open");
        b("/open", new m60(this.M, this.N, v82Var, rx1Var, d01Var, null));
    }

    public final void k(boolean z7) {
        this.T = z7;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void k1(boolean z7) {
        synchronized (this.f19735t) {
            this.H = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final boolean l() {
        boolean z7;
        synchronized (this.f19735t) {
            z7 = this.G;
        }
        return z7;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener l0() {
        synchronized (this.f19735t) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ot0
    public final void m() {
        vj0 vj0Var = this.O;
        if (vj0Var != null) {
            mr0 mr0Var = this.f19732q;
            WebView Q = mr0Var.Q();
            if (androidx.core.view.e0.A(Q)) {
                x(Q, vj0Var, 10);
                return;
            }
            y();
            nr0 nr0Var = new nr0(this, vj0Var);
            this.W = nr0Var;
            ((View) mr0Var).addOnAttachStateChangeListener(nr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void m1(d01 d01Var) {
        d("/click");
        b("/click", x50.b(this.A, d01Var));
    }

    final /* synthetic */ void n(View view, vj0 vj0Var, int i7) {
        x(view, vj0Var, i7 - 1);
    }

    final /* synthetic */ void o(boolean z7, long j7) {
        t(true, j7);
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        v2.n1.k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            e0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f19735t) {
            try {
                mr0 mr0Var = this.f19732q;
                if (mr0Var.q0()) {
                    v2.n1.k("Blank page loaded, 1...");
                    mr0Var.m0();
                    return;
                }
                this.Q = true;
                nt0 nt0Var = this.f19739x;
                if (nt0Var != null) {
                    nt0Var.a();
                    this.f19739x = null;
                }
                w0();
                mr0 mr0Var2 = this.f19732q;
                if (mr0Var2.O() != null) {
                    if (((Boolean) s2.b0.c().d(uy.Vc)).booleanValue()) {
                        mr0Var2.O().v8(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.C = true;
        this.D = i7;
        this.E = str;
        this.F = str2;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void p() {
        this.S--;
        w0();
    }

    public final ViewTreeObserver.OnScrollChangedListener p0() {
        synchronized (this.f19735t) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void r() {
        iu iuVar = this.f19733r;
        if (iuVar != null) {
            iuVar.c(10005);
        }
        this.R = true;
        this.D = 10004;
        this.E = "Page loaded delay cancel.";
        w0();
        this.f19732q.destroy();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return h(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case f.j.M0 /* 126 */:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        v2.n1.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            e0(parse);
        } else {
            if (this.B && webView == this.f19732q.Q()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    s2.a aVar = this.f19736u;
                    if (aVar != null) {
                        aVar.c0();
                        vj0 vj0Var = this.O;
                        if (vj0Var != null) {
                            vj0Var.v(str);
                        }
                        this.f19736u = null;
                    }
                    pi1 pi1Var = this.A;
                    if (pi1Var != null) {
                        pi1Var.z();
                        this.A = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            mr0 mr0Var = this.f19732q;
            if (mr0Var.Q().willNotDraw()) {
                w2.p.f("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    fn P = mr0Var.P();
                    a13 C0 = mr0Var.C0();
                    if (!((Boolean) s2.b0.c().d(uy.Zc)).booleanValue() || C0 == null) {
                        if (P != null && P.a(parse)) {
                            parse = P.d(parse, mr0Var.getContext(), (View) mr0Var, mr0Var.i());
                        }
                    } else if (P != null && P.a(parse)) {
                        parse = C0.a(parse, mr0Var.getContext(), (View) mr0Var, mr0Var.i());
                    }
                } catch (gn unused) {
                    w2.p.f("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                r2.b bVar = this.M;
                if (bVar == null || bVar.b()) {
                    u2.m mVar = new u2.m("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    mr0 mr0Var2 = this.f19732q;
                    y0(mVar, true, false, mr0Var2 != null ? mr0Var2.o() : "");
                } else {
                    bVar.c(str);
                }
            }
        }
        return true;
    }

    final /* synthetic */ void u(View view, vj0 vj0Var, int i7) {
        x(view, vj0Var, 10);
    }

    @Override // com.google.android.gms.internal.ads.ot0
    public final void w() {
        synchronized (this.f19735t) {
        }
        this.S++;
        w0();
    }

    public final void w0() {
        if (this.f19738w != null && ((this.Q && this.S <= 0) || this.R || this.C)) {
            if (((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue()) {
                mr0 mr0Var = this.f19732q;
                if (mr0Var.m() != null) {
                    cz.a(mr0Var.m().c(), mr0Var.j(), "awfllc");
                }
            }
            mt0 mt0Var = this.f19738w;
            boolean z7 = false;
            if (!this.R && !this.C) {
                z7 = true;
            }
            mt0Var.a(z7, this.D, this.E, this.F);
            this.f19738w = null;
        }
        this.f19732q.o0();
    }

    public final void y0(u2.m mVar, boolean z7, boolean z8, String str) {
        boolean z9;
        mr0 mr0Var = this.f19732q;
        boolean W = mr0Var.W();
        boolean z10 = false;
        boolean z11 = K(W, mr0Var) || z8;
        if (z11 || !z7) {
            z9 = W;
            z10 = true;
        } else {
            z9 = W;
        }
        a(new AdOverlayInfoParcel(mVar, z11 ? null : this.f19736u, z9 ? null : this.f19737v, this.K, mr0Var.p(), mr0Var, z10 ? null : this.A, str));
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void z() {
        pi1 pi1Var = this.A;
        if (pi1Var != null) {
            pi1Var.z();
        }
    }
}
