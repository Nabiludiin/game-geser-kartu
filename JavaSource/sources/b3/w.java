package b3;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.a00;
import com.google.android.gms.internal.ads.a13;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.b63;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.e63;
import com.google.android.gms.internal.ads.fn;
import com.google.android.gms.internal.ads.gn;
import com.google.android.gms.internal.ads.gu0;
import com.google.android.gms.internal.ads.h64;
import com.google.android.gms.internal.ads.hx3;
import com.google.android.gms.internal.ads.iy3;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.p64;
import com.google.android.gms.internal.ads.q53;
import com.google.android.gms.internal.ads.r53;
import com.google.android.gms.internal.ads.rf0;
import com.google.android.gms.internal.ads.tk0;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.v54;
import com.google.android.gms.internal.ads.vf0;
import com.google.android.gms.internal.ads.vk0;
import com.google.android.gms.internal.ads.w13;
import com.google.android.gms.internal.ads.w54;
import com.google.android.gms.internal.ads.wx1;
import com.google.android.gms.internal.ads.x73;
import com.google.android.gms.internal.ads.xs1;
import com.google.android.gms.internal.ads.yw1;
import com.google.android.gms.internal.ads.z64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import s2.b5;

/* compiled from: MyApplication */
public final class w extends vk0 {
    protected static final List W = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List X = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List Y = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List Z = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private final wx1 A;
    private final x73 B;
    private final w2.a J;
    private String K;
    private final List M;
    private final List N;
    private final List O;
    private final List P;
    private final a00 T;
    private final j1 U;
    private final a1 V;

    /* renamed from: q, reason: collision with root package name */
    private final gu0 f3368q;

    /* renamed from: r, reason: collision with root package name */
    private Context f3369r;

    /* renamed from: s, reason: collision with root package name */
    private final fn f3370s;

    /* renamed from: t, reason: collision with root package name */
    private final a13 f3371t;

    /* renamed from: u, reason: collision with root package name */
    private final w13 f3372u;

    /* renamed from: v, reason: collision with root package name */
    private final z64 f3373v;

    /* renamed from: w, reason: collision with root package name */
    private final ScheduledExecutorService f3374w;

    /* renamed from: x, reason: collision with root package name */
    private vf0 f3375x;

    /* renamed from: y, reason: collision with root package name */
    private Point f3376y = new Point();

    /* renamed from: z, reason: collision with root package name */
    private Point f3377z = new Point();
    private final AtomicInteger I = new AtomicInteger(0);
    private final AtomicBoolean Q = new AtomicBoolean(false);
    private final AtomicBoolean R = new AtomicBoolean(false);
    private final AtomicInteger S = new AtomicInteger(0);
    private final boolean C = ((Boolean) s2.b0.c().d(uy.N7)).booleanValue();
    private final boolean D = ((Boolean) s2.b0.c().d(uy.M7)).booleanValue();
    private final boolean E = ((Boolean) s2.b0.c().d(uy.P7)).booleanValue();
    private final boolean F = ((Boolean) s2.b0.c().d(uy.R7)).booleanValue();
    private final String G = (String) s2.b0.c().d(uy.Q7);
    private final String H = (String) s2.b0.c().d(uy.S7);
    private final String L = (String) s2.b0.c().d(uy.T7);

    w(gu0 gu0Var, Context context, fn fnVar, w13 w13Var, z64 z64Var, ScheduledExecutorService scheduledExecutorService, wx1 wx1Var, x73 x73Var, w2.a aVar, a00 a00Var, a13 a13Var, j1 j1Var, a1 a1Var) {
        List list;
        this.f3368q = gu0Var;
        this.f3369r = context;
        this.f3370s = fnVar;
        this.f3371t = a13Var;
        this.f3372u = w13Var;
        this.f3373v = z64Var;
        this.f3374w = scheduledExecutorService;
        this.A = wx1Var;
        this.B = x73Var;
        this.J = aVar;
        this.T = a00Var;
        this.U = j1Var;
        this.V = a1Var;
        if (((Boolean) s2.b0.c().d(uy.U7)).booleanValue()) {
            this.M = K8((String) s2.b0.c().d(uy.V7));
            this.N = K8((String) s2.b0.c().d(uy.W7));
            this.O = K8((String) s2.b0.c().d(uy.X7));
            list = K8((String) s2.b0.c().d(uy.Y7));
        } else {
            this.M = W;
            this.N = X;
            this.O = Y;
            list = Z;
        }
        this.P = list;
    }

