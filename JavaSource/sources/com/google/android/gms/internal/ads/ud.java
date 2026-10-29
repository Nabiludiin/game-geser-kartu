package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
final class ud {

    /* renamed from: a, reason: collision with root package name */
    private final List f16710a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16711b = "video/mp2t";

    /* renamed from: c, reason: collision with root package name */
    private final a4[] f16712c;

    /* renamed from: d, reason: collision with root package name */
    private final sa3 f16713d;

    public ud(List list, String str) {
        this.f16710a = list;
        this.f16712c = new a4[list.size()];
        sa3 sa3Var = new sa3(new s93() { // from class: com.google.android.gms.internal.ads.td
            @Override // com.google.android.gms.internal.ads.s93
            public final /* synthetic */ void a(long j7, y82 y82Var) {
                ud.this.c(j7, y82Var);
            }
        });
        this.f16713d = sa3Var;
        sa3Var.a(3);
    }

    public final void a(p2 p2Var, qd qdVar) {
        int i7 = 0;
        while (true) {
            a4[] a4VarArr = this.f16712c;
            if (i7 >= a4VarArr.length) {
                return;
            }
            qdVar.a();
            a4 A = p2Var.A(qdVar.b(), 3);
            eq5 eq5Var = (eq5) this.f16710a.get(i7);
            String str = eq5Var.f7775o;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            rx3.f(z7, "Invalid closed caption MIME type provided: %s", str);
            xn5 xn5Var = new xn5();
            xn5Var.A(qdVar.c());
            xn5Var.k0(this.f16711b);
            xn5Var.l0(str);
            xn5Var.e0(eq5Var.f7765e);
            xn5Var.d0(eq5Var.f7764d);
            xn5Var.j(eq5Var.L);
            xn5Var.o0(eq5Var.f7778r);
            A.c(xn5Var.m());
            a4VarArr[i7] = A;
            i7++;
        }
    }

    public final void b(long j7, y82 y82Var) {
        if (y82Var.C() < 9) {
            return;
        }
        int b8 = y82Var.b();
        int b9 = y82Var.b();
        int R = y82Var.R();
        if (b8 == 434 && b9 == 1195456820 && R == 3) {
            this.f16713d.c(j7, y82Var);
        }
    }

    final /* synthetic */ void c(long j7, y82 y82Var) {
        x1.b(j7, y82Var, this.f16712c);
    }
}
