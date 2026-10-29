package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class y85 {

    /* renamed from: a, reason: collision with root package name */
    private final List f19423a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19424b;

    /* synthetic */ y85(int i7, int i8, x85 x85Var) {
        this.f19423a = k85.a(i7);
        this.f19424b = k85.a(i8);
    }

    public final y85 a(w85 w85Var) {
        this.f19423a.add(w85Var);
        return this;
    }

    public final y85 b(w85 w85Var) {
        this.f19424b.add(w85Var);
        return this;
    }

    public final z85 c() {
        return new z85(this.f19423a, this.f19424b, null);
    }
}
