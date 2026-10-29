package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class zc {

    /* renamed from: a, reason: collision with root package name */
    private final zb f20122a;

    /* renamed from: b, reason: collision with root package name */
    private final ef2 f20123b;

    /* renamed from: c, reason: collision with root package name */
    private final w72 f20124c = new w72(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f20125d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20126e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20127f;

    public zc(zb zbVar, ef2 ef2Var) {
        this.f20122a = zbVar;
        this.f20123b = ef2Var;
    }

    public final void a() {
        this.f20127f = false;
        this.f20122a.a();
    }

    public final void b(y82 y82Var) {
        long j7;
        char c8;
        w72 w72Var = this.f20124c;
        y82Var.L(w72Var.f18098a, 0, 3);
        w72Var.f(0);
        w72Var.h(8);
        this.f20125d = w72Var.i();
        this.f20126e = w72Var.i();
        w72Var.h(6);
        y82Var.L(w72Var.f18098a, 0, w72Var.j(8));
        w72Var.f(0);
        if (this.f20125d) {
            w72Var.h(4);
            long j8 = w72Var.j(3);
            w72Var.h(1);
            int j9 = w72Var.j(15) << 15;
            w72Var.h(1);
            long j10 = w72Var.j(15);
            w72Var.h(1);
            if (this.f20127f || !this.f20126e) {
                c8 = 30;
            } else {
                w72Var.h(4);
                w72Var.h(1);
                int j11 = w72Var.j(15) << 15;
                w72Var.h(1);
                c8 = 30;
                long j12 = w72Var.j(15);
                w72Var.h(1);
                this.f20123b.e((w72Var.j(3) << 30) | j11 | j12);
                this.f20127f = true;
            }
            j7 = this.f20123b.e((j8 << c8) | j9 | j10);
        } else {
            j7 = 0;
        }
        zb zbVar = this.f20122a;
        zbVar.D0(j7, 4);
        zbVar.B0(y82Var);
        zbVar.A0(false);
    }
}
