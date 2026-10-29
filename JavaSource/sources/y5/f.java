package y5;

import java.math.BigDecimal;

/* compiled from: MyApplication */
public final class f extends Number {

    /* renamed from: q, reason: collision with root package name */
    private final String f27772q;

    public f(String str) {
        this.f27772q = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f27772q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f27772q;
        String str2 = ((f) obj).f27772q;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f27772q);
    }

    public int hashCode() {
        return this.f27772q.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f27772q);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f27772q);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f27772q).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f27772q);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f27772q).longValue();
        }
    }

    public String toString() {
        return this.f27772q;
    }
}
