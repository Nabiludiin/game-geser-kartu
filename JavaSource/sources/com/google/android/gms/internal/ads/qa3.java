package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: MyApplication */
final class qa3 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ WebView f14344q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f14345r;

    qa3(ra3 ra3Var, WebView webView, String str) {
        this.f14344q = webView;
        this.f14345r = str;
        Objects.requireNonNull(ra3Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ra3.k(this.f14344q, this.f14345r);
    }
}
