package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum wn4 implements uz4 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* renamed from: q, reason: collision with root package name */
    private final int f18341q;

    wn4(int i7) {
        this.f18341q = i7;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f18341q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18341q);
    }
}
