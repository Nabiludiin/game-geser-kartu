package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: MyApplication */
final class xu3 extends zv3 {

    /* renamed from: a, reason: collision with root package name */
    private IBinder f19041a;

    /* renamed from: b, reason: collision with root package name */
    private String f19042b;

    /* renamed from: c, reason: collision with root package name */
    private int f19043c;

    /* renamed from: d, reason: collision with root package name */
    private float f19044d;

    /* renamed from: e, reason: collision with root package name */
    private int f19045e;

    /* renamed from: f, reason: collision with root package name */
    private String f19046f;

    /* renamed from: g, reason: collision with root package name */
    private byte f19047g;

    xu3() {
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 a(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.f19041a = iBinder;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 b(String str) {
        this.f19042b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 c(int i7) {
        this.f19043c = i7;
        this.f19047g = (byte) (this.f19047g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 d(float f8) {
        this.f19044d = f8;
        this.f19047g = (byte) (this.f19047g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 e(int i7) {
        this.f19047g = (byte) (this.f19047g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 f(int i7) {
        this.f19047g = (byte) (this.f19047g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 g(int i7) {
        this.f19045e = i7;
        this.f19047g = (byte) (this.f19047g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final zv3 h(String str) {
        this.f19046f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zv3
    public final aw3 i() {
        IBinder iBinder;
        if (this.f19047g == 31 && (iBinder = this.f19041a) != null) {
            return new yu3(iBinder, this.f19042b, this.f19043c, this.f19044d, 0, 0, null, this.f19045e, null, this.f19046f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19041a == null) {
            sb.append(" windowToken");
        }
        if ((this.f19047g & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f19047g & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f19047g & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f19047g & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f19047g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
