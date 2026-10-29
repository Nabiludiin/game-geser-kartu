package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class pr4 implements qi4 {

    /* renamed from: a, reason: collision with root package name */
    private static final pr4 f14033a = new pr4();

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f14034b = ki4.d(mr4.f12394a, ch4.class, u84.class);

    pr4() {
    }

    public static void d() {
        sh4.a().c(f14033a);
        sh4.a().b(f14034b);
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class a() {
        return u84.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class b() {
        return u84.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final /* bridge */ /* synthetic */ Object c(xg4 xg4Var, fh4 fh4Var, pi4 pi4Var) {
        gh4 a8 = !fh4Var.a() ? qh4.a().b().a(xg4Var, fh4Var, "public_key_sign", "sign") : jh4.f10554a;
        n84 n84Var = (n84) xg4Var;
        return new or4(new nr4((u84) pi4Var.a(n84Var.c()), n84Var.c().c()), a8);
    }
}
