package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final /* synthetic */ class kp2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kp2 f11191a = new kp2();

    private /* synthetic */ kp2() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", r2.t.l().n());
        return new mp2(bundle);
    }
}
