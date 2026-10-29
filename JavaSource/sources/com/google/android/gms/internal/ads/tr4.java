package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class tr4 implements qi4 {

    /* renamed from: a, reason: collision with root package name */
    private static final tr4 f16340a = new tr4();

    /* renamed from: b, reason: collision with root package name */
    private static final ki4 f16341b = ki4.d(qr4.f14596a, ch4.class, v84.class);

    static void d() {
        sh4.a().c(f16340a);
        sh4.a().b(f16341b);
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class a() {
        return v84.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class b() {
        return v84.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final /* bridge */ /* synthetic */ Object c(xg4 xg4Var, fh4 fh4Var, pi4 pi4Var) {
        hw4 d8;
        fi4 fi4Var = new fi4();
        for (int i7 = 0; i7 < xg4Var.h(); i7++) {
            l84 d9 = ((n84) xg4Var).d(i7);
            if (d9.b().equals(d84.f6978b)) {
                v84 v84Var = (v84) pi4Var.a(d9);
                b84 a8 = d9.a();
                if (a8 instanceof ws4) {
                    d8 = ((ws4) a8).c();
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
                fi4Var.a(d8, new rr4(v84Var, d9.c()));
            }
        }
        return new sr4(fi4Var.b(), !fh4Var.a() ? qh4.a().b().a(xg4Var, fh4Var, "public_key_verify", "verify") : jh4.f10554a);
    }
}
