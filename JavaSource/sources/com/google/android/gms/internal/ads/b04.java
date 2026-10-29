package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class b04 extends mz3 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f5448q;

    /* renamed from: r, reason: collision with root package name */
    private int f5449r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ d04 f5450s;

    b04(d04 d04Var, int i7) {
        Objects.requireNonNull(d04Var);
        this.f5450s = d04Var;
        this.f5448q = d04Var.r(i7);
        this.f5449r = i7;
    }

    private final void a() {
        int i7 = this.f5449r;
        if (i7 != -1) {
            d04 d04Var = this.f5450s;
            if (i7 < d04Var.size() && Objects.equals(this.f5448q, d04Var.r(this.f5449r))) {
                return;
            }
        }
        this.f5449r = this.f5450s.l(this.f5448q);
    }

    @Override // com.google.android.gms.internal.ads.mz3, java.util.Map.Entry
    public final Object getKey() {
        return this.f5448q;
    }

    @Override // com.google.android.gms.internal.ads.mz3, java.util.Map.Entry
    public final Object getValue() {
        d04 d04Var = this.f5450s;
        Map f8 = d04Var.f();
        if (f8 != null) {
            return f8.get(this.f5448q);
        }
        a();
        int i7 = this.f5449r;
        if (i7 == -1) {
            return null;
        }
        return d04Var.s(i7);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d04 d04Var = this.f5450s;
        Map f8 = d04Var.f();
        if (f8 != null) {
            return f8.put(this.f5448q, obj);
        }
        a();
        int i7 = this.f5449r;
        if (i7 == -1) {
            d04Var.put(this.f5448q, obj);
            return null;
        }
        Object s7 = d04Var.s(i7);
        d04Var.t(this.f5449r, obj);
        return s7;
    }
}
