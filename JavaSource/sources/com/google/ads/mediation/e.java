package com.google.ads.mediation;

import com.google.android.gms.internal.ads.f30;
import k2.m;
import n2.g;
import n2.k;
import n2.l;
import n2.n;

/* compiled from: MyApplication */
final class e extends k2.d implements n, l, k {

    /* renamed from: q, reason: collision with root package name */
    final AbstractAdViewAdapter f4312q;

    /* renamed from: r, reason: collision with root package name */
    final y2.n f4313r;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, y2.n nVar) {
        this.f4312q = abstractAdViewAdapter;
        this.f4313r = nVar;
    }

    @Override // n2.l
    public final void a(f30 f30Var) {
        this.f4313r.i(this.f4312q, f30Var);
    }

    @Override // n2.k
    public final void b(f30 f30Var, String str) {
        this.f4313r.n(this.f4312q, f30Var, str);
    }

    @Override // n2.n
    public final void c(g gVar) {
        this.f4313r.d(this.f4312q, new a(gVar));
    }

    @Override // k2.d, s2.a
    public final void c0() {
        this.f4313r.k(this.f4312q);
    }

    @Override // k2.d
    public final void d() {
        this.f4313r.h(this.f4312q);
    }

    @Override // k2.d
    public final void e(m mVar) {
        this.f4313r.f(this.f4312q, mVar);
    }

    @Override // k2.d
    public final void f() {
        this.f4313r.r(this.f4312q);
    }

    @Override // k2.d
    public final void j() {
        this.f4313r.b(this.f4312q);
    }

    @Override // k2.d
    public final void h() {
    }
}
