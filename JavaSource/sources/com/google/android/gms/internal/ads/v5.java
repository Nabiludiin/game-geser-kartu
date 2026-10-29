package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class v5 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f17384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17385c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17386d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17387e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17388f;

    /* renamed from: g, reason: collision with root package name */
    private final d6[] f17389g;

    public v5(String str, int i7, int i8, long j7, long j8, d6[] d6VarArr) {
        super("CHAP");
        this.f17384b = str;
        this.f17385c = i7;
        this.f17386d = i8;
        this.f17387e = j7;
        this.f17388f = j8;
        this.f17389g = d6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v5.class == obj.getClass()) {
            v5 v5Var = (v5) obj;
            if (this.f17385c == v5Var.f17385c && this.f17386d == v5Var.f17386d && this.f17387e == v5Var.f17387e && this.f17388f == v5Var.f17388f && Objects.equals(this.f17384b, v5Var.f17384b) && Arrays.equals(this.f17389g, v5Var.f17389g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f17385c + 527;
        String str = this.f17384b;
        long j7 = this.f17388f;
        return (((((((i7 * 31) + this.f17386d) * 31) + ((int) this.f17387e)) * 31) + ((int) j7)) * 31) + str.hashCode();
    }
}
