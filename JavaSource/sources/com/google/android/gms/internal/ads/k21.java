package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class k21 extends h21 {

    /* renamed from: l, reason: collision with root package name */
    private final Context f10857l;

    /* renamed from: m, reason: collision with root package name */
    private final View f10858m;

    /* renamed from: n, reason: collision with root package name */
    private final mr0 f10859n;

    /* renamed from: o, reason: collision with root package name */
    private final d03 f10860o;

    /* renamed from: p, reason: collision with root package name */
    private final p41 f10861p;

    /* renamed from: q, reason: collision with root package name */
    private final ao1 f10862q;

    /* renamed from: r, reason: collision with root package name */
    private final ri1 f10863r;

    /* renamed from: s, reason: collision with root package name */
    private final h85 f10864s;

    /* renamed from: t, reason: collision with root package name */
    private final Executor f10865t;

    /* renamed from: u, reason: collision with root package name */
    private s2.g5 f10866u;

    k21(q41 q41Var, Context context, d03 d03Var, View view, mr0 mr0Var, p41 p41Var, ao1 ao1Var, ri1 ri1Var, h85 h85Var, Executor executor) {
        super(q41Var);
        this.f10857l = context;
        this.f10858m = view;
        this.f10859n = mr0Var;
        this.f10860o = d03Var;
        this.f10861p = p41Var;
        this.f10862q = ao1Var;
        this.f10863r = ri1Var;
        this.f10864s = h85Var;
        this.f10865t = executor;
    }

    @Override // com.google.android.gms.internal.ads.r41
    public final void b() {
        this.f10865t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.j21
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                k21.this.t();
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final View k() {
        return this.f10858m;
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final void l(ViewGroup viewGroup, s2.g5 g5Var) {
        mr0 mr0Var;
        if (viewGroup == null || (mr0Var = this.f10859n) == null) {
            return;
        }
        mr0Var.T0(bu0.a(g5Var));
        viewGroup.setMinimumHeight(g5Var.f26097s);
        viewGroup.setMinimumWidth(g5Var.f26100v);
        this.f10866u = g5Var;
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final s2.b3 m() {
        try {
            return this.f10861p.a();
        } catch (d13 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final d03 o() {
        s2.g5 g5Var = this.f10866u;
        if (g5Var != null) {
            return c13.b(g5Var);
        }
        c03 c03Var = this.f14726b;
        if (c03Var.f6155c0) {
            for (String str : c03Var.f6150a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f10858m;
            return new d03(view.getWidth(), view.getHeight(), false);
        }
        return (d03) c03Var.f6184r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final d03 p() {
        return this.f10860o;
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final int q() {
        if (((Boolean) s2.b0.c().d(uy.I8)).booleanValue() && this.f14726b.f6163g0) {
            if (!((Boolean) s2.b0.c().d(uy.J8)).booleanValue()) {
                return 0;
            }
        }
        return this.f14725a.f13137b.f12530b.f7927c;
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final int r() {
        return this.f14725a.f13137b.f12530b.f7928d;
    }

    @Override // com.google.android.gms.internal.ads.h21
    public final void s() {
        this.f10863r.a();
    }

    final /* synthetic */ void t() {
        v30 d8 = this.f10862q.d();
        if (d8 == null) {
            return;
        }
        try {
            d8.E6((s2.v0) this.f10864s.b(), w3.b.C1(this.f10857l));
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("RemoteException when notifyAdLoad is called", e8);
        }
    }
}
