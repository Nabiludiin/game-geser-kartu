package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class tp1 implements xn1, hf1 {
    private final ub0 C;
    private final vb0 D;

    /* renamed from: q, reason: collision with root package name */
    private final yb0 f16282q;

    /* renamed from: r, reason: collision with root package name */
    private final pa1 f16283r;

    /* renamed from: s, reason: collision with root package name */
    private final wc1 f16284s;

    /* renamed from: t, reason: collision with root package name */
    private final u91 f16285t;

    /* renamed from: u, reason: collision with root package name */
    private final ni1 f16286u;

    /* renamed from: v, reason: collision with root package name */
    private final Context f16287v;

    /* renamed from: w, reason: collision with root package name */
    private final c03 f16288w;

    /* renamed from: x, reason: collision with root package name */
    private final w2.a f16289x;

    /* renamed from: y, reason: collision with root package name */
    private final w03 f16290y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16291z = false;
    private boolean A = false;
    private boolean B = true;

    public tp1(ub0 ub0Var, vb0 vb0Var, yb0 yb0Var, pa1 pa1Var, wc1 wc1Var, u91 u91Var, ni1 ni1Var, Context context, c03 c03Var, w2.a aVar, w03 w03Var) {
        this.C = ub0Var;
        this.D = vb0Var;
        this.f16282q = yb0Var;
        this.f16283r = pa1Var;
        this.f16284s = wc1Var;
        this.f16285t = u91Var;
        this.f16286u = ni1Var;
        this.f16287v = context;
        this.f16288w = c03Var;
        this.f16289x = aVar;
        this.f16290y = w03Var;
    }

    private static final HashMap a(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    private final void b(View view) {
        try {
            yb0 yb0Var = this.f16282q;
            if (yb0Var != null && !yb0Var.t()) {
                yb0Var.E0(w3.b.C1(view));
                this.f16285t.c0();
                if (((Boolean) s2.b0.c().d(uy.Nb)).booleanValue()) {
                    this.f16286u.z();
                    return;
                }
                return;
            }
            ub0 ub0Var = this.C;
            if (ub0Var != null && !ub0Var.m()) {
                ub0Var.j0(w3.b.C1(view));
                this.f16285t.c0();
                if (((Boolean) s2.b0.c().d(uy.Nb)).booleanValue()) {
                    this.f16286u.z();
                    return;
                }
                return;
            }
            vb0 vb0Var = this.D;
            if (vb0Var == null || vb0Var.q()) {
                return;
            }
            vb0Var.J1(w3.b.C1(view));
            this.f16285t.c0();
            if (((Boolean) s2.b0.c().d(uy.Nb)).booleanValue()) {
                this.f16286u.z();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to call handleClick", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void C() {
        try {
            yb0 yb0Var = this.f16282q;
            if (yb0Var != null) {
                yb0Var.T();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to call destroy", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void H0(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        w3.a m7;
        try {
            w3.a C1 = w3.b.C1(view);
            JSONObject jSONObject = this.f16288w.f6169j0;
            boolean z7 = true;
            if (((Boolean) s2.b0.c().d(uy.O1)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) s2.b0.c().d(uy.P1)).booleanValue() && next.equals("3010")) {
                                yb0 yb0Var = this.f16282q;
                                Object obj2 = null;
                                if (yb0Var != null) {
                                    try {
                                        m7 = yb0Var.m();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    ub0 ub0Var = this.C;
                                    if (ub0Var != null) {
                                        m7 = ub0Var.Z4();
                                    } else {
                                        vb0 vb0Var = this.D;
                                        m7 = vb0Var != null ? vb0Var.t() : null;
                                    }
                                }
                                if (m7 != null) {
                                    obj2 = w3.b.r0(m7);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                v2.r0.a(optJSONArray, arrayList);
                                r2.t.g();
                                ClassLoader classLoader = this.f16287v.getClassLoader();
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj3 = arrayList.get(i7);
                                    i7++;
                                    if (Class.forName((String) obj3, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z7 = false;
                        break;
                    }
                }
            }
            this.B = z7;
            HashMap a8 = a(map);
            HashMap a9 = a(map2);
            yb0 yb0Var2 = this.f16282q;
            if (yb0Var2 != null) {
                yb0Var2.D3(C1, w3.b.C1(a8), w3.b.C1(a9));
                return;
            }
            ub0 ub0Var2 = this.C;
            if (ub0Var2 != null) {
                ub0Var2.M5(C1, w3.b.C1(a8), w3.b.C1(a9));
                ub0Var2.v6(C1);
                return;
            }
            vb0 vb0Var2 = this.D;
            if (vb0Var2 != null) {
                vb0Var2.u4(C1, w3.b.C1(a8), w3.b.C1(a9));
                vb0Var2.D2(C1);
            }
        } catch (RemoteException e8) {
            int i8 = v2.n1.f26802b;
            w2.p.g("Failed to call trackView", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void I0(View view, Map map) {
        try {
            w3.a C1 = w3.b.C1(view);
            yb0 yb0Var = this.f16282q;
            if (yb0Var != null) {
                yb0Var.R4(C1);
                return;
            }
            ub0 ub0Var = this.C;
            if (ub0Var != null) {
                ub0Var.a4(C1);
                return;
            }
            vb0 vb0Var = this.D;
            if (vb0Var != null) {
                vb0Var.b8(C1);
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to call untrackView", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void K0(s2.g2 g2Var) {
        int i7 = v2.n1.f26802b;
        w2.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final JSONObject L0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void N0(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType) {
        if (this.A && this.f16288w.L) {
            return;
        }
        b(view);
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final JSONObject O0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void P0(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i7) {
        if (!this.A) {
            int i8 = v2.n1.f26802b;
            w2.p.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f16288w.L) {
            b(view2);
        } else {
            int i9 = v2.n1.f26802b;
            w2.p.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void S0(s2.d2 d2Var) {
        int i7 = v2.n1.f26802b;
        w2.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void T0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f16291z) {
                this.f16291z = r2.t.s().g(this.f16287v, this.f16289x.f27051q, this.f16288w.C.toString(), this.f16290y.f17961g);
            }
            if (this.B) {
                yb0 yb0Var = this.f16282q;
                if (yb0Var == null) {
                    ub0 ub0Var = this.C;
                    if (ub0Var != null && !ub0Var.s()) {
                        ub0Var.n();
                        this.f16283r.a();
                        return;
                    }
                    vb0 vb0Var = this.D;
                    if (vb0Var == null || vb0Var.o()) {
                        return;
                    }
                    vb0Var.l();
                    this.f16283r.a();
                    return;
                }
                c03 c03Var = this.f16288w;
                if (c03Var.D0) {
                    if (yb0Var.r()) {
                        return;
                    }
                    yb0Var.z();
                    this.f16283r.a();
                    return;
                }
                if (yb0Var.r() && c03Var.f6158e == 4) {
                    this.f16284s.a();
                } else {
                    yb0Var.z();
                    this.f16283r.a();
                }
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to call recordImpression", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final boolean U0(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void d() {
        try {
            yb0 yb0Var = this.f16282q;
            if (yb0Var == null || !yb0Var.r()) {
                return;
            }
            c03 c03Var = this.f16288w;
            if (c03Var.f6158e != 4 && !c03Var.D0) {
                return;
            }
            yb0Var.z();
            this.f16283r.a();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Failed to report impression from an adapter", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void f() {
        this.A = true;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final boolean g() {
        return this.f16288w.L;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void r() {
        int i7 = v2.n1.f26802b;
        w2.p.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final int t() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final boolean z() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void m() {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void F0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void J0(View view) {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void M0(a40 a40Var) {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void Q0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void l0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void G0(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.xn1
    public final void R0(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
