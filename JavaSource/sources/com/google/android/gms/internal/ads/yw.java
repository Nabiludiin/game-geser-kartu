package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum yw implements uz4 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);

    private static final vz4 C = new vz4() { // from class: com.google.android.gms.internal.ads.yw.a
    };

    /* renamed from: q, reason: collision with root package name */
    private final int f19843q;

    yw(int i7) {
        this.f19843q = i7;
    }

    public static yw c(int i7) {
        switch (i7) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static wz4 d() {
        return zw.f20372a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f19843q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19843q);
    }
}
