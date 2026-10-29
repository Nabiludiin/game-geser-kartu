package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* compiled from: MyApplication */
final class xt0 extends Thread {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Runnable f19018q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ yt0 f19019r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    xt0(yt0 yt0Var, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.f19018q = runnable2;
        Objects.requireNonNull(yt0Var);
        this.f19019r = yt0Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f19019r.a());
        this.f19018q.run();
    }
}
