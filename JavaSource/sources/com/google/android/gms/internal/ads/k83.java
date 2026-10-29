package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class k83 extends s2.g1 {

    /* renamed from: q, reason: collision with root package name */
    private final q83 f10924q;

    /* renamed from: r, reason: collision with root package name */
    private final d83 f10925r;

    k83(q83 q83Var, d83 d83Var) {
        this.f10924q = q83Var;
        this.f10925r = d83Var;
    }

    @Override // s2.h1
    public final s2.m4 H1(int i7, String str) {
        k2.c c8 = k2.c.c(i7);
        if (c8 == null) {
            return null;
        }
        return this.f10925r.f(c8, str);
    }

    @Override // s2.h1
    public final int H3(int i7, String str) {
        k2.c c8 = k2.c.c(i7);
        if (c8 == null) {
            return 0;
        }
        return this.f10925r.g(c8, str);
    }

    @Override // s2.h1
    public final bt K0(String str) {
        return this.f10925r.d(str);
    }

    @Override // s2.h1
    public final Bundle N(int i7) {
        Map h8 = this.f10925r.h(i7);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : h8.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), q3.e.a((s2.m4) entry.getValue()));
        }
        return bundle;
    }

    @Override // s2.h1
    public final s2.v0 O0(String str) {
        return this.f10925r.e(str);
    }

    @Override // s2.h1
    public final boolean V0(String str) {
        return this.f10924q.f(str);
    }

    @Override // s2.h1
    public final void V1(List list, s2.c1 c1Var) {
        this.f10924q.a(list, c1Var);
    }

    @Override // s2.h1
    public final ki0 X0(String str) {
        return this.f10925r.c(str);
    }

    @Override // s2.h1
    public final ki0 a0(String str) {
        return this.f10924q.c(str);
    }

    @Override // s2.h1
    public final bt c0(String str) {
        return this.f10924q.e(str);
    }

    @Override // s2.h1
    public final boolean f2(String str, s2.m4 m4Var, s2.e1 e1Var) {
        return this.f10925r.a(str, m4Var, e1Var);
    }

    @Override // s2.h1
    public final boolean f6(int i7, String str) {
        k2.c c8 = k2.c.c(i7);
        if (c8 == null) {
            return false;
        }
        return this.f10925r.i(c8, str);
    }

    @Override // s2.h1
    public final s2.v0 h0(String str) {
        return this.f10924q.g(str);
    }

    @Override // s2.h1
    public final boolean p0(String str) {
        return this.f10924q.d(str);
    }

    @Override // s2.h1
    public final boolean u(String str) {
        return this.f10924q.b(str);
    }

    @Override // s2.h1
    public final void w0(int i7) {
        this.f10925r.j(i7);
    }

    @Override // s2.h1
    public final boolean z7(int i7, String str) {
        k2.c c8 = k2.c.c(i7);
        if (c8 == null) {
            return false;
        }
        return this.f10925r.b(c8, str);
    }

    @Override // s2.h1
    public final void Y4(kb0 kb0Var) {
    }
}
