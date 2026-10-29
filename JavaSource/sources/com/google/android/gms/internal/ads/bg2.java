package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class bg2 implements r2.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f5759a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o03 f5760b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c03 f5761c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ jg2 f5762d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dg2 f5763e;

    bg2(dg2 dg2Var, im0 im0Var, o03 o03Var, c03 c03Var, jg2 jg2Var) {
        this.f5759a = im0Var;
        this.f5760b = o03Var;
        this.f5761c = c03Var;
        this.f5762d = jg2Var;
        Objects.requireNonNull(dg2Var);
        this.f5763e = dg2Var;
    }

    @Override // r2.g
    public final void a(View view) {
        jg2 jg2Var = this.f5762d;
        this.f5759a.b(this.f5763e.d().a(this.f5760b, this.f5761c, view, jg2Var));
    }

    @Override // r2.g
    public final void b() {
    }

    @Override // r2.g
    public final void d() {
    }
}
