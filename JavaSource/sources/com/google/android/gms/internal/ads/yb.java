package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class yb implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final List f19451a;

    /* renamed from: c, reason: collision with root package name */
    private final a4[] f19453c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19454d;

    /* renamed from: e, reason: collision with root package name */
    private int f19455e;

    /* renamed from: f, reason: collision with root package name */
    private int f19456f;

    /* renamed from: b, reason: collision with root package name */
    private final String f19452b = "video/mp2t";

    /* renamed from: g, reason: collision with root package name */
    private long f19457g = -9223372036854775807L;

    public yb(List list, String str) {
        this.f19451a = list;
        this.f19453c = new a4[list.size()];
    }

    private final boolean b(y82 y82Var, int i7) {
        if (y82Var.C() == 0) {
            return false;
        }
        if (y82Var.R() != i7) {
            this.f19454d = false;
        }
        this.f19455e--;
        return this.f19454d;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
        if (this.f19454d) {
            rx3.h(this.f19457g != -9223372036854775807L);
            for (a4 a4Var : this.f19453c) {
                a4Var.a(this.f19457g, 1, this.f19456f, 0, null);
            }
            this.f19454d = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        if (this.f19454d) {
            if (this.f19455e != 2 || b(y82Var, 32)) {
                if (this.f19455e != 1 || b(y82Var, 0)) {
                    int F = y82Var.F();
                    int C = y82Var.C();
                    for (a4 a4Var : this.f19453c) {
                        y82Var.G(F);
                        a4Var.e(y82Var, C);
                    }
                    this.f19456f += C;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        int i7 = 0;
        while (true) {
            a4[] a4VarArr = this.f19453c;
            if (i7 >= a4VarArr.length) {
                return;
            }
            nd ndVar = (nd) this.f19451a.get(i7);
            qdVar.a();
            a4 A = p2Var.A(qdVar.b(), 3);
            xn5 xn5Var = new xn5();
            xn5Var.A(qdVar.c());
            xn5Var.k0(this.f19452b);
            xn5Var.l0("application/dvbsubs");
            xn5Var.o0(Collections.singletonList(ndVar.f12697b));
            xn5Var.d0(ndVar.f12696a);
            A.c(xn5Var.m());
            a4VarArr[i7] = A;
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f19454d = true;
        this.f19457g = j7;
        this.f19456f = 0;
        this.f19455e = 2;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f19454d = false;
        this.f19457g = -9223372036854775807L;
    }
}
