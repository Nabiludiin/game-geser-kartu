package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* compiled from: MyApplication */
final class hy4 implements ku5 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f9761a;

    /* renamed from: b, reason: collision with root package name */
    private final ni5 f9762b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a05 f9763c;

    public hy4(a05 a05Var, ni5 ni5Var) {
        Objects.requireNonNull(a05Var);
        this.f9763c = a05Var;
        this.f9761a = new HashMap();
        this.f9762b = ni5Var;
    }

    private final void d(iu5 iu5Var) {
        ni5 ni5Var = (ni5) this.f9761a.remove(iu5Var);
        ni5Var.getClass();
        gz4 gz4Var = (gz4) this.f9763c.l().get(ni5Var);
        if (gz4Var != null) {
            gz4Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized iu5 a() {
        iu5 a8;
        a05 a05Var = this.f9763c;
        ru5 k7 = a05Var.k();
        HashMap hashMap = this.f9761a;
        a8 = k7.a();
        ni5 ni5Var = this.f9762b;
        hashMap.put(a8, ni5Var);
        gz4 gz4Var = (gz4) a05Var.l().get(ni5Var);
        if (gz4Var != null) {
            gz4Var.a();
        }
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized void b(iu5 iu5Var) {
        this.f9763c.k().b(iu5Var);
        d(iu5Var);
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized void c(ju5 ju5Var) {
        this.f9763c.k().c(ju5Var);
        while (ju5Var != null) {
            d(ju5Var.h());
            ju5Var = ju5Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.ku5
    public final synchronized void h() {
        this.f9763c.k().h();
    }
}
