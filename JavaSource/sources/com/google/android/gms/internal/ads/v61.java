package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class v61 implements bg1, qb1 {

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f17400q;

    /* renamed from: r, reason: collision with root package name */
    private final x61 f17401r;

    /* renamed from: s, reason: collision with root package name */
    private final w03 f17402s;

    /* renamed from: t, reason: collision with root package name */
    private final String f17403t;

    v61(com.google.android.gms.common.util.e eVar, x61 x61Var, w03 w03Var, String str) {
        this.f17400q = eVar;
        this.f17401r = x61Var;
        this.f17402s = w03Var;
        this.f17403t = str;
    }

    @Override // com.google.android.gms.internal.ads.bg1
    public final void a() {
        this.f17401r.d(this.f17403t, this.f17400q.b());
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        com.google.android.gms.common.util.e eVar = this.f17400q;
        this.f17401r.e(this.f17402s.f17961g, this.f17403t, eVar.b());
    }
}
