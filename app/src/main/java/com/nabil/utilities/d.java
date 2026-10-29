package com.nabil.utilities;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class d {

    static ConsentInformation f4276a;

    static AtomicBoolean f4277b = new AtomicBoolean(false);

    public static void c(Activity activity, FormError formError) {
        if (formError != null) {
            Log.w("TAG", String.format("%s: %s", formError.getErrorCode(), formError.getMessage()));
        }
        if (f4276a.canRequestAds()) {
            d(activity);
        }
    }

    private static void d(Context context) {
        if (f4277b.getAndSet(true)) {
            return;
        }
        MobileAds.initialize(context);
    }

    public static void e(final Activity activity) {
        ConsentDebugSettings debugSettings = new ConsentDebugSettings.Builder(activity)
                .setDebugGeography(ConsentDebugSettings.DebugGeography.DEBUG_GEOGRAPHY_EEA)
                .addTestDeviceHashedId("B3EEABB8EE11C2BE770B684D95219ECB")
                .build();
        ConsentRequestParameters params = new ConsentRequestParameters.Builder()
                .setConsentDebugSettings(debugSettings)
                .setTagForUnderAgeOfConsent(false)
                .build();
        f4276a = UserMessagingPlatform.getConsentInformation(activity);
        f4276a.requestConsentInfoUpdate(activity, params,
                () -> UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, formError -> c(activity, formError)),
                formError -> Log.w("TAG", String.format("%s: %s", formError.getErrorCode(), formError.getMessage())));
        if (f4276a.canRequestAds()) {
            d(activity);
        }
    }
}
