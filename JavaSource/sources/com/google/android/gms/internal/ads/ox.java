package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum ox implements uz4 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);


    /* renamed from: u, reason: collision with root package name */
    private static final vz4 f13532u = new vz4() { // from class: com.google.android.gms.internal.ads.ox.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f13534q;

    ox(int i7) {
        this.f13534q = i7;
    }

    public static ox c(int i7) {
        if (i7 == 0) {
            return ENUM_FALSE;
        }
        if (i7 == 1) {
            return ENUM_TRUE;
        }
        if (i7 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static wz4 d() {
        return px.f14137a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f13534q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13534q);
    }
}
