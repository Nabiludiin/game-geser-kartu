package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class sg3 extends i6.k implements p6.p {

    /* renamed from: u, reason: collision with root package name */
    /* synthetic */ Object f15604u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ wf3 f15605v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    sg3(wf3 wf3Var, g6.e eVar) {
        super(2, eVar);
        this.f15605v = wf3Var;
    }

    @Override // p6.p
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
        return ((sg3) j((ag3) obj, (g6.e) obj2)).m(e6.s.f23253a);
    }

    @Override // i6.a
    public final g6.e j(Object obj, g6.e eVar) {
        sg3 sg3Var = new sg3(this.f15605v, eVar);
        sg3Var.f15604u = obj;
        return sg3Var;
    }

    @Override // i6.a
    public final Object m(Object obj) {
        h6.b.e();
        e6.n.b(obj);
        cg3 a8 = bg3.a((yf3) ((ag3) this.f15604u).Q());
        o25 b8 = a8.b();
        wf3 wf3Var = this.f15605v;
        String h02 = wf3Var.h0();
        q6.i.d(h02, "getGwsQueryId(...)");
        a8.c(b8, h02, wf3Var);
        return a8.a();
    }
}
