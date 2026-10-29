package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: MyApplication */
public final class w13 {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f17984a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable f17985b;

    /* renamed from: c, reason: collision with root package name */
    private final z64 f17986c;

    public w13(Callable callable, z64 z64Var) {
        this.f17985b = callable;
        this.f17986c = z64Var;
    }

    public final synchronized void a(int i7) {
        Deque deque = this.f17984a;
        int size = i7 - deque.size();
        for (int i8 = 0; i8 < size; i8++) {
            deque.add(this.f17986c.B0(this.f17985b));
        }
    }

    public final synchronized a5.d b() {
        a(1);
        return (a5.d) this.f17984a.poll();
    }

    public final synchronized void c(a5.d dVar) {
        this.f17984a.addFirst(dVar);
    }
}
