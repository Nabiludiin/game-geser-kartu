package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class ox2 {

    /* renamed from: a, reason: collision with root package name */
    private final n23 f13546a;

    /* renamed from: b, reason: collision with root package name */
    private final c91 f13547b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f13548c;

    /* renamed from: d, reason: collision with root package name */
    private mx2 f13549d;

    public ox2(n23 n23Var, c91 c91Var, Executor executor) {
        this.f13546a = n23Var;
        this.f13547b = c91Var;
        this.f13548c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final x23 b() {
        w03 b8 = this.f13547b.b();
        return this.f13546a.e(b8.f17958d, b8.f17961g, b8.f17965k);
    }

    public final a5.d a() {
        a5.d dVar;
        mx2 mx2Var = this.f13549d;
        if (mx2Var != null) {
            return p64.a(mx2Var);
        }
        if (((Boolean) d10.f6903a.e()).booleanValue()) {
            h64 C = h64.C(this.f13547b.a().e(this.f13546a.c()));
            lx2 lx2Var = new lx2(this);
            Executor executor = this.f13548c;
            dVar = (h64) p64.g((h64) p64.k(C, lx2Var, executor), b52.class, new kx2(this), executor);
        } else {
            mx2 mx2Var2 = new mx2(null, b(), null);
            this.f13549d = mx2Var2;
            dVar = p64.a(mx2Var2);
        }
        return p64.k(dVar, nx2.f13092a, this.f13548c);
    }

    final /* synthetic */ mx2 c() {
        return this.f13549d;
    }

    final /* synthetic */ void d(mx2 mx2Var) {
        this.f13549d = mx2Var;
    }
}
