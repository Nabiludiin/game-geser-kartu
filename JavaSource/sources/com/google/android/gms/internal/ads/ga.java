package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: MyApplication */
public final class ga implements s9 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f8730a = new y82();

    /* renamed from: b, reason: collision with root package name */
    private final y82 f8731b = new y82();

    /* renamed from: c, reason: collision with root package name */
    private final fa f8732c = new fa();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f8733d;

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        y82 y82Var = this.f8730a;
        y82Var.A(bArr, i8 + i7);
        y82Var.G(i7);
        if (this.f8733d == null) {
            this.f8733d = new Inflater();
        }
        y82 y82Var2 = this.f8731b;
        if (hi2.m(y82Var, y82Var2, this.f8733d)) {
            y82Var.A(y82Var2.H(), y82Var2.D());
        }
        fa faVar = this.f8732c;
        faVar.b();
        ArrayList arrayList = new ArrayList();
        while (y82Var.C() >= 3) {
            int D = y82Var.D();
            int R = y82Var.R();
            int S = y82Var.S();
            int F = y82Var.F() + S;
            vw0 vw0Var = null;
            if (F > D) {
                y82Var.G(D);
            } else {
                if (R != 128) {
                    switch (R) {
                        case 20:
                            faVar.c(y82Var, S);
                            break;
                        case 21:
                            faVar.d(y82Var, S);
                            break;
                        case 22:
                            faVar.e(y82Var, S);
                            break;
                    }
                } else {
                    vw0Var = faVar.a();
                    faVar.b();
                }
                y82Var.G(F);
            }
            if (vw0Var != null) {
                arrayList.add(vw0Var);
            }
        }
        th1Var.d(new k9(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
