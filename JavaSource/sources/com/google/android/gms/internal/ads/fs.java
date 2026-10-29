package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: MyApplication */
final class fs implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final ValueCallback f8454q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ xr f8455r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ WebView f8456s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f8457t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ hs f8458u;

    fs(hs hsVar, final xr xrVar, final WebView webView, final boolean z7) {
        this.f8455r = xrVar;
        this.f8456s = webView;
        this.f8457t = z7;
        Objects.requireNonNull(hsVar);
        this.f8458u = hsVar;
        this.f8454q = new ValueCallback() { // from class: com.google.android.gms.internal.ads.es
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                fs.this.f8458u.d(xrVar, webView, (String) obj, z7);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.f8456s;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f8454q);
            } catch (Throwable unused) {
                this.f8454q.onReceiveValue("");
            }
        }
    }
}
