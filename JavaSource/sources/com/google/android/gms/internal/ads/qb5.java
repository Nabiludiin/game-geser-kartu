package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class qb5 {

    /* renamed from: a, reason: collision with root package name */
    public final xp5 f14361a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14362b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14363c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14364d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14365e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14366f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14367g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14368h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14369i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14370j;

    qb5(xp5 xp5Var, long j7, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12 = true;
        rx3.a(!z11 || z9);
        if (z10 && !z9) {
            z12 = false;
        }
        rx3.a(z12);
        this.f14361a = xp5Var;
        this.f14362b = j7;
        this.f14363c = j8;
        this.f14364d = j9;
        this.f14365e = j10;
        this.f14366f = false;
        this.f14367g = false;
        this.f14368h = z9;
        this.f14369i = z10;
        this.f14370j = z11;
    }

    public final qb5 a(long j7) {
        return j7 == this.f14362b ? this : new qb5(this.f14361a, j7, this.f14363c, this.f14364d, this.f14365e, false, false, this.f14368h, this.f14369i, this.f14370j);
    }

    public final qb5 b(long j7) {
        return j7 == this.f14363c ? this : new qb5(this.f14361a, this.f14362b, j7, this.f14364d, this.f14365e, false, false, this.f14368h, this.f14369i, this.f14370j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qb5.class == obj.getClass()) {
            qb5 qb5Var = (qb5) obj;
            if (this.f14362b == qb5Var.f14362b && this.f14363c == qb5Var.f14363c && this.f14364d == qb5Var.f14364d && this.f14365e == qb5Var.f14365e && this.f14368h == qb5Var.f14368h && this.f14369i == qb5Var.f14369i && this.f14370j == qb5Var.f14370j && Objects.equals(this.f14361a, qb5Var.f14361a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14361a.hashCode() + 527;
        long j7 = this.f14365e;
        long j8 = this.f14364d;
        return (((((((((((((hashCode * 31) + ((int) this.f14362b)) * 31) + ((int) this.f14363c)) * 31) + ((int) j8)) * 31) + ((int) j7)) * 29791) + (this.f14368h ? 1 : 0)) * 31) + (this.f14369i ? 1 : 0)) * 31) + (this.f14370j ? 1 : 0);
    }
}
