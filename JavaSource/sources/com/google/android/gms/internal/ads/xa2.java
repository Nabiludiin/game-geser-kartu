package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: MyApplication */
final class xa2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    private final w2.a f18691a;

    /* renamed from: b, reason: collision with root package name */
    private final a5.d f18692b;

    /* renamed from: c, reason: collision with root package name */
    private final c03 f18693c;

    /* renamed from: d, reason: collision with root package name */
    private final mr0 f18694d;

    /* renamed from: e, reason: collision with root package name */
    private final w03 f18695e;

    /* renamed from: f, reason: collision with root package name */
    private final c60 f18696f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18697g;

    /* renamed from: h, reason: collision with root package name */
    private final i92 f18698h;

    /* renamed from: i, reason: collision with root package name */
    private final rx1 f18699i;

    xa2(w2.a aVar, a5.d dVar, c03 c03Var, mr0 mr0Var, w03 w03Var, boolean z7, c60 c60Var, i92 i92Var, rx1 rx1Var) {
        this.f18691a = aVar;
        this.f18692b = dVar;
        this.f18693c = c03Var;
        this.f18694d = mr0Var;
        this.f18695e = w03Var;
        this.f18697g = z7;
        this.f18696f = c60Var;
        this.f18698h = i92Var;
        this.f18699i = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        r11 r11Var = (r11) p64.t(this.f18692b);
        mr0 mr0Var = this.f18694d;
        mr0Var.q1(true);
        boolean z8 = this.f18697g;
        boolean c8 = z8 ? this.f18696f.c(true) : true;
        boolean z9 = z8 && this.f18696f.d();
        float e8 = z8 ? this.f18696f.e() : 0.0f;
        c03 c03Var = this.f18693c;
        r2.l lVar = new r2.l(c8, true, z9, e8, -1, z7, c03Var.O, false);
        if (ka1Var != null) {
            ka1Var.U0();
        }
        r2.t.f();
        xk1 j7 = r11Var.j();
        int i7 = c03Var.Q;
        if (i7 == -1) {
            s2.m5 m5Var = this.f18695e.f17965k;
            if (m5Var != null) {
                int i8 = m5Var.f26193q;
                if (i8 == 1) {
                    i7 = 7;
                } else if (i8 == 2) {
                    i7 = 6;
                }
            }
            int i9 = v2.n1.f26802b;
            w2.p.a("Error setting app open orientation; no targeting orientation available.");
        }
        w2.a aVar = this.f18691a;
        String str = c03Var.B;
        h03 h03Var = c03Var.f6186s;
        u2.b0.a(context, new AdOverlayInfoParcel(null, j7, null, mr0Var, i7, aVar, str, lVar, h03Var.f9278b, h03Var.f9277a, this.f18695e.f17961g, ka1Var, c03Var.b() ? this.f18698h : null, mr0Var.o()), true, this.f18699i);
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f18693c;
    }
}
