package w5;

import java.math.BigInteger;

/* compiled from: MyApplication */
public final class l extends g {

    /* renamed from: r, reason: collision with root package name */
    private static final Class[] f27178r = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: q, reason: collision with root package name */
    private Object f27179q;

    public l(Boolean bool) {
        u(bool);
    }

    private static boolean q(l lVar) {
        Object obj = lVar.f27179q;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    private static boolean s(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class cls2 : f27178r) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f27179q == null) {
            return lVar.f27179q == null;
        }
        if (q(this) && q(lVar)) {
            return n().longValue() == lVar.n().longValue();
        }
        Object obj2 = this.f27179q;
        if (!(obj2 instanceof Number) || !(lVar.f27179q instanceof Number)) {
            return obj2.equals(lVar.f27179q);
        }
        double doubleValue = n().doubleValue();
        double doubleValue2 = lVar.n().doubleValue();
        return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f27179q == null) {
            return 31;
        }
        if (q(this)) {
            doubleToLongBits = n().longValue();
        } else {
            Object obj = this.f27179q;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(n().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean l() {
        return p() ? m().booleanValue() : Boolean.parseBoolean(o());
    }

    Boolean m() {
        return (Boolean) this.f27179q;
    }

    public Number n() {
        Object obj = this.f27179q;
        return obj instanceof String ? new y5.f((String) obj) : (Number) obj;
    }

    public String o() {
        return r() ? n().toString() : p() ? m().toString() : (String) this.f27179q;
    }

    public boolean p() {
        return this.f27179q instanceof Boolean;
    }

    public boolean r() {
        return this.f27179q instanceof Number;
    }

    public boolean t() {
        return this.f27179q instanceof String;
    }

    void u(Object obj) {
        if (obj instanceof Character) {
            this.f27179q = String.valueOf(((Character) obj).charValue());
        } else {
            y5.a.a((obj instanceof Number) || s(obj));
            this.f27179q = obj;
        }
    }

    public l(Number number) {
        u(number);
    }

    public l(String str) {
        u(str);
    }
}
