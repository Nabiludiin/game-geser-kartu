package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* compiled from: MyApplication */
public final class q93 extends m93 {

    /* renamed from: a, reason: collision with root package name */
    private final o93 f14314a;

    /* renamed from: c, reason: collision with root package name */
    private cc3 f14316c;

    /* renamed from: d, reason: collision with root package name */
    private bb3 f14317d;

    /* renamed from: g, reason: collision with root package name */
    private final String f14320g;

    /* renamed from: b, reason: collision with root package name */
    private final oa3 f14315b = new oa3();

    /* renamed from: e, reason: collision with root package name */
    private boolean f14318e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14319f = false;

    q93(n93 n93Var, o93 o93Var, String str) {
        this.f14314a = o93Var;
        this.f14320g = str;
        k(null);
        if (o93Var.i() == p93.HTML || o93Var.i() == p93.JAVASCRIPT) {
            this.f14317d = new cb3(str, o93Var.f());
        } else {
            this.f14317d = new fb3(str, o93Var.e(), null);
        }
        this.f14317d.a();
        ka3.a().b(this);
        this.f14317d.j(n93Var);
    }

    private final void k(View view) {
        this.f14316c = new cc3(view);
    }

    @Override // com.google.android.gms.internal.ads.m93
    public final void a() {
        if (this.f14318e || this.f14317d == null) {
            return;
        }
        this.f14318e = true;
        ka3.a().c(this);
        this.f14317d.o(ta3.a().g());
        this.f14317d.n(ia3.a().b());
        this.f14317d.k(this, this.f14314a);
    }

    @Override // com.google.android.gms.internal.ads.m93
    public final void b(View view) {
        if (this.f14319f || i() == view) {
            return;
        }
        k(view);
        this.f14317d.p();
        Collection<q93> e8 = ka3.a().e();
        if (e8 == null || e8.isEmpty()) {
            return;
        }
        for (q93 q93Var : e8) {
            if (q93Var != this && q93Var.i() == view) {
                q93Var.f14316c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m93
    public final void c() {
        if (this.f14319f) {
            return;
        }
        this.f14316c.clear();
        if (!this.f14319f) {
            this.f14315b.c();
        }
        this.f14319f = true;
        this.f14317d.m();
        ka3.a().d(this);
        this.f14317d.b();
        this.f14317d = null;
    }

    @Override // com.google.android.gms.internal.ads.m93
    public final void d(View view, u93 u93Var, String str) {
        if (this.f14319f) {
            return;
        }
        this.f14315b.b(view, u93Var, "Ad overlay");
    }

    public final List f() {
        return this.f14315b.a();
    }

    public final bb3 g() {
        return this.f14317d;
    }

    public final String h() {
        return this.f14320g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View i() {
        return (View) this.f14316c.get();
    }

    public final boolean j() {
        return this.f14318e && !this.f14319f;
    }
}
