package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: MyApplication */
public final class cd extends vc {
    cd(pd pdVar) {
        super(pdVar);
    }

    private final String k(String str) {
        String x7 = this.f22755b.D0().x(str);
        if (TextUtils.isEmpty(x7)) {
            return (String) c5.f21979r.b(null);
        }
        Uri parse = Uri.parse((String) c5.f21979r.b(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(x7).length() + 1 + String.valueOf(authority).length());
        sb.append(x7);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }

    private static final boolean l(String str) {
        String str2 = (String) c5.f21983t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final bd i(String str) {
        v5 J0;
        pd pdVar = this.f22755b;
        v5 J02 = pdVar.F0().J0(str);
        bd bdVar = null;
        if (J02 == null || !J02.V()) {
            return new bd(k(str), Collections.EMPTY_MAP, t4.k0.GOOGLE_ANALYTICS, null);
        }
        com.google.android.gms.internal.measurement.c7 G = com.google.android.gms.internal.measurement.j7.G();
        G.y(2);
        G.x((com.google.android.gms.internal.measurement.e7) p3.o.m(com.google.android.gms.internal.measurement.e7.c(J02.M())));
        String p02 = J02.p0();
        com.google.android.gms.internal.measurement.a5 w7 = pdVar.D0().w(str);
        if (w7 == null || (J0 = pdVar.F0().J0(str)) == null || ((!w7.T() || w7.U().H() != 100) && !this.f22928a.C().P(str, J0.l0()) && (TextUtils.isEmpty(p02) || Math.abs(p02.hashCode() % 100) >= w7.U().H()))) {
            G.z(3);
            return new bd(k(str), Collections.EMPTY_MAP, t4.k0.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.j7) G.s());
        }
        String o02 = J02.o0();
        G.y(2);
        com.google.android.gms.internal.measurement.a5 w8 = pdVar.D0().w(J02.o0());
        if (w8 == null || !w8.T()) {
            this.f22928a.a().w().b("[sgtm] Missing sgtm_setting in remote config. appId", o02);
            G.z(4);
        } else {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(J02.l0())) {
                hashMap.put("x-gtm-server-preview", J02.l0());
            }
            String I = w8.U().I();
            com.google.android.gms.internal.measurement.e7 c8 = com.google.android.gms.internal.measurement.e7.c(J02.M());
            if (c8 != null && c8 != com.google.android.gms.internal.measurement.e7.CLIENT_UPLOAD_ELIGIBLE) {
                G.x(c8);
            } else if (l(J02.o0())) {
                G.x(com.google.android.gms.internal.measurement.e7.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(I)) {
                G.x(com.google.android.gms.internal.measurement.e7.MISSING_SGTM_SERVER_URL);
            } else {
                this.f22928a.a().w().b("[sgtm] Eligible for client side upload. appId", o02);
                G.y(3);
                G.x(com.google.android.gms.internal.measurement.e7.CLIENT_UPLOAD_ELIGIBLE);
                bdVar = new bd(I, hashMap, t4.k0.SGTM_CLIENT, (com.google.android.gms.internal.measurement.j7) G.s());
            }
            w8.U().F();
            w8.U().G();
            w6 w6Var = this.f22928a;
            w6Var.c();
            if (TextUtils.isEmpty(I)) {
                G.z(6);
                w6Var.a().w().b("[sgtm] Local service, missing sgtm_server_url", J02.o0());
            } else {
                w6Var.a().w().b("[sgtm] Eligible for local service direct upload. appId", o02);
                G.y(5);
                G.z(2);
                bdVar = new bd(I, hashMap, t4.k0.SGTM, (com.google.android.gms.internal.measurement.j7) G.s());
            }
        }
        return bdVar != null ? bdVar : new bd(k(str), Collections.EMPTY_MAP, t4.k0.GOOGLE_ANALYTICS, (com.google.android.gms.internal.measurement.j7) G.s());
    }

    final boolean j(String str, com.google.android.gms.internal.measurement.e7 e7Var) {
        com.google.android.gms.internal.measurement.a5 w7;
        h();
        return (e7Var != com.google.android.gms.internal.measurement.e7.CLIENT_UPLOAD_ELIGIBLE || l(str) || (w7 = this.f22755b.D0().w(str)) == null || !w7.T() || w7.U().I().isEmpty()) ? false : true;
    }
}
