package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class w3 extends b3 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q3 f18011b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x3 f18012c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w3(x3 x3Var, q3 q3Var, q3 q3Var2) {
        super(q3Var);
        this.f18011b = q3Var2;
        Objects.requireNonNull(x3Var);
        this.f18012c = x3Var;
    }

    @Override // com.google.android.gms.internal.ads.b3, com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        o3 c8 = this.f18011b.c(j7);
        r3 r3Var = c8.f13172a;
        long j8 = r3Var.f14718a;
        x3 x3Var = this.f18012c;
        r3 r3Var2 = new r3(j8, r3Var.f14719b + x3Var.a());
        r3 r3Var3 = c8.f13173b;
        return new o3(r3Var2, new r3(r3Var3.f14718a, r3Var3.f14719b + x3Var.a()));
    }
}
