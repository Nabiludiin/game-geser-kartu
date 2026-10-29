package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class w51 {

    /* renamed from: a, reason: collision with root package name */
    private final b42 f18038a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f18039b;

    /* renamed from: c, reason: collision with root package name */
    private final f53 f18040c;

    /* renamed from: d, reason: collision with root package name */
    private final py0 f18041d;

    /* renamed from: e, reason: collision with root package name */
    private final ge2 f18042e;

    /* renamed from: f, reason: collision with root package name */
    private final vf1 f18043f;

    /* renamed from: g, reason: collision with root package name */
    private o03 f18044g;

    /* renamed from: h, reason: collision with root package name */
    private final n52 f18045h;

    /* renamed from: i, reason: collision with root package name */
    private final z81 f18046i;

    /* renamed from: j, reason: collision with root package name */
    private final Executor f18047j;

    /* renamed from: k, reason: collision with root package name */
    private final y42 f18048k;

    /* renamed from: l, reason: collision with root package name */
    private final pa2 f18049l;

    w51(b42 b42Var, w03 w03Var, f53 f53Var, py0 py0Var, ge2 ge2Var, vf1 vf1Var, o03 o03Var, n52 n52Var, z81 z81Var, Executor executor, y42 y42Var, pa2 pa2Var) {
        this.f18038a = b42Var;
        this.f18039b = w03Var;
        this.f18040c = f53Var;
        this.f18041d = py0Var;
        this.f18042e = ge2Var;
        this.f18043f = vf1Var;
        this.f18044g = o03Var;
        this.f18045h = n52Var;
        this.f18046i = z81Var;
        this.f18047j = executor;
        this.f18048k = y42Var;
        this.f18049l = pa2Var;
    }

    public final a5.d a(a5.d dVar) {
        if (this.f18044g != null) {
            f53 f53Var = this.f18040c;
            z43 z43Var = z43.SERVER_TRANSACTION;
            Objects.requireNonNull(f53Var);
            return q43.a(p64.a(this.f18044g), z43Var, f53Var).i();
        }
        r2.t.n().b();
        w43 a8 = this.f18040c.a(z43.SERVER_TRANSACTION, dVar);
        final y42 y42Var = this.f18048k;
        Objects.requireNonNull(y42Var);
        return a8.c(new w54() { // from class: com.google.android.gms.internal.ads.v51
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return y42.this.a((eh0) obj);
            }
        }).i();
    }

    public final a5.d b() {
        s2.b5 b5Var = this.f18039b.f17958d;
        if (b5Var.N == null && b5Var.I == null) {
            return a(this.f18046i.b());
        }
        f53 f53Var = this.f18040c;
        z43 z43Var = z43.PRELOADED_LOADER;
        Objects.requireNonNull(f53Var);
        return q43.a(this.f18038a.a(), z43Var, f53Var).i();
    }

    public final a5.d c(a5.d dVar) {
        w43 c8 = this.f18040c.a(z43.RENDERER, dVar).b(new j43() { // from class: com.google.android.gms.internal.ads.u51
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                o03 o03Var = (o03) obj;
                w51.this.i(o03Var);
                return o03Var;
            }
        }).c(this.f18042e);
        if (!((Boolean) s2.b0.c().d(uy.f17115h6)).booleanValue()) {
            c8 = c8.h(((Integer) s2.b0.c().d(uy.f17124i6)).intValue(), TimeUnit.SECONDS);
        }
        return c8.i();
    }

    public final vf1 d() {
        return this.f18043f;
    }

    public final a5.d e(final u23 u23Var) {
        l43 i7 = this.f18040c.a(z43.GET_CACHE_KEY, this.f18046i.b()).c(new w54() { // from class: com.google.android.gms.internal.ads.t51
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return w51.this.j(u23Var, (eh0) obj);
            }
        }).i();
        p64.r(i7, new r51(this), this.f18047j);
        return i7;
    }

    public final a5.d f(eh0 eh0Var) {
        l43 i7 = this.f18040c.a(z43.NOTIFY_CACHE_HIT, this.f18045h.b(eh0Var)).i();
        p64.r(i7, new s51(this), this.f18047j);
        return i7;
    }

    public final s2.x2 g(Throwable th) {
        return z13.b(th, this.f18049l);
    }

    public final void h(o03 o03Var) {
        this.f18044g = o03Var;
    }

    final /* synthetic */ o03 i(o03 o03Var) {
        this.f18041d.a(o03Var);
        return o03Var;
    }

    final /* synthetic */ a5.d j(u23 u23Var, eh0 eh0Var) {
        eh0Var.f7632y = u23Var;
        return this.f18045h.a(eh0Var);
    }

    final /* synthetic */ vf1 k() {
        return this.f18043f;
    }
}
