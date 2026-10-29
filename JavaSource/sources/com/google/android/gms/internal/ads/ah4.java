package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
abstract /* synthetic */ class ah4 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f4972a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f4973b;

    static {
        int[] iArr = new int[wn4.values().length];
        f4973b = iArr;
        try {
            iArr[wn4.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4973b[wn4.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[uo4.values().length];
        f4972a = iArr2;
        try {
            iArr2[uo4.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4972a[uo4.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4972a[uo4.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4972a[uo4.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
