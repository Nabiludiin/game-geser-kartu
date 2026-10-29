package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bc implements zb {

    /* renamed from: r, reason: collision with root package name */
    private static final double[] f5687r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f5688a;

    /* renamed from: b, reason: collision with root package name */
    private a4 f5689b;

    /* renamed from: c, reason: collision with root package name */
    private final ud f5690c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5691d;

    /* renamed from: e, reason: collision with root package name */
    private final y82 f5692e;

    /* renamed from: f, reason: collision with root package name */
    private final tc f5693f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f5694g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    private final ac f5695h = new ac(128);

    /* renamed from: i, reason: collision with root package name */
    private long f5696i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5697j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5698k;

    /* renamed from: l, reason: collision with root package name */
    private long f5699l;

    /* renamed from: m, reason: collision with root package name */
    private long f5700m;

    /* renamed from: n, reason: collision with root package name */
    private long f5701n;

    /* renamed from: o, reason: collision with root package name */
    private long f5702o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5703p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5704q;

    bc(ud udVar, String str) {
        y82 y82Var;
        this.f5690c = udVar;
        this.f5691d = str;
        if (udVar != null) {
            this.f5693f = new tc(178, 128);
            y82Var = new y82();
        } else {
            y82Var = null;
            this.f5693f = null;
        }
        this.f5692e = y82Var;
        this.f5700m = -9223372036854775807L;
        this.f5702o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
        a4 a4Var = this.f5689b;
        a4Var.getClass();
        if (z7) {
            boolean z8 = this.f5703p;
            long j7 = this.f5696i - this.f5701n;
            a4Var.a(this.f5702o, z8 ? 1 : 0, (int) j7, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c6  */
    @Override // com.google.android.gms.internal.ads.zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(com.google.android.gms.internal.ads.y82 r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bc.B0(com.google.android.gms.internal.ads.y82):void");
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f5688a = qdVar.c();
        this.f5689b = p2Var.A(qdVar.b(), 2);
        ud udVar = this.f5690c;
        if (udVar != null) {
            udVar.a(p2Var, qdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f5700m = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        p63.i(this.f5694g);
        this.f5695h.a();
        tc tcVar = this.f5693f;
        if (tcVar != null) {
            tcVar.a();
        }
        this.f5696i = 0L;
        this.f5697j = false;
        this.f5700m = -9223372036854775807L;
        this.f5702o = -9223372036854775807L;
    }
}
