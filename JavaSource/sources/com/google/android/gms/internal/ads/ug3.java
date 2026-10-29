package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class ug3 extends i6.k implements p6.p {

    /* renamed from: u, reason: collision with root package name */
    int f16755u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ fh3 f16756v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ String f16757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ug3(fh3 fh3Var, String str, g6.e eVar) {
        super(2, eVar);
        this.f16756v = fh3Var;
        this.f16757w = str;
    }

    @Override // p6.p
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
        return ((ug3) j((x6.g0) obj, (g6.e) obj2)).m(e6.s.f23253a);
    }

    @Override // i6.a
    public final g6.e j(Object obj, g6.e eVar) {
        return new ug3(this.f16756v, this.f16757w, eVar);
    }

    @Override // i6.a
    public final Object m(Object obj) {
        Object e8 = h6.b.e();
        int i7 = this.f16755u;
        e6.n.b(obj);
        if (i7 == 0) {
            fh3 fh3Var = this.f16756v;
            String str = this.f16757w;
            this.f16755u = 1;
            if (fh3Var.g(str, this) == e8) {
                return e8;
            }
        }
        return e6.s.f23253a;
    }
}
