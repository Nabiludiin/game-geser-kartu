package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xp5 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18925b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18926c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18928e;

    private xp5(Object obj, int i7, int i8, long j7, int i9) {
        this.f18924a = obj;
        this.f18925b = i7;
        this.f18926c = i8;
        this.f18927d = j7;
        this.f18928e = i9;
    }

    public final xp5 a(Object obj) {
        return this.f18924a.equals(obj) ? this : new xp5(obj, this.f18925b, this.f18926c, this.f18927d, this.f18928e);
    }

    public final boolean b() {
        return this.f18925b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp5)) {
            return false;
        }
        xp5 xp5Var = (xp5) obj;
        return this.f18924a.equals(xp5Var.f18924a) && this.f18925b == xp5Var.f18925b && this.f18926c == xp5Var.f18926c && this.f18927d == xp5Var.f18927d && this.f18928e == xp5Var.f18928e;
    }

    public final int hashCode() {
        return ((((((((this.f18924a.hashCode() + 527) * 31) + this.f18925b) * 31) + this.f18926c) * 31) + ((int) this.f18927d)) * 31) + this.f18928e;
    }

    public xp5(Object obj, int i7, int i8, long j7) {
        this(obj, i7, i8, j7, -1);
    }

    public xp5(Object obj, long j7) {
        this(obj, -1, -1, j7, -1);
    }

    public xp5(Object obj, long j7, int i7) {
        this(obj, -1, -1, j7, i7);
    }
}
