package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cc2 extends bi0 implements hb1 {

    /* renamed from: q, reason: collision with root package name */
    private ci0 f6366q;

    /* renamed from: r, reason: collision with root package name */
    private gb1 f6367r;

    /* renamed from: s, reason: collision with root package name */
    private bj1 f6368s;

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void J1(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9491r.c0();
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void L0(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9490q.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void M0(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9493t.d0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void N0(w3.a aVar, int i7) {
        bj1 bj1Var = this.f6368s;
        if (bj1Var != null) {
            String str = ((ff2) bj1Var).f8227c.f12648a;
            int i8 = v2.n1.f26802b;
            w2.p.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void S5(w3.a aVar, int i7) {
        gb1 gb1Var = this.f6367r;
        if (gb1Var != null) {
            gb1Var.b(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void U7(w3.a aVar, di0 di0Var) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9493t.d0(di0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void Y(w3.a aVar) {
        bj1 bj1Var = this.f6368s;
        if (bj1Var != null) {
            final na2 na2Var = ((ff2) bj1Var).f8227c;
            final c03 c03Var = ((ff2) bj1Var).f8226b;
            final o03 o03Var = ((ff2) bj1Var).f8225a;
            final ff2 ff2Var = (ff2) bj1Var;
            ((ff2) bj1Var).f8228d.c().execute(new Runnable(ff2Var, o03Var, c03Var, na2Var) { // from class: com.google.android.gms.internal.ads.df2

                /* renamed from: q, reason: collision with root package name */
                private final /* synthetic */ o03 f7089q;

                /* renamed from: r, reason: collision with root package name */
                private final /* synthetic */ c03 f7090r;

                /* renamed from: s, reason: collision with root package name */
                private final /* synthetic */ na2 f7091s;

                {
                    this.f7089q = o03Var;
                    this.f7090r = c03Var;
                    this.f7091s = na2Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    if2.e(this.f7089q, this.f7090r, this.f7091s);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void Z0(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9493t.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void j0(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9492s.U0();
        }
    }

    public final synchronized void k8(ci0 ci0Var) {
        this.f6366q = ci0Var;
    }

    public final synchronized void l8(bj1 bj1Var) {
        this.f6368s = bj1Var;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void q0(w3.a aVar) {
        gb1 gb1Var = this.f6367r;
        if (gb1Var != null) {
            gb1Var.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void t0(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ci0Var.t0(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.hb1
    public final synchronized void u4(gb1 gb1Var) {
        this.f6367r = gb1Var;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final synchronized void v6(w3.a aVar) {
        ci0 ci0Var = this.f6366q;
        if (ci0Var != null) {
            ((hf2) ci0Var).f9492s.e();
        }
    }
}
