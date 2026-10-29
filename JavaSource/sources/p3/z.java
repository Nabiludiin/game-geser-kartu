package p3;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static final r.h f25280a = new r.h();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f25281b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return u3.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i7) {
        Resources resources = context.getResources();
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? resources.getString(R.string.ok) : resources.getString(j3.b.f24246a) : resources.getString(j3.b.f24255j) : resources.getString(j3.b.f24249d);
    }

    public static String c(Context context, int i7) {
        Resources resources = context.getResources();
        String a8 = a(context);
        if (i7 == 1) {
            return resources.getString(j3.b.f24250e, a8);
        }
        if (i7 == 2) {
            return com.google.android.gms.common.util.i.g(context) ? resources.getString(j3.b.f24259n) : resources.getString(j3.b.f24256k, a8);
        }
        if (i7 == 3) {
            return resources.getString(j3.b.f24247b, a8);
        }
        if (i7 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a8);
        }
        if (i7 == 7) {
            return g(context, "common_google_play_services_network_error_text", a8);
        }
        if (i7 == 9) {
            return resources.getString(j3.b.f24254i, a8);
        }
        if (i7 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a8);
        }
        switch (i7) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a8);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a8);
            case 18:
                return resources.getString(j3.b.f24258m, a8);
            default:
                return resources.getString(k3.m.f24516a, a8);
        }
    }

    public static String d(Context context, int i7) {
        return (i7 == 6 || i7 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i7);
    }

    public static String e(Context context, int i7) {
        String h8 = i7 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i7);
        return h8 == null ? context.getResources().getString(j3.b.f24253h) : h8;
    }

    public static String f(Context context, int i7) {
        Resources resources = context.getResources();
        switch (i7) {
            case 1:
                return resources.getString(j3.b.f24251f);
            case 2:
                return resources.getString(j3.b.f24257l);
            case 3:
                return resources.getString(j3.b.f24248c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i7);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h8 = h(context, str);
        if (h8 == null) {
            h8 = resources.getString(k3.m.f24516a);
        }
        return String.format(resources.getConfiguration().locale, h8, str2);
    }

    private static String h(Context context, String str) {
        r.h hVar = f25280a;
        synchronized (hVar) {
            try {
                Locale c8 = androidx.core.os.d.a(context.getResources().getConfiguration()).c(0);
                if (!c8.equals(f25281b)) {
                    hVar.clear();
                    f25281b = c8;
                }
                String str2 = (String) hVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources e8 = k3.j.e(context);
                if (e8 == null) {
                    return null;
                }
                int identifier = e8.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = e8.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    hVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
