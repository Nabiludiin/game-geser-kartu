package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class fl3 {

    /* renamed from: a, reason: collision with root package name */
    private final h85 f8316a;

    /* renamed from: b, reason: collision with root package name */
    private final h85 f8317b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f8318c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f8319d;

    /* renamed from: e, reason: collision with root package name */
    private final nu3 f8320e;

    fl3(h85 h85Var, h85 h85Var2, h85 h85Var3, ExecutorService executorService, nu3 nu3Var) {
        this.f8316a = h85Var;
        this.f8317b = h85Var2;
        this.f8318c = h85Var3;
        this.f8319d = executorService;
        this.f8320e = nu3Var;
    }

    private final a5.d e(final int i7) {
        return (h64) p64.j(h64.C(p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.bl3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return fl3.this.c(i7);
            }
        }, this.f8319d)), cl3.f6493a, g74.a());
    }

    final /* synthetic */ nu3 a() {
        return this.f8320e;
    }

    final a5.d b(int i7, boolean z7) {
        a5.d e8 = e(i7);
        return (!z7 || i7 == 2) ? e8 : (h64) p64.j((h64) p64.g(h64.C(e8), Throwable.class, el3.f7688a, g74.a()), new al3(this), g74.a());
    }

    final /* synthetic */ yk3 c(int i7) {
        int i8 = i7 - 1;
        if (i8 == 1) {
            return (yk3) this.f8316a.b();
        }
        if (i8 == 2) {
            return (yk3) this.f8317b.b();
        }
        if (i8 == 3) {
            return (yk3) this.f8318c.b();
        }
        throw new IllegalArgumentException();
    }

    final /* synthetic */ a5.d d(int i7) {
        return e(2);
    }
}
