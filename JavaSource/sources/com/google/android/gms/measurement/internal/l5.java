package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class l5 {

    /* renamed from: d, reason: collision with root package name */
    private static l5 f22314d;

    /* renamed from: a, reason: collision with root package name */
    private final w6 f22315a;

    /* renamed from: b, reason: collision with root package name */
    private final p3.u f22316b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f22317c = new AtomicLong(-1);

    private l5(Context context, w6 w6Var) {
        this.f22316b = p3.t.b(context, p3.v.b().b("measurement:api").a());
        this.f22315a = w6Var;
    }

    static l5 a(w6 w6Var) {
        if (f22314d == null) {
            f22314d = new l5(w6Var.e(), w6Var);
        }
        return f22314d;
    }

    public final synchronized void b(int i7, int i8, long j7, long j8, int i9) {
        final long b8 = this.f22315a.f().b();
        AtomicLong atomicLong = this.f22317c;
        if (atomicLong.get() != -1 && b8 - atomicLong.get() <= 1800000) {
            return;
        }
        this.f22316b.b(new p3.s(0, Arrays.asList(new p3.m(36301, i8, 0, j7, j8, null, null, 0, i9)))).e(new w4.f() { // from class: com.google.android.gms.measurement.internal.k5
            @Override // w4.f
            public final /* synthetic */ void d(Exception exc) {
                l5.this.c(b8, exc);
            }
        });
    }

    final /* synthetic */ void c(long j7, Exception exc) {
        this.f22317c.set(j7);
    }
}
