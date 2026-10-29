package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class n32 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f12556a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f12557b;

    /* renamed from: c, reason: collision with root package name */
    private final z64 f12558c;

    /* renamed from: d, reason: collision with root package name */
    private final n42 f12559d;

    /* renamed from: e, reason: collision with root package name */
    private final h85 f12560e;

    public n32(ScheduledExecutorService scheduledExecutorService, z64 z64Var, z64 z64Var2, n42 n42Var, h85 h85Var) {
        this.f12556a = scheduledExecutorService;
        this.f12557b = z64Var;
        this.f12558c = z64Var2;
        this.f12559d = n42Var;
        this.f12560e = h85Var;
    }

    public final a5.d a(final eh0 eh0Var) {
        a5.d B0;
        String str = eh0Var.f7627t;
        r2.t.g();
        if (v2.f2.g(str)) {
            B0 = p64.c(new b52(1));
        } else {
            B0 = (((Boolean) s2.b0.c().d(uy.a8)).booleanValue() || ((Boolean) h10.f9283a.e()).booleanValue()) ? this.f12558c.B0(new Callable() { // from class: com.google.android.gms.internal.ads.k32
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return n32.this.c(eh0Var);
                }
            }) : this.f12559d.d(eh0Var);
        }
        final int callingUid = Binder.getCallingUid();
        return (h64) p64.h((h64) p64.i(h64.C(B0), ((Integer) s2.b0.c().d(uy.f17124i6)).intValue(), TimeUnit.SECONDS, this.f12556a), Throwable.class, new w54() { // from class: com.google.android.gms.internal.ads.m32
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return n32.this.b(eh0Var, callingUid, (Throwable) obj);
            }
        }, this.f12557b);
    }

    final /* synthetic */ a5.d b(final eh0 eh0Var, int i7, Throwable th) {
        Bundle bundle;
        if (eh0Var != null && (bundle = eh0Var.C) != null) {
            bundle.putBoolean("ls", true);
        }
        return p64.j(((w62) this.f12560e.b()).m8(eh0Var, i7), new w54() { // from class: com.google.android.gms.internal.ads.l32
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return p64.a(new c52((InputStream) obj, eh0.this));
            }
        }, this.f12557b);
    }

    final /* synthetic */ c52 c(eh0 eh0Var) {
        return (c52) this.f12559d.d(eh0Var).get(((Integer) s2.b0.c().d(uy.f17124i6)).intValue(), TimeUnit.SECONDS);
    }
}
