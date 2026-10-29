package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: MyApplication */
public final class e91 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7466a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f7467b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f7468c;

    /* renamed from: d, reason: collision with root package name */
    private final p03 f7469d;

    /* renamed from: e, reason: collision with root package name */
    private final w81 f7470e;

    /* renamed from: f, reason: collision with root package name */
    private final pa2 f7471f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7472g;

    /* synthetic */ e91(d91 d91Var, byte[] bArr) {
        this.f7466a = d91Var.i();
        this.f7467b = d91Var.j();
        this.f7468c = d91Var.k();
        this.f7469d = d91Var.l();
        this.f7470e = d91Var.m();
        this.f7471f = d91Var.n();
        this.f7472g = d91Var.o();
    }

    final d91 a() {
        d91 d91Var = new d91();
        d91Var.a(this.f7466a);
        d91Var.b(this.f7467b);
        d91Var.c(this.f7468c);
        d91Var.d(this.f7470e);
        d91Var.g(this.f7471f);
        return d91Var;
    }

    final w03 b() {
        return this.f7467b;
    }

    final p03 c() {
        return this.f7469d;
    }

    final Bundle d() {
        return this.f7468c;
    }

    final w81 e() {
        return this.f7470e;
    }

    final Context f(Context context) {
        return this.f7466a;
    }

    final pa2 g(String str) {
        pa2 pa2Var = this.f7471f;
        return pa2Var != null ? pa2Var : new pa2(str);
    }

    final int h() {
        return this.f7472g;
    }
}
