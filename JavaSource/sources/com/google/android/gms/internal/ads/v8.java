package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class v8 implements b9 {

    /* renamed from: a, reason: collision with root package name */
    private final a9 f17418a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17419b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17420c;

    /* renamed from: d, reason: collision with root package name */
    private final f9 f17421d;

    /* renamed from: e, reason: collision with root package name */
    private int f17422e;

    /* renamed from: f, reason: collision with root package name */
    private long f17423f;

    /* renamed from: g, reason: collision with root package name */
    private long f17424g;

    /* renamed from: h, reason: collision with root package name */
    private long f17425h;

    /* renamed from: i, reason: collision with root package name */
    private long f17426i;

    /* renamed from: j, reason: collision with root package name */
    private long f17427j;

    /* renamed from: k, reason: collision with root package name */
    private long f17428k;

    /* renamed from: l, reason: collision with root package name */
    private long f17429l;

    public v8(f9 f9Var, long j7, long j8, long j9, long j10, boolean z7) {
        rx3.a(j7 >= 0 && j8 > j7);
        this.f17421d = f9Var;
        this.f17419b = j7;
        this.f17420c = j8;
        if (j9 == j8 - j7 || z7) {
            this.f17423f = j10;
            this.f17422e = 4;
        } else {
            this.f17422e = 0;
        }
        this.f17418a = new a9();
    }

    final /* synthetic */ long a() {
        return this.f17419b;
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final void b(long j7) {
        long j8 = this.f17423f - 1;
        String str = hi2.f9535a;
        this.f17425h = Math.max(0L, Math.min(j7, j8));
        this.f17422e = 2;
        this.f17426i = this.f17419b;
        this.f17427j = this.f17420c;
        this.f17428k = 0L;
        this.f17429l = this.f17423f;
    }

    final /* synthetic */ long c() {
        return this.f17420c;
    }

    @Override // com.google.android.gms.internal.ads.b9
    public final /* bridge */ /* synthetic */ q3 d() {
        byte[] bArr = null;
        if (this.f17423f != 0) {
            return new u8(this, bArr);
        }
        return null;
    }

    final /* synthetic */ f9 e() {
        return this.f17421d;
    }

    final /* synthetic */ long f() {
        return this.f17423f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    @Override // com.google.android.gms.internal.ads.b9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(com.google.android.gms.internal.ads.n2 r25) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v8.j(com.google.android.gms.internal.ads.n2):long");
    }
}
