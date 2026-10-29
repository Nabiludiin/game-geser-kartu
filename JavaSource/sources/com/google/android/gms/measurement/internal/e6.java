package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class e6 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.u0 f22082q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f22083r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ f6 f22084s;

    e6(f6 f6Var, com.google.android.gms.internal.measurement.u0 u0Var, ServiceConnection serviceConnection) {
        this.f22082q = u0Var;
        this.f22083r = serviceConnection;
        Objects.requireNonNull(f6Var);
        this.f22084s = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        f6 f6Var = this.f22084s;
        g6 g6Var = f6Var.f22128b;
        w6 w6Var = g6Var.f22169a;
        w6Var.b().h();
        Bundle bundle2 = new Bundle();
        String a8 = f6Var.a();
        bundle2.putString("package_name", a8);
        try {
            bundle = this.f22082q.F0(bundle2);
        } catch (Exception e8) {
            g6Var.f22169a.a().o().b("Exception occurred while retrieving the Install Referrer", e8.getMessage());
        }
        if (bundle == null) {
            w6Var.a().o().a("Install Referrer Service returned a null response");
            bundle = null;
        }
        w6 w6Var2 = g6Var.f22169a;
        w6Var2.b().h();
        w6.q();
        if (bundle != null) {
            long j7 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j7 == 0) {
                w6Var2.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    w6Var2.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    w6Var2.a().w().b("InstallReferrer API result", string);
                    Bundle s02 = w6Var2.C().s0(Uri.parse("?".concat(string)));
                    if (s02 == null) {
                        w6Var2.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List asList = Arrays.asList(((String) c5.f21956h1.b(null)).split(","));
                        Iterator<String> it = s02.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (asList.contains(it.next())) {
                                long j8 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j8 > 0) {
                                    s02.putLong("click_timestamp", j8);
                                }
                            }
                        }
                        if (j7 == w6Var2.x().f22027g.a()) {
                            w6Var2.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (w6Var2.g()) {
                            w6Var2.x().f22027g.b(j7);
                            w6Var2.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            s02.putString("_cis", "referrer API v2");
                            w6Var2.B().w("auto", "_cmp", s02, a8);
                        }
                    }
                }
            }
        }
        s3.a.b().c(w6Var2.e(), this.f22083r);
    }
}
