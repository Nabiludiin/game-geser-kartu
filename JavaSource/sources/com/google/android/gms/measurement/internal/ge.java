package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* compiled from: MyApplication */
public final class ge {

    /* renamed from: a, reason: collision with root package name */
    private final w6 f22188a;

    public ge(w6 w6Var) {
        this.f22188a = w6Var;
    }

    final void a() {
        w6 w6Var = this.f22188a;
        w6Var.b().h();
        if (e()) {
            if (d()) {
                w6Var.x().f22044x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                w6Var.B().t("auto", "_cmpx", bundle);
            } else {
                String a8 = w6Var.x().f22044x.a();
                if (TextUtils.isEmpty(a8)) {
                    w6Var.a().p().a("Cache still valid but referrer not found");
                } else {
                    long a9 = w6Var.x().f22045y.a() / 3600000;
                    Uri parse = Uri.parse(a8);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a9 - 1) * 3600000);
                    Object obj = pair.first;
                    w6Var.B().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                w6Var.x().f22044x.b(null);
            }
            w6Var.x().f22045y.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String uri;
        w6 w6Var = this.f22188a;
        w6Var.b().h();
        if (w6Var.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        w6Var.x().f22044x.b(uri);
        w6Var.x().f22045y.b(w6Var.f().a());
    }

    final void c() {
        if (e() && d()) {
            this.f22188a.x().f22044x.b(null);
        }
    }

    final boolean d() {
        if (!e()) {
            return false;
        }
        w6 w6Var = this.f22188a;
        return w6Var.f().a() - w6Var.x().f22045y.a() > w6Var.w().D(null, c5.f21964k0);
    }

    final boolean e() {
        return this.f22188a.x().f22045y.a() > 0;
    }
}
