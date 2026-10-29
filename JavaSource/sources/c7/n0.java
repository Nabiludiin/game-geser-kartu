package c7;

import x6.g2;

/* compiled from: MyApplication */
final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final g6.i f3806a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f3807b;

    /* renamed from: c, reason: collision with root package name */
    private final g2[] f3808c;

    /* renamed from: d, reason: collision with root package name */
    private int f3809d;

    public n0(g6.i iVar, int i7) {
        this.f3806a = iVar;
        this.f3807b = new Object[i7];
        this.f3808c = new g2[i7];
    }

    public final void a(g2 g2Var, Object obj) {
        Object[] objArr = this.f3807b;
        int i7 = this.f3809d;
        objArr[i7] = obj;
        g2[] g2VarArr = this.f3808c;
        this.f3809d = i7 + 1;
        q6.i.c(g2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        g2VarArr[i7] = g2Var;
    }

    public final void b(g6.i iVar) {
        int length = this.f3808c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            g2 g2Var = this.f3808c[length];
            q6.i.b(g2Var);
            g2Var.l(iVar, this.f3807b[length]);
            if (i7 < 0) {
                return;
            } else {
                length = i7;
            }
        }
    }
}
