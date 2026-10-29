package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class lq {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11721b;

    /* renamed from: c, reason: collision with root package name */
    public final j9 f11722c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11723d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11724e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11725f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11726g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11727h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11728i;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public lq(Object obj, int i7, j9 j9Var, Object obj2, int i8, long j7, long j8, int i9, int i10) {
        this.f11720a = obj;
        this.f11721b = i7;
        this.f11722c = j9Var;
        this.f11723d = obj2;
        this.f11724e = i8;
        this.f11725f = j7;
        this.f11726g = j8;
        this.f11727h = i9;
        this.f11728i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lq.class == obj.getClass()) {
            lq lqVar = (lq) obj;
            if (this.f11721b == lqVar.f11721b && this.f11724e == lqVar.f11724e && this.f11725f == lqVar.f11725f && this.f11726g == lqVar.f11726g && this.f11727h == lqVar.f11727h && this.f11728i == lqVar.f11728i && Objects.equals(this.f11722c, lqVar.f11722c) && Objects.equals(this.f11720a, lqVar.f11720a) && Objects.equals(this.f11723d, lqVar.f11723d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11720a, Integer.valueOf(this.f11721b), this.f11722c, this.f11723d, Integer.valueOf(this.f11724e), Long.valueOf(this.f11725f), Long.valueOf(this.f11726g), Integer.valueOf(this.f11727h), Integer.valueOf(this.f11728i));
    }

    public final String toString() {
        int i7 = this.f11721b;
        int length = String.valueOf(i7).length();
        int i8 = this.f11724e;
        int length2 = String.valueOf(i8).length();
        long j7 = this.f11725f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j7).length());
        sb.append("mediaItem=");
        sb.append(i7);
        sb.append(", period=");
        sb.append(i8);
        sb.append(", pos=");
        sb.append(j7);
        String sb2 = sb.toString();
        int i9 = this.f11727h;
        if (i9 == -1) {
            return sb2;
        }
        long j8 = this.f11726g;
        int i10 = this.f11728i;
        int length3 = sb2.length();
        StringBuilder sb3 = new StringBuilder(length3 + 13 + String.valueOf(j8).length() + 10 + String.valueOf(i9).length() + 5 + String.valueOf(i10).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j8);
        sb3.append(", adGroup=");
        sb3.append(i9);
        sb3.append(", ad=");
        sb3.append(i10);
        return sb3.toString();
    }
}
