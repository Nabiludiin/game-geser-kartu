package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class ti3 implements ii3 {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f16215a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16216b;

    /* renamed from: c, reason: collision with root package name */
    private li3 f16217c;

    /* synthetic */ ti3(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.ii3
    public final ji3 a() {
        v85.c(this.f16215a, ExecutorService.class);
        v85.c(this.f16216b, Context.class);
        v85.c(this.f16217c, li3.class);
        return new ri3(new ro3(), new to3(), new vo3(), this.f16215a, this.f16216b, this.f16217c);
    }

    public final ti3 b(ExecutorService executorService) {
        executorService.getClass();
        this.f16215a = executorService;
        return this;
    }

    public final ti3 c(Context context) {
        context.getClass();
        this.f16216b = context;
        return this;
    }

    public final ti3 d(li3 li3Var) {
        li3Var.getClass();
        this.f16217c = li3Var;
        return this;
    }
}
