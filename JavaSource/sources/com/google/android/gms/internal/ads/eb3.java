package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: MyApplication */
final class eb3 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final WebView f7524q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ fb3 f7525r;

    eb3(fb3 fb3Var) {
        Objects.requireNonNull(fb3Var);
        this.f7525r = fb3Var;
        this.f7524q = fb3Var.q();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7524q.destroy();
    }
}
