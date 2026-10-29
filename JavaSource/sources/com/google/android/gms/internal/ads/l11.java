package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class l11 implements gr {

    /* renamed from: q, reason: collision with root package name */
    private mr0 f11337q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f11338r;

    /* renamed from: s, reason: collision with root package name */
    private final w01 f11339s;

    /* renamed from: t, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f11340t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11341u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11342v = false;

    /* renamed from: w, reason: collision with root package name */
    private final a11 f11343w = new a11();

    public l11(Executor executor, w01 w01Var, com.google.android.gms.common.util.e eVar) {
        this.f11338r = executor;
        this.f11339s = w01Var;
        this.f11340t = eVar;
    }

    private final void f() {
        try {
            final JSONObject b8 = this.f11339s.b(this.f11343w);
            if (this.f11337q != null) {
                this.f11338r.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.k11
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        l11.this.e(b8);
                    }
                });
            }
        } catch (JSONException e8) {
            v2.n1.l("Failed to call video active view js", e8);
        }
    }

    public final void a(mr0 mr0Var) {
        this.f11337q = mr0Var;
    }

    public final void b() {
        this.f11341u = false;
    }

    public final void c() {
        this.f11341u = true;
        f();
    }

    public final void d(boolean z7) {
        this.f11342v = z7;
    }

    final /* synthetic */ void e(JSONObject jSONObject) {
        String obj = jSONObject.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(obj);
        sb.append(")");
        String sb2 = sb.toString();
        int i7 = v2.n1.f26802b;
        w2.p.a(sb2);
        this.f11337q.c("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void t(fr frVar) {
        boolean z7 = this.f11342v ? false : frVar.f8430j;
        a11 a11Var = this.f11343w;
        a11Var.f4668a = z7;
        a11Var.f4671d = this.f11340t.b();
        a11Var.f4673f = frVar;
        if (this.f11341u) {
            f();
        }
    }
}
