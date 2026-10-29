package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class es5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7810b;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public es5(String str, String str2) {
        this.f7809a = hi2.E(str);
        this.f7810b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && es5.class == obj.getClass()) {
            es5 es5Var = (es5) obj;
            if (Objects.equals(this.f7809a, es5Var.f7809a) && Objects.equals(this.f7810b, es5Var.f7810b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7810b.hashCode() * 31;
        String str = this.f7809a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
