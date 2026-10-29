package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class yc5 {

    /* renamed from: c, reason: collision with root package name */
    public static final yc5 f19502c;

    /* renamed from: d, reason: collision with root package name */
    public static final yc5 f19503d;

    /* renamed from: e, reason: collision with root package name */
    public static final yc5 f19504e;

    /* renamed from: a, reason: collision with root package name */
    public final long f19505a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19506b;

    static {
        yc5 yc5Var = new yc5(0L, 0L);
        f19502c = yc5Var;
        new yc5(Long.MAX_VALUE, Long.MAX_VALUE);
        f19503d = new yc5(Long.MAX_VALUE, 0L);
        new yc5(0L, Long.MAX_VALUE);
        f19504e = yc5Var;
    }

    public yc5(long j7, long j8) {
        rx3.a(j7 >= 0);
        rx3.a(j8 >= 0);
        this.f19505a = j7;
        this.f19506b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yc5.class == obj.getClass()) {
            yc5 yc5Var = (yc5) obj;
            if (this.f19505a == yc5Var.f19505a && this.f19506b == yc5Var.f19506b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19505a) * 31) + ((int) this.f19506b);
    }
}
