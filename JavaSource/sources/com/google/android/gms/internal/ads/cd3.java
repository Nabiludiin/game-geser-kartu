package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class cd3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6384a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6385b;

    /* renamed from: c, reason: collision with root package name */
    private final lc3 f6386c;

    /* renamed from: d, reason: collision with root package name */
    private final bd3 f6387d;

    /* renamed from: e, reason: collision with root package name */
    private w4.i f6388e;

    cd3(Context context, Executor executor, lc3 lc3Var, nc3 nc3Var, yc3 yc3Var) {
        this.f6384a = context;
        this.f6385b = executor;
        this.f6386c = lc3Var;
        this.f6387d = yc3Var;
    }

    public static cd3 a(Context context, Executor executor, lc3 lc3Var, nc3 nc3Var) {
        final cd3 cd3Var = new cd3(context, executor, lc3Var, nc3Var, new yc3());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.ad3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return cd3.this.c();
            }
        };
        Executor executor2 = cd3Var.f6385b;
        cd3Var.f6388e = w4.l.c(executor2, callable).d(executor2, new w4.f() { // from class: com.google.android.gms.internal.ads.zc3
            @Override // w4.f
            public final /* synthetic */ void d(Exception exc) {
                cd3.this.d(exc);
            }
        });
        return cd3Var;
    }

    public final xk b() {
        bd3 bd3Var = this.f6387d;
        w4.i iVar = this.f6388e;
        return !iVar.n() ? bd3Var.a() : (xk) iVar.k();
    }

    final /* synthetic */ xk c() {
        Context context = this.f6384a;
        return sc3.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void d(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f6386c.c(2025, -1L, exc);
    }
}
