package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class hr5 implements wp5 {

    /* renamed from: a, reason: collision with root package name */
    private final wk3 f9632a;

    /* renamed from: b, reason: collision with root package name */
    private final rq5 f9633b;

    /* renamed from: c, reason: collision with root package name */
    private int f9634c;

    /* renamed from: d, reason: collision with root package name */
    private final uu5 f9635d;

    public hr5(wk3 wk3Var, final s2 s2Var) {
        rq5 rq5Var = new rq5() { // from class: com.google.android.gms.internal.ads.gr5
            @Override // com.google.android.gms.internal.ads.rq5
            public final /* synthetic */ sq5 a(ni5 ni5Var) {
                return new yo5(s2.this);
            }
        };
        uu5 uu5Var = new uu5(-1);
        this.f9632a = wk3Var;
        this.f9633b = rq5Var;
        this.f9635d = uu5Var;
        this.f9634c = 1048576;
    }

    public final hr5 a(int i7) {
        this.f9634c = i7;
        return this;
    }

    public final ir5 b(j9 j9Var) {
        j9Var.f10399b.getClass();
        return new ir5(j9Var, this.f9632a, this.f9633b, jm5.f10648a, this.f9635d, this.f9634c, 0, null, null, null);
    }
}
