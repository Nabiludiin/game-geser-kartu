package p4;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: MyApplication */
final class d3 {

    /* renamed from: a, reason: collision with root package name */
    private final z2 f25326a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f25327b;

    /* renamed from: c, reason: collision with root package name */
    private final x4.a f25328c;

    /* renamed from: d, reason: collision with root package name */
    private final x4.d f25329d;

    /* synthetic */ d3(z2 z2Var, Activity activity, x4.a aVar, x4.d dVar, a3 a3Var) {
        this.f25326a = z2Var;
        this.f25327b = activity;
        this.f25328c = aVar;
        this.f25329d = dVar;
    }

    static /* bridge */ /* synthetic */ h1 a(d3 d3Var) {
        Bundle bundle;
        List list;
        List<Rect> boundingRects;
        List list2;
        PackageInfo packageInfo;
        h1 h1Var = new h1();
        String c8 = d3Var.f25329d.c();
        if (TextUtils.isEmpty(c8)) {
            try {
                z2 z2Var = d3Var.f25326a;
                bundle = z2Var.f25550a.getPackageManager().getApplicationInfo(z2Var.f25550a.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c8 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c8)) {
                throw new u2(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        h1Var.f25374a = c8;
        x4.a aVar = d3Var.f25328c;
        if (aVar.b()) {
            ArrayList arrayList = new ArrayList();
            int a8 = aVar.a();
            if (a8 == 1) {
                arrayList.add(c1.GEO_OVERRIDE_EEA);
            } else if (a8 == 2) {
                arrayList.add(c1.GEO_OVERRIDE_NON_EEA);
            } else if (a8 == 3) {
                arrayList.add(c1.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (a8 == 4) {
                arrayList.add(c1.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(c1.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        h1Var.f25382i = list;
        z2 z2Var2 = d3Var.f25326a;
        h1Var.f25378e = z2Var2.f25551b.b();
        h1Var.f25377d = Boolean.valueOf(d3Var.f25329d.b());
        h1Var.f25376c = Locale.getDefault().toLanguageTag();
        d1 d1Var = new d1();
        int i7 = Build.VERSION.SDK_INT;
        d1Var.f25322b = Integer.valueOf(i7);
        d1Var.f25321a = Build.MODEL;
        d1Var.f25323c = 2;
        h1Var.f25375b = d1Var;
        Configuration configuration = z2Var2.f25550a.getResources().getConfiguration();
        z2Var2.f25550a.getResources().getConfiguration();
        f1 f1Var = new f1();
        f1Var.f25356a = Integer.valueOf(configuration.screenWidthDp);
        f1Var.f25357b = Integer.valueOf(configuration.screenHeightDp);
        f1Var.f25358c = Double.valueOf(z2Var2.f25550a.getResources().getDisplayMetrics().density);
        if (i7 < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = d3Var.f25327b;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        e1 e1Var = new e1();
                        e1Var.f25343b = Integer.valueOf(rect.left);
                        e1Var.f25344c = Integer.valueOf(rect.right);
                        e1Var.f25342a = Integer.valueOf(rect.top);
                        e1Var.f25345d = Integer.valueOf(rect.bottom);
                        arrayList2.add(e1Var);
                    }
                }
                list2 = arrayList2;
            }
        }
        f1Var.f25359d = list2;
        h1Var.f25379f = f1Var;
        Application application = z2Var2.f25550a;
        try {
            packageInfo = z2Var2.f25550a.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        b1 b1Var = new b1();
        b1Var.f25298a = application.getPackageName();
        z2 z2Var3 = d3Var.f25326a;
        CharSequence applicationLabel = z2Var3.f25550a.getPackageManager().getApplicationLabel(z2Var3.f25550a.getApplicationInfo());
        b1Var.f25299b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            b1Var.f25300c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        h1Var.f25380g = b1Var;
        g1 g1Var = new g1();
        g1Var.f25366a = "3.2.0";
        h1Var.f25381h = g1Var;
        return h1Var;
    }
}
