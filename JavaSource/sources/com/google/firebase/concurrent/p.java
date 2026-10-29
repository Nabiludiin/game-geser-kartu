package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* renamed from: x, reason: collision with root package name */
    private final ScheduledFuture f23010x;

    /* compiled from: MyApplication */
    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.x(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.w(obj);
        }
    }

    /* compiled from: MyApplication */
    interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    /* compiled from: MyApplication */
    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f23010x = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f23010x.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f23010x.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.a
    protected void k() {
        this.f23010x.cancel(z());
    }
}
