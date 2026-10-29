package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
final class h1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21540a = AtomicReferenceFieldUpdater.newUpdater(k1.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21541b = AtomicReferenceFieldUpdater.newUpdater(k1.class, k1.class, "b");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21542c = AtomicReferenceFieldUpdater.newUpdater(l1.class, k1.class, "s");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21543d = AtomicReferenceFieldUpdater.newUpdater(l1.class, d1.class, "r");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21544e = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "q");

    /* synthetic */ h1(p1 p1Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final d1 a(l1 l1Var, d1 d1Var) {
        return (d1) f21543d.getAndSet(l1Var, d1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final k1 b(l1 l1Var, k1 k1Var) {
        return (k1) f21542c.getAndSet(l1Var, k1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final void c(k1 k1Var, k1 k1Var2) {
        f21541b.lazySet(k1Var, k1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.g1
    public final void d(k1 k1Var, Thread thread) {
        f21540a.lazySet(k1Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean e(l1 l1Var, d1 d1Var, d1 d1Var2) {
        return m1.a(f21543d, l1Var, d1Var, d1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean f(l1 l1Var, Object obj, Object obj2) {
        return m1.a(f21544e, l1Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean g(l1 l1Var, k1 k1Var, k1 k1Var2) {
        return m1.a(f21542c, l1Var, k1Var, k1Var2);
    }
}
