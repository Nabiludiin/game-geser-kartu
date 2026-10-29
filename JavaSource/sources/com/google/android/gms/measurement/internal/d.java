package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class d extends c {

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.b4 f22016g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f22017h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, String str, int i7, com.google.android.gms.internal.measurement.b4 b4Var) {
        super(str, i7);
        Objects.requireNonNull(eVar);
        this.f22017h = eVar;
        this.f22016g = b4Var;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final int a() {
        return this.f22016g.G();
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l7, Long l8, com.google.android.gms.internal.measurement.l7 l7Var, boolean z7) {
        com.google.android.gms.internal.measurement.ge.a();
        w6 w6Var = this.f22017h.f22928a;
        boolean H = w6Var.w().H(this.f21912a, c5.E0);
        com.google.android.gms.internal.measurement.b4 b4Var = this.f22016g;
        boolean J = b4Var.J();
        boolean K = b4Var.K();
        boolean M = b4Var.M();
        Object[] objArr = J || K || M;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z7 && objArr != true) {
            w6Var.a().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f21913b), b4Var.F() ? Integer.valueOf(b4Var.G()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.v3 I = b4Var.I();
        boolean K2 = I.K();
        if (l7Var.K()) {
            if (I.H()) {
                bool = c.e(c.g(l7Var.L(), I.I()), K2);
            } else {
                w6Var.a().r().b("No number filter for long property. property", w6Var.D().c(l7Var.H()));
            }
        } else if (l7Var.O()) {
            if (I.H()) {
                bool = c.e(c.h(l7Var.P(), I.I()), K2);
            } else {
                w6Var.a().r().b("No number filter for double property. property", w6Var.D().c(l7Var.H()));
            }
        } else if (!l7Var.I()) {
            w6Var.a().r().b("User property has no value, property", w6Var.D().c(l7Var.H()));
        } else if (I.F()) {
            bool = c.e(c.f(l7Var.J(), I.G(), w6Var.a()), K2);
        } else if (!I.H()) {
            w6Var.a().r().b("No string or number filter defined. property", w6Var.D().c(l7Var.H()));
        } else if (td.O(l7Var.J())) {
            bool = c.e(c.i(l7Var.J(), I.I()), K2);
        } else {
            w6Var.a().r().c("Invalid user property value for Numeric number filter. property, value", w6Var.D().c(l7Var.H()), l7Var.J());
        }
        w6Var.a().w().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f21914c = Boolean.TRUE;
        if (M && !bool.booleanValue()) {
            return true;
        }
        if (!z7 || b4Var.J()) {
            this.f21915d = bool;
        }
        if (bool.booleanValue() && objArr != false && l7Var.F()) {
            long G = l7Var.G();
            if (l7 != null) {
                G = l7.longValue();
            }
            if (H && b4Var.J() && !b4Var.K() && l8 != null) {
                G = l8.longValue();
            }
            if (b4Var.K()) {
                this.f21917f = Long.valueOf(G);
            } else {
                this.f21916e = Long.valueOf(G);
            }
        }
        return true;
    }
}
