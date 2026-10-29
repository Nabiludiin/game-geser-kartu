package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: MyApplication */
final class xe2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18778a;

    /* renamed from: b, reason: collision with root package name */
    private final ku1 f18779b;

    /* renamed from: c, reason: collision with root package name */
    private final w03 f18780c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.a f18781d;

    /* renamed from: e, reason: collision with root package name */
    private final c03 f18782e;

    /* renamed from: f, reason: collision with root package name */
    private final a5.d f18783f;

    /* renamed from: g, reason: collision with root package name */
    private final mr0 f18784g;

    /* renamed from: h, reason: collision with root package name */
    private final c60 f18785h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f18786i;

    /* renamed from: j, reason: collision with root package name */
    private final i92 f18787j;

    /* renamed from: k, reason: collision with root package name */
    private final lx1 f18788k;

    /* renamed from: l, reason: collision with root package name */
    private final rx1 f18789l;

    xe2(Context context, ku1 ku1Var, w03 w03Var, w2.a aVar, c03 c03Var, a5.d dVar, mr0 mr0Var, c60 c60Var, boolean z7, i92 i92Var, lx1 lx1Var, rx1 rx1Var) {
        this.f18778a = context;
        this.f18779b = ku1Var;
        this.f18780c = w03Var;
        this.f18781d = aVar;
        this.f18782e = c03Var;
        this.f18783f = dVar;
        this.f18784g = mr0Var;
        this.f18785h = c60Var;
        this.f18786i = z7;
        this.f18787j = i92Var;
        this.f18788k = lx1Var;
        this.f18789l = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        ot1 ot1Var = (ot1) p64.t(this.f18783f);
        try {
            c03 c03Var = this.f18782e;
            final mr0 mr0Var = this.f18784g;
            if (mr0Var.i1()) {
                if (((Boolean) s2.b0.c().d(uy.f17083e1)).booleanValue()) {
                    mr0Var = this.f18779b.a(this.f18780c.f17960f, null, null);
                    s60.b(mr0Var, ot1Var.k());
                    final ou1 ou1Var = new ou1();
                    ot1Var.l().i(mr0Var, true, this.f18786i ? this.f18785h : null, this.f18788k.e());
                    mr0Var.s0().g1(new mt0(ou1Var, mr0Var) { // from class: com.google.android.gms.internal.ads.we2

                        /* renamed from: q, reason: collision with root package name */
                        private final /* synthetic */ mr0 f18232q;

                        {
                            this.f18232q = mr0Var;
                        }

                        @Override // com.google.android.gms.internal.ads.mt0
                        public final /* synthetic */ void a(boolean z8, int i7, String str, String str2) {
                            mr0 mr0Var2 = this.f18232q;
                            mr0Var2.V();
                            mr0Var2.s0().m();
                        }
                    });
                    mr0Var.s0().Y(new nt0() { // from class: com.google.android.gms.internal.ads.ve2
                        @Override // com.google.android.gms.internal.ads.nt0
                        public final /* synthetic */ void a() {
                            mr0.this.U();
                        }
                    });
                    h03 h03Var = c03Var.f6186s;
                    mr0Var.a1(h03Var.f9278b, h03Var.f9277a, null);
                }
            }
            mr0 mr0Var2 = mr0Var;
            mr0Var2.q1(true);
            boolean z8 = this.f18786i;
            boolean z9 = false;
            boolean c8 = z8 ? this.f18785h.c(false) : false;
            r2.t.g();
            boolean m7 = v2.f2.m(this.f18778a);
            if (z8 && this.f18785h.d()) {
                z9 = true;
            }
            float e8 = z8 ? this.f18785h.e() : 0.0f;
            c03 c03Var2 = this.f18782e;
            r2.l lVar = new r2.l(c8, m7, z9, e8, -1, z7, c03Var2.O, c03Var2.P);
            if (ka1Var != null) {
                ka1Var.U0();
            }
            r2.t.f();
            xk1 j7 = ot1Var.j();
            int i7 = c03Var2.Q;
            w2.a aVar = this.f18781d;
            String str = c03Var2.B;
            h03 h03Var2 = c03Var2.f6186s;
            u2.b0.a(context, new AdOverlayInfoParcel(null, j7, null, mr0Var2, i7, aVar, str, lVar, h03Var2.f9278b, h03Var2.f9277a, this.f18780c.f17961g, ka1Var, c03Var2.b() ? this.f18787j : null, mr0Var2.o()), true, this.f18789l);
        } catch (cs0 e9) {
            int i8 = v2.n1.f26802b;
            w2.p.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f18782e;
    }
}
