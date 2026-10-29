package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: MyApplication */
final class gc2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8777a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.a f8778b;

    /* renamed from: c, reason: collision with root package name */
    private final a5.d f8779c;

    /* renamed from: d, reason: collision with root package name */
    private final c03 f8780d;

    /* renamed from: e, reason: collision with root package name */
    private final mr0 f8781e;

    /* renamed from: f, reason: collision with root package name */
    private final w03 f8782f;

    /* renamed from: g, reason: collision with root package name */
    private final c60 f8783g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8784h;

    /* renamed from: i, reason: collision with root package name */
    private final i92 f8785i;

    /* renamed from: j, reason: collision with root package name */
    private final rx1 f8786j;

    gc2(Context context, w2.a aVar, a5.d dVar, c03 c03Var, mr0 mr0Var, w03 w03Var, boolean z7, c60 c60Var, i92 i92Var, rx1 rx1Var) {
        this.f8777a = context;
        this.f8778b = aVar;
        this.f8779c = dVar;
        this.f8780d = c03Var;
        this.f8781e = mr0Var;
        this.f8782f = w03Var;
        this.f8783g = c60Var;
        this.f8784h = z7;
        this.f8785i = i92Var;
        this.f8786j = rx1Var;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        sj1 sj1Var = (sj1) p64.t(this.f8779c);
        mr0 mr0Var = this.f8781e;
        mr0Var.q1(true);
        boolean z8 = this.f8784h;
        boolean c8 = z8 ? this.f8783g.c(false) : false;
        r2.t.g();
        boolean m7 = v2.f2.m(this.f8777a);
        boolean z9 = z8 && this.f8783g.d();
        float e8 = z8 ? this.f8783g.e() : 0.0f;
        c03 c03Var = this.f8780d;
        r2.l lVar = new r2.l(c8, m7, z9, e8, -1, z7, c03Var.O, false);
        if (ka1Var != null) {
            ka1Var.U0();
        }
        r2.t.f();
        xk1 j7 = sj1Var.j();
        int i7 = c03Var.Q;
        w2.a aVar = this.f8778b;
        String str = c03Var.B;
        h03 h03Var = c03Var.f6186s;
        u2.b0.a(context, new AdOverlayInfoParcel(null, j7, null, mr0Var, i7, aVar, str, lVar, h03Var.f9278b, h03Var.f9277a, this.f8782f.f17961g, ka1Var, c03Var.b() ? this.f8785i : null, mr0Var.o()), true, this.f8786j);
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f8780d;
    }
}
