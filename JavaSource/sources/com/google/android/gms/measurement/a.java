package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.w6;
import com.google.android.gms.measurement.internal.w9;
import java.util.List;
import java.util.Map;
import p3.o;

/* compiled from: MyApplication */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final w6 f21828a;

    /* renamed from: b, reason: collision with root package name */
    private final w9 f21829b;

    public a(w6 w6Var) {
        super(null);
        o.m(w6Var);
        this.f21828a = w6Var;
        this.f21829b = w6Var.B();
    }

    @Override // t4.h0
    public final int D0(String str) {
        this.f21829b.L(str);
        return 25;
    }

    @Override // t4.h0
    public final void H0(String str) {
        w6 w6Var = this.f21828a;
        w6Var.M().j(str, w6Var.f().b());
    }

    @Override // t4.h0
    public final void X(Bundle bundle) {
        this.f21829b.M(bundle);
    }

    @Override // t4.h0
    public final void a(String str, String str2, Bundle bundle) {
        this.f21829b.p(str, str2, bundle);
    }

    @Override // t4.h0
    public final void b(String str, String str2, Bundle bundle) {
        this.f21828a.B().O(str, str2, bundle);
    }

    @Override // t4.h0
    public final List c(String str, String str2) {
        return this.f21829b.P(str, str2);
    }

    @Override // t4.h0
    public final Map d(String str, String str2, boolean z7) {
        return this.f21829b.C(str, str2, z7);
    }

    @Override // t4.h0
    public final String g() {
        return this.f21829b.Q();
    }

    @Override // t4.h0
    public final String i() {
        return this.f21829b.D();
    }

    @Override // t4.h0
    public final String j() {
        return this.f21829b.R();
    }

    @Override // t4.h0
    public final long k() {
        return this.f21828a.C().p0();
    }

    @Override // t4.h0
    public final String l() {
        return this.f21829b.S();
    }

    @Override // t4.h0
    public final void n0(String str) {
        w6 w6Var = this.f21828a;
        w6Var.M().i(str, w6Var.f().b());
    }
}
