package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nh0 extends ph0 {

    /* renamed from: q, reason: collision with root package name */
    private final String f12732q;

    /* renamed from: r, reason: collision with root package name */
    private final int f12733r;

    public nh0(String str, int i7) {
        this.f12732q = str;
        this.f12733r = i7;
    }

    @Override // com.google.android.gms.internal.ads.qh0
    public final String b() {
        return this.f12732q;
    }

    @Override // com.google.android.gms.internal.ads.qh0
    public final int d() {
        return this.f12733r;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nh0)) {
            return false;
        }
        nh0 nh0Var = (nh0) obj;
        if (p3.n.a(this.f12732q, nh0Var.f12732q)) {
            if (p3.n.a(Integer.valueOf(this.f12733r), Integer.valueOf(nh0Var.f12733r))) {
                return true;
            }
        }
        return false;
    }
}
