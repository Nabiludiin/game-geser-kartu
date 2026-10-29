package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ev1 {

    /* renamed from: a, reason: collision with root package name */
    private final t13 f7832a;

    /* renamed from: b, reason: collision with root package name */
    private final bv1 f7833b;

    ev1(t13 t13Var, bv1 bv1Var) {
        this.f7832a = t13Var;
        this.f7833b = bv1Var;
    }

    public final v13 a(String str, JSONObject jSONObject) {
        nb0 v7;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                v7 = new lc0(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                v7 = new lc0(new zzbub());
            } else {
                kb0 d8 = d();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        v7 = d8.W(string) ? d8.v("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : d8.l0(string) ? d8.v(string) : d8.v("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e8) {
                        int i7 = v2.n1.f26802b;
                        w2.p.d("Invalid custom event.", e8);
                    }
                }
                v7 = d8.v(str);
            }
            v13 v13Var = new v13(v7);
            this.f7833b.a(str, v13Var);
            return v13Var;
        } catch (Throwable th) {
            if (((Boolean) s2.b0.c().d(uy.ra)).booleanValue()) {
                this.f7833b.a(str, null);
            }
            throw new d13(th);
        }
    }

    public final id0 b(String str) {
        id0 y7 = d().y(str);
        this.f7833b.b(str, y7);
        return y7;
    }

    public final boolean c() {
        return this.f7832a.d() != null;
    }

    final kb0 d() {
        kb0 d8 = this.f7832a.d();
        if (d8 != null) {
            return d8;
        }
        int i7 = v2.n1.f26802b;
        w2.p.f("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
