package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class ka4 implements yl3 {

    /* renamed from: a, reason: collision with root package name */
    private final yl3 f10943a;

    /* renamed from: b, reason: collision with root package name */
    private long f10944b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f10945c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f10946d = Collections.EMPTY_MAP;

    public ka4(yl3 yl3Var) {
        this.f10943a = yl3Var;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void a(kb4 kb4Var) {
        kb4Var.getClass();
        this.f10943a.a(kb4Var);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        this.f10945c = cq3Var.f6571a;
        this.f10946d = Collections.EMPTY_MAP;
        try {
            long b8 = this.f10943a.b(cq3Var);
            Uri d8 = d();
            if (d8 != null) {
                this.f10945c = d8;
            }
            this.f10946d = i();
            return b8;
        } catch (Throwable th) {
            Uri d9 = d();
            if (d9 != null) {
                this.f10945c = d9;
            }
            this.f10946d = i();
            throw th;
        }
    }

    public final long c() {
        return this.f10944b;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f10943a.d();
    }

    public final Uri e() {
        return this.f10945c;
    }

    public final Map f() {
        return this.f10946d;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        this.f10943a.h();
    }

    @Override // com.google.android.gms.internal.ads.yl3, com.google.android.gms.internal.ads.g64
    public final Map i() {
        return this.f10943a.i();
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        int r7 = this.f10943a.r(bArr, i7, i8);
        if (r7 != -1) {
            this.f10944b += r7;
        }
        return r7;
    }
}
