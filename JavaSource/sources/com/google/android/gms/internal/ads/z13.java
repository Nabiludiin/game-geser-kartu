package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class z13 {
    public static s2.x2 a(Throwable th) {
        if (th instanceof oa2) {
            oa2 oa2Var = (oa2) th;
            return c(oa2Var.a(), oa2Var.b());
        }
        if (th instanceof j22) {
            return th.getMessage() == null ? d(((j22) th).a(), null, null) : d(((j22) th).a(), th.getMessage(), null);
        }
        if (!(th instanceof v2.a0)) {
            return d(1, null, null);
        }
        v2.a0 a0Var = (v2.a0) th;
        return new s2.x2(a0Var.a(), iy3.a(a0Var.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static s2.x2 b(Throwable th, pa2 pa2Var) {
        s2.x2 x2Var;
        s2.x2 a8 = a(th);
        int i7 = a8.f26259q;
        if ((i7 == 3 || i7 == 0) && (x2Var = a8.f26262t) != null && !x2Var.f26261s.equals("com.google.android.gms.ads")) {
            a8.f26262t = null;
        }
        if (pa2Var != null) {
            a8.f26263u = pa2Var.f();
        }
        return a8;
    }

    public static s2.x2 c(int i7, s2.x2 x2Var) {
        if (i7 == 0) {
            throw null;
        }
        if (i7 == 8) {
            if (((Integer) s2.b0.c().d(uy.g9)).intValue() > 0) {
                return x2Var;
            }
            i7 = 8;
        }
        return d(i7, null, x2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static s2.x2 d(int i7, String str, s2.x2 x2Var) {
        String str2;
        int i8 = i7 - 1;
        if (str == null) {
            if (i7 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i8) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) s2.b0.c().d(uy.j9)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i7 == 0) {
            throw null;
        }
        int i9 = 0;
        int i10 = 2;
        switch (i8) {
            case 0:
            case 11:
            case 15:
                i10 = i9;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i10 = 1;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 2:
            case 10:
            case 18:
                i10 = 3;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 3:
                i9 = 8;
                i10 = i9;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 4:
            case 8:
            case 17:
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 7:
                i9 = 4;
                i10 = i9;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 12:
                if (((Integer) s2.b0.c().d(uy.j9)).intValue() <= 0) {
                    i9 = 9;
                    i10 = i9;
                    return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
                }
                i10 = 3;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 13:
                i9 = 10;
                i10 = i9;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            case 14:
                i9 = 11;
                i10 = i9;
                return new s2.x2(i10, str3, "com.google.android.gms.ads", x2Var, null);
            default:
                switch (i7) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
