package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class j implements r {

    /* renamed from: q, reason: collision with root package name */
    private final Double f21047q;

    public j(Double d8) {
        if (d8 == null) {
            this.f21047q = Double.valueOf(Double.NaN);
        } else {
            this.f21047q = d8;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        Double d8 = this.f21047q;
        boolean z7 = false;
        if (!Double.isNaN(d8.doubleValue()) && d8.doubleValue() != 0.0d) {
            z7 = true;
        }
        return Boolean.valueOf(z7);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        Double d8 = this.f21047q;
        if (Double.isNaN(d8.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d8.doubleValue())) {
            return d8.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal a8 = i.a(BigDecimal.valueOf(d8.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((a8.scale() > 0 ? a8.precision() : a8.scale()) - 1);
        String format = decimalFormat.format(a8);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : a8.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f21047q.equals(((j) obj).f21047q);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        if ("toString".equals(str)) {
            return new v(d());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", d(), str));
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        return this.f21047q;
    }

    public final int hashCode() {
        return this.f21047q.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        return new j(this.f21047q);
    }

    public final String toString() {
        return d();
    }
}