    static final /* synthetic */ Uri A8(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? J8(uri, "nas", str) : uri;
    }

    private final void B8(final List list, final w3.a aVar, rf0 rf0Var, boolean z7) {
        if (!((Boolean) s2.b0.c().d(uy.k8)).booleanValue()) {
            try {
                rf0Var.u("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("", e8);
                return;
            }
        }
        z64 z64Var = this.f3373v;
        a5.d B0 = z64Var.B0(new Callable() { // from class: b3.k
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return w.this.O8(list, aVar);
            }
        });
        if (I8()) {
            B0 = p64.j(B0, new w54() { // from class: b3.m
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return w.this.P8((ArrayList) obj);
                }
            }, z64Var);
        } else {
            int i8 = v2.n1.f26802b;
            w2.p.e("Asset view map is empty.");
        }
        p64.r(B0, new g(this, rf0Var, z7), this.f3368q.j());
    }

    private final void C8(List list, final w3.a aVar, rf0 rf0Var, boolean z7) {
        a5.d B0;
        if (!((Boolean) s2.b0.c().d(uy.k8)).booleanValue()) {
            int i7 = v2.n1.f26802b;
            w2.p.f("The updating URL feature is not enabled.");
            try {
                rf0Var.u("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                w2.p.d("", e8);
                return;
            }
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (M8((Uri) it.next())) {
                i8++;
            }
        }
        if (i8 > 1) {
            String valueOf = String.valueOf(list);
            int i9 = v2.n1.f26802b;
            w2.p.f("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (M8(uri)) {
                z64 z64Var = this.f3373v;
                B0 = z64Var.B0(new Callable() { // from class: b3.n
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return w.this.Q8(uri, aVar);
                    }
                });
                if (I8()) {
                    B0 = p64.j(B0, new w54() { // from class: b3.o
                        @Override // com.google.android.gms.internal.ads.w54
                        public final /* synthetic */ a5.d d(Object obj) {
                            return w.this.R8((Uri) obj);
                        }
                    }, z64Var);
                } else {
                    int i10 = v2.n1.f26802b;
                    w2.p.e("Asset view map is empty.");
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i11 = v2.n1.f26802b;
                w2.p.f("Not a Google URL: ".concat(valueOf2));
                B0 = p64.a(uri);
            }
            arrayList.add(B0);
        }
        p64.r(p64.m(arrayList), new h(this, rf0Var, z7), this.f3368q.j());
    }

    private final void D8() {
        if (((Boolean) s2.b0.c().d(uy.Da)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.Ga)).booleanValue()) {
                return;
            }
            if (((Boolean) s2.b0.c().d(uy.Ka)).booleanValue() && this.Q.getAndSet(true)) {
                return;
            }
            X8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E8, reason: merged with bridge method [inline-methods] */
    public final void X8() {
        w wVar;
        a5.d a8;
        if (((Boolean) b10.f5455e.e()).booleanValue()) {
            this.U.a();
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.ec)).booleanValue()) {
            a8 = p64.f(new v54() { // from class: b3.p
                @Override // com.google.android.gms.internal.ads.v54
                public final /* synthetic */ a5.d a() {
                    return w.this.S8();
                }
            }, cm0.f6500a);
            wVar = this;
        } else {
            wVar = this;
            a8 = wVar.G8(this.f3369r, null, k2.c.BANNER.name(), null, null, 0, null, new Bundle(), null).a();
        }
        p64.r(a8, new i(this), wVar.f3368q.j());
    }

    private static boolean F8(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r8.equals("REWARDED_INTERSTITIAL") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r9 = s2.g5.O0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r8.equals("REWARDED") != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final b3.e G8(android.content.Context r6, java.lang.String r7, java.lang.String r8, s2.g5 r9, s2.b5 r10, int r11, java.lang.String r12, android.os.Bundle r13, com.google.android.gms.internal.ads.al0 r14) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.v03 r0 = new com.google.android.gms.internal.ads.v03
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r8)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            if (r2 == 0) goto L18
            com.google.android.gms.internal.ads.j03 r2 = r0.I()
            r4 = 2
            r2.a(r4)
            goto L26
        L18:
            boolean r2 = r3.equals(r8)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.j03 r2 = r0.I()
            r4 = 3
            r2.a(r4)
        L26:
            com.google.android.gms.internal.ads.gu0 r2 = r5.f3368q
            b3.d r2 = r2.z()
            com.google.android.gms.internal.ads.d91 r4 = new com.google.android.gms.internal.ads.d91
            r4.<init>()
            r4.a(r6)
            if (r7 != 0) goto L38
            java.lang.String r7 = "adUnitId"
        L38:
            r0.F(r7)
            if (r10 != 0) goto L46
            s2.c5 r7 = new s2.c5
            r7.<init>()
            s2.b5 r10 = r7.a()
        L46:
            r0.z(r10)
            if (r9 != 0) goto L94
            int r7 = r8.hashCode()
            switch(r7) {
                case -1999289321: goto L82;
                case -428325382: goto L75;
                case 543046670: goto L6a;
                case 1854800829: goto L63;
                case 1951953708: goto L53;
                default: goto L52;
            }
        L52:
            goto L8f
        L53:
            java.lang.String r7 = "BANNER"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L8f
            s2.g5 r9 = new s2.g5
            k2.h r7 = k2.h.f24400i
            r9.<init>(r6, r7)
            goto L94
        L63:
            boolean r6 = r8.equals(r3)
            if (r6 == 0) goto L8f
            goto L70
        L6a:
            boolean r6 = r8.equals(r1)
            if (r6 == 0) goto L8f
        L70:
            s2.g5 r9 = s2.g5.O0()
            goto L94
        L75:
            java.lang.String r6 = "APP_OPEN_AD"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8f
            s2.g5 r9 = s2.g5.P0()
            goto L94
        L82:
            java.lang.String r6 = "NATIVE"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8f
            s2.g5 r9 = s2.g5.N0()
            goto L94
        L8f:
            s2.g5 r9 = new s2.g5
            r9.<init>()
        L94:
            r0.B(r9)
            r6 = 1
            r0.T(r6)
            r0.U(r13)
            com.google.android.gms.internal.ads.w03 r6 = r0.Y()
            r4.b(r6)
            r4.h(r11)
            com.google.android.gms.internal.ads.e91 r6 = r4.e()
            r2.c(r6)
            b3.z r6 = new b3.z
            r6.<init>()
            r6.a(r8)
            r6.b(r12)
            r6.c(r14)
            b3.a0 r7 = new b3.a0
            r8 = 0
            r7.<init>(r6, r8)
            r2.b(r7)
            com.google.android.gms.internal.ads.fg1 r6 = new com.google.android.gms.internal.ads.fg1
            r6.<init>()
            b3.e r6 = r2.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.w.G8(android.content.Context, java.lang.String, java.lang.String, s2.g5, s2.b5, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.al0):b3.e");
    }

    private final a5.d H8(final String str) {
        final xs1[] xs1VarArr = new xs1[1];
        a5.d b8 = this.f3372u.b();
        w54 w54Var = new w54() { // from class: b3.u
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return w.this.U8(xs1VarArr, str, (xs1) obj);
            }
        };
        z64 z64Var = this.f3373v;
        a5.d j7 = p64.j(b8, w54Var, z64Var);
        j7.c(new Runnable() { // from class: b3.l
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                w.this.V8(xs1VarArr);
            }
        }, z64Var);
        return (h64) p64.g((h64) p64.k((h64) p64.i(h64.C(j7), ((Integer) s2.b0.c().d(uy.l8)).intValue(), TimeUnit.MILLISECONDS, this.f3374w), s.f3344a, z64Var), Exception.class, t.f3351a, z64Var);
    }

    private final boolean I8() {
        Map map;
        vf0 vf0Var = this.f3375x;
        return (vf0Var == null || (map = vf0Var.f17592r) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri J8(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i7 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i7) + str + "=" + str2 + "&" + uri2.substring(i7));
    }

    private static final List K8(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!iy3.c(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* synthetic */ b63 Y8(a5.d dVar, al0 al0Var) {
        if (!e63.a() || !((Boolean) p00.f13598e.e()).booleanValue()) {
            return null;
        }
        try {
            b63 b8 = ((e) p64.s(dVar)).b();
            b8.b(new ArrayList(Collections.singletonList(al0Var.f5026r)));
            b5 b5Var = al0Var.f5028t;
            b8.c(b5Var == null ? "" : b5Var.F);
            b8.d(b5Var.C);
            return b8;
        } catch (ExecutionException e8) {
            r2.t.l().i(e8, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void F6(vf0 vf0Var) {
        this.f3375x = vf0Var;
        this.f3372u.a(1);
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void K4(List list, w3.a aVar, rf0 rf0Var) {
        B8(list, aVar, rf0Var, false);
    }

    final boolean L8(Uri uri) {
        return F8(uri, this.O, this.P);
    }

    final boolean M8(Uri uri) {
        return F8(uri, this.M, this.N);
    }

    final /* synthetic */ e N8(al0 al0Var, int i7, Bundle bundle) {
        return G8(this.f3369r, al0Var.f5025q, al0Var.f5026r, al0Var.f5027s, al0Var.f5028t, i7, al0Var.f5030v, bundle, al0Var);
    }

    final /* synthetic */ ArrayList O8(List list, w3.a aVar) {
        fn fnVar = this.f3370s;
        String m7 = fnVar.b() != null ? fnVar.b().m(this.f3369r, (View) w3.b.r0(aVar), null) : "";
        if (TextUtils.isEmpty(m7)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (L8(uri)) {
                arrayList.add(J8(uri, "ms", m7));
            } else {
                String valueOf = String.valueOf(uri);
                int i7 = v2.n1.f26802b;
                w2.p.f("Not a Google URL: ".concat(valueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ a5.d P8(final ArrayList arrayList) {
        return p64.k(H8("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new hx3() { // from class: b3.q
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return w.this.T8(arrayList, (String) obj);
            }
        }, this.f3373v);
    }

    final /* synthetic */ Uri Q8(Uri uri, w3.a aVar) {
        a13 a13Var;
        try {
            uri = (!((Boolean) s2.b0.c().d(uy.Zc)).booleanValue() || (a13Var = this.f3371t) == null) ? this.f3370s.d(uri, this.f3369r, (View) w3.b.r0(aVar), null) : a13Var.a(uri, this.f3369r, (View) w3.b.r0(aVar), null);
        } catch (gn e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("", e8);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ a5.d R8(final Uri uri) {
        return p64.k(H8("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new hx3(this) { // from class: b3.r
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return w.A8(uri, (String) obj);
            }
        }, this.f3373v);
    }

    final /* synthetic */ a5.d S8() {
        return G8(this.f3369r, null, k2.c.BANNER.name(), null, null, 0, null, new Bundle(), null).a();
    }

    final /* synthetic */ ArrayList T8(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!L8(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(J8(uri, "nas", str));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void U3(List list, w3.a aVar, rf0 rf0Var) {
        C8(list, aVar, rf0Var, true);
    }

    final /* synthetic */ a5.d U8(xs1[] xs1VarArr, String str, xs1 xs1Var) {
        xs1VarArr[0] = xs1Var;
        Context context = this.f3369r;
        vf0 vf0Var = this.f3375x;
        Map map = vf0Var.f17592r;
        JSONObject e8 = v2.u0.e(context, map, map, vf0Var.f17591q, null);
        JSONObject b8 = v2.u0.b(this.f3369r, this.f3375x.f17591q);
        JSONObject c8 = v2.u0.c(this.f3375x.f17591q);
        JSONObject d8 = v2.u0.d(this.f3369r, this.f3375x.f17591q);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", e8);
        jSONObject.put("ad_view_signal", b8);
        jSONObject.put("scroll_view_signal", c8);
        jSONObject.put("lock_screen_signal", d8);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", v2.u0.f(null, this.f3369r, this.f3377z, this.f3376y));
        }
        return xs1Var.c(str, jSONObject);
    }

    final /* synthetic */ void V8(xs1[] xs1VarArr) {
        xs1 xs1Var = xs1VarArr[0];
        if (xs1Var != null) {
            this.f3372u.c(p64.a(xs1Var));
        }
    }

    final /* synthetic */ void W8(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (M8((Uri) it.next())) {
                this.I.getAndIncrement();
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void X2(w3.a aVar, final al0 al0Var, tk0 tk0Var) {
        al0 al0Var2;
        a5.d a8;
        a5.d a9;
        a5.d j7;
        a5.d dVar;
        final Bundle bundle = new Bundle();
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue()) {
            bundle.putLong(yw1.PUBLIC_API_CALL.c(), al0Var.f5028t.P);
            bundle.putLong(yw1.DYNAMITE_ENTER.c(), r2.t.o().a());
        }
        Context context = (Context) w3.b.r0(aVar);
        this.f3369r = context;
        r53 a10 = q53.a(context, 22);
        a10.a();
        int i7 = 0;
        if (((Boolean) s2.b0.c().d(uy.d8)).booleanValue()) {
            b5 b5Var = al0Var.f5028t;
            if (b5Var.f26058s.getBoolean("optimize_for_app_start", false) && Objects.equals(c.c(b5Var), "requester_type_8")) {
                i7 = 2;
                if (al0Var.f5029u != 2) {
                    i7 = 1;
                }
            }
        }
        final int i8 = i7;
        String str = al0Var.f5026r;
        if ("UNKNOWN".equals(str)) {
            List arrayList = new ArrayList();
            ly lyVar = uy.c8;
            if (!((String) s2.b0.c().d(lyVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) s2.b0.c().d(lyVar)).split(","));
            }
            if (arrayList.contains(c.c(al0Var.f5028t))) {
                a8 = p64.c(new IllegalArgumentException("Unknown format is no longer supported."));
                a9 = p64.c(new IllegalArgumentException("Unknown format is no longer supported."));
                al0Var2 = al0Var;
                dVar = a8;
                j7 = a9;
                p64.r(j7, new f(this, dVar, al0Var2, tk0Var, a10), this.f3368q.j());
            }
        }
        if (((Boolean) s2.b0.c().d(uy.ec)).booleanValue()) {
            z64 z64Var = cm0.f6500a;
            a5.d B0 = z64Var.B0(new Callable() { // from class: b3.v
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return w.this.N8(al0Var, i8, bundle);
                }
            });
            j7 = p64.j(B0, j.f3266a, z64Var);
            al0Var2 = al0Var;
            dVar = B0;
            p64.r(j7, new f(this, dVar, al0Var2, tk0Var, a10), this.f3368q.j());
        }
        e G8 = G8(this.f3369r, al0Var.f5025q, str, al0Var.f5027s, al0Var.f5028t, i8, al0Var.f5030v, bundle, al0Var);
        al0Var2 = al0Var;
        a8 = p64.a(G8);
        a9 = G8.a();
        dVar = a8;
        j7 = a9;
        p64.r(j7, new f(this, dVar, al0Var2, tk0Var, a10), this.f3368q.j());
    }

    final /* synthetic */ Context Z8() {
        return this.f3369r;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final w3.a g7(w3.a aVar, w3.a aVar2, String str, w3.a aVar3) {
        if (!((Boolean) s2.b0.c().d(uy.Qa)).booleanValue()) {
            return w3.b.C1(null);
        }
        Context context = (Context) w3.b.r0(aVar);
        androidx.browser.customtabs.c cVar = (androidx.browser.customtabs.c) w3.b.r0(aVar2);
        androidx.browser.customtabs.b bVar = (androidx.browser.customtabs.b) w3.b.r0(aVar3);
        a00 a00Var = this.T;
        a00Var.a(context, cVar, str, bVar);
        if (((Boolean) b10.f5455e.e()).booleanValue()) {
            this.U.a();
        }
        if (((Boolean) b10.f5453c.e()).booleanValue()) {
            this.V.a(null);
        }
        return w3.b.C1(a00Var.b());
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void i7(List list, w3.a aVar, rf0 rf0Var) {
        C8(list, aVar, rf0Var, false);
    }

    final /* synthetic */ wx1 k8() {
        return this.A;
    }

    final /* synthetic */ x73 l8() {
        return this.B;
    }

    final /* synthetic */ boolean m8() {
        return this.C;
    }

    final /* synthetic */ boolean n8() {
        return this.D;
    }

    final /* synthetic */ boolean o8() {
        return this.E;
    }

    final /* synthetic */ boolean p8() {
        return this.F;
    }

    final /* synthetic */ String q8() {
        return this.G;
    }

    final /* synthetic */ String r8() {
        return this.H;
    }

    final /* synthetic */ AtomicInteger s8() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void t0(w3.a aVar) {
        if (((Boolean) s2.b0.c().d(uy.Ca)).booleanValue()) {
            ly lyVar = uy.b8;
            if (!((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                D8();
            }
            WebView webView = (WebView) w3.b.r0(aVar);
            if (webView == null) {
                int i7 = v2.n1.f26802b;
                w2.p.c("The webView cannot be null.");
                return;
            }
            a1 a1Var = this.V;
            final e1 e1Var = new e1(webView, a1Var, cm0.f6505f);
            webView.addJavascriptInterface(new a(webView, this.f3370s, this.A, this.B, this.f3371t, this.U, a1Var, e1Var), "gmaSdk");
            if (((Boolean) s2.b0.c().d(uy.Ma)).booleanValue()) {
                r2.t.l().o();
            }
            if (((Boolean) b10.f5453c.e()).booleanValue()) {
                a1Var.a(webView);
                if (((Boolean) b10.f5454d.e()).booleanValue()) {
                    cm0.f6503d.scheduleWithFixedDelay(new Runnable() { // from class: b3.d1
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            e1.this.b();
                        }
                    }, 0L, ((Integer) s2.b0.c().d(uy.Na)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
                D8();
            }
        }
    }

    final /* synthetic */ w2.a t8() {
        return this.J;
    }

    final /* synthetic */ String u8() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void v1(List list, w3.a aVar, rf0 rf0Var) {
        B8(list, aVar, rf0Var, true);
    }

    final /* synthetic */ void v8(String str) {
        this.K = str;
    }

    final /* synthetic */ String w8() {
        return this.L;
    }

    final /* synthetic */ AtomicBoolean x8() {
        return this.R;
    }

    final /* synthetic */ AtomicInteger y8() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final void zzf(w3.a aVar) {
        if (((Boolean) s2.b0.c().d(uy.k8)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) w3.b.r0(aVar);
            vf0 vf0Var = this.f3375x;
            this.f3376y = v2.u0.h(motionEvent, vf0Var == null ? null : vf0Var.f17591q);
            if (motionEvent.getAction() == 0) {
                this.f3377z = this.f3376y;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f3376y;
            obtain.setLocation(point.x, point.y);
            this.f3370s.c(obtain);
            obtain.recycle();
        }
    }
}
