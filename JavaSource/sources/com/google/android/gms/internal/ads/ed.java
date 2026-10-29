package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class ed {

    /* renamed from: a, reason: collision with root package name */
    private final List f7552a;

    /* renamed from: c, reason: collision with root package name */
    private final a4[] f7554c;

    /* renamed from: b, reason: collision with root package name */
    private final String f7553b = "video/mp2t";

    /* renamed from: d, reason: collision with root package name */
    private final sa3 f7555d = new sa3(new s93() { // from class: com.google.android.gms.internal.ads.dd
        @Override // com.google.android.gms.internal.ads.s93
        public final /* synthetic */ void a(long j7, y82 y82Var) {
            ed.this.f(j7, y82Var);
        }
    });

    public ed(List list, String str) {
        this.f7552a = list;
        this.f7554c = new a4[list.size()];
    }

    public final void a(p2 p2Var, qd qdVar) {
        int i7 = 0;
        while (true) {
            a4[] a4VarArr = this.f7554c;
            if (i7 >= a4VarArr.length) {
                return;
            }
            qdVar.a();
            a4 A = p2Var.A(qdVar.b(), 3);
            eq5 eq5Var = (eq5) this.f7552a.get(i7);
            String str = eq5Var.f7775o;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            rx3.f(z7, "Invalid closed caption MIME type provided: %s", str);
            String str2 = eq5Var.f7761a;
            if (str2 == null) {
                str2 = qdVar.c();
            }
            xn5 xn5Var = new xn5();
            xn5Var.A(str2);
            xn5Var.k0(this.f7553b);
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

    public final void b(int i7) {
        this.f7555d.a(i7);
    }

    public final void c(long j7, y82 y82Var) {
        this.f7555d.c(j7, y82Var);
    }

    public final void d() {
        this.f7555d.e();
    }

    public final void e() {
        this.f7555d.e();
    }

    final /* synthetic */ void f(long j7, y82 y82Var) {
        x1.a(j7, y82Var, this.f7554c);
    }
}
