package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class jo1 extends t20 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, op1 {

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference f10670q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f10671r = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    private final Map f10672s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private final Map f10673t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private kn1 f10674u;

    /* renamed from: v, reason: collision with root package name */
    private ir f10675v;

    public jo1(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        r2.t.c();
        qm0.a(view, this);
        r2.t.c();
        qm0.b(view, this);
        this.f10670q = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f10671r.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f10673t.putAll(this.f10671r);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f10672s.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f10673t.putAll(this.f10672s);
        this.f10675v = new ir(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final synchronized void C0(w3.a aVar) {
        Object r02 = w3.b.r0(aVar);
        if (!(r02 instanceof kn1)) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        kn1 kn1Var = this.f10674u;
        if (kn1Var != null) {
            kn1Var.b0(this);
        }
        kn1 kn1Var2 = (kn1) r02;
        if (!kn1Var2.u()) {
            int i8 = v2.n1.f26802b;
            w2.p.c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.f10674u = kn1Var2;
            kn1Var2.a0(this);
            this.f10674u.y(q5());
        }
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final FrameLayout C1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized void D2(String str, View view, boolean z7) {
        this.f10673t.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f10671r.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final synchronized void d() {
        kn1 kn1Var = this.f10674u;
        if (kn1Var != null) {
            kn1Var.b0(this);
            this.f10674u = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final synchronized void d0(w3.a aVar) {
        try {
            if (this.f10674u != null) {
                Object r02 = w3.b.r0(aVar);
                if (!(r02 instanceof View)) {
                    int i7 = v2.n1.f26802b;
                    w2.p.f("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.f10674u.h0((View) r02);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final ir g() {
        return this.f10675v;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized Map i() {
        return this.f10673t;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized Map k() {
        return this.f10672s;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized Map l() {
        return this.f10671r;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized JSONObject m() {
        kn1 kn1Var = this.f10674u;
        if (kn1Var == null) {
            return null;
        }
        return kn1Var.g0(q5(), i(), l());
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized View n0(String str) {
        WeakReference weakReference = (WeakReference) this.f10673t.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized String o() {
        return "1007";
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        kn1 kn1Var = this.f10674u;
        if (kn1Var != null) {
            kn1Var.c0(view, q5(), i(), l(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        kn1 kn1Var = this.f10674u;
        if (kn1Var != null) {
            kn1Var.e0(q5(), i(), l(), kn1.t(q5()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        kn1 kn1Var = this.f10674u;
        if (kn1Var != null) {
            kn1Var.e0(q5(), i(), l(), kn1.t(q5()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        kn1 kn1Var = this.f10674u;
        if (kn1Var != null) {
            kn1Var.d0(view, motionEvent, q5());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized w3.a q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final View q5() {
        return (View) this.f10670q.get();
    }

    @Override // com.google.android.gms.internal.ads.op1
    public final synchronized JSONObject s() {
        return null;
    }
}
