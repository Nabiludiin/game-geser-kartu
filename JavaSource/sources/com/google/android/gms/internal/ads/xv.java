package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum xv implements uz4 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* renamed from: v, reason: collision with root package name */
    private static final vz4 f19057v = new vz4() { // from class: com.google.android.gms.internal.ads.xv.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f19059q;

    xv(int i7) {
        this.f19059q = i7;
    }

    public static xv c(int i7) {
        if (i7 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i7 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i7 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i7 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static wz4 d() {
        return yv.f19813a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f19059q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19059q);
    }
}
