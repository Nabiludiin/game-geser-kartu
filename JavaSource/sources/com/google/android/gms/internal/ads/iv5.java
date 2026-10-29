package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class iv5 implements kv5 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Executor f10230q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ th1 f10231r;

    iv5(Executor executor, th1 th1Var) {
        this.f10230q = executor;
        this.f10231r = th1Var;
    }

    @Override // com.google.android.gms.internal.ads.kv5
    public final void a() {
        this.f10231r.d(this.f10230q);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10230q.execute(runnable);
    }
}
