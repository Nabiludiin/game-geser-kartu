package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class qd {

    /* renamed from: a, reason: collision with root package name */
    private final String f14380a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14381b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14382c;

    /* renamed from: d, reason: collision with root package name */
    private int f14383d;

    /* renamed from: e, reason: collision with root package name */
    private String f14384e;

    public qd(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1);
            sb.append(i7);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.f14380a = str;
        this.f14381b = i8;
        this.f14382c = i9;
        this.f14383d = Integer.MIN_VALUE;
        this.f14384e = "";
    }

    private final void d() {
        if (this.f14383d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void a() {
        int i7 = this.f14383d;
        int i8 = i7 == Integer.MIN_VALUE ? this.f14381b : i7 + this.f14382c;
        this.f14383d = i8;
        String str = this.f14380a;
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(i8).length());
        sb.append(str);
        sb.append(i8);
        this.f14384e = sb.toString();
    }

    public final int b() {
        d();
        return this.f14383d;
    }

    public final String c() {
        d();
        return this.f14384e;
    }
}
