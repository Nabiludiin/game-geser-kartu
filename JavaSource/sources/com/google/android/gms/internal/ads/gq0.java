package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: MyApplication */
final class gq0 implements yl3 {

    /* renamed from: a, reason: collision with root package name */
    private final yl3 f9073a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9074b;

    /* renamed from: c, reason: collision with root package name */
    private final yl3 f9075c;

    /* renamed from: d, reason: collision with root package name */
    private long f9076d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f9077e;

    gq0(yl3 yl3Var, int i7, yl3 yl3Var2) {
        this.f9073a = yl3Var;
        this.f9074b = i7;
        this.f9075c = yl3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        Uri uri;
        cq3 cq3Var2;
        Uri uri2 = cq3Var.f6571a;
        this.f9077e = uri2;
        long j7 = cq3Var.f6575e;
        long j8 = this.f9074b;
        cq3 cq3Var3 = null;
        if (j7 >= j8) {
            uri = uri2;
            cq3Var2 = null;
        } else {
            long j9 = cq3Var.f6576f;
            long j10 = j8 - j7;
            if (j9 != -1) {
                j10 = Math.min(j9, j10);
            }
            uri = uri2;
            cq3Var2 = new cq3(uri, j7, j10, null);
        }
        long j11 = cq3Var.f6576f;
        if (j11 == -1 || j7 + j11 > j8) {
            cq3Var3 = new cq3(uri, Math.max(j8, j7), j11 != -1 ? Math.min(j11, (j7 + j11) - j8) : -1L, null);
        }
        long b8 = cq3Var2 != null ? this.f9073a.b(cq3Var2) : 0L;
        long b9 = cq3Var3 != null ? this.f9075c.b(cq3Var3) : 0L;
        this.f9076d = j7;
        if (b8 == -1 || b9 == -1) {
            return -1L;
        }
        return b8 + b9;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f9077e;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        this.f9073a.h();
        this.f9075c.h();
    }

    @Override // com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        return z04.a();
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        int i9;
        long j7 = this.f9076d;
        long j8 = this.f9074b;
        if (j7 < j8) {
            int r7 = this.f9073a.r(bArr, i7, (int) Math.min(i8, j8 - j7));
            long j9 = this.f9076d + r7;
            this.f9076d = j9;
            i9 = r7;
            j7 = j9;
        } else {
            i9 = 0;
        }
        if (j7 < j8) {
            return i9;
        }
        int r8 = this.f9075c.r(bArr, i7 + i9, i8 - i9);
        int i10 = i9 + r8;
        this.f9076d += r8;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void a(kb4 kb4Var) {
    }
}
