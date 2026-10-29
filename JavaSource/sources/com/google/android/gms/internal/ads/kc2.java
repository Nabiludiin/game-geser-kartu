package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class kc2 implements il1 {

    /* renamed from: a, reason: collision with root package name */
    private final c03 f10964a;

    /* renamed from: b, reason: collision with root package name */
    private final id0 f10965b;

    /* renamed from: c, reason: collision with root package name */
    private final k2.c f10966c;

    /* renamed from: d, reason: collision with root package name */
    private pa1 f10967d = null;

    kc2(c03 c03Var, id0 id0Var, k2.c cVar) {
        this.f10964a = c03Var;
        this.f10965b = id0Var;
        this.f10966c = cVar;
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final void a(boolean z7, Context context, ka1 ka1Var) {
        boolean B0;
        try {
            k2.c cVar = k2.c.BANNER;
            int ordinal = this.f10966c.ordinal();
            if (ordinal == 1) {
                B0 = this.f10965b.B0(w3.b.C1(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        B0 = this.f10965b.y0(w3.b.C1(context));
                    }
                    throw new hl1("Adapter failed to show.");
                }
                B0 = this.f10965b.g4(w3.b.C1(context));
            }
            if (B0) {
                pa1 pa1Var = this.f10967d;
                if (pa1Var == null) {
                    return;
                }
                if (((Boolean) s2.b0.c().d(uy.N1)).booleanValue() || this.f10964a.Y != 2) {
                    return;
                }
                pa1Var.a();
                return;
            }
            throw new hl1("Adapter failed to show.");
        } catch (Throwable th) {
            throw new hl1(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.il1
    public final c03 b() {
        return this.f10964a;
    }

    public final void c(pa1 pa1Var) {
        this.f10967d = pa1Var;
    }
}
