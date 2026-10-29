package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class ee0 implements View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ge0 f7580q;

    ee0(ge0 ge0Var) {
        Objects.requireNonNull(ge0Var);
        this.f7580q = ge0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f7580q.i(true);
    }
}
