package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ch3 extends i6.k implements p6.p {

    /* renamed from: u, reason: collision with root package name */
    int f6435u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ fh3 f6436v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ch3(fh3 fh3Var, g6.e eVar) {
        super(2, eVar);
        this.f6436v = fh3Var;
    }

    @Override // p6.p
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
        return ((ch3) j((x6.g0) obj, (g6.e) obj2)).m(e6.s.f23253a);
    }

    @Override // i6.a
    public final g6.e j(Object obj, g6.e eVar) {
        return new ch3(this.f6436v, eVar);
    }

    @Override // i6.a
    public final Object m(Object obj) {
        Object e8 = h6.b.e();
        int i7 = this.f6435u;
        e6.n.b(obj);
        if (i7 == 0) {
            fh3 fh3Var = this.f6436v;
            this.f6435u = 1;
            if (fh3Var.l(this) == e8) {
                return e8;
            }
        }
        return e6.s.f23253a;
    }
}
