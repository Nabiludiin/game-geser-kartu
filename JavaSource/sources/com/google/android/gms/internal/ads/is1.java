package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class is1 extends d40 {

    /* renamed from: q, reason: collision with root package name */
    private final String f10172q;

    /* renamed from: r, reason: collision with root package name */
    private final kn1 f10173r;

    /* renamed from: s, reason: collision with root package name */
    private final pn1 f10174s;

    /* renamed from: t, reason: collision with root package name */
    private final rx1 f10175t;

    public is1(String str, kn1 kn1Var, pn1 pn1Var, rx1 rx1Var) {
        this.f10172q = str;
        this.f10173r = kn1Var;
        this.f10174s = pn1Var;
        this.f10175t = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void A4(a40 a40Var) {
        this.f10173r.i0(a40Var);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final boolean A5(Bundle bundle) {
        return this.f10173r.Y(bundle);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void B3(s2.q2 q2Var) {
        try {
            if (!q2Var.e()) {
                this.f10175t.b();
            }
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.b("Error in making CSI ping for reporting paid event callback", e8);
        }
        this.f10173r.B(q2Var);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final boolean C() {
        pn1 pn1Var = this.f10174s;
        return (pn1Var.e().isEmpty() || pn1Var.f() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final i20 D() {
        return this.f10173r.A().a();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void D4(Bundle bundle) {
        this.f10173r.Z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void D6(Bundle bundle) {
        this.f10173r.X(bundle);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void E() {
        this.f10173r.j0();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final Bundle G() {
        return this.f10174s.h();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void J2(long j7) {
        kn1 kn1Var = this.f10173r;
        if (kn1Var == null || kn1Var.e() == null) {
            return;
        }
        kn1Var.e().b(j7);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final s2.y2 M() {
        if (((Boolean) s2.b0.c().d(uy.m7)).booleanValue()) {
            return this.f10173r.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void Q() {
        this.f10173r.m();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final long S() {
        kn1 kn1Var = this.f10173r;
        if (kn1Var == null || kn1Var.e() == null) {
            return 0L;
        }
        return kn1Var.e().a();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void Z() {
        this.f10173r.o();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String c() {
        return this.f10174s.b();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final List e() {
        return this.f10174s.c();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String f() {
        return this.f10174s.g();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void f5(Bundle bundle) {
        if (((Boolean) s2.b0.c().d(uy.ae)).booleanValue()) {
            this.f10173r.C(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final l20 g() {
        return this.f10174s.p();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final boolean g0() {
        return this.f10173r.q();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String i() {
        return this.f10174s.q();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String j() {
        return this.f10174s.i();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String k() {
        return this.f10174s.m();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final double l() {
        return this.f10174s.o();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final e20 m() {
        return this.f10174s.m0();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String n() {
        return this.f10174s.n();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final s2.b3 o() {
        return this.f10174s.l0();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final String q() {
        return this.f10172q;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void q1(s2.d2 d2Var) {
        this.f10173r.l(d2Var);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void s() {
        this.f10173r.a();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final w3.a t() {
        return w3.b.C1(this.f10173r);
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final List x() {
        return C() ? this.f10174s.e() : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final w3.a z() {
        return this.f10174s.l();
    }

    @Override // com.google.android.gms.internal.ads.e40
    public final void z3(s2.g2 g2Var) {
        this.f10173r.k(g2Var);
    }
}
