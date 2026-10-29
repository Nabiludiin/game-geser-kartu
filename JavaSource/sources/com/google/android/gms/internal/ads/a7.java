package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class a7 extends a2 implements f7 {

    /* renamed from: g, reason: collision with root package name */
    private final long f4771g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4772h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4773i;

    /* renamed from: j, reason: collision with root package name */
    private final long f4774j;

    public a7(long j7, long j8, int i7, int i8, boolean z7) {
        super(j7, j8, i7, i8, false);
        this.f4771g = j8;
        this.f4772h = i7;
        this.f4773i = i8;
        this.f4774j = j7 != -1 ? j7 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long e() {
        return this.f4774j;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final int f() {
        return this.f4772h;
    }

    @Override // com.google.android.gms.internal.ads.f7
    public final long g(long j7) {
        return d(j7);
    }

    public final a7 i(long j7) {
        return new a7(j7, this.f4771g, this.f4772h, this.f4773i, false);
    }
}
