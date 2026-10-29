package t5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import m5.c;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26439a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f26440b;

    /* renamed from: c, reason: collision with root package name */
    private final c f26441c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26442d;

    public a(Context context, String str, c cVar) {
        Context a8 = a(context);
        this.f26439a = a8;
        this.f26440b = a8.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f26441c = cVar;
        this.f26442d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f26440b.contains("firebase_data_collection_default_enabled") ? this.f26440b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f26439a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f26439a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f26442d;
    }
}
