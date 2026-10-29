package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: MyApplication */
final class id5 implements Handler.Callback, jp {

    /* renamed from: q, reason: collision with root package name */
    private final mr f10006q;

    /* renamed from: r, reason: collision with root package name */
    private final cd5 f10007r;

    /* renamed from: s, reason: collision with root package name */
    private final ot f10008s = new ot();

    /* renamed from: t, reason: collision with root package name */
    private final zn1 f10009t;

    /* renamed from: u, reason: collision with root package name */
    private final ed5 f10010u;

    /* renamed from: v, reason: collision with root package name */
    private final fd5 f10011v;

    /* renamed from: w, reason: collision with root package name */
    private final gd5 f10012w;

    /* renamed from: x, reason: collision with root package name */
    private final hd5 f10013x;

    public id5(mr mrVar, cd5 cd5Var, pd1 pd1Var, int i7, int i8, int i9, int i10) {
        this.f10006q = mrVar;
        this.f10007r = cd5Var;
        this.f10009t = pd1Var.c(mrVar.h(), this);
        this.f10010u = new ed5(this, i7);
        this.f10011v = new fd5(this, i8);
        this.f10012w = new gd5(this, i9);
        this.f10013x = new hd5(this, i10);
        mrVar.L(this);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void A(int i7, int i8) {
        ip.t(this, i7, i8);
    }

    final /* synthetic */ cd5 D() {
        return this.f10007r;
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void H(float f8) {
        ip.q(this, f8);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void I(int i7) {
        ip.h(this, i7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void L(xj xjVar) {
        ip.l(this, xjVar);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void P(int i7) {
        ip.j(this, i7);
    }

    final /* synthetic */ ot Q() {
        return this.f10008s;
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void R(boolean z7) {
        ip.e(this, z7);
    }

    final /* synthetic */ zn1 V() {
        return this.f10009t;
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void X(j9 j9Var, int i7) {
        ip.b(this, j9Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void Y(jc jcVar) {
        ip.d(this, jcVar);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void b(te0 te0Var) {
        ip.s(this, te0Var);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void c(boolean z7) {
        ip.k(this, z7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void e(boolean z7, int i7) {
        ip.i(this, z7, i7);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            this.f10010u.a();
            return true;
        }
        if (i7 == 2) {
            this.f10011v.a();
            return true;
        }
        if (i7 == 3) {
            this.f10012w.a();
            return true;
        }
        if (i7 != 4) {
            return false;
        }
        this.f10013x.a();
        return true;
    }

    public final void j() {
        this.f10009t.i(null);
        this.f10006q.K(this);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void k(yk ykVar) {
        ip.o(this, ykVar);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void l(boolean z7, int i7) {
        ip.g(this, z7, i7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void m(boolean z7) {
        ip.r(this, z7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public final void n(mr mrVar, go goVar) {
        this.f10010u.a();
        this.f10011v.a();
        this.f10012w.a();
        this.f10013x.a();
    }

    final /* synthetic */ mr p() {
        return this.f10006q;
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void q(en enVar) {
        ip.f(this, enVar);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void t(d70 d70Var) {
        ip.c(this, d70Var);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void v(int i7) {
        ip.p(this, i7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void w(az azVar, int i7) {
        ip.a(this, azVar, i7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void x(lq lqVar, lq lqVar2, int i7) {
        ip.n(this, lqVar, lqVar2, i7);
    }

    @Override // com.google.android.gms.internal.ads.jp
    public /* synthetic */ void z(xj xjVar) {
        ip.m(this, xjVar);
    }
}
