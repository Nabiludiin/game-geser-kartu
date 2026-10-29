package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class yw4 extends Number {

    /* renamed from: q, reason: collision with root package name */
    private final String f19893q;

    public yw4(String str) {
        this.f19893q = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f19893q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yw4) {
            return this.f19893q.equals(((yw4) obj).f19893q);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f19893q);
    }

    public final int hashCode() {
        return this.f19893q.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.f19893q);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f19893q);
            }
        } catch (NumberFormatException unused2) {
            return hx4.a(this.f19893q).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f19893q);
        } catch (NumberFormatException unused) {
            return hx4.a(this.f19893q).longValue();
        }
    }

    public final String toString() {
        return this.f19893q;
    }
}
