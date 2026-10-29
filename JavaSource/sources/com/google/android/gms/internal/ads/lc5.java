package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class lc5 extends lp5 {

    /* renamed from: c, reason: collision with root package name */
    private final yx f11565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    lc5(mc5 mc5Var, az azVar) {
        super(azVar);
        Objects.requireNonNull(mc5Var);
        this.f11565c = new yx();
    }

    @Override // com.google.android.gms.internal.ads.lp5, com.google.android.gms.internal.ads.az
    public final ot d(int i7, ot otVar, boolean z7) {
        az azVar = this.f11719b;
        ot d8 = azVar.d(i7, otVar, z7);
        if (azVar.b(d8.f13477c, this.f11565c, 0L).b()) {
            d8.a(otVar.f13475a, otVar.f13476b, otVar.f13477c, otVar.f13478d, 0L, ck0.f6475e, true);
            return d8;
        }
        d8.f13480f = true;
        return d8;
    }
}
