package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class e13 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ mr0 f7397a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d01 f7398b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x73 f7399c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v82 f7400d;

    e13(mr0 mr0Var, d01 d01Var, x73 x73Var, v82 v82Var) {
        this.f7397a = mr0Var;
        this.f7398b = d01Var;
        this.f7399c = x73Var;
        this.f7400d = v82Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        d01 d01Var;
        String str = (String) obj;
        mr0 mr0Var = this.f7397a;
        c03 T = mr0Var.T();
        if (T != null && !T.f6167i0) {
            w2.w wVar = T.f6197x0;
            if (((Boolean) s2.b0.c().d(uy.cb)).booleanValue() && (d01Var = this.f7398b) != null && d01.c(str)) {
                d01Var.a(str, this.f7399c, s2.z.e(), wVar);
                return;
            } else {
                this.f7399c.b(str, wVar, null, null);
                return;
            }
        }
        f03 t02 = mr0Var.t0();
        if (t02 == null) {
            r2.t.l().i(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long a8 = r2.t.o().a();
        boolean u7 = r2.t.l().u(mr0Var.getContext());
        boolean z7 = false;
        boolean z8 = ((Boolean) s2.b0.c().d(uy.N6)).booleanValue() && T != null && T.S;
        if (T != null && T.f6157d0 != null) {
            z7 = true;
        }
        this.f7400d.h(new z82(a8, t02.f7926b, str, (u7 || z8 || z7) ? 2 : 1));
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
    }
}
