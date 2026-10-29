package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class a95 implements w85 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4834c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile w85 f4835a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f4836b = f4834c;

    private a95(w85 w85Var) {
        this.f4835a = w85Var;
    }

    public static w85 a(w85 w85Var) {
        return !(w85Var instanceof a95) ? w85Var instanceof m85 ? w85Var : new a95(w85Var) : w85Var;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final Object b() {
        Object obj = this.f4836b;
        if (obj != f4834c) {
            return obj;
        }
        w85 w85Var = this.f4835a;
        if (w85Var == null) {
            return this.f4836b;
        }
        Object b8 = w85Var.b();
        this.f4836b = b8;
        this.f4835a = null;
        return b8;
    }
}
