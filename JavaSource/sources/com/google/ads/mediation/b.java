package com.google.ads.mediation;

import k2.m;
import y2.i;

/* compiled from: MyApplication */
final class b extends k2.d implements l2.d, s2.a {

    /* renamed from: q, reason: collision with root package name */
    final AbstractAdViewAdapter f4306q;

    /* renamed from: r, reason: collision with root package name */
    final i f4307r;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f4306q = abstractAdViewAdapter;
        this.f4307r = iVar;
    }

    @Override // k2.d, s2.a
    public final void c0() {
        this.f4307r.e(this.f4306q);
    }

    @Override // k2.d
    public final void d() {
        this.f4307r.a(this.f4306q);
    }

    @Override // k2.d
    public final void e(m mVar) {
        this.f4307r.g(this.f4306q, mVar);
    }

    @Override // k2.d
    public final void h() {
        this.f4307r.j(this.f4306q);
    }

    @Override // k2.d
    public final void j() {
        this.f4307r.p(this.f4306q);
    }

    @Override // l2.d
    public final void n(String str, String str2) {
        this.f4307r.l(this.f4306q, str, str2);
    }
}
