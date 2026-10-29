package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
final class q6 extends FutureTask implements Comparable {

    /* renamed from: q, reason: collision with root package name */
    private final long f22529q;

    /* renamed from: r, reason: collision with root package name */
    final boolean f22530r;

    /* renamed from: s, reason: collision with root package name */
    private final String f22531s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ s6 f22532t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q6(s6 s6Var, Runnable runnable, boolean z7, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        Objects.requireNonNull(s6Var);
        this.f22532t = s6Var;
        p3.o.m(str);
        atomicLong = s6.f22606k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f22529q = andIncrement;
        this.f22531s = str;
        this.f22530r = z7;
        if (andIncrement == Long.MAX_VALUE) {
            s6Var.f22928a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        q6 q6Var = (q6) obj;
        boolean z7 = q6Var.f22530r;
        boolean z8 = this.f22530r;
        if (z8 != z7) {
            return !z8 ? 1 : -1;
        }
        long j7 = this.f22529q;
        long j8 = q6Var.f22529q;
        if (j7 < j8) {
            return -1;
        }
        if (j7 > j8) {
            return 1;
        }
        this.f22532t.f22928a.a().p().b("Two tasks share the same index. index", Long.valueOf(j7));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f22532t.f22928a.a().o().b(this.f22531s, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q6(s6 s6Var, Callable callable, boolean z7, String str) {
        super(callable);
        AtomicLong atomicLong;
        Objects.requireNonNull(s6Var);
        this.f22532t = s6Var;
        p3.o.m("Task exception on worker thread");
        atomicLong = s6.f22606k;
        long andIncrement = atomicLong.getAndIncrement();
        this.f22529q = andIncrement;
        this.f22531s = "Task exception on worker thread";
        this.f22530r = z7;
        if (andIncrement == Long.MAX_VALUE) {
            s6Var.f22928a.a().o().a("Tasks index overflow");
        }
    }
}
