package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum lx implements uz4 {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);


    /* renamed from: u, reason: collision with root package name */
    private static final vz4 f11919u = new vz4() { // from class: com.google.android.gms.internal.ads.lx.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f11921q;

    lx(int i7) {
        this.f11921q = i7;
    }

    public static lx c(int i7) {
        if (i7 == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i7 == 1) {
            return IOS;
        }
        if (i7 != 2) {
            return null;
        }
        return ANDROID;
    }

    public static wz4 d() {
        return mx.f12465a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f11921q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11921q);
    }
}
