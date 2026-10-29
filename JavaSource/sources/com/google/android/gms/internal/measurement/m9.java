package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public enum m9 implements za {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: q, reason: collision with root package name */
    private final int f21138q;

    m9(int i7) {
        this.f21138q = i7;
    }

    @Override // com.google.android.gms.internal.measurement.za
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f21138q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21138q);
    }
}
