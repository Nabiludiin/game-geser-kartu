package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class bi3 implements n85 {
    public static bi3 a() {
        return ai3.f4988a;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        v85.b(newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }
}
