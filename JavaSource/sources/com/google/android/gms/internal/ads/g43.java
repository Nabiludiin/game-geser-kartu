package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: MyApplication */
public final class g43 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f8644a;

    private g43(w85 w85Var) {
        this.f8644a = w85Var;
    }

    public static g43 a(w85 w85Var) {
        return new g43(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        ThreadFactory threadFactory = (ThreadFactory) this.f8644a.b();
        nf3.a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        v85.b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
