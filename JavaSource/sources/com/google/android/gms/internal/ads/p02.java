package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class p02 implements z91, jd1, ub1 {
    private JSONObject A;
    private JSONObject B;
    private boolean C;
    private boolean D;
    private boolean E;

    /* renamed from: q, reason: collision with root package name */
    private final b12 f13609q;

    /* renamed from: r, reason: collision with root package name */
    private final String f13610r;

    /* renamed from: s, reason: collision with root package name */
    private final String f13611s;

    /* renamed from: v, reason: collision with root package name */
    private p91 f13614v;

    /* renamed from: w, reason: collision with root package name */
    private s2.x2 f13615w;

    /* renamed from: x, reason: collision with root package name */
    private String f13616x = "";

    /* renamed from: y, reason: collision with root package name */
    private String f13617y = "";

    /* renamed from: z, reason: collision with root package name */
    private String f13618z = "";

    /* renamed from: t, reason: collision with root package name */
    private int f13612t = 0;

    /* renamed from: u, reason: collision with root package name */
    private o02 f13613u = o02.AD_REQUESTED;

    p02(b12 b12Var, w03 w03Var, String str) {
        this.f13609q = b12Var;
        this.f13611s = str;
        this.f13610r = w03Var.f17961g;
    }

    private final JSONObject f(p91 p91Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", p91Var.c());
        jSONObject.put("responseSecsSinceEpoch", p91Var.k8());
        jSONObject.put("responseId", p91Var.e());
        if (((Boolean) s2.b0.c().d(uy.la)).booleanValue()) {
            String l8 = p91Var.l8();
            if (!TextUtils.isEmpty(l8)) {
                String valueOf = String.valueOf(l8);
                int i7 = v2.n1.f26802b;
                w2.p.a("Bidding data: ".concat(valueOf));
                jSONObject.put("biddingData", new JSONObject(l8));
            }
        }
        if (!TextUtils.isEmpty(this.f13616x)) {
            jSONObject.put("adRequestUrl", this.f13616x);
        }
        if (!TextUtils.isEmpty(this.f13617y)) {
            jSONObject.put("postBody", this.f13617y);
        }
        if (!TextUtils.isEmpty(this.f13618z)) {
            jSONObject.put("adResponseBody", this.f13618z);
        }
        Object obj = this.A;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.B;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) s2.b0.c().d(uy.oa)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.E);
        }
        JSONArray jSONArray = new JSONArray();
        for (s2.k5 k5Var : p91Var.f()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", k5Var.f26156q);
            jSONObject2.put("latencyMillis", k5Var.f26157r);
            if (((Boolean) s2.b0.c().d(uy.ma)).booleanValue()) {
                jSONObject2.put("credentials", s2.z.a().u(k5Var.f26159t));
            }
            s2.x2 x2Var = k5Var.f26158s;
            jSONObject2.put("error", x2Var == null ? null : g(x2Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject g(s2.x2 x2Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", x2Var.f26261s);
        jSONObject.put("errorCode", x2Var.f26259q);
        jSONObject.put("errorDescription", x2Var.f26260r);
        s2.x2 x2Var2 = x2Var.f26262t;
        jSONObject.put("underlyingError", x2Var2 == null ? null : g(x2Var2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ub1
    public final void H(r41 r41Var) {
        b12 b12Var = this.f13609q;
        if (b12Var.t()) {
            this.f13614v = r41Var.d();
            this.f13613u = o02.AD_LOADED;
            if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue()) {
                b12Var.l(this.f13610r, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void J(eh0 eh0Var) {
        if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue()) {
            return;
        }
        b12 b12Var = this.f13609q;
        if (b12Var.t()) {
            b12Var.l(this.f13610r, this);
        }
    }

    public final boolean a() {
        return this.f13613u != o02.AD_REQUESTED;
    }

    public final String b() {
        return this.f13611s;
    }

    public final void c() {
        this.C = true;
    }

    public final void d() {
        this.D = true;
    }

    public final JSONObject e() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.f13613u);
        jSONObject2.put("format", c03.a(this.f13612t));
        if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.C);
            if (this.C) {
                jSONObject2.put("shown", this.D);
            }
        }
        p91 p91Var = this.f13614v;
        if (p91Var != null) {
            jSONObject = f(p91Var);
        } else {
            s2.x2 x2Var = this.f13615w;
            JSONObject jSONObject3 = null;
            if (x2Var != null && (iBinder = x2Var.f26263u) != null) {
                p91 p91Var2 = (p91) iBinder;
                jSONObject3 = f(p91Var2);
                if (p91Var2.f().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(g(this.f13615w));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void o(s2.x2 x2Var) {
        b12 b12Var = this.f13609q;
        if (b12Var.t()) {
            this.f13613u = o02.AD_LOAD_FAILED;
            this.f13615w = x2Var;
            if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue()) {
                b12Var.l(this.f13610r, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jd1
    public final void x(o03 o03Var) {
        b12 b12Var = this.f13609q;
        if (b12Var.t()) {
            n03 n03Var = o03Var.f13137b;
            List list = n03Var.f12529a;
            if (!list.isEmpty()) {
                this.f13612t = ((c03) list.get(0)).f6152b;
            }
            f03 f03Var = n03Var.f12530b;
            String str = f03Var.f7936l;
            if (!TextUtils.isEmpty(str)) {
                this.f13616x = str;
            }
            String str2 = f03Var.f7937m;
            if (!TextUtils.isEmpty(str2)) {
                this.f13617y = str2;
            }
            JSONObject jSONObject = f03Var.f7940p;
            if (jSONObject.length() > 0) {
                this.B = jSONObject;
            }
            if (((Boolean) s2.b0.c().d(uy.oa)).booleanValue()) {
                if (!b12Var.n()) {
                    this.E = true;
                    return;
                }
                String str3 = f03Var.f7938n;
                if (!TextUtils.isEmpty(str3)) {
                    this.f13618z = str3;
                }
                JSONObject jSONObject2 = f03Var.f7939o;
                if (jSONObject2.length() > 0) {
                    this.A = jSONObject2;
                }
                JSONObject jSONObject3 = this.A;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f13618z)) {
                    length += this.f13618z.length();
                }
                b12Var.m(length);
            }
        }
    }
}
