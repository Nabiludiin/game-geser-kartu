package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tt1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16357a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16358b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f16359c;

    private tt1(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f16357a = w85Var;
        this.f16358b = w85Var2;
        this.f16359c = w85Var3;
    }

    public static tt1 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new tt1(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        int i7 = ((n91) this.f16359c).a().f17970p.f10839a;
        if (i7 != 0) {
            return i7 + (-1) != 0 ? ((sf2) this.f16358b).b() : ((sf2) this.f16357a).b();
        }
        throw null;
    }
}
