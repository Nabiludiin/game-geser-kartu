package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MyApplication */
final class s54 extends r54 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f15471a = AtomicReferenceFieldUpdater.newUpdater(u54.class, Set.class, "x");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15472b = AtomicIntegerFieldUpdater.newUpdater(u54.class, "y");

    /* synthetic */ s54(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.r54
    final void a(u54 u54Var, Set set, Set set2) {
        androidx.concurrent.futures.b.a(f15471a, u54Var, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.r54
    final int b(u54 u54Var) {
        return f15472b.decrementAndGet(u54Var);
    }
}
