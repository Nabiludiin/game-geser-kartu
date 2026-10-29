package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ew1 implements jd1, qb1, z91, ra1, s2.a, xf1 {

    /* renamed from: q, reason: collision with root package name */
    private final iu f7853q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7854r = false;

    public ew1(iu iuVar, wx2 wx2Var) {
        this.f7853q = iuVar;
        iuVar.c(2);
        if (wx2Var != null) {
            iuVar.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.xf1
    public final void C(final lw lwVar) {
        hu huVar = new hu() { // from class: com.google.android.gms.internal.ads.aw1
            @Override // com.google.android.gms.internal.ads.hu
            public final /* synthetic */ void a(qx qxVar) {
                qxVar.M(lw.this);
            }
        };
        iu iuVar = this.f7853q;
        iuVar.b(huVar);
        iuVar.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final synchronized void E() {
        this.f7853q.c(6);
    }

    @Override // com.google.android.gms.internal.ads.xf1
    public final void K(final lw lwVar) {
        hu huVar = new hu() { // from class: com.google.android.gms.internal.ads.bw1
            @Override // com.google.android.gms.internal.ads.hu
            public final /* synthetic */ void a(qx qxVar) {
                qxVar.M(lw.this);
            }
        };
        iu iuVar = this.f7853q;
        iuVar.b(huVar);
        iuVar.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.xf1
    public final void X(final lw lwVar) {
        hu huVar = new hu() { // from class: com.google.android.gms.internal.ads.cw1
            @Override // com.google.android.gms.internal.ads.hu
            public final /* synthetic */ void a(qx qxVar) {
                qxVar.M(lw.this);
            }
        };
        iu iuVar = this.f7853q;
        iuVar.b(huVar);
        iuVar.c(1104);
    }

    @Override // s2.a
    public final synchronized void c0() {
        if (this.f7854r) {
            this.f7853q.c(8);
        } else {
            this.f7853q.c(7);
            this.f7854r = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        this.f7853q.c(3);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(s2.x2 x2Var) {
        switch (x2Var.f26259q) {
            case 1:
                this.f7853q.c(101);
                break;
            case 2:
                this.f7853q.c(102);
                break;
            case 3:
                this.f7853q.c(5);
                break;
            case 4:
                this.f7853q.c(103);
                break;
            case 5:
                this.f7853q.c(104);
                break;
            case 6:
                this.f7853q.c(105);
                break;
            case 7:
                this.f7853q.c(106);
                break;
            default:
                this.f7853q.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.xf1
    public final void q() {
        this.f7853q.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.xf1
    public final void s(boolean z7) {
        this.f7853q.c(true != z7 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(final o03 o03Var) {
        this.f7853q.b(new hu() { // from class: com.google.android.gms.internal.ads.dw1
            @Override // com.google.android.gms.internal.ads.hu
            public final /* synthetic */ void a(qx qxVar) {
                qu quVar = (qu) qxVar.I().Q();
                ex exVar = (ex) qxVar.I().j0().Q();
                exVar.E(o03.this.f13137b.f12530b.f7926b);
                quVar.F(exVar);
                qxVar.J(quVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.xf1
    public final void y(boolean z7) {
        this.f7853q.c(true != z7 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
    }
}
