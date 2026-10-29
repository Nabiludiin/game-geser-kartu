package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum tu implements uz4 {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);


    /* renamed from: v, reason: collision with root package name */
    private static final vz4 f16368v = new vz4() { // from class: com.google.android.gms.internal.ads.tu.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f16370q;

    tu(int i7) {
        this.f16370q = i7;
    }

    public static tu c(int i7) {
        if (i7 == 0) {
            return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
        }
        if (i7 == 1) {
            return TWO_G;
        }
        if (i7 == 2) {
            return THREE_G;
        }
        if (i7 != 4) {
            return null;
        }
        return LTE;
    }

    public static wz4 d() {
        return uu.f16987a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f16370q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16370q);
    }
}
