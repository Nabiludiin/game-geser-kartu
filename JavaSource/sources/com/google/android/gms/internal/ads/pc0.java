package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: MyApplication */
public final class pc0 extends xb0 {

    /* renamed from: q, reason: collision with root package name */
    private final y2.r f13814q;

    public pc0(y2.r rVar) {
        this.f13814q = rVar;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final float C() {
        return this.f13814q.g();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void D3(w3.a aVar, w3.a aVar2, w3.a aVar3) {
        HashMap hashMap = (HashMap) w3.b.r0(aVar2);
        HashMap hashMap2 = (HashMap) w3.b.r0(aVar3);
        this.f13814q.F((View) w3.b.r0(aVar), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void E0(w3.a aVar) {
        this.f13814q.r((View) w3.b.r0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final float J() {
        return this.f13814q.f();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void R4(w3.a aVar) {
        this.f13814q.G((View) w3.b.r0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void T() {
        this.f13814q.a();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String c() {
        return this.f13814q.i();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final List e() {
        List<n2.d> k7 = this.f13814q.k();
        ArrayList arrayList = new ArrayList();
        if (k7 != null) {
            for (n2.d dVar : k7) {
                arrayList.add(new v10(dVar.a(), dVar.c(), dVar.b(), dVar.d(), dVar.e(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String f() {
        return this.f13814q.d();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final l20 g() {
        n2.d j7 = this.f13814q.j();
        if (j7 != null) {
            return new v10(j7.a(), j7.c(), j7.b(), j7.d(), j7.e(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String i() {
        return this.f13814q.c();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String j() {
        return this.f13814q.e();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String k() {
        return this.f13814q.q();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final double l() {
        y2.r rVar = this.f13814q;
        if (rVar.p() != null) {
            return rVar.p().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final w3.a m() {
        View K = this.f13814q.K();
        if (K == null) {
            return null;
        }
        return w3.b.C1(K);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final String n() {
        return this.f13814q.o();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final s2.b3 o() {
        y2.r rVar = this.f13814q;
        if (rVar.J() != null) {
            return rVar.J().c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final Bundle p() {
        return this.f13814q.h();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final e20 q() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final boolean r() {
        return this.f13814q.n();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final w3.a s() {
        View b8 = this.f13814q.b();
        if (b8 == null) {
            return null;
        }
        return w3.b.C1(b8);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final boolean t() {
        return this.f13814q.m();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final w3.a w() {
        Object L = this.f13814q.L();
        if (L == null) {
            return null;
        }
        return w3.b.C1(L);
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final float x() {
        return this.f13814q.l();
    }

    @Override // com.google.android.gms.internal.ads.yb0
    public final void z() {
        this.f13814q.t();
    }
}
