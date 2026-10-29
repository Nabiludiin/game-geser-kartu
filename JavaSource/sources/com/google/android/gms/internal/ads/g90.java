package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class g90 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u80 f8717a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v2.x0 f8718b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba0 f8719c;

    g90(ba0 ba0Var, fn fnVar, u80 u80Var, v2.x0 x0Var) {
        this.f8717a = u80Var;
        this.f8718b = x0Var;
        Objects.requireNonNull(ba0Var);
        this.f8719c = ba0Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        v2.n1.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        ba0 ba0Var = this.f8719c;
        synchronized (ba0Var.f()) {
            try {
                v2.n1.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                w2.p.e("JS Engine is requesting an update");
                if (ba0Var.j() == 0) {
                    w2.p.e("Starting reload.");
                    ba0Var.k(2);
                    ba0Var.a(null);
                }
                this.f8717a.J("/requestReload", (y50) this.f8718b.a());
            } catch (Throwable th) {
                throw th;
            }
        }
        v2.n1.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
