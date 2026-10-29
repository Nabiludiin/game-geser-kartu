package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: MyApplication */
public final class lr0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final mr0 f11740a;

    public lr0(mr0 mr0Var) {
        this.f11740a = mr0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof mr0)) {
            return webView.getContext();
        }
        mr0 mr0Var = (mr0) webView;
        Activity i7 = mr0Var.i();
        return i7 != null ? i7 : mr0Var.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z7) {
        mr0 mr0Var;
        r2.b g8;
        try {
            mr0Var = this.f11740a;
        } catch (WindowManager.BadTokenException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.g("Fail to display Dialog.", e8);
        }
        if (mr0Var != null && mr0Var.s0() != null && mr0Var.s0().g() != null && (g8 = mr0Var.s0().g()) != null && !g8.b()) {
            StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            g8.c(sb.toString());
            return false;
        }
        r2.t.g();
        AlertDialog.Builder o7 = v2.f2.o(context);
        o7.setTitle(str2);
        if (z7) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            o7.setView(linearLayout).setPositiveButton(R.string.ok, new jr0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new ir0(jsPromptResult)).setOnCancelListener(new hr0(jsPromptResult)).create().show();
        } else {
            o7.setMessage(str3).setPositiveButton(R.string.ok, new gr0(jsResult)).setNegativeButton(R.string.cancel, new fr0(jsResult)).setOnCancelListener(new er0(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof mr0)) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        u2.a0 O = ((mr0) webView).O();
        if (O != null) {
            O.b();
        } else {
            int i8 = v2.n1.f26802b;
            w2.p.f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i7 = kr0.f11209a[consoleMessage.messageLevel().ordinal()];
        if (i7 == 1) {
            int i8 = v2.n1.f26802b;
            w2.p.c(sb2);
        } else if (i7 == 2) {
            int i9 = v2.n1.f26802b;
            w2.p.f(sb2);
        } else if (i7 == 3 || i7 == 4) {
            int i10 = v2.n1.f26802b;
            w2.p.e(sb2);
        } else if (i7 != 5) {
            int i11 = v2.n1.f26802b;
            w2.p.e(sb2);
        } else {
            int i12 = v2.n1.f26802b;
            w2.p.a(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z7, boolean z8, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        mr0 mr0Var = this.f11740a;
        if (mr0Var.G0() != null) {
            webView2.setWebViewClient(mr0Var.G0());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j7, long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        long j10 = 5242880 - j9;
        if (j10 <= 0) {
            quotaUpdater.updateQuota(j7);
            return;
        }
        if (j7 == 0) {
            if (j8 > j10 || j8 > 1048576) {
                j8 = 0;
            }
        } else if (j8 == 0) {
            j8 = Math.min(j7 + Math.min(131072L, j10), 1048576L);
        } else {
            if (j8 <= Math.min(1048576 - j7, j10)) {
                j7 += j8;
            }
            j8 = j7;
        }
        quotaUpdater.updateQuota(j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r6, android.webkit.GeolocationPermissions.Callback r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L59
            com.google.android.gms.internal.ads.mr0 r0 = r5.f11740a
            r2.t.g()
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = v2.f2.e(r1, r2)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L24
            r2.t.g()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = v2.f2.e(r0, r1)
            if (r0 == 0) goto L26
        L24:
            r0 = r3
            goto L27
        L26:
            r0 = r2
        L27:
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.le
            com.google.android.gms.internal.ads.sy r4 = s2.b0.c()
            java.lang.Object r1 = r4.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d
            r7.invoke(r6, r2, r3)
            goto L40
        L3d:
            r7.invoke(r6, r0, r3)
        L40:
            com.google.android.gms.internal.ads.ly r6 = com.google.android.gms.internal.ads.uy.me
            com.google.android.gms.internal.ads.sy r7 = s2.b0.c()
            java.lang.Object r6 = r7.d(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L59
            int r6 = v2.n1.f26802b
            java.lang.String r6 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            w2.p.a(r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lr0.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        u2.a0 O = this.f11740a.O();
        if (O != null) {
            O.d();
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        u2.a0 O = this.f11740a.O();
        if (O != null) {
            O.t8(view, customViewCallback);
            O.s8(i7);
        } else {
            int i8 = v2.n1.f26802b;
            w2.p.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
