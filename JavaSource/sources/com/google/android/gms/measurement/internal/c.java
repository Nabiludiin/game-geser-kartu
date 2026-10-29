package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: MyApplication */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final String f21912a;

    /* renamed from: b, reason: collision with root package name */
    final int f21913b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f21914c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f21915d;

    /* renamed from: e, reason: collision with root package name */
    Long f21916e;

    /* renamed from: f, reason: collision with root package name */
    Long f21917f;

    c(String str, int i7) {
        this.f21912a = str;
        this.f21913b = i7;
    }

    private static Boolean d(String str, int i7, boolean z7, String str2, List list, String str3, p5 p5Var) {
        if (i7 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && i7 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i7 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (p5Var != null) {
                            p5Var.r().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean e(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    static Boolean f(String str, com.google.android.gms.internal.measurement.f4 f4Var, p5 p5Var) {
        List list;
        p3.o.m(f4Var);
        if (str == null || !f4Var.F() || f4Var.O() == 1 || (f4Var.O() != 7 ? !f4Var.G() : f4Var.L() == 0)) {
            return null;
        }
        int O = f4Var.O();
        boolean J = f4Var.J();
        String H = (J || O == 2 || O == 7) ? f4Var.H() : f4Var.H().toUpperCase(Locale.ENGLISH);
        if (f4Var.L() == 0) {
            list = null;
        } else {
            List K = f4Var.K();
            if (!J) {
                ArrayList arrayList = new ArrayList(K.size());
                Iterator it = K.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                K = Collections.unmodifiableList(arrayList);
            }
            list = K;
        }
        return d(str, O, J, H, list, O == 2 ? H : null, p5Var);
    }

    static Boolean g(long j7, com.google.android.gms.internal.measurement.z3 z3Var) {
        try {
            return j(new BigDecimal(j7), z3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(double d8, com.google.android.gms.internal.measurement.z3 z3Var) {
        try {
            return j(new BigDecimal(d8), z3Var, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.z3 z3Var) {
        if (!td.O(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), z3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.z3 z3Var, double d8) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        p3.o.m(z3Var);
        if (z3Var.F()) {
            if (z3Var.Q() != 1) {
                if (z3Var.Q() == 5) {
                    if (!z3Var.K() || !z3Var.M()) {
                        return null;
                    }
                } else if (!z3Var.I()) {
                    return null;
                }
                int Q = z3Var.Q();
                if (z3Var.Q() == 5) {
                    if (td.O(z3Var.L()) && td.O(z3Var.N())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(z3Var.L());
                            bigDecimal4 = new BigDecimal(z3Var.N());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!td.O(z3Var.J())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(z3Var.J());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (Q == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i7 = Q - 1;
                if (i7 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i7 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i7 != 3) {
                    if (i7 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d8 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}
