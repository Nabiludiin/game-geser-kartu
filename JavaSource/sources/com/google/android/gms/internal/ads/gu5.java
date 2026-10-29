package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class gu5 {

    /* renamed from: a, reason: collision with root package name */
    private fu5 f9164a;

    /* renamed from: b, reason: collision with root package name */
    private qu5 f9165b;

    public void b() {
        this.f9164a = null;
        this.f9165b = null;
    }

    public abstract boolean c();

    public abstract void d(mb1 mb1Var);

    public abstract qc5 e();

    public abstract void f(Object obj);

    public abstract hu5 g(sc5[] sc5VarArr, as5 as5Var, xp5 xp5Var, az azVar);

    public final void h(fu5 fu5Var, qu5 qu5Var) {
        rx3.h(this.f9164a == null);
        this.f9164a = fu5Var;
        this.f9165b = qu5Var;
    }

    protected final void i() {
        fu5 fu5Var = this.f9164a;
        if (fu5Var != null) {
            fu5Var.m();
        }
    }

    protected final qu5 j() {
        qu5 qu5Var = this.f9165b;
        qu5Var.getClass();
        return qu5Var;
    }
}
