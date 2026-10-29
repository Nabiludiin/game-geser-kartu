package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.l0;
import java.util.List;
import java.util.Map;

final class y implements f3 {

    /* renamed from: a, reason: collision with root package name */
    private final w f20779a;

    private y(w wVar) {
        w wVar2 = (w) m0.d(wVar, "output");
        this.f20779a = wVar2;
        wVar2.f20762a = this;
    }

    public static y d(w wVar) {
        y yVar = wVar.f20762a;
        return yVar != null ? yVar : new y(wVar);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final int A() {
        return l0.c.f20652l;
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.e0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.t(((Integer) list.get(i10)).intValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.n(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void C(int i7) {
        this.f20779a.F(i7, 3);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void D(int i7, double d8) {
        this.f20779a.e(i7, d8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void E(int i7, float f8) {
        this.f20779a.f(i7, f8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void F(int i7, int i8) {
        this.f20779a.Q(i7, i8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void G(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.R(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.v0(((Long) list.get(i10)).longValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.r0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void H(int i7, Object obj, u1 u1Var) {
        w wVar = this.f20779a;
        wVar.F(i7, 3);
        u1Var.b((i1) obj, wVar.f20762a);
        wVar.F(i7, 4);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void I(int i7, int i8) {
        this.f20779a.e0(i7, i8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void J(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.g(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.t0(((Long) list.get(i10)).longValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.n0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void K(int i7, i iVar) {
        this.f20779a.h(i7, iVar);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void L(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.c0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.r(((Integer) list.get(i10)).intValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.A0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void M(int i7, List list, u1 u1Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            N(i7, list.get(i8), u1Var);
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void N(int i7, Object obj, u1 u1Var) {
        this.f20779a.j(i7, (i1) obj, u1Var);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void O(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f20779a.h(i7, (i) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void P(int i7, int i8) {
        this.f20779a.a0(i7, i8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void Q(int i7, List list, u1 u1Var) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            H(i7, list.get(i8), u1Var);
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void R(int i7, int i8) {
        this.f20779a.e0(i7, i8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void S(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.f(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.y(((Float) list.get(i10)).floatValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.d(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void T(int i7, int i8) {
        this.f20779a.c0(i7, i8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void U(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof t0)) {
            while (i8 < list.size()) {
                this.f20779a.k(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        t0 t0Var = (t0) list;
        while (i8 < list.size()) {
            Object z02 = t0Var.z0(i8);
            if (z02 instanceof String) {
                this.f20779a.k(i7, (String) z02);
            } else {
                this.f20779a.h(i7, (i) z02);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void a(int i7, long j7) {
        this.f20779a.G(i7, j7);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void b(int i7, long j7) {
        this.f20779a.g(i7, j7);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void c(int i7, long j7) {
        this.f20779a.R(i7, j7);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void e(int i7, long j7) {
        this.f20779a.R(i7, j7);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void l(int i7, boolean z7) {
        this.f20779a.I(i7, z7);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void m(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.g(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.s0(((Long) list.get(i10)).longValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.n0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void m0(int i7, String str) {
        this.f20779a.k(i7, str);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void n(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.R(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.w0(((Long) list.get(i10)).longValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.r0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void o(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.a0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.q(((Integer) list.get(i10)).intValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.z0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void p(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.G(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.u0(((Long) list.get(i10)).longValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.q0(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.e(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.x(((Double) list.get(i10)).doubleValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.c(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void r(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.I(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.Z(((Boolean) list.get(i10)).booleanValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.S(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void s(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.Q(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.p(((Integer) list.get(i10)).intValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.y0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void t(int i7) {
        this.f20779a.F(i7, 4);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void u(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.Q(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.u(((Integer) list.get(i10)).intValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.y0(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void v(int i7, int i8) {
        this.f20779a.Q(i7, i8);
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void w(int i7, Object obj) {
        if (obj instanceof i) {
            this.f20779a.H(i7, (i) obj);
        } else {
            this.f20779a.i(i7, (i1) obj);
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void x(int i7, c1 c1Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f20779a.F(i7, 2);
            this.f20779a.z0(b1.a(c1Var, entry.getKey(), entry.getValue()));
            b1.b(this.f20779a, c1Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void y(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f20779a.e0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.f20779a.F(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += w.s(((Integer) list.get(i10)).intValue());
        }
        this.f20779a.z0(i9);
        while (i8 < list.size()) {
            this.f20779a.n(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.drive.f3
    public final void z(int i7, long j7) {
        this.f20779a.g(i7, j7);
    }
}
