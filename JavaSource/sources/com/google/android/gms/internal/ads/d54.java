package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
final class d54 extends c54 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6925a = AtomicReferenceFieldUpdater.newUpdater(h54.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6926b = AtomicReferenceFieldUpdater.newUpdater(h54.class, h54.class, "b");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6927c = AtomicReferenceFieldUpdater.newUpdater(i54.class, h54.class, "s");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6928d = AtomicReferenceFieldUpdater.newUpdater(i54.class, y44.class, "r");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6929e = AtomicReferenceFieldUpdater.newUpdater(i54.class, Object.class, "q");

    /* synthetic */ d54(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.c54
    public final void a(h54 h54Var, Thread thread) {
        f6925a.lazySet(h54Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final void b(h54 h54Var, h54 h54Var2) {
        f6926b.lazySet(h54Var, h54Var2);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean c(i54 i54Var, h54 h54Var, h54 h54Var2) {
        return androidx.concurrent.futures.b.a(f6927c, i54Var, h54Var, h54Var2);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean d(i54 i54Var, y44 y44Var, y44 y44Var2) {
        return androidx.concurrent.futures.b.a(f6928d, i54Var, y44Var, y44Var2);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final h54 e(i54 i54Var, h54 h54Var) {
        return (h54) f6927c.getAndSet(i54Var, h54Var);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final y44 f(i54 i54Var, y44 y44Var) {
        return (y44) f6928d.getAndSet(i54Var, y44Var);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean g(i54 i54Var, Object obj, Object obj2) {
        return androidx.concurrent.futures.b.a(f6929e, i54Var, obj, obj2);
    }
}
