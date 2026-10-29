package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: MyApplication */
public final class tj3 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private cq3 f16222e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f16223f;

    /* renamed from: g, reason: collision with root package name */
    private int f16224g;

    /* renamed from: h, reason: collision with root package name */
    private int f16225h;

    public tj3() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        c(cq3Var);
        this.f16222e = cq3Var;
        Uri normalizeScheme = cq3Var.f6571a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        rx3.f("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = hi2.f9535a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw wi.a("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f16223f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e8) {
                throw wi.a("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e8);
            }
        } else {
            this.f16223f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j7 = cq3Var.f6575e;
        int length = this.f16223f.length;
        if (j7 > length) {
            this.f16223f = null;
            throw new zm3(2008);
        }
        int i7 = (int) j7;
        this.f16224g = i7;
        int i8 = length - i7;
        this.f16225h = i8;
        long j8 = cq3Var.f6576f;
        if (j8 != -1) {
            this.f16225h = (int) Math.min(i8, j8);
        }
        e(cq3Var);
        return j8 != -1 ? j8 : this.f16225h;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        cq3 cq3Var = this.f16222e;
        if (cq3Var != null) {
            return cq3Var.f6571a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        if (this.f16223f != null) {
            this.f16223f = null;
            g();
        }
        this.f16222e = null;
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f16225h;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        byte[] bArr2 = this.f16223f;
        String str = hi2.f9535a;
        System.arraycopy(bArr2, this.f16224g, bArr, i7, min);
        this.f16224g += min;
        this.f16225h -= min;
        f(min);
        return min;
    }
}
