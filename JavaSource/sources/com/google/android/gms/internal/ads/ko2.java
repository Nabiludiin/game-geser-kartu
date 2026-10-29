package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class ko2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11170a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f11171b;

    ko2(Context context, z64 z64Var) {
        this.f11170a = context;
        this.f11171b = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f11171b.B0(new Callable() { // from class: com.google.android.gms.internal.ads.jo2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ko2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 18;
    }

    final /* synthetic */ io2 c() {
        Bundle bundle;
        r2.t.g();
        String string = !((Boolean) s2.b0.c().d(uy.E6)).booleanValue() ? "" : this.f11170a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) s2.b0.c().d(uy.G6)).booleanValue() ? this.f11170a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        r2.t.g();
        Context context = this.f11170a;
        if (((Boolean) s2.b0.c().d(uy.F6)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i7 = 0; i7 < 4; i7++) {
                String str = strArr[i7];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new io2(string, string2, bundle, null);
    }
}
