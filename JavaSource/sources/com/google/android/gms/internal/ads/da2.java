package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class da2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7013a;

    /* renamed from: b, reason: collision with root package name */
    private final w2.a f7014b;

    /* renamed from: c, reason: collision with root package name */
    private final c03 f7015c;

    /* renamed from: d, reason: collision with root package name */
    private final mr0 f7016d;

    /* renamed from: e, reason: collision with root package name */
    private final rx1 f7017e;

    /* renamed from: f, reason: collision with root package name */
    private z93 f7018f;

    da2(Context context, w2.a aVar, c03 c03Var, mr0 mr0Var, rx1 rx1Var) {
        this.f7013a = context;
        this.f7014b = aVar;
        this.f7015c = c03Var;
        this.f7016d = mr0Var;
        this.f7017e = rx1Var;
    }

    public final synchronized boolean a(boolean z7) {
        mr0 mr0Var;
        c03 c03Var = this.f7015c;
        if (c03Var.T) {
            if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue()) {
                if (((Boolean) s2.b0.c().d(uy.S5)).booleanValue() && (mr0Var = this.f7016d) != null) {
                    if (this.f7018f != null) {
                        int i7 = v2.n1.f26802b;
                        w2.p.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!r2.t.y().h(this.f7013a)) {
                        int i8 = v2.n1.f26802b;
                        w2.p.f("Unable to initialize omid.");
                        return false;
                    }
                    if (c03Var.V.b()) {
                        z93 e8 = r2.t.y().e(this.f7014b, mr0Var.Q(), true);
                        if (((Boolean) s2.b0.c().d(uy.T5)).booleanValue()) {
                            rx1 rx1Var = this.f7017e;
                            String str = e8 != null ? "1" : "0";
                            qx1 a8 = rx1Var.a();
                            a8.c("omid_js_session_success", str);
                            a8.d();
                        }
                        if (e8 == null) {
                            int i9 = v2.n1.f26802b;
                            w2.p.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i10 = v2.n1.f26802b;
                        w2.p.e("Created omid javascript session service.");
                        this.f7018f = e8;
                        mr0Var.e1(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean b() {
        return this.f7018f != null;
    }

    public final synchronized void c() {
        mr0 mr0Var;
        try {
            z93 z93Var = this.f7018f;
            if (z93Var == null || (mr0Var = this.f7016d) == null) {
                return;
            }
            Iterator it = mr0Var.D().iterator();
            while (it.hasNext()) {
                r2.t.y().i(z93Var, (View) it.next());
            }
            mr0Var.B("onSdkLoaded", z04.a());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        mr0 mr0Var;
        if (this.f7018f == null || (mr0Var = this.f7016d) == null) {
            return;
        }
        mr0Var.B("onSdkImpression", z04.a());
    }

    public final synchronized void e(y93 y93Var) {
        mr0 mr0Var;
        z93 z93Var = this.f7018f;
        if (z93Var == null || (mr0Var = this.f7016d) == null) {
            return;
        }
        r2.t.y().d(z93Var, y93Var);
        this.f7018f = null;
        mr0Var.e1(null);
    }

    public final synchronized void f(View view) {
        z93 z93Var = this.f7018f;
        if (z93Var != null) {
            r2.t.y().i(z93Var, view);
        }
    }
}
