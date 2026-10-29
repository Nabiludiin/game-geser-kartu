package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
enum n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: q, reason: collision with root package name */
    private final char f22390q;

    n(char c8) {
        this.f22390q = c8;
    }

    public static n c(char c8) {
        for (n nVar : values()) {
            if (nVar.f22390q == c8) {
                return nVar;
            }
        }
        return UNSET;
    }

    final /* synthetic */ char d() {
        return this.f22390q;
    }
}
