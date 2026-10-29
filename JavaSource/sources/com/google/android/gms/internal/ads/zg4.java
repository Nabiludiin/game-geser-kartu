package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public class zg4 implements c84 {

    /* renamed from: a, reason: collision with root package name */
    final String f20178a;

    /* renamed from: b, reason: collision with root package name */
    final Class f20179b;

    /* renamed from: c, reason: collision with root package name */
    final wn4 f20180c;

    zg4(String str, Class cls, wn4 wn4Var, d15 d15Var) {
        this.f20178a = str;
        this.f20179b = cls;
        this.f20180c = wn4Var;
    }

    public static c84 e(String str, Class cls, wn4 wn4Var, d15 d15Var) {
        return new zg4(str, cls, wn4Var, d15Var);
    }

    public static t84 f(String str, Class cls, d15 d15Var) {
        return new yg4(str, cls, d15Var);
    }

    @Override // com.google.android.gms.internal.ads.c84
    public final Object a(qy4 qy4Var) {
        return sh4.a().d(wh4.a().g(ri4.a(this.f20178a, qy4Var, this.f20180c, uo4.RAW, null), z74.a()), this.f20179b);
    }

    @Override // com.google.android.gms.internal.ads.c84
    public final String b() {
        return this.f20178a;
    }

    @Override // com.google.android.gms.internal.ads.c84
    public final xn4 c(qy4 qy4Var) {
        zn4 h02 = bo4.h0();
        h02.E(this.f20178a);
        h02.F(qy4Var);
        h02.G(uo4.RAW);
        ri4 ri4Var = (ri4) wh4.a().h(mh4.a().c(wh4.a().j(si4.b((bo4) h02.A())), null), ri4.class, z74.a());
        vn4 g02 = xn4.g0();
        g02.E(ri4Var.g());
        g02.F(ri4Var.b());
        g02.G(ri4Var.c());
        return (xn4) g02.A();
    }

    @Override // com.google.android.gms.internal.ads.c84
    public final Class d() {
        return this.f20179b;
    }
}
