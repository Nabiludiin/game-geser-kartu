package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class ti1 {

    /* renamed from: a, reason: collision with root package name */
    private final List f16209a;

    /* renamed from: b, reason: collision with root package name */
    private final x73 f16210b;

    /* renamed from: c, reason: collision with root package name */
    private final w2.w f16211c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16212d;

    public ti1(c03 c03Var, x73 x73Var) {
        this.f16209a = c03Var.f6180p;
        this.f16210b = x73Var;
        this.f16211c = c03Var.f6197x0;
    }

    public final void a() {
        if (this.f16212d) {
            return;
        }
        this.f16210b.a(this.f16209a, this.f16211c);
        this.f16212d = true;
    }
}
