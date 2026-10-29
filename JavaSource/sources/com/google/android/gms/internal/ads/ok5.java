package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ok5 {

    /* renamed from: a, reason: collision with root package name */
    private final nq0[] f13365a;

    /* renamed from: b, reason: collision with root package name */
    private final yl5 f13366b;

    /* renamed from: c, reason: collision with root package name */
    private final st0 f13367c;

    public ok5(nq0... nq0VarArr) {
        yl5 yl5Var = new yl5();
        st0 st0Var = new st0();
        nq0[] nq0VarArr2 = {yl5Var, st0Var};
        this.f13365a = nq0VarArr2;
        System.arraycopy(nq0VarArr, 0, nq0VarArr2, 0, 0);
        this.f13366b = yl5Var;
        this.f13367c = st0Var;
    }

    public final nq0[] a() {
        return this.f13365a;
    }

    public final yk b(yk ykVar) {
        st0 st0Var = this.f13367c;
        st0Var.h(ykVar.f19630a);
        st0Var.j(ykVar.f19631b);
        return ykVar;
    }

    public final boolean c(boolean z7) {
        this.f13366b.o(z7);
        return z7;
    }

    public final long d(long j7) {
        st0 st0Var = this.f13367c;
        return st0Var.d() ? st0Var.k(j7) : j7;
    }

    public final long e() {
        return this.f13366b.p();
    }
}
