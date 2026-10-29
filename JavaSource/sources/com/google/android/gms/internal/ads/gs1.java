package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public final class gs1 extends d30 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f9104q;

    /* renamed from: r, reason: collision with root package name */
    private final pn1 f9105r;

    /* renamed from: s, reason: collision with root package name */
    private po1 f9106s;

    /* renamed from: t, reason: collision with root package name */
    private kn1 f9107t;

    public gs1(Context context, pn1 pn1Var, po1 po1Var, kn1 kn1Var) {
        this.f9104q = context;
        this.f9105r = pn1Var;
        this.f9106s = po1Var;
        this.f9107t = kn1Var;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void b8(w3.a aVar) {
        kn1 kn1Var;
        Object r02 = w3.b.r0(aVar);
        if (!(r02 instanceof View) || this.f9105r.z() == null || (kn1Var = this.f9107t) == null) {
            return;
        }
        kn1Var.y((View) r02);
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void c0(String str) {
        kn1 kn1Var = this.f9107t;
        if (kn1Var != null) {
            kn1Var.L(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final List f() {
        try {
            pn1 pn1Var = this.f9105r;
            r.h B = pn1Var.B();
            r.h E = pn1Var.E();
            String[] strArr = new String[B.size() + E.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < B.size(); i8++) {
                strArr[i7] = (String) B.i(i8);
                i7++;
            }
            for (int i9 = 0; i9 < E.size(); i9++) {
                strArr[i7] = (String) E.i(i9);
                i7++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e8) {
            r2.t.l().i(e8, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final String g() {
        return this.f9105r.s();
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void i() {
        kn1 kn1Var = this.f9107t;
        if (kn1Var != null) {
            kn1Var.W();
        }
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean j0(w3.a aVar) {
        po1 po1Var;
        Object r02 = w3.b.r0(aVar);
        if (!(r02 instanceof ViewGroup) || (po1Var = this.f9106s) == null || !po1Var.d((ViewGroup) r02)) {
            return false;
        }
        this.f9105r.t().M0(new fs1(this, "_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void k() {
        kn1 kn1Var = this.f9107t;
        if (kn1Var != null) {
            kn1Var.a();
        }
        this.f9107t = null;
        this.f9106s = null;
    }

    final /* synthetic */ kn1 k8() {
        return this.f9107t;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final s2.b3 l() {
        return this.f9105r.l0();
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final w3.a n() {
        return w3.b.C1(this.f9104q);
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final i20 p() {
        try {
            return this.f9107t.A().a();
        } catch (NullPointerException e8) {
            r2.t.l().i(e8, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean q() {
        kn1 kn1Var = this.f9107t;
        if (kn1Var != null && !kn1Var.x()) {
            return false;
        }
        pn1 pn1Var = this.f9105r;
        return pn1Var.w() != null && pn1Var.t() == null;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean s() {
        pn1 pn1Var = this.f9105r;
        fa2 z7 = pn1Var.z();
        if (z7 == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Trying to start OMID session before creation.");
            return false;
        }
        r2.t.y().b(z7.a());
        if (pn1Var.w() == null) {
            return true;
        }
        pn1Var.w().B("onSdkLoaded", new r.a());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final l20 u(String str) {
        return (l20) this.f9105r.B().get(str);
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final void w() {
        try {
            String D = this.f9105r.D();
            if (Objects.equals(D, "Google")) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(D)) {
                int i8 = v2.n1.f26802b;
                w2.p.f("Not starting OMID session. OM partner name has not been configured.");
            } else {
                kn1 kn1Var = this.f9107t;
                if (kn1Var != null) {
                    kn1Var.w(D, false);
                }
            }
        } catch (NullPointerException e8) {
            r2.t.l().i(e8, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final String y(String str) {
        return (String) this.f9105r.E().get(str);
    }

    @Override // com.google.android.gms.internal.ads.e30
    public final boolean y0(w3.a aVar) {
        po1 po1Var;
        Object r02 = w3.b.r0(aVar);
        if (!(r02 instanceof ViewGroup) || (po1Var = this.f9106s) == null || !po1Var.e((ViewGroup) r02)) {
            return false;
        }
        this.f9105r.u().M0(new fs1(this, "_videoMediaView"));
        return true;
    }
}
