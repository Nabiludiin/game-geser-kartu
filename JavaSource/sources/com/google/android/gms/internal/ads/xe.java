package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class xe {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18776a;

    public xe(Handler handler) {
        this.f18776a = new ve(this, handler);
    }

    public final void a(gf gfVar, lf lfVar, Runnable runnable) {
        gfVar.v();
        gfVar.d("post-response");
        ((ve) this.f18776a).f17586q.post(new we(gfVar, lfVar, runnable));
    }

    public final void b(gf gfVar, of ofVar) {
        gfVar.d("post-error");
        ((ve) this.f18776a).f17586q.post(new we(gfVar, lf.b(ofVar), null));
    }
}
