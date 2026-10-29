package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: MyApplication */
final class r6 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14745a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f14746b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final z6 f14747c = new z6();

    /* renamed from: d, reason: collision with root package name */
    private s6 f14748d;

    /* renamed from: e, reason: collision with root package name */
    private int f14749e;

    /* renamed from: f, reason: collision with root package name */
    private int f14750f;

    /* renamed from: g, reason: collision with root package name */
    private long f14751g;

    private final long d(n2 n2Var, int i7) {
        n2Var.s(this.f14745a, 0, i7);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (r0[i8] & 255);
        }
        return j7;
    }

    public final void a(s6 s6Var) {
        this.f14748d = s6Var;
    }

    public final void b() {
        this.f14749e = 0;
        this.f14746b.clear();
        this.f14747c.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x008c, code lost:
    
        if (r1 == 1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.google.android.gms.internal.ads.n2 r14) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r6.c(com.google.android.gms.internal.ads.n2):boolean");
    }
}
