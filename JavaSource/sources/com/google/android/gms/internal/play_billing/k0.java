package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21587a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21588b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21589c;

    k0(Object obj, Object obj2, Object obj3) {
        this.f21587a = obj;
        this.f21588b = obj2;
        this.f21589c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f21589c;
        Object obj2 = this.f21588b;
        Object obj3 = this.f21587a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
