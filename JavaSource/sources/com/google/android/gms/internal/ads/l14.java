package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
final class l14 extends ty3 {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Iterator f11351s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ sx3 f11352t;

    l14(Iterator it, sx3 sx3Var) {
        this.f11351s = it;
        this.f11352t = sx3Var;
    }

    @Override // com.google.android.gms.internal.ads.ty3
    protected final Object b() {
        sx3 sx3Var;
        Object next;
        do {
            Iterator it = this.f11351s;
            if (!it.hasNext()) {
                d();
                return null;
            }
            sx3Var = this.f11352t;
            next = it.next();
        } while (!sx3Var.d(next));
        return next;
    }
}
