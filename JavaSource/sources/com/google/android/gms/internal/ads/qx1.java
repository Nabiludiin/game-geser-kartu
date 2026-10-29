package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class qx1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14662a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ rx1 f14663b;

    qx1(rx1 rx1Var) {
        Objects.requireNonNull(rx1Var);
        this.f14663b = rx1Var;
        this.f14662a = new ConcurrentHashMap();
    }

    public final qx1 a(f03 f03Var) {
        c("gqi", f03Var.f7926b);
        return this;
    }

    public final qx1 b(c03 c03Var) {
        c("aai", c03Var.f6194w);
        c("request_id", c03Var.f6177n0);
        c("ad_format", c03.a(c03Var.f6152b));
        return this;
    }

    public final qx1 c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f14662a.put(str, str2);
        }
        return this;
    }

    public final void d() {
        this.f14663b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.px1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qx1.this.i();
            }
        });
    }

    public final w2.u e() {
        if (!((Boolean) s2.b0.c().d(uy.af)).booleanValue()) {
            d();
            return w2.u.SUCCESS;
        }
        rx1 rx1Var = this.f14663b;
        return rx1Var.c().f(this.f14662a);
    }

    public final void f() {
        this.f14663b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nx1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qx1.this.j();
            }
        });
    }

    public final String g() {
        return this.f14663b.c().c(this.f14662a);
    }

    public final void h() {
        this.f14663b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ox1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qx1.this.k();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f14663b.c().b(this.f14662a);
    }

    final /* synthetic */ void j() {
        this.f14663b.c().g(this.f14662a);
    }

    final /* synthetic */ void k() {
        this.f14663b.c().e(this.f14662a);
    }

    final /* synthetic */ qx1 l() {
        this.f14662a.putAll(this.f14663b.e());
        return this;
    }
}
