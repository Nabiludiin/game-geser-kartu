package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* compiled from: MyApplication */
final class v0 extends j0 {

    /* renamed from: t, reason: collision with root package name */
    private final transient Object[] f21756t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f21757u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f21758v;

    v0(Object[] objArr, int i7, int i8) {
        this.f21756t = objArr;
        this.f21757u = i7;
        this.f21758v = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        w.a(i7, this.f21758v, "index");
        Object obj = this.f21756t[i7 + i7 + this.f21757u];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.g0
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21758v;
    }
}
