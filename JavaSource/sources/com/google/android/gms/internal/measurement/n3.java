package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    final z f21148a;

    /* renamed from: b, reason: collision with root package name */
    final o4 f21149b;

    /* renamed from: c, reason: collision with root package name */
    final o4 f21150c;

    /* renamed from: d, reason: collision with root package name */
    final r7 f21151d;

    public n3() {
        z zVar = new z();
        this.f21148a = zVar;
        o4 o4Var = new o4(null, zVar);
        this.f21150c = o4Var;
        this.f21149b = o4Var.c();
        r7 r7Var = new r7();
        this.f21151d = r7Var;
        o4Var.e("require", new mg(r7Var));
        r7Var.a("internal.platform", y2.f21447a);
        o4Var.e("runtime.counter", new j(Double.valueOf(0.0d)));
    }

    public final r a(o4 o4Var, w7... w7VarArr) {
        r rVar = r.f21314f;
        for (w7 w7Var : w7VarArr) {
            rVar = q6.b(w7Var);
            p5.l(this.f21150c);
            if ((rVar instanceof s) || (rVar instanceof q)) {
                rVar = this.f21148a.b(o4Var, rVar);
            }
        }
        return rVar;
    }
}
