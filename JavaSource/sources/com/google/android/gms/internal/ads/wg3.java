package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class wg3 extends i6.k implements p6.p {

    /* renamed from: u, reason: collision with root package name */
    int f18246u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ fh3 f18247v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wg3(fh3 fh3Var, g6.e eVar) {
        super(2, eVar);
        this.f18247v = fh3Var;
    }

    @Override // p6.p
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
        return ((wg3) j((x6.g0) obj, (g6.e) obj2)).m(e6.s.f23253a);
    }

    @Override // i6.a
    public final g6.e j(Object obj, g6.e eVar) {
        return new wg3(this.f18247v, eVar);
    }

    @Override // i6.a
    public final Object m(Object obj) {
        Object e8 = h6.b.e();
        int i7 = this.f18246u;
        e6.n.b(obj);
        if (i7 == 0) {
            fh3 fh3Var = this.f18247v;
            this.f18246u = 1;
            if (fh3Var.m(this) == e8) {
                return e8;
            }
        }
        return e6.s.f23253a;
    }
}
