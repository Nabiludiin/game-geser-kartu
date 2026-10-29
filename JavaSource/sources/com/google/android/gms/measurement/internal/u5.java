package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: MyApplication */
public final class u5 extends ad {
    public u5(pd pdVar) {
        super(pdVar);
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f22928a.e().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final void n(String str, bd bdVar, com.google.android.gms.internal.measurement.s6 s6Var, r5 r5Var) {
        u5 u5Var;
        String str2;
        URL url;
        byte[] c8;
        h();
        j();
        try {
            url = new URI(bdVar.a()).toURL();
            this.f22755b.K0();
            c8 = s6Var.c();
            u5Var = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            u5Var = this;
            str2 = str;
        }
        try {
            this.f22928a.b().w(new t5(u5Var, str2, url, c8, bdVar.b(), r5Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            u5Var.f22928a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", p5.x(str2), bdVar.a());
        }
    }

    public final void o(v5 v5Var, Map map, r5 r5Var) {
        u5 u5Var;
        URL url;
        h();
        j();
        p3.o.m(v5Var);
        p3.o.m(r5Var);
        cd C0 = this.f22755b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder appendQueryParameter = builder.scheme((String) c5.f21948f.b(null)).encodedAuthority((String) c5.f21951g.b(null)).path("config/app/".concat(String.valueOf(v5Var.r0()))).appendQueryParameter("platform", "android");
        C0.f22928a.w().A();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            url = new URI(uri).toURL();
            u5Var = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            u5Var = this;
        }
        try {
            this.f22928a.b().w(new t5(u5Var, v5Var.o0(), url, null, map, r5Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            u5Var.f22928a.a().o().c("Failed to parse config URL. Not fetching. appId", p5.x(v5Var.o0()), uri);
        }
    }
}
