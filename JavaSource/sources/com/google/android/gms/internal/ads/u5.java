package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class u5 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16583b;

    public u5(String str, byte[] bArr) {
        super(str);
        this.f16583b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u5.class == obj.getClass()) {
            u5 u5Var = (u5) obj;
            if (this.f6930a.equals(u5Var.f6930a) && Arrays.equals(this.f16583b, u5Var.f16583b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6930a.hashCode() + 527) * 31) + Arrays.hashCode(this.f16583b);
    }
}
