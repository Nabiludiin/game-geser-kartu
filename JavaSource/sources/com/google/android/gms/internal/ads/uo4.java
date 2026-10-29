package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum uo4 implements uz4 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* renamed from: q, reason: collision with root package name */
    private final int f16869q;

    uo4(int i7) {
        this.f16869q = i7;
    }

    public static uo4 c(int i7) {
        if (i7 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i7 == 1) {
            return TINK;
        }
        if (i7 == 2) {
            return LEGACY;
        }
        if (i7 == 3) {
            return RAW;
        }
        if (i7 == 4) {
            return CRUNCHY;
        }
        if (i7 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f16869q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16869q);
    }
}
