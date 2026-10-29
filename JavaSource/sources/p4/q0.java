package p4;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: MyApplication */
final class q0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s0 f25499a;

    /* synthetic */ q0(s0 s0Var, r0 r0Var) {
        this.f25499a = s0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        z0 z0Var;
        s0 s0Var = this.f25499a;
        if (s0.f(s0Var, str)) {
            z0Var = s0Var.f25509r;
            z0Var.e(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z7;
        s0 s0Var = this.f25499a;
        z7 = s0Var.f25510s;
        if (z7) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        s0Var.f25510s = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        z0 z0Var;
        z0Var = this.f25499a.f25509r;
        z0Var.f(i7, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        z0 z0Var;
        String uri = webResourceRequest.getUrl().toString();
        s0 s0Var = this.f25499a;
        if (!s0.f(s0Var, uri)) {
            return false;
        }
        z0Var = s0Var.f25509r;
        z0Var.e(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        z0 z0Var;
        s0 s0Var = this.f25499a;
        if (!s0.f(s0Var, str)) {
            return false;
        }
        z0Var = s0Var.f25509r;
        z0Var.e(str);
        return true;
    }
}
