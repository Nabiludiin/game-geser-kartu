package p4;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import x4.c;

/* compiled from: MyApplication */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    static final e2 f25502d = e2.m("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* renamed from: a, reason: collision with root package name */
    private final Application f25503a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f25504b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f25505c;

    r(Application application) {
        this.f25503a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f25504b = sharedPreferences;
        this.f25505c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int a() {
        return this.f25504b.getInt("consent_status", 0);
    }

    public final Map b() {
        String str;
        Set<String> stringSet = this.f25504b.getStringSet("stored_info", e2.l());
        if (stringSet.isEmpty()) {
            stringSet = f25502d;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.f25503a;
            l1 a8 = n1.a(application, str2);
            if (a8 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str2)));
            } else {
                Object obj = application.getSharedPreferences(a8.f25448a, 0).getAll().get(a8.f25449b);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str2)));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str2)));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final Set c() {
        return this.f25505c;
    }

    public final void d() {
        this.f25504b.edit().putStringSet("written_values", this.f25505c).commit();
    }

    public final void e(int i7) {
        this.f25504b.edit().putInt("consent_status", i7).commit();
    }

    public final void f(boolean z7) {
        this.f25504b.edit().putBoolean("is_pub_misconfigured", z7).commit();
    }

    public final void g(c.EnumC0147c enumC0147c) {
        this.f25504b.edit().putString("privacy_options_requirement_status", enumC0147c.name()).commit();
    }

    public final void h(Set set) {
        this.f25504b.edit().putStringSet("stored_info", set).commit();
    }

    public final boolean i() {
        return this.f25504b.getBoolean("is_pub_misconfigured", false);
    }
}
