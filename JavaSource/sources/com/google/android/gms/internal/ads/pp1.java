package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class pp1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rp1 f14001a;

    pp1(rp1 rp1Var) {
        Objects.requireNonNull(rp1Var);
        this.f14001a = rp1Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.X5)).booleanValue()) {
            r2.t.l().i(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(List list) {
        try {
            mr0 mr0Var = (mr0) list.get(0);
            if (mr0Var != null) {
                this.f14001a.a(mr0Var);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e8) {
            if (((Boolean) s2.b0.c().d(uy.X5)).booleanValue()) {
                r2.t.l().i(e8, "omid native display exp");
            }
        }
    }
}
