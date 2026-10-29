package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: MyApplication */
public final class v implements Iterable, r {

    /* renamed from: q, reason: collision with root package name */
    private final String f21408q;

    public v(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f21408q = str;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        return Boolean.valueOf(!this.f21408q.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        return this.f21408q;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return new t(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f21408q.equals(((v) obj).f21408q);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0256  */
    @Override // com.google.android.gms.internal.measurement.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.r g(java.lang.String r27, com.google.android.gms.internal.measurement.o4 r28, java.util.List r29) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.v.g(java.lang.String, com.google.android.gms.internal.measurement.o4, java.util.List):com.google.android.gms.internal.measurement.r");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        String str = this.f21408q;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.f21408q.hashCode();
    }

    final /* synthetic */ String i() {
        return this.f21408q;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        return new v(this.f21408q);
    }

    public final String toString() {
        String str = this.f21408q;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }
}
