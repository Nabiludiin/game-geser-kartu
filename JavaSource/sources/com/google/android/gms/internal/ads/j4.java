package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class j4 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f10335a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l4 f10336b;

    public j4(l4 l4Var, long j7) {
        Objects.requireNonNull(l4Var);
        this.f10336b = l4Var;
        this.f10335a = j7;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f10335a;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        l4 l4Var = this.f10336b;
        o3 g8 = l4Var.a()[0].g(j7);
        for (int i7 = 1; i7 < l4Var.a().length; i7++) {
            o3 g9 = l4Var.a()[i7].g(j7);
            if (g9.f13172a.f14719b < g8.f13172a.f14719b) {
                g8 = g9;
            }
        }
        return g8;
    }
}
