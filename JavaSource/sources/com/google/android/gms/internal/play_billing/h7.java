package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
final class h7 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f21549a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f21550b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f21551c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f21552d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f21553e;

    h7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f21549a = atomicReferenceFieldUpdater;
        this.f21550b = atomicReferenceFieldUpdater2;
        this.f21551c = atomicReferenceFieldUpdater3;
        this.f21552d = atomicReferenceFieldUpdater4;
        this.f21553e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final void a(f8 f8Var, f8 f8Var2) {
        this.f21550b.lazySet(f8Var, f8Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final void b(f8 f8Var, Thread thread) {
        this.f21549a.lazySet(f8Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final boolean c(h8 h8Var, m5 m5Var, m5 m5Var2) {
        return g6.a(this.f21552d, h8Var, m5Var, m5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final boolean d(h8 h8Var, Object obj, Object obj2) {
        return g6.a(this.f21553e, h8Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.b2
    final boolean e(h8 h8Var, f8 f8Var, f8 f8Var2) {
        return g6.a(this.f21551c, h8Var, f8Var, f8Var2);
    }
}
