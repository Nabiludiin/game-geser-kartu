package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class p94 implements qi4 {

    /* renamed from: a, reason: collision with root package name */
    private static final p94 f13746a = new p94();

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f13747b = ki4.d(n94.f12641a, ch4.class, u74.class);

    p94() {
    }

    public static void d() {
        sh4.a().c(f13746a);
        sh4.a().b(f13747b);
    }

    public static void e(li4 li4Var) {
        li4Var.b(f13746a);
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class a() {
        return u74.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class b() {
        return u74.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final /* bridge */ /* synthetic */ Object c(xg4 xg4Var, fh4 fh4Var, pi4 pi4Var) {
        gh4 gh4Var;
        gh4 gh4Var2;
        hw4 d8;
        fi4 fi4Var = new fi4();
        for (int i7 = 0; i7 < xg4Var.h(); i7++) {
            l84 d9 = ((n84) xg4Var).d(i7);
            if (d9.b().equals(d84.f6978b)) {
                b84 a8 = d9.a();
                if (a8 instanceof k94) {
                    d8 = ((k94) a8).c();
                } else {
                    if (!(a8 instanceof ch4)) {
                        String name = a8.getClass().getName();
                        String valueOf = String.valueOf(a8.a());
                        StringBuilder sb = new StringBuilder(name.length() + 59 + valueOf.length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(valueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    d8 = ((ch4) a8).d();
                }
                fi4Var.a(d8, new m94((u74) pi4Var.a(d9), d9.c()));
            }
        }
        if (fh4Var.a()) {
            gh4Var = jh4.f10554a;
            gh4Var2 = gh4Var;
        } else {
            hh4 b8 = qh4.a().b();
            gh4 a9 = b8.a(xg4Var, fh4Var, "aead", "encrypt");
            gh4Var2 = b8.a(xg4Var, fh4Var, "aead", "decrypt");
            gh4Var = a9;
        }
        n84 n84Var = (n84) xg4Var;
        return new o94(new m94((u74) pi4Var.a(n84Var.c()), n84Var.c().c()), fi4Var.b(), gh4Var, gh4Var2, null);
    }
}
