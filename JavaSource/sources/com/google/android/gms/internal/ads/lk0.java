package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class lk0 {
    public static String a(String str, Context context, boolean z7, Map map) {
        String j7;
        if ((((Boolean) s2.b0.c().d(uy.I0)).booleanValue() && !z7) || !r2.t.d().a(context) || TextUtils.isEmpty(str) || (j7 = r2.t.d().j(context)) == null) {
            return str;
        }
        String str2 = (String) s2.b0.c().d(uy.B0);
        if (((Boolean) s2.b0.c().d(uy.A0)).booleanValue() && str.contains(str2)) {
            if (r2.t.g().U(str)) {
                r2.t.d().k(context, j7, (Map) map.get("_ac"));
                return d(str, context).replace(str2, j7);
            }
            if (!r2.t.g().V(str)) {
                return str;
            }
            r2.t.d().l(context, j7, (Map) map.get("_ai"));
            return d(str, context).replace(str2, j7);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) s2.b0.c().d(uy.f17254z0)).booleanValue()) {
            return str;
        }
        if (r2.t.g().U(str)) {
            r2.t.d().k(context, j7, (Map) map.get("_ac"));
            return c(d(str, context), "fbs_aeid", j7).toString();
        }
        if (!r2.t.g().V(str)) {
            return str;
        }
        r2.t.d().l(context, j7, (Map) map.get("_ai"));
        return c(d(str, context), "fbs_aeid", j7).toString();
    }

    public static String b(Uri uri, Context context, Map map) {
        if (!r2.t.d().a(context)) {
            return uri.toString();
        }
        String j7 = r2.t.d().j(context);
        if (j7 == null) {
            return uri.toString();
        }
        String str = (String) s2.b0.c().d(uy.B0);
        String uri2 = uri.toString();
        if (((Boolean) s2.b0.c().d(uy.A0)).booleanValue() && uri2.contains(str)) {
            r2.t.d().k(context, j7, (Map) map.get("_ac"));
            return d(uri2, context).replace(str, j7);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) s2.b0.c().d(uy.f17254z0)).booleanValue()) {
                String uri3 = c(d(uri2, context), "fbs_aeid", j7).toString();
                r2.t.d().k(context, j7, (Map) map.get("_ac"));
                return uri3;
            }
        }
        return uri2;
    }

    static Uri c(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i7 = indexOf + 1;
        return Uri.parse(str.substring(0, i7) + str2 + "=" + str3 + "&" + str.substring(i7));
    }

    private static String d(String str, Context context) {
        String h8 = r2.t.d().h(context);
        String i7 = r2.t.d().i(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(h8)) {
            str = c(str, "gmp_app_id", h8).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(i7)) ? str : c(str, "fbs_aiid", i7).toString();
    }
}
