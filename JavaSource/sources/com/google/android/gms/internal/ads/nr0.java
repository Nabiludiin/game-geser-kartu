package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class nr0 implements View.OnAttachStateChangeListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ vj0 f12862q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ yr0 f12863r;

    nr0(yr0 yr0Var, vj0 vj0Var) {
        this.f12862q = vj0Var;
        Objects.requireNonNull(yr0Var);
        this.f12863r = yr0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12863r.u(view, this.f12862q, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
