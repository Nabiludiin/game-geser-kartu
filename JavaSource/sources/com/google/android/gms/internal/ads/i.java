package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class i implements d1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ nn5 f9774a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f9775b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f9776c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f9777d;

    i(p pVar, nn5 nn5Var, int i7, long j7) {
        this.f9774a = nn5Var;
        this.f9775b = i7;
        this.f9776c = j7;
        Objects.requireNonNull(pVar);
        this.f9777d = pVar;
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final void K(long j7) {
        this.f9777d.A1(this.f9774a, this.f9775b, this.f9776c, j7);
    }

    @Override // com.google.android.gms.internal.ads.d1
    public final void b() {
        this.f9777d.x1(this.f9774a, this.f9775b, this.f9776c);
    }
}
