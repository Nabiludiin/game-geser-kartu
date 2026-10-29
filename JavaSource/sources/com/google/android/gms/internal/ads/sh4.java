package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class sh4 {

    /* renamed from: b, reason: collision with root package name */
    private static final sh4 f15631b = new sh4();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f15632a = new AtomicReference(new oi4(new li4(null), null));

    sh4() {
    }

    public static sh4 a() {
        return f15631b;
    }

    public final synchronized void b(ki4 ki4Var) {
        AtomicReference atomicReference = this.f15632a;
        li4 li4Var = new li4((oi4) atomicReference.get(), null);
        li4Var.a(ki4Var);
        atomicReference.set(new oi4(li4Var, null));
    }

    public final synchronized void c(qi4 qi4Var) {
        AtomicReference atomicReference = this.f15632a;
        li4 li4Var = new li4((oi4) atomicReference.get(), null);
        li4Var.b(qi4Var);
        atomicReference.set(new oi4(li4Var, null));
    }

    public final Object d(b84 b84Var, Class cls) {
        return ((oi4) this.f15632a.get()).b(b84Var, cls);
    }

    public final Object e(xg4 xg4Var, fh4 fh4Var, Class cls) {
        return ((oi4) this.f15632a.get()).c(xg4Var, fh4Var, cls);
    }
}
