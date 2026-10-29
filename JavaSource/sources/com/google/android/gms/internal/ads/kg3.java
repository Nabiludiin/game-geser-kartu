package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class kg3 extends i6.k implements p6.p {

    /* renamed from: u, reason: collision with root package name */
    /* synthetic */ Object f11045u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ String f11046v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kg3(String str, g6.e eVar) {
        super(2, eVar);
        this.f11046v = str;
    }

    @Override // p6.p
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
        return ((kg3) j((ag3) obj, (g6.e) obj2)).m(e6.s.f23253a);
    }

    @Override // i6.a
    public final g6.e j(Object obj, g6.e eVar) {
        kg3 kg3Var = new kg3(this.f11046v, eVar);
        kg3Var.f11045u = obj;
        return kg3Var;
    }

    @Override // i6.a
    public final Object m(Object obj) {
        h6.b.e();
        e6.n.b(obj);
        cg3 a8 = bg3.a((yf3) ((ag3) this.f11045u).Q());
        a8.d(a8.b(), this.f11046v);
        return a8.a();
    }
}
