package p4;

import android.webkit.WebView;

/* compiled from: MyApplication */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f25506a;

    public static void a(WebView webView, String str) {
        boolean booleanValue;
        synchronized (r1.class) {
            if (f25506a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f25506a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    f25506a = Boolean.FALSE;
                }
            }
            booleanValue = f25506a.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
