package com.google.ads.mediation;

import k2.m;
import y2.l;

/* compiled from: MyApplication */
final class c extends x2.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f4308a;

    /* renamed from: b, reason: collision with root package name */
    final l f4309b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f4308a = abstractAdViewAdapter;
        this.f4309b = lVar;
    }

    @Override // k2.e
    public final void a(m mVar) {
        this.f4309b.m(this.f4308a, mVar);
    }

    @Override // k2.e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f4308a;
        x2.a aVar = (x2.a) obj;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        l lVar = this.f4309b;
        aVar.c(new d(abstractAdViewAdapter, lVar));
        lVar.o(abstractAdViewAdapter);
    }
}
