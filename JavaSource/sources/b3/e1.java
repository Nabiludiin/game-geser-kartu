package b3;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.b10;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.y60;
import com.google.android.gms.internal.ads.z64;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class e1 extends y60 {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f3225a;

    /* renamed from: b, reason: collision with root package name */
    private final a1 f3226b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3227c;

    /* renamed from: d, reason: collision with root package name */
    private WebViewClient f3228d;

    public e1(WebView webView, a1 a1Var, z64 z64Var) {
        this.f3225a = webView;
        this.f3226b = a1Var;
        this.f3227c = z64Var;
    }

    private final void d() {
        this.f3225a.evaluateJavascript(String.format(Locale.getDefault(), (String) s2.b0.c().d(uy.Oa), this.f3226b.b()), null);
    }

    private final boolean e() {
        if (!((Boolean) b10.f5451a.e()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z7 = false;
        boolean z8 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(e1.class.getName())) {
                if (z7 && z8) {
                    return true;
                }
                z7 = true;
            } else if (z7) {
                z8 = true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y60
    protected final WebViewClient a() {
        return this.f3228d;
    }

    public final void b() {
        this.f3227c.execute(new Runnable() { // from class: b3.c1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                e1.this.c();
            }
        });
    }

    final /* synthetic */ void c() {
        WebViewClient j7;
        try {
            r2.t.g();
            WebView webView = this.f3225a;
            if (Build.VERSION.SDK_INT < 26) {
                if (c1.h.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        j7 = c1.g.j(webView);
                    } catch (RuntimeException e8) {
                        r2.t.l().i(e8, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            j7 = webView.getWebViewClient();
            if (j7 == this) {
                return;
            }
            if (j7 != null) {
                this.f3228d = j7;
            }
            this.f3225a.setWebViewClient(this);
            d();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z7) {
        if (e()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z7);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (e()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (e()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        if (e()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (e()) {
            return;
        }
        d();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (e()) {
            return;
        }
        d();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (e()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        if (e()) {
            return;
        }
        super.onReceivedError(webView, i7, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (e()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (e()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        if (e()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (e()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (e()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i7, SafeBrowsingResponse safeBrowsingResponse) {
        if (e()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i7, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f8, float f9) {
        if (e()) {
            return;
        }
        super.onScaleChanged(webView, f8, f9);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (e()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (e()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (e()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (e()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (e()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (e()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (e()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.y60, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (e()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
