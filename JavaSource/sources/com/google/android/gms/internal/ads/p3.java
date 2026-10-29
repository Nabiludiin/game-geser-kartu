package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public class p3 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f13644a;

    /* renamed from: b, reason: collision with root package name */
    private final o3 f13645b;

    public p3(long j7, long j8) {
        this.f13644a = j7;
        r3 r3Var = j8 == 0 ? r3.f14717c : new r3(0L, j8);
        this.f13645b = new o3(r3Var, r3Var);
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f13644a;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        return this.f13645b;
    }
}
