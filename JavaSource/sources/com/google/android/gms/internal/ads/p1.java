package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class p1 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    private final s1 f13623a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13624b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13625c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13626d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13627e;

    /* renamed from: f, reason: collision with root package name */
    private final long f13628f;

    public p1(s1 s1Var, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f13623a = s1Var;
        this.f13624b = j7;
        this.f13625c = j9;
        this.f13626d = j10;
        this.f13627e = j11;
        this.f13628f = j12;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final long a() {
        return this.f13624b;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final o3 c(long j7) {
        r3 r3Var = new r3(j7, r1.a(this.f13623a.K(j7), 0L, this.f13625c, this.f13626d, this.f13627e, this.f13628f));
        return new o3(r3Var, r3Var);
    }

    public final long d(long j7) {
        return this.f13623a.K(j7);
    }

    final /* synthetic */ long e() {
        return this.f13626d;
    }

    final /* synthetic */ long h() {
        return this.f13625c;
    }

    final /* synthetic */ long i() {
        return this.f13627e;
    }

    final /* synthetic */ long j() {
        return this.f13628f;
    }
}
