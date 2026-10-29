package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lc implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final String f11519a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11520b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11521c = "video/mp2t";

    /* renamed from: d, reason: collision with root package name */
    private final y82 f11522d;

    /* renamed from: e, reason: collision with root package name */
    private final w72 f11523e;

    /* renamed from: f, reason: collision with root package name */
    private a4 f11524f;

    /* renamed from: g, reason: collision with root package name */
    private String f11525g;

    /* renamed from: h, reason: collision with root package name */
    private eq5 f11526h;

    /* renamed from: i, reason: collision with root package name */
    private int f11527i;

    /* renamed from: j, reason: collision with root package name */
    private int f11528j;

    /* renamed from: k, reason: collision with root package name */
    private int f11529k;

    /* renamed from: l, reason: collision with root package name */
    private int f11530l;

    /* renamed from: m, reason: collision with root package name */
    private long f11531m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f11532n;

    /* renamed from: o, reason: collision with root package name */
    private int f11533o;

    /* renamed from: p, reason: collision with root package name */
    private int f11534p;

    /* renamed from: q, reason: collision with root package name */
    private int f11535q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11536r;

    /* renamed from: s, reason: collision with root package name */
    private long f11537s;

    /* renamed from: t, reason: collision with root package name */
    private int f11538t;

    /* renamed from: u, reason: collision with root package name */
    private long f11539u;

    /* renamed from: v, reason: collision with root package name */
    private int f11540v;

    /* renamed from: w, reason: collision with root package name */
    private String f11541w;

    public lc(String str, int i7, String str2) {
        this.f11519a = str;
        this.f11520b = i7;
        y82 y82Var = new y82(1024);
        this.f11522d = y82Var;
        byte[] H = y82Var.H();
        this.f11523e = new w72(H, H.length);
        this.f11531m = -9223372036854775807L;
    }

    private final int b(w72 w72Var) {
        int c8 = w72Var.c();
        g1 b8 = h1.b(w72Var, true);
        this.f11541w = b8.f8597c;
        this.f11538t = b8.f8595a;
        this.f11540v = b8.f8596b;
        return c8 - w72Var.c();
    }

    private static long c(w72 w72Var) {
        return w72Var.j((w72Var.j(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015a, code lost:
    
        if (r14.f11532n == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(com.google.android.gms.internal.ads.y82 r15) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc.B0(com.google.android.gms.internal.ads.y82):void");
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void C0(p2 p2Var, qd qdVar) {
        qdVar.a();
        this.f11524f = p2Var.A(qdVar.b(), 1);
        this.f11525g = qdVar.c();
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void D0(long j7, int i7) {
        this.f11531m = j7;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a() {
        this.f11527i = 0;
        this.f11531m = -9223372036854775807L;
        this.f11532n = false;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void A0(boolean z7) {
    }
}
