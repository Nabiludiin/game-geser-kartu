package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class br5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5961a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5962b;

    public br5(int i7, boolean z7) {
        this.f5961a = i7;
        this.f5962b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && br5.class == obj.getClass()) {
            br5 br5Var = (br5) obj;
            if (this.f5961a == br5Var.f5961a && this.f5962b == br5Var.f5962b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5961a * 31) + (this.f5962b ? 1 : 0);
    }
}
