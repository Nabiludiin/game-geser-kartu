package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class if2 implements qa2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10027a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10028b;

    /* renamed from: c, reason: collision with root package name */
    private final st1 f10029c;

    public if2(Context context, Executor executor, st1 st1Var) {
        this.f10027a = context;
        this.f10028b = executor;
        this.f10029c = st1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(o03 o03Var, c03 c03Var, na2 na2Var) {
        try {
            ((v13) na2Var.f12649b).q(o03Var.f13136a.f11326a.f17958d, c03Var.f6192v.toString());
        } catch (Exception e8) {
            String str = na2Var.f12648a;
            int i7 = v2.n1.f26802b;
            w2.p.g("Fail to load ad from adapter ".concat(String.valueOf(str)), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final void a(o03 o03Var, c03 c03Var, na2 na2Var) {
        v13 v13Var = (v13) na2Var.f12649b;
        if (v13Var.s()) {
            e(o03Var, c03Var, na2Var);
            return;
        }
        ff2 ff2Var = new ff2(this, o03Var, c03Var, na2Var);
        hb1 hb1Var = na2Var.f12650c;
        ((cc2) hb1Var).l8(ff2Var);
        Context context = this.f10027a;
        w03 w03Var = o03Var.f13136a.f11326a;
        String jSONObject = c03Var.f6192v.toString();
        v13Var.p(context, w03Var.f17958d, null, (ci0) hb1Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.qa2
    public final /* bridge */ /* synthetic */ Object b(o03 o03Var, c03 c03Var, na2 na2Var) {
        ot1 e8 = this.f10029c.e(new i51(o03Var, c03Var, na2Var.f12648a), new pt1(new gf2(this, na2Var, c03Var)));
        e8.a().y0(new sz0((v13) na2Var.f12649b), this.f10028b);
        eb1 b8 = e8.b();
        u91 c8 = e8.c();
        ((cc2) na2Var.f12650c).k8(new hf2(this, e8.i(), c8, b8, e8.k()));
        return e8.h();
    }

    final /* synthetic */ Executor c() {
        return this.f10028b;
    }
}
