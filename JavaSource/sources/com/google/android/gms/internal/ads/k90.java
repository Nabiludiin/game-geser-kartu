package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class k90 implements km0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa0 f10930a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r53 f10931b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba0 f10932c;

    k90(ba0 ba0Var, aa0 aa0Var, r53 r53Var) {
        this.f10930a = aa0Var;
        this.f10931b = r53Var;
        Objects.requireNonNull(ba0Var);
        this.f10932c = ba0Var;
    }

    @Override // com.google.android.gms.internal.ads.km0
    public final void a() {
        v2.n1.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        ba0 ba0Var = this.f10932c;
        synchronized (ba0Var.f()) {
            try {
                v2.n1.k("loadNewJavascriptEngine (failure): Lock acquired");
                ba0Var.k(1);
                v2.n1.k("Failed loading new engine. Marking new engine destroyable.");
                this.f10930a.i();
                if (((Boolean) p00.f13597d.e()).booleanValue() && ba0Var.g() != null) {
                    e63 g8 = ba0Var.g();
                    r53 r53Var = this.f10931b;
                    r53Var.h0("Failed loading new engine");
                    r53Var.e(false);
                    g8.b(r53Var.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v2.n1.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
