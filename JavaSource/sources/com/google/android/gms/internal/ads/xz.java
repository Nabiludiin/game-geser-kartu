package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class xz extends androidx.browser.customtabs.b {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f19311a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final List f19312b = Arrays.asList(((String) s2.b0.c().d(uy.Ua)).split(","));

    /* renamed from: c, reason: collision with root package name */
    private final a00 f19313c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.browser.customtabs.b f19314d;

    /* renamed from: e, reason: collision with root package name */
    private final wx1 f19315e;

    xz(a00 a00Var, androidx.browser.customtabs.b bVar, wx1 wx1Var) {
        this.f19314d = bVar;
        this.f19313c = a00Var;
        this.f19315e = wx1Var;
    }

    private final void m(String str) {
        b3.c.e(this.f19315e, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.b
    public final void a(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            bVar.a(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle b(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            return bVar.b(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void d(int i7, int i8, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            bVar.d(i7, i8, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void e(Bundle bundle) {
        this.f19311a.set(false);
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            bVar.e(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void g(int i7, Bundle bundle) {
        this.f19311a.set(false);
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            bVar.g(i7, bundle);
        }
        a00 a00Var = this.f19313c;
        a00Var.g(r2.t.o().a());
        List list = this.f19312b;
        if (list == null || !list.contains(String.valueOf(i7))) {
            return;
        }
        a00Var.c();
        m("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.b
    public final void h(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f19311a.set(true);
                m("pact_con");
                this.f19313c.d(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e8) {
            v2.n1.l("Message is not in JSON format: ", e8);
        }
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            bVar.h(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void i(int i7, Uri uri, boolean z7, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.f19314d;
        if (bVar != null) {
            bVar.i(i7, uri, z7, bundle);
        }
    }

    public final Boolean l() {
        return Boolean.valueOf(this.f19311a.get());
    }
}
