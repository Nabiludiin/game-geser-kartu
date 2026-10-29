package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class f90 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f8085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa0 f8086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u80 f8087c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ba0 f8088d;

    f90(ba0 ba0Var, long j7, aa0 aa0Var, u80 u80Var) {
        this.f8085a = j7;
        this.f8086b = aa0Var;
        this.f8087c = u80Var;
        Objects.requireNonNull(ba0Var);
        this.f8088d = ba0Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        long a8 = r2.t.o().a() - this.f8085a;
        StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(a8);
        sb.append(" ms.");
        v2.n1.k(sb.toString());
        v2.n1.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        ba0 ba0Var = this.f8088d;
        synchronized (ba0Var.f()) {
            v2.n1.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            aa0 aa0Var = this.f8086b;
            if (aa0Var.e() != -1 && aa0Var.e() != 1) {
                ba0Var.k(0);
                u80 u80Var = this.f8087c;
                u80Var.K("/log", x50.f18548g);
                u80Var.K("/result", x50.f18556o);
                aa0Var.b(u80Var);
                ba0Var.i(aa0Var);
                v2.n1.k("Successfully loaded JS Engine.");
                v2.n1.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            v2.n1.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
