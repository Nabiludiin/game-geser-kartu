package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class pc {

    /* renamed from: a, reason: collision with root package name */
    static final z4.i f22486a = z4.i.p("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static final boolean c(com.google.android.gms.internal.measurement.l9 l9Var, z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        int i12;
        int i13;
        z4.k kVar2;
        String str4;
        oc ocVar;
        char c8;
        int e8 = e(l9Var, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true);
        if (e8 > 0) {
            i13 = i9;
            if (i13 == 1) {
                i12 = i8;
                if (i12 != 1) {
                    i13 = 1;
                } else {
                    i12 = 1;
                    i13 = 1;
                }
            } else {
                i12 = i8;
            }
            cArr[e8] = '2';
        } else {
            i12 = i8;
            i13 = i9;
        }
        if (i(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i11, str, str2, str3, z7, z8, true) == com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c8 = '3';
        } else {
            int i14 = i11;
            if (l9Var == com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                kVar2 = kVar;
                str4 = str;
                if (i14 == 1) {
                    if (kVar2.contains(str4)) {
                        if (e8 > 0 && cArr[e8] != '2') {
                            cArr[e8] = '1';
                        }
                        return true;
                    }
                    i14 = 1;
                }
            } else {
                kVar2 = kVar;
                str4 = str;
            }
            if (jVar.containsKey(l9Var) && (ocVar = (oc) jVar.get(l9Var)) != null) {
                int ordinal = ocVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return i(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) == com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) : g(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                        }
                        if (ordinal == 3) {
                            return i(l9Var, jVar, jVar2, kVar2, cArr, i7, i12, i13, i10, i14, str4, str2, str3, z7, z8, true) == com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) : h(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                        }
                    } else if (i(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) != com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                    }
                } else if (i(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true) != com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(l9Var, jVar, jVar2, kVar, cArr, i7, i12, i13, i10, i14, str, str2, str3, z7, z8, true);
                }
                c8 = '8';
            }
            c8 = '0';
        }
        if (e8 <= 0 || cArr[e8] == '2') {
            return false;
        }
        cArr[e8] = c8;
        return false;
    }

    public static final Map d(z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        if (!z9) {
            return z4.j.h();
        }
        com.google.android.gms.internal.measurement.l9 l9Var = com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.m9 m9Var = (com.google.android.gms.internal.measurement.m9) jVar2.get(l9Var);
        com.google.android.gms.internal.measurement.l9 l9Var2 = com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.m9 m9Var2 = (com.google.android.gms.internal.measurement.m9) jVar2.get(l9Var2);
        com.google.android.gms.internal.measurement.l9 l9Var3 = com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.m9 m9Var3 = (com.google.android.gms.internal.measurement.m9) jVar2.get(l9Var3);
        com.google.android.gms.internal.measurement.l9 l9Var4 = com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.m9 m9Var4 = (com.google.android.gms.internal.measurement.m9) jVar2.get(l9Var4);
        return z4.j.a().f("Version", "2").f("VendorConsent", true != z7 ? "0" : "1").f("VendorLegitimateInterest", true != z8 ? "0" : "1").f("gdprApplies", i9 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i8 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i10)).f("CmpSdkID", String.valueOf(i7)).f("PurposeOneTreatment", i11 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(m9Var != null ? m9Var.a() : com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED.a())).f("PublisherRestrictions3", String.valueOf(m9Var2 != null ? m9Var2.a() : com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED.a())).f("PublisherRestrictions4", String.valueOf(m9Var3 != null ? m9Var3.a() : com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED.a())).f("PublisherRestrictions7", String.valueOf(m9Var4 != null ? m9Var4.a() : com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED.a())).i(z4.j.i("Purpose1", f(l9Var, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true), "Purpose3", f(l9Var2, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true), "Purpose4", f(l9Var3, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true), "Purpose7", f(l9Var4, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true))).i(z4.j.j("AuthorizePurpose1", true != c(l9Var, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "AuthorizePurpose3", true != c(l9Var2, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "AuthorizePurpose4", true != c(l9Var3, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "AuthorizePurpose7", true != c(l9Var4, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    private static final int e(com.google.android.gms.internal.measurement.l9 l9Var, z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        if (l9Var == com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (l9Var == com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (l9Var == com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return l9Var == com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String f(com.google.android.gms.internal.measurement.l9 l9Var, z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        String str4 = "0";
        String valueOf = (TextUtils.isEmpty(str2) || str2.length() < l9Var.a()) ? "0" : String.valueOf(str2.charAt(l9Var.a() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= l9Var.a()) {
            str4 = String.valueOf(str3.charAt(l9Var.a() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    private static final boolean g(com.google.android.gms.internal.measurement.l9 l9Var, z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        char c8;
        int e8 = e(l9Var, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true);
        if (!z7) {
            c8 = '4';
        } else {
            if (str2.length() >= l9Var.a()) {
                char charAt = str2.charAt(l9Var.a() - 1);
                boolean z10 = charAt == '1';
                if (e8 > 0 && cArr[e8] != '2') {
                    cArr[e8] = charAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c8 = '0';
        }
        if (e8 > 0 && cArr[e8] != '2') {
            cArr[e8] = c8;
        }
        return false;
    }

    private static final boolean h(com.google.android.gms.internal.measurement.l9 l9Var, z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        char c8;
        int e8 = e(l9Var, jVar, jVar2, kVar, cArr, i7, i8, i9, i10, i11, str, str2, str3, z7, z8, true);
        if (!z8) {
            c8 = '5';
        } else {
            if (str3.length() >= l9Var.a()) {
                char charAt = str3.charAt(l9Var.a() - 1);
                boolean z10 = charAt == '1';
                if (e8 > 0 && cArr[e8] != '2') {
                    cArr[e8] = charAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c8 = '0';
        }
        if (e8 > 0 && cArr[e8] != '2') {
            cArr[e8] = c8;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.m9 i(com.google.android.gms.internal.measurement.l9 l9Var, z4.j jVar, z4.j jVar2, z4.k kVar, char[] cArr, int i7, int i8, int i9, int i10, int i11, String str, String str2, String str3, boolean z7, boolean z8, boolean z9) {
        return (com.google.android.gms.internal.measurement.m9) jVar2.getOrDefault(l9Var, com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
