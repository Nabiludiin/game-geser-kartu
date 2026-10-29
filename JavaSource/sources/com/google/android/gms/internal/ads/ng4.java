package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* compiled from: MyApplication */
final class ng4 extends Number {

    /* renamed from: q, reason: collision with root package name */
    private final String f12731q;

    public ng4(String str) {
        this.f12731q = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f12731q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ng4) {
            return this.f12731q.equals(((ng4) obj).f12731q);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f12731q);
    }

    public final int hashCode() {
        return this.f12731q.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f12731q);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f12731q);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f12731q).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f12731q);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f12731q).longValue();
        }
    }

    public final String toString() {
        return this.f12731q;
    }
}
