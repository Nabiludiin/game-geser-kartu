package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o85 implements n85, h85 {

    /* renamed from: b, reason: collision with root package name */
    private static final o85 f13226b = new o85(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f13227a;

    private o85(Object obj) {
        this.f13227a = obj;
    }

    public static n85 a(Object obj) {
        v85.a(obj, "instance cannot be null");
        return new o85(obj);
    }

    public static n85 c(Object obj) {
        return obj == null ? f13226b : new o85(obj);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final Object b() {
        return this.f13227a;
    }
}
