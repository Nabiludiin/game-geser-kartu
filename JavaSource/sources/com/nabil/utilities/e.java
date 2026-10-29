package com.nabil.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class e {
    private static String a(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", str);
    }

    public static Context b(Context context, String str) {
        return d(context, a(context, str));
    }

    private static void c(Context context, String str) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("Locale.Helper.Selected.Language", str);
        edit.apply();
    }

    public static Context d(Context context, String str) {
        c(context, str);
        return Build.VERSION.SDK_INT >= 24 ? e(context, str) : f(context, str);
    }

    private static Context e(Context context, String str) {
        Locale locale;
        if (str.contains("_")) {
            String[] split = str.split("_");
            locale = new Locale(split[0], split[1]);
        } else {
            locale = new Locale(str);
        }
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }

    private static Context f(Context context, String str) {
        Locale locale;
        if (str.contains("_")) {
            String[] split = str.split("_");
            locale = new Locale(split[0], split[1]);
        } else {
            locale = new Locale(str);
        }
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}
