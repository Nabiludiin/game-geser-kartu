package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class wd2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f18206a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f03 f18207b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c03 f18208c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f18209d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t73 f18210e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o03 f18211f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ yd2 f18212g;

    wd2(yd2 yd2Var, long j7, f03 f03Var, c03 c03Var, String str, t73 t73Var, o03 o03Var) {
        this.f18206a = j7;
        this.f18207b = f03Var;
        this.f18208c = c03Var;
        this.f18209d = str;
        this.f18210e = t73Var;
        this.f18211f = o03Var;
        Objects.requireNonNull(yd2Var);
        this.f18212g = yd2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.m64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wd2.a(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        long j7;
        yd2 yd2Var = this.f18212g;
        long b8 = yd2Var.j().b() - this.f18206a;
        synchronized (yd2Var) {
            try {
                if (yd2Var.n()) {
                    j7 = b8;
                    yd2Var.k().a(this.f18207b, this.f18208c, 0, null, j7);
                } else {
                    j7 = b8;
                }
                if (yd2Var.p()) {
                    return;
                }
                c03 c03Var = this.f18208c;
                if (yd2Var.i(c03Var)) {
                    ((xd2) yd2Var.m().get(c03Var)).f18770d = j7;
                } else {
                    long j8 = j7;
                    j7 = j8;
                    yd2Var.m().put(c03Var, new xd2(this.f18209d, c03Var.f6161f0, 0, j8, null));
                }
                yd2Var.o().d(c03Var, j7, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
