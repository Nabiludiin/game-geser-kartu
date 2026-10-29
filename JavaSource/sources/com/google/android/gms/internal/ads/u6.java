package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class u6 implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    public final long f16604q;

    /* renamed from: r, reason: collision with root package name */
    public final long f16605r;

    public u6(long j7, long j8) {
        this.f16604q = j7;
        this.f16605r = j8;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f16604q, ((u6) obj).f16604q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return this.f16604q == u6Var.f16604q && this.f16605r == u6Var.f16605r;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16604q), Long.valueOf(this.f16605r));
    }
}
