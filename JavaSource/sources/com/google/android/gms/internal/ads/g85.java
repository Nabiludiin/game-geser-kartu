package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class g85 {

    /* renamed from: j, reason: collision with root package name */
    public static final g85 f8699j = new g85(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final g85 f8700k = new g85(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final g85 f8701l = new g85(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final g85 f8702m = new g85(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f8703a;

    /* renamed from: b, reason: collision with root package name */
    public final double f8704b;

    /* renamed from: c, reason: collision with root package name */
    public final double f8705c;

    /* renamed from: d, reason: collision with root package name */
    public final double f8706d;

    /* renamed from: e, reason: collision with root package name */
    public final double f8707e;

    /* renamed from: f, reason: collision with root package name */
    public final double f8708f;

    /* renamed from: g, reason: collision with root package name */
    public final double f8709g;

    /* renamed from: h, reason: collision with root package name */
    public final double f8710h;

    /* renamed from: i, reason: collision with root package name */
    public final double f8711i;

    public g85(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f8703a = d12;
        this.f8704b = d13;
        this.f8705c = d14;
        this.f8706d = d8;
        this.f8707e = d9;
        this.f8708f = d10;
        this.f8709g = d11;
        this.f8710h = d15;
        this.f8711i = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g85.class != obj.getClass()) {
            return false;
        }
        g85 g85Var = (g85) obj;
        return Double.compare(g85Var.f8706d, this.f8706d) == 0 && Double.compare(g85Var.f8707e, this.f8707e) == 0 && Double.compare(g85Var.f8708f, this.f8708f) == 0 && Double.compare(g85Var.f8709g, this.f8709g) == 0 && Double.compare(g85Var.f8710h, this.f8710h) == 0 && Double.compare(g85Var.f8711i, this.f8711i) == 0 && Double.compare(g85Var.f8703a, this.f8703a) == 0 && Double.compare(g85Var.f8704b, this.f8704b) == 0 && Double.compare(g85Var.f8705c, this.f8705c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f8703a);
        long j7 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8704b);
        long j8 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f8705c);
        long j9 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f8706d);
        long j10 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f8707e);
        long j11 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f8708f);
        long j12 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f8709g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f8710h);
        long j13 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f8711i);
        return (((((((((((((((((int) j7) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j13)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f8699j)) {
            return "Rotate 0°";
        }
        if (equals(f8700k)) {
            return "Rotate 90°";
        }
        if (equals(f8701l)) {
            return "Rotate 180°";
        }
        if (equals(f8702m)) {
            return "Rotate 270°";
        }
        double d8 = this.f8703a;
        double d9 = this.f8704b;
        double d10 = this.f8705c;
        double d11 = this.f8706d;
        double d12 = this.f8707e;
        double d13 = this.f8708f;
        double d14 = this.f8709g;
        double d15 = this.f8710h;
        double d16 = this.f8711i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d8);
        sb.append(", v=");
        sb.append(d9);
        sb.append(", w=");
        sb.append(d10);
        sb.append(", a=");
        sb.append(d11);
        sb.append(", b=");
        sb.append(d12);
        sb.append(", c=");
        sb.append(d13);
        sb.append(", d=");
        sb.append(d14);
        sb.append(", tx=");
        sb.append(d15);
        sb.append(", ty=");
        sb.append(d16);
        sb.append("}");
        return sb.toString();
    }
}
