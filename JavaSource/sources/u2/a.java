package u2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.rx1;
import com.google.android.gms.internal.ads.uy;
import v2.f2;
import v2.n1;

/* compiled from: MyApplication */
public final class a {
    public static final boolean a(Context context, Intent intent, e eVar, b bVar, boolean z7, rx1 rx1Var, String str, Bundle bundle) {
        if (z7) {
            return c(context, intent.getData(), eVar, bVar, bundle);
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            n1.k(sb.toString());
            if (((Boolean) s2.b0.c().d(uy.ge)).booleanValue()) {
                r2.t.g();
                f2.E(context, intent, rx1Var, str);
            } else {
                r2.t.g();
                f2.z(context, intent);
            }
            if (eVar != null) {
                eVar.k();
            }
            if (bVar != null) {
                bVar.r0(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            String message = e8.getMessage();
            int i7 = n1.f26802b;
            w2.p.f(message);
            if (bVar != null) {
                bVar.r0(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, m mVar, e eVar, b bVar, rx1 rx1Var, String str) {
        int i7 = 0;
        if (mVar == null) {
            int i8 = n1.f26802b;
            w2.p.f("No intent data for launcher overlay.");
            return false;
        }
        uy.a(context);
        Intent intent = mVar.f26532x;
        if (intent != null) {
            return a(context, intent, eVar, bVar, mVar.f26534z, rx1Var, str, mVar.A);
        }
        Intent intent2 = new Intent();
        String str2 = mVar.f26526r;
        if (TextUtils.isEmpty(str2)) {
            int i9 = n1.f26802b;
            w2.p.f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = mVar.f26527s;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = mVar.f26528t;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = mVar.f26529u;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                int i10 = n1.f26802b;
                w2.p.f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = mVar.f26530v;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i7 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i11 = n1.f26802b;
                w2.p.f("Could not parse intent flags.");
            }
            intent2.addFlags(i7);
        }
        if (((Boolean) s2.b0.c().d(uy.f17096f5)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) s2.b0.c().d(uy.f17087e5)).booleanValue()) {
                r2.t.g();
                f2.e0(context, intent2);
            }
        }
        return a(context, intent2, eVar, bVar, mVar.f26534z, rx1Var, str, mVar.A);
    }

    private static final boolean c(Context context, Uri uri, e eVar, b bVar, Bundle bundle) {
        int i7;
        try {
            i7 = r2.t.g().b0(context, uri, bundle);
            if (eVar != null) {
                eVar.k();
            }
        } catch (ActivityNotFoundException e8) {
            String message = e8.getMessage();
            int i8 = n1.f26802b;
            w2.p.f(message);
            i7 = 6;
        }
        if (bVar != null) {
            bVar.b(i7);
        }
        return i7 == 5;
    }
}
