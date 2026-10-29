package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public enum s6 implements f4 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* renamed from: q, reason: collision with root package name */
    private final int f21742q;

    s6(int i7) {
        this.f21742q = i7;
    }

    public final int a() {
        return this.f21742q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f21742q);
    }
}
