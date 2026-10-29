package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class tm implements kd3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lc3 f16248a;

    tm(lc3 lc3Var) {
        this.f16248a = lc3Var;
    }

    @Override // com.google.android.gms.internal.ads.kd3
    public final void b(int i7, long j7) {
        this.f16248a.b(i7, System.currentTimeMillis() - j7);
    }

    @Override // com.google.android.gms.internal.ads.kd3
    public final void c(int i7, long j7, String str) {
        this.f16248a.f(i7, System.currentTimeMillis() - j7, str);
    }
}
