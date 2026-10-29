package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class hd2 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c03 f9448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ id2 f9449b;

    hd2(id2 id2Var, c03 c03Var) {
        this.f9448a = c03Var;
        Objects.requireNonNull(id2Var);
        this.f9449b = id2Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        id2 id2Var = this.f9449b;
        synchronized (id2Var) {
            try {
                jd2 c8 = id2Var.c();
                c03 c03Var = this.f9448a;
                c8.c(th, c03Var);
                c03 a8 = id2Var.c().a();
                if (c03Var.f6193v0) {
                    while (a8 != null) {
                        id2Var.b(a8);
                        a8 = id2Var.c().a();
                    }
                } else if (a8 != null) {
                    id2Var.b(a8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        id2 id2Var = this.f9449b;
        zd2 zd2Var = (zd2) obj;
        synchronized (id2Var) {
            try {
                id2Var.c().b(zd2Var, this.f9448a);
                c03 a8 = id2Var.c().a();
                if (a8 != null) {
                    id2Var.b(a8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
