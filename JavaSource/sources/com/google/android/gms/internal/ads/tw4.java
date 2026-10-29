package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: MyApplication */
public final class tw4 extends pw4 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f16476q;

    public tw4(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f16476q = bool;
    }

    private static boolean n(tw4 tw4Var) {
        Object obj = tw4Var.f16476q;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean a() {
        return this.f16476q instanceof Boolean;
    }

    @Override // com.google.android.gms.internal.ads.pw4
    public final String c() {
        Object obj = this.f16476q;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return j().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(obj.getClass())));
    }

    public final boolean d() {
        return this.f16476q instanceof Number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tw4.class != obj.getClass()) {
            return false;
        }
        tw4 tw4Var = (tw4) obj;
        Object obj2 = this.f16476q;
        if (obj2 == null) {
            return tw4Var.f16476q == null;
        }
        if (n(this) && n(tw4Var)) {
            return ((obj2 instanceof BigInteger) || (tw4Var.f16476q instanceof BigInteger)) ? m().equals(tw4Var.m()) : j().longValue() == tw4Var.j().longValue();
        }
        if (obj2 instanceof Number) {
            Object obj3 = tw4Var.f16476q;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return l().compareTo(tw4Var.l()) == 0;
                }
                double k7 = k();
                double k8 = tw4Var.k();
                if (k7 != k8) {
                    return Double.isNaN(k7) && Double.isNaN(k8);
                }
                return true;
            }
        }
        return obj2.equals(tw4Var.f16476q);
    }

    public final int hashCode() {
        long doubleToLongBits;
        Object obj = this.f16476q;
        if (obj == null) {
            return 31;
        }
        if (n(this)) {
            doubleToLongBits = j().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(j().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean i() {
        Object obj = this.f16476q;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(c());
    }

    public final Number j() {
        Object obj = this.f16476q;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new yw4((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final double k() {
        return this.f16476q instanceof Number ? j().doubleValue() : Double.parseDouble(c());
    }

    public final BigDecimal l() {
        Object obj = this.f16476q;
        return obj instanceof BigDecimal ? (BigDecimal) obj : hx4.a(c());
    }

    public final BigInteger m() {
        Object obj = this.f16476q;
        return obj instanceof BigInteger ? (BigInteger) obj : n(this) ? BigInteger.valueOf(j().longValue()) : hx4.b(c());
    }

    public tw4(Number number) {
        Objects.requireNonNull(number);
        this.f16476q = number;
    }

    public tw4(String str) {
        Objects.requireNonNull(str);
        this.f16476q = str;
    }
}
