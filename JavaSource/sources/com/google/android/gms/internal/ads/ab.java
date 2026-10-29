package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: MyApplication */
public final class ab implements s9 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f4852a = new y82();

    /* renamed from: b, reason: collision with root package name */
    private final y82 f4853b = new y82();

    /* renamed from: c, reason: collision with root package name */
    private final za f4854c;

    /* renamed from: d, reason: collision with root package name */
    private Inflater f4855d;

    public ab(List list) {
        za zaVar = new za();
        this.f4854c = zaVar;
        zaVar.a(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        y82 y82Var = this.f4852a;
        y82Var.A(bArr, i8 + i7);
        y82Var.G(i7);
        if (this.f4855d == null) {
            this.f4855d = new Inflater();
        }
        y82 y82Var2 = this.f4853b;
        if (hi2.m(y82Var, y82Var2, this.f4855d)) {
            y82Var.A(y82Var2.H(), y82Var2.D());
        }
        za zaVar = this.f4854c;
        zaVar.d();
        int C = y82Var.C();
        vw0 vw0Var = null;
        if (C >= 2 && y82Var.S() == C) {
            zaVar.b(y82Var);
            vw0Var = zaVar.c(y82Var);
        }
        th1Var.d(new k9(vw0Var != null ? w04.n(vw0Var) : w04.m(), -9223372036854775807L, 5000000L));
    }
}
