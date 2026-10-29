package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class qj4 implements qi4 {

    /* renamed from: a, reason: collision with root package name */
    private static final qj4 f14465a = new qj4();

    private qj4() {
    }

    static void d() {
        sh4.a().c(f14465a);
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class a() {
        return oj4.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final Class b() {
        return oj4.class;
    }

    @Override // com.google.android.gms.internal.ads.qi4
    public final /* bridge */ /* synthetic */ Object c(xg4 xg4Var, fh4 fh4Var, pi4 pi4Var) {
        hw4 d8;
        l84 c8 = ((n84) xg4Var).c();
        fi4 fi4Var = new fi4();
        for (int i7 = 0; i7 < xg4Var.h(); i7++) {
            l84 d9 = ((n84) xg4Var).d(i7);
            if (d9.b().equals(d84.f6978b)) {
                oj4 oj4Var = (oj4) pi4Var.a(d9);
                b84 a8 = d9.a();
                if (a8 instanceof ek4) {
                    d8 = ((ek4) a8).c();
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
                fi4Var.a(d8, oj4Var);
            }
        }
        return new pj4(fi4Var.b(), (oj4) pi4Var.a(c8), null);
    }
}
