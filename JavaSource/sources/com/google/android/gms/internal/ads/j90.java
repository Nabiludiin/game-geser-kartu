package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class j90 implements mm0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa0 f10404a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r53 f10405b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba0 f10406c;

    j90(ba0 ba0Var, aa0 aa0Var, r53 r53Var) {
        this.f10404a = aa0Var;
        this.f10405b = r53Var;
        Objects.requireNonNull(ba0Var);
        this.f10406c = ba0Var;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        v2.n1.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        ba0 ba0Var = this.f10406c;
        synchronized (ba0Var.f()) {
            try {
                v2.n1.k("loadNewJavascriptEngine (success): Lock acquired");
                ba0Var.k(0);
                if (ba0Var.h() != null && this.f10404a != ba0Var.h()) {
                    v2.n1.k("New JS engine is loaded, marking previous one as destroyable.");
                    ba0Var.h().i();
                }
                ba0Var.i(this.f10404a);
                if (((Boolean) p00.f13597d.e()).booleanValue() && ba0Var.g() != null) {
                    e63 g8 = ba0Var.g();
                    r53 r53Var = this.f10405b;
                    r53Var.e(true);
                    g8.b(r53Var.n());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v2.n1.k("loadNewJavascriptEngine (success): Lock released");
    }
}
