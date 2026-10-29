package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class zp3 extends lc3 {

    /* renamed from: g, reason: collision with root package name */
    private final ik3 f20272g;

    zp3(Context context, Executor executor, ik3 ik3Var) {
        super(context, executor, new w4.j().a(), false);
        this.f20272g = ik3Var;
    }

    private static w4.i i() {
        w4.j jVar = new w4.j();
        jVar.c(Boolean.TRUE);
        return jVar.a();
    }

    @Override // com.google.android.gms.internal.ads.lc3
    public final w4.i b(int i7, long j7) {
        this.f20272g.c(i7, j7, null, null);
        return i();
    }

    @Override // com.google.android.gms.internal.ads.lc3
    public final w4.i c(int i7, long j7, Exception exc) {
        this.f20272g.c(i7, j7, exc, null);
        return i();
    }

    @Override // com.google.android.gms.internal.ads.lc3
    public final w4.i e(int i7, String str) {
        this.f20272g.c(i7, -1L, null, str);
        return i();
    }
}
