package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum dv implements uz4 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: x, reason: collision with root package name */
    private static final vz4 f7319x = new vz4() { // from class: com.google.android.gms.internal.ads.dv.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f7321q;

    dv(int i7) {
        this.f7321q = i7;
    }

    public static dv c(int i7) {
        if (i7 == 0) {
            return UNSPECIFIED;
        }
        if (i7 == 1) {
            return CONNECTING;
        }
        if (i7 == 2) {
            return CONNECTED;
        }
        if (i7 == 3) {
            return DISCONNECTING;
        }
        if (i7 == 4) {
            return DISCONNECTED;
        }
        if (i7 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public static wz4 d() {
        return ev.f7830a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f7321q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7321q);
    }
}
