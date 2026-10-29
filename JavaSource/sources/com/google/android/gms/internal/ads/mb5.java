package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class mb5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12175a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12176b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12177c;

    /* synthetic */ mb5(lb5 lb5Var, byte[] bArr) {
        this.f12175a = lb5Var.e();
        this.f12176b = lb5Var.f();
        this.f12177c = lb5Var.g();
    }

    public final lb5 a() {
        return new lb5(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb5)) {
            return false;
        }
        mb5 mb5Var = (mb5) obj;
        return this.f12175a == mb5Var.f12175a && this.f12176b == mb5Var.f12176b && this.f12177c == mb5Var.f12177c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f12175a), Float.valueOf(this.f12176b), Long.valueOf(this.f12177c));
    }
}
