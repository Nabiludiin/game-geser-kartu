package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ls0 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ rs0 f11764q;

    ls0(rs0 rs0Var) {
        Objects.requireNonNull(rs0Var);
        this.f11764q = rs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
