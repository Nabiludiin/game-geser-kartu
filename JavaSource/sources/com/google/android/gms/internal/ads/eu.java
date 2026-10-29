package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: MyApplication */
public final class eu {

    /* renamed from: a, reason: collision with root package name */
    private tt f7818a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7819b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7820c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f7821d = new Object();

    eu(Context context) {
        this.f7820c = context;
    }

    final Future a(ut utVar) {
        yt ytVar = new yt(this);
        cu cuVar = new cu(this, utVar, ytVar);
        du duVar = new du(this, ytVar);
        synchronized (this.f7821d) {
            tt ttVar = new tt(this.f7820c, r2.t.w().a(), cuVar, duVar);
            this.f7818a = ttVar;
            ttVar.v();
        }
        return ytVar;
    }

    final /* synthetic */ void b() {
        synchronized (this.f7821d) {
            try {
                tt ttVar = this.f7818a;
                if (ttVar == null) {
                    return;
                }
                ttVar.h();
                this.f7818a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ tt c() {
        return this.f7818a;
    }

    final /* synthetic */ boolean d() {
        return this.f7819b;
    }

    final /* synthetic */ void e(boolean z7) {
        this.f7819b = true;
    }

    final /* synthetic */ Object f() {
        return this.f7821d;
    }
}
