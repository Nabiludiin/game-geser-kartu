package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: MyApplication */
public final class qg3 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private final pf3 f14430e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f14431f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f14432g;

    /* renamed from: h, reason: collision with root package name */
    private int f14433h;

    /* renamed from: i, reason: collision with root package name */
    private int f14434i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14435j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg3(final byte[] bArr) {
        super(false);
        pf3 pf3Var = new pf3() { // from class: com.google.android.gms.internal.ads.we3
            @Override // com.google.android.gms.internal.ads.pf3
            public final /* synthetic */ byte[] a(Uri uri) {
                return bArr;
            }
        };
        this.f14430e = pf3Var;
        rx3.a(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        c(cq3Var);
        Uri uri = cq3Var.f6571a;
        this.f14431f = uri;
        byte[] a8 = this.f14430e.a(uri);
        this.f14432g = a8;
        long j7 = cq3Var.f6575e;
        int length = a8.length;
        if (j7 > length) {
            throw new zm3(2008);
        }
        int i7 = (int) j7;
        this.f14433h = i7;
        int i8 = length - i7;
        this.f14434i = i8;
        long j8 = cq3Var.f6576f;
        if (j8 != -1) {
            this.f14434i = (int) Math.min(i8, j8);
        }
        this.f14435j = true;
        e(cq3Var);
        return j8 != -1 ? j8 : this.f14434i;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f14431f;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        if (this.f14435j) {
            this.f14435j = false;
            g();
        }
        this.f14431f = null;
        this.f14432g = null;
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f14434i;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        byte[] bArr2 = this.f14432g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.f14433h, bArr, i7, min);
        this.f14433h += min;
        this.f14434i -= min;
        f(min);
        return min;
    }
}
