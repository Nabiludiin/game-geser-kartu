package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: MyApplication */
public final class p91 extends s2.w2 {

    /* renamed from: q, reason: collision with root package name */
    private final String f13722q;

    /* renamed from: r, reason: collision with root package name */
    private final String f13723r;

    /* renamed from: s, reason: collision with root package name */
    private final String f13724s;

    /* renamed from: t, reason: collision with root package name */
    private final String f13725t;

    /* renamed from: u, reason: collision with root package name */
    private final List f13726u;

    /* renamed from: v, reason: collision with root package name */
    private final long f13727v;

    /* renamed from: w, reason: collision with root package name */
    private final String f13728w;

    /* renamed from: x, reason: collision with root package name */
    private final pa2 f13729x;

    /* renamed from: y, reason: collision with root package name */
    private final Bundle f13730y;

    /* renamed from: z, reason: collision with root package name */
    private final double f13731z;

    public p91(c03 c03Var, String str, pa2 pa2Var, f03 f03Var, String str2) {
        String str3 = null;
        this.f13723r = c03Var == null ? null : c03Var.f6153b0;
        this.f13724s = str2;
        this.f13725t = f03Var == null ? null : f03Var.f7926b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && c03Var != null) {
            try {
                str3 = c03Var.f6192v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f13722q = str3 != null ? str3 : str;
        this.f13726u = pa2Var.h();
        this.f13729x = pa2Var;
        this.f13731z = c03Var == null ? 0.0d : c03Var.f6201z0;
        this.f13727v = r2.t.o().a() / 1000;
        if (!((Boolean) s2.b0.c().d(uy.o7)).booleanValue() || f03Var == null) {
            this.f13730y = new Bundle();
        } else {
            this.f13730y = f03Var.f7935k;
        }
        this.f13728w = (!((Boolean) s2.b0.c().d(uy.la)).booleanValue() || f03Var == null || TextUtils.isEmpty(f03Var.f7933i)) ? "" : f03Var.f7933i;
    }

    @Override // s2.y2
    public final String c() {
        return this.f13722q;
    }

    @Override // s2.y2
    public final String e() {
        return this.f13723r;
    }

    @Override // s2.y2
    public final List f() {
        return this.f13726u;
    }

    @Override // s2.y2
    public final s2.k5 g() {
        pa2 pa2Var = this.f13729x;
        if (pa2Var != null) {
            return pa2Var.g();
        }
        return null;
    }

    @Override // s2.y2
    public final String i() {
        return this.f13724s;
    }

    @Override // s2.y2
    public final Bundle j() {
        return this.f13730y;
    }

    public final long k8() {
        return this.f13727v;
    }

    public final String l8() {
        return this.f13728w;
    }

    public final String m8() {
        return this.f13725t;
    }

    public final double n8() {
        return this.f13731z;
    }
}
