package com.google.ads.mediation;

import k2.l;

/* compiled from: MyApplication */
final class d extends l {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f4310a;

    /* renamed from: b, reason: collision with root package name */
    final y2.l f4311b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, y2.l lVar) {
        this.f4310a = abstractAdViewAdapter;
        this.f4311b = lVar;
    }

    @Override // k2.l
    public final void b() {
        this.f4311b.q(this.f4310a);
    }

    @Override // k2.l
    public final void e() {
        this.f4311b.s(this.f4310a);
    }
}
