package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class kc implements zb {

    /* renamed from: c, reason: collision with root package name */
    private a4 f10958c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10959d;

    /* renamed from: f, reason: collision with root package name */
    private int f10961f;

    /* renamed from: g, reason: collision with root package name */
    private int f10962g;

    /* renamed from: a, reason: collision with root package name */
    private final String f10956a = "video/mp2t";

    /* renamed from: b, reason: collision with root package name */
    private final y82 f10957b = new y82(10);

    /* renamed from: e, reason: collision with root package name */
    private long f10960e = -9223372036854775807L;

    public kc(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
        int i7;
        this.f10958c.getClass();
        if (this.f10959d && (i7 = this.f10961f) != 0 && this.f10962g == i7) {
            rx3.h(this.f10960e != -9223372036854775807L);
            this.f10958c.a(this.f10960e, 1, this.f10961f, 0, null);
            this.f10959d = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void B0(y82 y82Var) {
        this.f10958c.getClass();
        if (this.f10959d) {
            int C = y82Var.C();
            int i7 = this.f10962g;
            if (i7 < 10) {
                int min = Math.min(C, 10 - i7);
                byte[] H = y82Var.H();
                int F = y82Var.F();
                y82 y82Var2 = this.f10957b;
                System.arraycopy(H, F, y82Var2.H(), this.f10962g, min);
                if (this.f10962g + min == 10) {
                    y82Var2.G(0);
                    if (y82Var2.R() != 73 || y82Var2.R() != 68 || y82Var2.R() != 51) {
                        gv1.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f10959d = false;
                        return;
                    } else {
                        y82Var2.J(3);
                        this.f10961f = y82Var2.g() + 10;
                    }
                }
            }
            int min2 = Math.min(C, this.f10961f - this.f10962g);
            this.f10958c.e(y82Var, min2);
            this.f10962g += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        a4 A = p2Var.A(qdVar.b(), 5);
        this.f10958c = A;
        xn5 xn5Var = new xn5();
        xn5Var.A(qdVar.c());
        xn5Var.k0(this.f10956a);
        xn5Var.l0("application/id3");
        A.c(xn5Var.m());
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f10959d = true;
        this.f10960e = j7;
        this.f10961f = 0;
        this.f10962g = 0;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f10959d = false;
        this.f10960e = -9223372036854775807L;
    }
}
