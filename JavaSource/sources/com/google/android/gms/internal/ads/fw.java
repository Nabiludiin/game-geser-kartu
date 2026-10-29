package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum fw implements uz4 {
    UNSPECIFIED(0),
    IN_MEMORY(1);


    /* renamed from: t, reason: collision with root package name */
    private static final vz4 f8511t = new vz4() { // from class: com.google.android.gms.internal.ads.fw.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f8513q;

    fw(int i7) {
        this.f8513q = i7;
    }

    public static fw c(int i7) {
        if (i7 == 0) {
            return UNSPECIFIED;
        }
        if (i7 != 1) {
            return null;
        }
        return IN_MEMORY;
    }

    public static wz4 d() {
        return gw.f9177a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f8513q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f8513q);
    }
}
