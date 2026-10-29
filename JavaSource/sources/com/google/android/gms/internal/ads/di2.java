package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class di2 implements uc1 {

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference f7117q = new AtomicReference();

    public final void a(s2.q2 q2Var) {
        this.f7117q.set(q2Var);
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final void h(final s2.i5 i5Var) {
        hx2.a(this.f7117q, new gx2() { // from class: com.google.android.gms.internal.ads.ci2
            @Override // com.google.android.gms.internal.ads.gx2
            public final /* synthetic */ void d(Object obj) {
                ((s2.q2) obj).f8(s2.i5.this);
            }
        });
    }
}
