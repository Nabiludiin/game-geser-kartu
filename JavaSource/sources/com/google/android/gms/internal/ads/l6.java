package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* compiled from: MyApplication */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11429a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11431c;

    public l6(long j7, long j8, int i7) {
        rx3.a(j7 < j8);
        this.f11429a = j7;
        this.f11430b = j8;
        this.f11431c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l6.class == obj.getClass()) {
            l6 l6Var = (l6) obj;
            if (this.f11429a == l6Var.f11429a && this.f11430b == l6Var.f11430b && this.f11431c == l6Var.f11431c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f11429a), Long.valueOf(this.f11430b), Integer.valueOf(this.f11431c));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f11429a), Long.valueOf(this.f11430b), Integer.valueOf(this.f11431c)};
        String str = hi2.f9535a;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
