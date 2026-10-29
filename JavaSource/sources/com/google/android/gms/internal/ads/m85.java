package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class m85 implements w85, h85 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12132c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile w85 f12133a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f12134b = f12132c;

    private m85(w85 w85Var) {
        this.f12133a = w85Var;
    }

    public static w85 a(w85 w85Var) {
        return w85Var instanceof m85 ? w85Var : new m85(w85Var);
    }

    public static h85 c(w85 w85Var) {
        if (w85Var instanceof h85) {
            return (h85) w85Var;
        }
        w85Var.getClass();
        return new m85(w85Var);
    }

    private final synchronized Object d() {
        try {
            Object obj = this.f12134b;
            Object obj2 = f12132c;
            if (obj != obj2) {
                return obj;
            }
            Object b8 = this.f12133a.b();
            Object obj3 = this.f12134b;
            if (obj3 != obj2 && obj3 != b8) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + b8 + ". This is likely due to a circular dependency.");
            }
            this.f12134b = b8;
            this.f12133a = null;
            return b8;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final Object b() {
        Object obj = this.f12134b;
        return obj == f12132c ? d() : obj;
    }
}
