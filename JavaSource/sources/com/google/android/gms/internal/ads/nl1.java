package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* compiled from: MyApplication */
public final class nl1 implements w91, uh1 {

    /* renamed from: q, reason: collision with root package name */
    private final gk0 f12782q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f12783r;

    /* renamed from: s, reason: collision with root package name */
    private final jk0 f12784s;

    /* renamed from: t, reason: collision with root package name */
    private final View f12785t;

    /* renamed from: u, reason: collision with root package name */
    private String f12786u;

    /* renamed from: v, reason: collision with root package name */
    private final ou f12787v;

    public nl1(gk0 gk0Var, Context context, jk0 jk0Var, View view, ou ouVar) {
        this.f12782q = gk0Var;
        this.f12783r = context;
        this.f12784s = jk0Var;
        this.f12785t = view;
        this.f12787v = ouVar;
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void b() {
        View view = this.f12785t;
        if (view != null && this.f12786u != null) {
            this.f12784s.g(view.getContext(), this.f12786u);
        }
        this.f12782q.a(true);
    }

    @Override // com.google.android.gms.internal.ads.uh1
    public final void g() {
        ou ouVar = this.f12787v;
        if (ouVar == ou.APP_OPEN) {
            return;
        }
        String f8 = this.f12784s.f(this.f12783r);
        this.f12786u = f8;
        this.f12786u = String.valueOf(f8).concat(ouVar == ou.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void u(qh0 qh0Var, String str, String str2) {
        jk0 jk0Var = this.f12784s;
        Context context = this.f12783r;
        if (jk0Var.a(context)) {
            try {
                jk0Var.o(context, jk0Var.j(context), this.f12782q.b(), qh0Var.b(), qh0Var.d());
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.g("Remote Exception to get reward item.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void v() {
        this.f12782q.a(false);
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.uh1
    public final void f() {
    }
}
