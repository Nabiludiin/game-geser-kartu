package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: MyApplication */
public final class xk5 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f18860a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f18861b;

    public final xk5 a(int i7) {
        rx3.h(!this.f18861b);
        this.f18860a.append(i7, true);
        return this;
    }

    public final km5 b() {
        rx3.h(!this.f18861b);
        this.f18861b = true;
        return new km5(this.f18860a, null);
    }
}
