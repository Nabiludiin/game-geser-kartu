package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Objects;

/* compiled from: MyApplication */
final class hl0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Context f9567q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ im0 f9568r;

    hl0(il0 il0Var, Context context, im0 im0Var) {
        this.f9567q = context;
        this.f9568r = im0Var;
        Objects.requireNonNull(il0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9568r.b(o2.a.a(this.f9567q));
        } catch (IOException | IllegalStateException | k3.i e8) {
            this.f9568r.e(e8);
            w2.p.d("Exception while getting advertising Id info", e8);
        }
    }
}
