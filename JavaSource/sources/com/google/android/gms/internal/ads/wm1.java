package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class wm1 extends h20 {

    /* renamed from: q, reason: collision with root package name */
    private final pn1 f18316q;

    /* renamed from: r, reason: collision with root package name */
    private w3.a f18317r;

    public wm1(pn1 pn1Var) {
        this.f18316q = pn1Var;
    }

    private static float j8(w3.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) w3.b.r0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final void T6(s30 s30Var) {
        pn1 pn1Var = this.f18316q;
        if (pn1Var.l0() instanceof us0) {
            ((us0) pn1Var.l0()).p8(s30Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final float c() {
        bu0 R;
        int i7;
        int i8;
        pn1 pn1Var = this.f18316q;
        if (pn1Var.C() != 0.0f) {
            return pn1Var.C();
        }
        if (pn1Var.l0() != null) {
            try {
                return pn1Var.l0().n();
            } catch (RemoteException e8) {
                int i9 = v2.n1.f26802b;
                w2.p.d("Remote exception getting video controller aspect ratio.", e8);
                return 0.0f;
            }
        }
        w3.a aVar = this.f18317r;
        if (aVar != null) {
            return j8(aVar);
        }
        if (((Boolean) s2.b0.c().d(uy.sd)).booleanValue() && pn1Var.u() != null && (R = pn1Var.u().R()) != null && (i7 = R.f6005c) >= 0 && (i8 = R.f6004b) > 0) {
            return i7 / i8;
        }
        l20 d8 = pn1Var.d();
        if (d8 == null) {
            return 0.0f;
        }
        float c8 = (d8.c() == -1 || d8.e() == -1) ? 0.0f : d8.c() / d8.e();
        return c8 == 0.0f ? j8(d8.b()) : c8;
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final w3.a f() {
        w3.a aVar = this.f18317r;
        if (aVar != null) {
            return aVar;
        }
        l20 d8 = this.f18316q.d();
        if (d8 == null) {
            return null;
        }
        return d8.b();
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final float g() {
        pn1 pn1Var = this.f18316q;
        if (pn1Var.l0() != null) {
            return pn1Var.l0().i();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final s2.b3 i() {
        return this.f18316q.l0();
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final float j() {
        pn1 pn1Var = this.f18316q;
        if (pn1Var.l0() != null) {
            return pn1Var.l0().l();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final boolean k() {
        return this.f18316q.v();
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final boolean l() {
        return this.f18316q.l0() != null;
    }

    @Override // com.google.android.gms.internal.ads.i20
    public final void zzf(w3.a aVar) {
        this.f18317r = aVar;
    }
}
