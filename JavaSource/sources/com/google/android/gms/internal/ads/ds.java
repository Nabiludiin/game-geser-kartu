package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: MyApplication */
final class ds implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ View f7282q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ hs f7283r;

    ds(hs hsVar, View view) {
        this.f7282q = view;
        Objects.requireNonNull(hsVar);
        this.f7283r = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7283r.b(this.f7282q);
    }
}
