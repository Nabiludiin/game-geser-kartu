package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* compiled from: MyApplication */
public final class wz {

    /* renamed from: a, reason: collision with root package name */
    private androidx.browser.customtabs.f f18479a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.browser.customtabs.c f18480b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.browser.customtabs.e f18481c;

    /* renamed from: d, reason: collision with root package name */
    private vz f18482d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i7 = 0; i7 < queryIntentActivities.size(); i7++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i7).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(c95.a(context));
                    }
                }
            }
        }
        return false;
    }

    public final void b(Activity activity) {
        androidx.browser.customtabs.e eVar = this.f18481c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f18480b = null;
        this.f18479a = null;
        this.f18481c = null;
    }

    public final androidx.browser.customtabs.f c() {
        androidx.browser.customtabs.c cVar = this.f18480b;
        if (cVar == null) {
            this.f18479a = null;
        } else if (this.f18479a == null) {
            this.f18479a = cVar.e(null);
        }
        return this.f18479a;
    }

    public final void d(vz vzVar) {
        this.f18482d = vzVar;
    }

    public final void e(Activity activity) {
        String a8;
        if (this.f18480b == null && (a8 = c95.a(activity)) != null) {
            d95 d95Var = new d95(this);
            this.f18481c = d95Var;
            androidx.browser.customtabs.c.a(activity, a8, d95Var);
        }
    }

    public final void f(androidx.browser.customtabs.c cVar) {
        this.f18480b = cVar;
        cVar.g(0L);
        vz vzVar = this.f18482d;
        if (vzVar != null) {
            vzVar.a();
        }
    }

    public final void g() {
        this.f18480b = null;
        this.f18479a = null;
    }
}
