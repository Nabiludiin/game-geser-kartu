package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum on4 implements uz4 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: q, reason: collision with root package name */
    private final int f13415q;

    on4(int i7) {
        this.f13415q = i7;
    }

    public static on4 c(int i7) {
        if (i7 == 0) {
            return UNKNOWN_HASH;
        }
        if (i7 == 1) {
            return SHA1;
        }
        if (i7 == 2) {
            return SHA384;
        }
        if (i7 == 3) {
            return SHA256;
        }
        if (i7 == 4) {
            return SHA512;
        }
        if (i7 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f13415q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13415q);
    }
}
