package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum vu implements uz4 {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);


    /* renamed from: u, reason: collision with root package name */
    private static final vz4 f17770u = new vz4() { // from class: com.google.android.gms.internal.ads.vu.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f17772q;

    vu(int i7) {
        this.f17772q = i7;
    }

    public static vu c(int i7) {
        if (i7 == 0) {
            return NETWORKTYPE_UNSPECIFIED;
        }
        if (i7 == 1) {
            return CELL;
        }
        if (i7 != 2) {
            return null;
        }
        return WIFI;
    }

    public static wz4 d() {
        return wu.f18429a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f17772q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17772q);
    }
}
