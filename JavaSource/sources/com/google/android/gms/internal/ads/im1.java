package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class im1 implements xn1 {
    private final w2.a A;
    private final w03 B;
    private final b11 C;
    private final vo1 D;
    private final com.google.android.gms.common.util.e E;
    private final ji1 F;
    private final x73 G;
    private final pu1 H;
    private final b63 I;
    private final i92 J;
    private boolean L;
    private s2.d2 S;
    private final sc1 T;
    private final ro1 U;
    private final r2.b V;
    private final p81 W;

    /* renamed from: q, reason: collision with root package name */
    private final Context f10079q;

    /* renamed from: r, reason: collision with root package name */
    private final ao1 f10080r;

    /* renamed from: s, reason: collision with root package name */
    private final JSONObject f10081s;

    /* renamed from: t, reason: collision with root package name */
    private final xs1 f10082t;

    /* renamed from: u, reason: collision with root package name */
    private final pn1 f10083u;

    /* renamed from: v, reason: collision with root package name */
    private final fn f10084v;

    /* renamed from: w, reason: collision with root package name */
    private final pa1 f10085w;

    /* renamed from: x, reason: collision with root package name */
    private final u91 f10086x;

    /* renamed from: y, reason: collision with root package name */
    private final ni1 f10087y;

    /* renamed from: z, reason: collision with root package name */
    private final c03 f10088z;
    private boolean K = false;
    private boolean M = false;
    private boolean N = false;
    private Point O = new Point();
    private Point P = new Point();
    private long Q = 0;
    private long R = 0;

    public im1(Context context, ao1 ao1Var, JSONObject jSONObject, xs1 xs1Var, pn1 pn1Var, fn fnVar, pa1 pa1Var, u91 u91Var, ni1 ni1Var, c03 c03Var, w2.a aVar, w03 w03Var, b11 b11Var, vo1 vo1Var, com.google.android.gms.common.util.e eVar, ji1 ji1Var, x73 x73Var, b63 b63Var, i92 i92Var, pu1 pu1Var, ro1 ro1Var, sc1 sc1Var, r2.b bVar, vj0 vj0Var, p81 p81Var) {
        this.f10079q = context;
        this.f10080r = ao1Var;
        this.f10081s = jSONObject;
        this.f10082t = xs1Var;
        this.f10083u = pn1Var;
        this.f10084v = fnVar;
        this.f10085w = pa1Var;
        this.f10086x = u91Var;
        this.f10087y = ni1Var;
        this.f10088z = c03Var;
        this.A = aVar;
        this.B = w03Var;
        this.C = b11Var;
        this.D = vo1Var;
        this.E = eVar;
        this.F = ji1Var;
        this.G = x73Var;
        this.I = b63Var;
        this.J = i92Var;
        this.H = pu1Var;
        this.U = ro1Var;
        this.T = sc1Var;
        this.V = bVar;
        this.W = p81Var;
    }

    private final boolean h(String str) {
        JSONObject optJSONObject = this.f10081s.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final String i(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int k02 = this.f10083u.k0();
        if (k02 == 1) {
            return "1099";
        }
        if (k02 == 2) {
            return "2099";
        }
        if (k02 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean j() {
        return this.f10081s.optBoolean("allow_custom_click_gesture", false);
    }

    private final void k() {
        r2.b bVar;
        if (!((Boolean) s2.b0.c().d(uy.Ce)).booleanValue() || (bVar = this.V) == null) {
            return;
        }
        bVar.a();
    }

    private final boolean l(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z7, View view) {
        JSONException jSONException;
        p81 p81Var;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f10081s);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) s2.b0.c().d(uy.f17059b4)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e8) {
                    jSONException = e8;
                    int i7 = v2.n1.f26802b;
                    w2.p.d("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z7);
            jSONObject6.put("screen", v2.u0.j(this.f10079q));
            if (((Boolean) s2.b0.c().d(uy.Ee)).booleanValue() && (p81Var = this.W) != null && p81Var.a() > 0) {
                jSONObject6.put("placement_id", p81Var.a());
            }
            if (((Boolean) s2.b0.c().d(uy.y9)).booleanValue()) {
                this.f10082t.d("/clickRecorded", new fm1(this, null));
            } else {
                this.f10082t.d("/logScionEvent", new em1(this, null));
            }
            xs1 xs1Var = this.f10082t;
            xs1Var.d("/nativeImpression", new gm1(this, view, null));
            try {
                xs1Var.d("/nativeImpressionFlowControl", new hm1(this, this.G, this.f10088z.f6197x0, this.I, null));
                fm0.a(xs1Var.c("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
                if (this.K) {
                    return true;
                }
                this.K = r2.t.s().g(this.f10079q, this.A.f27051q, this.f10088z.C.toString(), this.B.f17961g);
                return true;
            } catch (JSONException e9) {
                e = e9;
                jSONException = e;
                int i72 = v2.n1.f26802b;
                w2.p.d("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e10) {
            e = e10;
        }
    }

    private final String n(View view) {
        if (!((Boolean) s2.b0.c().d(uy.f17059b4)).booleanValue()) {
            return null;
        }
        try {
            return this.f10084v.b().m(this.f10079q, view, null);
        } catch (Exception unused) {
            int i7 = v2.n1.f26802b;
            w2.p.c("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void C() {
        this.f10082t.b();
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void E() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f10081s);
            fm0.a(this.f10082t.c("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void F0(Bundle bundle) {
        if (bundle == null) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Click data is null. No click is reported.");
        } else if (h("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            p(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, s2.z.a().t(bundle, null), false, false);
        } else {
            int i8 = v2.n1.f26802b;
            w2.p.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void G0(View view, MotionEvent motionEvent, View view2) {
        this.O = v2.u0.h(motionEvent, view2);
        long a8 = this.E.a();
        this.R = a8;
        if (motionEvent.getAction() == 0) {
            this.H.a(motionEvent);
            this.Q = a8;
            this.P = this.O;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.O;
        obtain.setLocation(point.x, point.y);
        this.f10084v.c(obtain);
        obtain.recycle();
        k();
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void H0(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.O = new Point();
        this.P = new Point();
        if (!this.L) {
            this.F.U0(view);
            this.L = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.C.e(this);
        boolean a8 = v2.u0.a(this.A.f27053s);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (a8) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (a8) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void I0(View view, Map map) {
        this.O = new Point();
        this.P = new Point();
        if (view != null) {
            this.F.W0(view);
        }
        this.L = false;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void J0(View view) {
        if (!this.f10081s.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i7 = v2.n1.f26802b;
            w2.p.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        vo1 vo1Var = this.D;
        if (view == null) {
            return;
        }
        view.setOnClickListener(vo1Var);
        view.setClickable(true);
        vo1Var.f17698w = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void K0(s2.g2 g2Var) {
        try {
            if (this.M) {
                return;
            }
            if (g2Var == null) {
                pn1 pn1Var = this.f10083u;
                if (pn1Var.f() != null) {
                    this.M = true;
                    this.G.b(pn1Var.f().e(), this.f10088z.f6197x0, this.I, null);
                    r();
                    return;
                }
            }
            this.M = true;
            this.G.b(g2Var.e(), this.f10088z.f6197x0, this.I, null);
            r();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final JSONObject L0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10079q;
        JSONObject e8 = v2.u0.e(context, map, map2, view, scaleType);
        JSONObject b8 = v2.u0.b(context, view);
        JSONObject c8 = v2.u0.c(view);
        JSONObject d8 = v2.u0.d(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", e8);
            jSONObject.put("ad_view_signal", b8);
            jSONObject.put("scroll_view_signal", c8);
            jSONObject.put("lock_screen_signal", d8);
            return jSONObject;
        } catch (JSONException e9) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Unable to create native ad view signals JSON.", e9);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void M0(a40 a40Var) {
        if (this.f10081s.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.D.a(a40Var);
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void N0(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        Context context = this.f10079q;
        JSONObject e8 = v2.u0.e(context, map, map2, view2, scaleType);
        JSONObject b8 = v2.u0.b(context, view2);
        JSONObject c8 = v2.u0.c(view2);
        JSONObject d8 = v2.u0.d(context, view2);
        String i7 = i(view, map);
        p(true == ((Boolean) s2.b0.c().d(uy.f17122i4)).booleanValue() ? view2 : view, b8, e8, c8, d8, i7, v2.u0.f(i7, context, this.P, this.O), null, z7, false);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final JSONObject O0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject L0 = L0(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.N && j()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (L0 != null) {
                jSONObject.put("nas", L0);
            }
            return jSONObject;
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Unable to create native click meta data JSON.", e8);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void P0(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i7) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f10081s;
        boolean z8 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) s2.b0.c().d(uy.Bc)).booleanValue()) {
                z8 = true;
            }
        }
        if (!z8) {
            if (!this.N) {
                int i8 = v2.n1.f26802b;
                w2.p.a("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!j()) {
                int i9 = v2.n1.f26802b;
                w2.p.a("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.f10079q;
        JSONObject e8 = v2.u0.e(context, map, map2, view2, scaleType);
        JSONObject b8 = v2.u0.b(context, view2);
        boolean z9 = z8;
        JSONObject c8 = v2.u0.c(view2);
        JSONObject d8 = v2.u0.d(context, view2);
        String i10 = i(view, map);
        JSONObject f8 = v2.u0.f(i10, context, this.P, this.O);
        if (z9) {
            try {
                Point point = this.P;
                Point point2 = this.O;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i7);
                    } catch (Exception e9) {
                        e = e9;
                        int i11 = v2.n1.f26802b;
                        w2.p.d("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        p(view2, b8, e8, c8, d8, i10, f8, null, z7, true);
                    }
                } catch (Exception e10) {
                    e = e10;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e11) {
                int i12 = v2.n1.f26802b;
                w2.p.d("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                r2.t.l().i(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        p(view2, b8, e8, c8, d8, i10, f8, null, z7, true);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void Q0(Bundle bundle) {
        if (bundle == null) {
            int i7 = v2.n1.f26802b;
            w2.p.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!h("touch_reporting")) {
                int i8 = v2.n1.f26802b;
                w2.p.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f10084v.b().e((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            k();
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void R0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10079q;
        JSONObject e8 = v2.u0.e(context, map, map2, view, scaleType);
        JSONObject b8 = v2.u0.b(context, view);
        JSONObject c8 = v2.u0.c(view);
        JSONObject d8 = v2.u0.d(context, view);
        boolean i7 = v2.u0.i(context, this.f10088z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f10081s);
            jSONObject.put("asset_view_signal", e8);
            jSONObject.put("ad_view_signal", b8);
            jSONObject.put("scroll_view_signal", c8);
            jSONObject.put("lock_screen_signal", d8);
            if (((Boolean) s2.b0.c().d(uy.f17059b4)).booleanValue()) {
                jSONObject.put("view_signals", n(view));
            }
            jSONObject.put("policy_validator_enabled", i7);
            jSONObject.put("screen", v2.u0.j(context));
            fm0.a(this.f10082t.c("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e9) {
            int i8 = v2.n1.f26802b;
            w2.p.d("Unable to create native ad signals logging JSON.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void S0(s2.d2 d2Var) {
        this.S = d2Var;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void T0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f10079q;
        l(v2.u0.b(context, view), v2.u0.e(context, map, map2, view, scaleType), v2.u0.c(view), v2.u0.d(context, view), n(view), null, v2.u0.i(context, this.f10088z), view);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final boolean U0(Bundle bundle) {
        if (h("impression_reporting")) {
            return l(null, null, null, null, ((Boolean) s2.b0.c().d(uy.xc)).booleanValue() ? n(null) : null, s2.z.a().t(bundle, null), false, null);
        }
        int i7 = v2.n1.f26802b;
        w2.p.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    final /* synthetic */ void a(View view) {
        this.U.a(view, this.f10088z);
    }

    final /* synthetic */ pa1 b() {
        return this.f10085w;
    }

    final /* synthetic */ u91 c() {
        return this.f10086x;
    }

    final /* synthetic */ ni1 d() {
        return this.f10087y;
    }

    final /* synthetic */ sc1 e() {
        return this.T;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void f() {
        this.N = true;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final boolean g() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void l0(String str) {
        p(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void m() {
        if (this.f10081s.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.D.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void o() {
        l(null, null, null, null, null, null, false, null);
    }

    protected final void p(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z7, boolean z8) {
        String str2;
        try {
            k();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.f10081s;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            ao1 ao1Var = this.f10080r;
            pn1 pn1Var = this.f10083u;
            jSONObject7.put("has_custom_click_handler", ao1Var.g(pn1Var.s()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", pn1Var.k0());
            jSONObject9.put("view_aware_api_used", z7);
            z10 z10Var = this.B.f17964j;
            jSONObject9.put("custom_mute_requested", z10Var != null && z10Var.f19960w);
            jSONObject9.put("custom_mute_enabled", (pn1Var.e().isEmpty() || pn1Var.f() == null) ? false : true);
            if (this.D.b() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.E.a());
            if (this.N && j()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z8) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", ao1Var.g(pn1Var.s()) != null);
            try {
                JSONObject optJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f10084v.b().l(this.f10079q, optJSONObject.optString("click_string"), view);
            } catch (Exception e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Exception obtaining click signals", e8);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) s2.b0.c().d(uy.C9)).booleanValue() && com.google.android.gms.common.util.n.i()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) s2.b0.c().d(uy.D9)).booleanValue() && com.google.android.gms.common.util.n.i()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long a8 = this.E.a();
            jSONObject10.put("time_from_last_touch_down", a8 - this.Q);
            jSONObject10.put("time_from_last_touch", a8 - this.R);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.f10088z.b()) {
                JSONObject jSONObject11 = (JSONObject) this.f10081s.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.J.k8(string, this.f10083u);
                }
            }
            fm0.a(this.f10082t.c("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e9) {
            int i8 = v2.n1.f26802b;
            w2.p.d("Unable to create click JSON.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void r() {
        try {
            s2.d2 d2Var = this.S;
            if (d2Var != null) {
                d2Var.c();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final int t() {
        z10 z10Var = this.B.f17964j;
        if (z10Var == null) {
            return 0;
        }
        if (((Boolean) s2.b0.c().d(uy.Bc)).booleanValue()) {
            return z10Var.f19962y;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final boolean z() {
        if (t() == 0) {
            return true;
        }
        if (((Boolean) s2.b0.c().d(uy.Bc)).booleanValue()) {
            return this.B.f17964j.f19963z;
        }
        return true;
    }
}
