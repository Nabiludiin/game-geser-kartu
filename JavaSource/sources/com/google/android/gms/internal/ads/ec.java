package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ec implements zb {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f7533l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final ud f7534a;

    /* renamed from: f, reason: collision with root package name */
    private dc f7539f;

    /* renamed from: g, reason: collision with root package name */
    private long f7540g;

    /* renamed from: h, reason: collision with root package name */
    private String f7541h;

    /* renamed from: i, reason: collision with root package name */
    private a4 f7542i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7543j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f7536c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final cc f7537d = new cc(128);

    /* renamed from: k, reason: collision with root package name */
    private long f7544k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private final tc f7538e = new tc(178, 128);

    /* renamed from: b, reason: collision with root package name */
    private final y82 f7535b = new y82();

    ec(ud udVar, String str) {
        this.f7534a = udVar;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
        dc dcVar = this.f7539f;
        dcVar.getClass();
        if (z7) {
            dcVar.d(this.f7540g, 0, this.f7543j);
            this.f7539f.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    @Override // com.google.android.gms.internal.ads.zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(com.google.android.gms.internal.ads.y82 r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ec.B0(com.google.android.gms.internal.ads.y82):void");
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f7541h = qdVar.c();
        a4 A = p2Var.A(qdVar.b(), 2);
        this.f7542i = A;
        this.f7539f = new dc(A);
        this.f7534a.a(p2Var, qdVar);
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f7544k = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        p63.i(this.f7536c);
        this.f7537d.a();
        dc dcVar = this.f7539f;
        if (dcVar != null) {
            dcVar.a();
        }
        this.f7538e.a();
        this.f7540g = 0L;
        this.f7544k = -9223372036854775807L;
    }
}
