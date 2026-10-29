package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class zt0 {

    /* renamed from: a, reason: collision with root package name */
    private final pt0 f20338a;

    /* renamed from: b, reason: collision with root package name */
    private final rx1 f20339b;

    zt0(pt0 pt0Var, rx1 rx1Var) {
        this.f20338a = pt0Var;
        this.f20339b = rx1Var;
    }

    public final void a(final Context context, final w2.a aVar) {
        if (((Boolean) s2.b0.c().d(uy.Je)).booleanValue()) {
            Executor executor = cm0.f6500a;
            if (((Boolean) s2.b0.c().d(uy.Le)).booleanValue()) {
                yt0 yt0Var = new yt0(((Integer) s2.b0.c().d(uy.Ne)).intValue(), null);
                int intValue = ((Integer) s2.b0.c().d(uy.Me)).intValue();
                executor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), yt0Var);
            }
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wt0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zt0.this.b(context, aVar);
                }
            });
        }
    }

    final /* synthetic */ void b(Context context, w2.a aVar) {
        long b8 = r2.t.o().b();
        r2.t.g().Q(context, aVar.f27051q);
        if (((Boolean) s2.b0.c().d(uy.Ke)).booleanValue()) {
            long b9 = r2.t.o().b() - b8;
            qx1 a8 = this.f20339b.a();
            a8.c("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(b9).length());
            sb.append(b9);
            a8.c("webview_startup_l", sb.toString());
            a8.d();
        }
        if (!((Boolean) s2.b0.c().d(uy.Qe)).booleanValue() || Build.VERSION.SDK_INT < 24) {
            return;
        }
        cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vt0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zt0.this.c();
            }
        });
    }

    final /* synthetic */ void c() {
        this.f20338a.b(new ut0(this, r2.t.o().b()));
    }

    final /* synthetic */ rx1 d() {
        return this.f20339b;
    }
}
