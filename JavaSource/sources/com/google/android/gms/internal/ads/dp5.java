package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: MyApplication */
final class dp5 implements kq5, fm5 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f7225q;

    /* renamed from: r, reason: collision with root package name */
    private jq5 f7226r;

    /* renamed from: s, reason: collision with root package name */
    private em5 f7227s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ fp5 f7228t;

    public dp5(fp5 fp5Var, Object obj) {
        Objects.requireNonNull(fp5Var);
        this.f7228t = fp5Var;
        this.f7226r = fp5Var.s(null);
        this.f7227s = fp5Var.u(null);
        this.f7225q = obj;
    }

    private final boolean b(int i7, xp5 xp5Var) {
        xp5 xp5Var2;
        if (xp5Var != null) {
            xp5Var2 = this.f7228t.B(this.f7225q, xp5Var);
            if (xp5Var2 == null) {
                return false;
            }
        } else {
            xp5Var2 = null;
        }
        fp5 fp5Var = this.f7228t;
        fp5Var.A(this.f7225q, 0);
        jq5 jq5Var = this.f7226r;
        int i8 = jq5Var.f10717a;
        if (!Objects.equals(jq5Var.f10718b, xp5Var2)) {
            this.f7226r = fp5Var.t(0, xp5Var2);
        }
        em5 em5Var = this.f7227s;
        int i9 = em5Var.f7709a;
        if (Objects.equals(em5Var.f7710b, xp5Var2)) {
            return true;
        }
        this.f7227s = fp5Var.v(0, xp5Var2);
        return true;
    }

    private final tp5 c(tp5 tp5Var, xp5 xp5Var) {
        fp5 fp5Var = this.f7228t;
        Object obj = this.f7225q;
        fp5Var.C(obj, tp5Var.f16299c, xp5Var);
        fp5Var.C(obj, tp5Var.f16300d, xp5Var);
        return tp5Var;
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void Q(int i7, xp5 xp5Var, tp5 tp5Var) {
        if (b(0, xp5Var)) {
            jq5 jq5Var = this.f7226r;
            c(tp5Var, xp5Var);
            jq5Var.h(tp5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void V(int i7, xp5 xp5Var, op5 op5Var, tp5 tp5Var) {
        if (b(0, xp5Var)) {
            jq5 jq5Var = this.f7226r;
            c(tp5Var, xp5Var);
            jq5Var.f(op5Var, tp5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void c0(int i7, xp5 xp5Var, op5 op5Var, tp5 tp5Var) {
        if (b(0, xp5Var)) {
            jq5 jq5Var = this.f7226r;
            c(tp5Var, xp5Var);
            jq5Var.e(op5Var, tp5Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void j(int i7, xp5 xp5Var, op5 op5Var, tp5 tp5Var, IOException iOException, boolean z7) {
        if (b(0, xp5Var)) {
            jq5 jq5Var = this.f7226r;
            c(tp5Var, xp5Var);
            jq5Var.g(op5Var, tp5Var, iOException, z7);
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void p(int i7, xp5 xp5Var, op5 op5Var, tp5 tp5Var, int i8) {
        if (b(0, xp5Var)) {
            jq5 jq5Var = this.f7226r;
            c(tp5Var, xp5Var);
            jq5Var.d(op5Var, tp5Var, i8);
        }
    }
}
