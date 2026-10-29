package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: MyApplication */
final class np5 implements yl3 {

    /* renamed from: a, reason: collision with root package name */
    private final yl3 f12836a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12837b;

    /* renamed from: c, reason: collision with root package name */
    private final mp5 f12838c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f12839d;

    /* renamed from: e, reason: collision with root package name */
    private int f12840e;

    public np5(yl3 yl3Var, int i7, mp5 mp5Var) {
        rx3.a(i7 > 0);
        this.f12836a = yl3Var;
        this.f12837b = i7;
        this.f12838c = mp5Var;
        this.f12839d = new byte[1];
        this.f12840e = i7;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void a(kb4 kb4Var) {
        kb4Var.getClass();
        this.f12836a.a(kb4Var);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f12836a.d();
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        return this.f12836a.i();
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        int i9 = this.f12840e;
        if (i9 == 0) {
            yl3 yl3Var = this.f12836a;
            byte[] bArr2 = this.f12839d;
            int i10 = 0;
            if (yl3Var.r(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int r7 = yl3Var.r(bArr3, i10, i12);
                        if (r7 != -1) {
                            i10 += r7;
                            i12 -= r7;
                        }
                    }
                    while (i11 > 0) {
                        int i13 = i11 - 1;
                        if (bArr3[i13] != 0) {
                            break;
                        }
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        this.f12838c.a(new y82(bArr3, i11));
                    }
                }
                i9 = this.f12837b;
                this.f12840e = i9;
            }
            return -1;
        }
        int r8 = this.f12836a.r(bArr, i7, Math.min(i9, i8));
        if (r8 != -1) {
            this.f12840e -= r8;
        }
        return r8;
    }
}
