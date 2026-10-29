package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class wp0 extends qp0 implements kb4 {
    private static final AtomicInteger E = new AtomicInteger(0);
    private final Object A;
    private final String B;
    private final int C;
    private boolean D;

    /* renamed from: t, reason: collision with root package name */
    private String f18368t;

    /* renamed from: u, reason: collision with root package name */
    private final ao0 f18369u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18370v;

    /* renamed from: w, reason: collision with root package name */
    private final vp0 f18371w;

    /* renamed from: x, reason: collision with root package name */
    private final yo0 f18372x;

    /* renamed from: y, reason: collision with root package name */
    private ByteBuffer f18373y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f18374z;

    public wp0(bo0 bo0Var, ao0 ao0Var) {
        super(bo0Var);
        this.f18369u = ao0Var;
        this.f18371w = new vp0();
        this.f18372x = new yo0();
        this.A = new Object();
        this.B = (String) px3.d(bo0Var != null ? bo0Var.o() : null).a("");
        this.C = bo0Var != null ? bo0Var.s() : 0;
        E.incrementAndGet();
    }

    protected static final String B(String str) {
        return "cache:".concat(String.valueOf(w2.g.o(str)));
    }

    private final void C() {
        int a8 = (int) this.f18371w.a();
        int a9 = (int) this.f18372x.a(this.f18373y);
        int position = this.f18373y.position();
        int round = Math.round(a9 * (position / a8));
        int G = sn0.G();
        int H = sn0.H();
        String str = this.f18368t;
        s(str, B(str), position, a8, round, a9, round > 0, G, H);
    }

    public static int x() {
        return E.get();
    }

    public final ByteBuffer A() {
        synchronized (this.A) {
            try {
                ByteBuffer byteBuffer = this.f18373y;
                if (byteBuffer != null && !this.f18374z) {
                    byteBuffer.flip();
                    this.f18374z = true;
                }
                this.f18370v = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f18373y;
    }

    @Override // com.google.android.gms.internal.ads.qp0, l3.h
    public final void a() {
        E.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // com.google.android.gms.internal.ads.qp0
    public final boolean g(String str) {
        String str2;
        String str3;
        com.google.android.gms.common.util.e eVar;
        long j7;
        this.f18368t = str;
        String str4 = "error";
        String B = B(str);
        try {
            ht3 ht3Var = new ht3();
            ht3Var.b(this.f14548r);
            ao0 ao0Var = this.f18369u;
            ht3Var.c(ao0Var.f5172d);
            ht3Var.d(ao0Var.f5173e);
            ht3Var.e(true);
            ht3Var.f(this);
            yl3 a8 = ht3Var.a();
            if (ao0Var.f5177i) {
                a8 = new wo0(this.f14547q, a8, this.B, this.C, null, null);
            }
            a8.b(new cq3(Uri.parse(str), 0L, -1L, null));
            bo0 bo0Var = (bo0) this.f14549s.get();
            if (bo0Var != null) {
                bo0Var.z0(B, this);
            }
            com.google.android.gms.common.util.e o7 = r2.t.o();
            long a9 = o7.a();
            long longValue = ((Long) s2.b0.c().d(uy.T)).longValue();
            long longValue2 = ((Long) s2.b0.c().d(uy.S)).longValue();
            this.f18373y = ByteBuffer.allocate(ao0Var.f5171c);
            byte[] bArr = new byte[8192];
            long j8 = a9;
            while (true) {
                str2 = str4;
                try {
                    int r7 = a8.r(bArr, 0, Math.min(this.f18373y.remaining(), 8192));
                    if (r7 == -1) {
                        this.D = true;
                        u(str, B, (int) this.f18372x.a(this.f18373y));
                        break;
                    }
                    synchronized (this.A) {
                        eVar = o7;
                        try {
                            if (this.f18370v) {
                                j7 = a9;
                            } else {
                                j7 = a9;
                                this.f18373y.put(bArr, 0, r7);
                            }
                        } finally {
                        }
                    }
                    if (this.f18373y.remaining() <= 0) {
                        C();
                        break;
                    }
                    str3 = this.f18370v;
                    try {
                        if (str3 != 0) {
                            int limit = this.f18373y.limit();
                            StringBuilder sb = new StringBuilder(String.valueOf(limit).length() + 24);
                            sb.append("Precache abort at ");
                            sb.append(limit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long a10 = eVar.a();
                        if (a10 - j8 >= longValue) {
                            C();
                            j8 = a10;
                        }
                        if (a10 - j7 > 1000 * longValue2) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(longValue2).length() + 29);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(longValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        str4 = str2;
                        o7 = eVar;
                        a9 = j7;
                    } catch (Exception e8) {
                        e = e8;
                        String canonicalName = e.getClass().getCanonicalName();
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length());
                        sb3.append(canonicalName);
                        sb3.append(":");
                        sb3.append(message);
                        String sb4 = sb3.toString();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 34 + sb4.length());
                        sb5.append("Failed to preload url ");
                        sb5.append(str);
                        sb5.append(" Exception: ");
                        sb5.append(sb4);
                        String sb6 = sb5.toString();
                        int i7 = v2.n1.f26802b;
                        w2.p.f(sb6);
                        v(str, B, str3, sb4);
                        return false;
                    }
                } catch (Exception e9) {
                    e = e9;
                    str3 = str2;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length());
                    sb32.append(canonicalName2);
                    sb32.append(":");
                    sb32.append(message2);
                    String sb42 = sb32.toString();
                    StringBuilder sb52 = new StringBuilder(String.valueOf(str).length() + 34 + sb42.length());
                    sb52.append("Failed to preload url ");
                    sb52.append(str);
                    sb52.append(" Exception: ");
                    sb52.append(sb42);
                    String sb62 = sb52.toString();
                    int i72 = v2.n1.f26802b;
                    w2.p.f(sb62);
                    v(str, B, str3, sb42);
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            e = e10;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void p(yl3 yl3Var, cq3 cq3Var, boolean z7) {
        if (yl3Var instanceof nx3) {
            this.f18371w.b((nx3) yl3Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.qp0
    public final void q() {
        this.f18370v = true;
    }

    public final String y() {
        return this.f18368t;
    }

    public final boolean z() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void d(yl3 yl3Var, cq3 cq3Var, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void l(yl3 yl3Var, cq3 cq3Var, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.kb4
    public final void i(yl3 yl3Var, cq3 cq3Var, boolean z7, int i7) {
    }
}
