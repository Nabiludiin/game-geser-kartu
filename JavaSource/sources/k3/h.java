package k3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import p3.p1;

/* compiled from: MyApplication */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24498a = k.f24503a;

    /* renamed from: b, reason: collision with root package name */
    private static final h f24499b = new h();

    h() {
    }

    public static h h() {
        return f24499b;
    }

    public void a(Context context) {
        k.a(context);
    }

    public int b(Context context) {
        return k.b(context);
    }

    public Intent c(int i7) {
        return d(null, i7, null);
    }

    public Intent d(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            int i8 = p1.f25257c;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.i.g(context)) {
            int i9 = p1.f25257c;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f24498a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(u3.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        int i10 = p1.f25257c;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent e(Context context, int i7, int i8) {
        return f(context, i7, i8, null);
    }

    public PendingIntent f(Context context, int i7, int i8, String str) {
        Intent d8 = d(context, i7, str);
        if (d8 == null) {
            return null;
        }
        return androidx.core.app.m.b(context, i8, d8, 134217728, false);
    }

    public String g(int i7) {
        return k.c(i7);
    }

    public int i(Context context) {
        return j(context, f24498a);
    }

    public int j(Context context, int i7) {
        int h8 = k.h(context, i7);
        if (k.i(context, h8)) {
            return 18;
        }
        return h8;
    }

    public boolean k(Context context, int i7) {
        return k.i(context, i7);
    }

    public boolean l(Context context, String str) {
        return k.m(context, str);
    }

    public boolean m(int i7) {
        return k.k(i7);
    }
}
