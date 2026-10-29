package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* compiled from: MyApplication */
final class db3 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fb3 f7043a;

    db3(fb3 fb3Var) {
        Objects.requireNonNull(fb3Var);
        this.f7043a = fb3Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length());
        sb.append("WebView renderer gone: ");
        sb.append(obj);
        sb.append("for WebView: ");
        sb.append(valueOf);
        Log.w("NativeBridge", sb.toString());
        fb3 fb3Var = this.f7043a;
        if (fb3Var.d() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            fb3Var.c(null);
        }
        webView.destroy();
        return true;
    }
}
