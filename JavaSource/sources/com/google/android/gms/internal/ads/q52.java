package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class q52 {

    /* renamed from: a, reason: collision with root package name */
    private final gu0 f14264a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14265b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f14266c;

    q52(gu0 gu0Var, Context context, Executor executor) {
        this.f14264a = gu0Var;
        this.f14265b = context;
        this.f14266c = executor;
    }

    public final void a() {
        this.f14266c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.p52
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                q52.this.b();
            }
        });
    }

    final /* synthetic */ void b() {
        t52 p7 = this.f14264a.p();
        p7.j(this.f14265b);
        p7.a().a().a();
    }
}
