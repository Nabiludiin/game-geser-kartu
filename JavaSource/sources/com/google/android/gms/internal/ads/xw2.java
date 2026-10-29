package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class xw2 implements h33 {

    /* renamed from: a, reason: collision with root package name */
    public final rx2 f19275a;

    /* renamed from: b, reason: collision with root package name */
    public final tx2 f19276b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.b5 f19277c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19278d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f19279e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.m5 f19280f;

    /* renamed from: g, reason: collision with root package name */
    public final x23 f19281g;

    public xw2(rx2 rx2Var, tx2 tx2Var, s2.b5 b5Var, String str, Executor executor, s2.m5 m5Var, x23 x23Var) {
        this.f19275a = rx2Var;
        this.f19276b = tx2Var;
        this.f19277c = b5Var;
        this.f19278d = str;
        this.f19279e = executor;
        this.f19280f = m5Var;
        this.f19281g = x23Var;
    }

    @Override // com.google.android.gms.internal.ads.h33
    public final Executor a() {
        return this.f19279e;
    }

    @Override // com.google.android.gms.internal.ads.h33
    public final x23 b() {
        return this.f19281g;
    }
}
