package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ya0 {

    /* renamed from: a, reason: collision with root package name */
    private final ba0 f19441a;

    /* renamed from: b, reason: collision with root package name */
    private a5.d f19442b;

    ya0(ba0 ba0Var) {
        this.f19441a = ba0Var;
    }

    private final void d() {
        if (this.f19442b == null) {
            final im0 im0Var = new im0();
            this.f19442b = im0Var;
            this.f19441a.b(null).a(new mm0() { // from class: com.google.android.gms.internal.ads.xa0
                @Override // com.google.android.gms.internal.ads.mm0
                public final /* synthetic */ void d(Object obj) {
                    im0.this.b((ca0) obj);
                }
            }, new km0() { // from class: com.google.android.gms.internal.ads.ua0
                @Override // com.google.android.gms.internal.ads.km0
                public final /* synthetic */ void a() {
                    im0.this.e(new ea0("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final cb0 a(String str, ia0 ia0Var, ha0 ha0Var) {
        d();
        return new cb0(this.f19442b, "google.afma.activeView.handleUpdate", ia0Var, ha0Var);
    }

    public final void b(final String str, final y50 y50Var) {
        d();
        this.f19442b = p64.j(this.f19442b, new w54() { // from class: com.google.android.gms.internal.ads.va0
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                ca0 ca0Var = (ca0) obj;
                ca0Var.K(str, y50Var);
                return p64.a(ca0Var);
            }
        }, cm0.f6506g);
    }

    public final void c(final String str, final y50 y50Var) {
        this.f19442b = p64.k(this.f19442b, new hx3() { // from class: com.google.android.gms.internal.ads.wa0
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                ca0 ca0Var = (ca0) obj;
                ca0Var.J(str, y50Var);
                return ca0Var;
            }
        }, cm0.f6506g);
    }
}
