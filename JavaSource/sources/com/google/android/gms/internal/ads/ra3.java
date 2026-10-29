package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ra3 {

    /* renamed from: a, reason: collision with root package name */
    private static final ra3 f14813a = new ra3();

    private ra3() {
    }

    public static final ra3 a() {
        return f14813a;
    }

    public static final boolean k(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("javascript: ");
                    sb.append(str);
                    webView.loadUrl(sb.toString());
                    return true;
                }
            } catch (Exception e8) {
                e8.getMessage();
                j93.f10408a.getClass();
            }
        }
        return false;
    }

    public final void b(WebView webView, String str, JSONObject jSONObject) {
        j(webView, "init", jSONObject, str);
    }

    public final void c(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        j(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    public final void d(WebView webView, String str) {
        j(webView, "finishSession", str);
    }

    public final void e(WebView webView, String str, String str2) {
        j(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void f(WebView webView, String str, String str2) {
        j(webView, "setState", str2, str);
    }

    public final void g(WebView webView, String str, String str2) {
        j(webView, "setDeviceLockState", str2);
    }

    public final void h(WebView webView, String str, float f8) {
        j(webView, "setDeviceVolume", Float.valueOf(f8), str);
    }

    public final void i(WebView webView, JSONObject jSONObject) {
        j(webView, "setLastActivity", jSONObject);
    }

    final void j(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            j93.f10408a.getClass();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof String) {
                String obj2 = obj.toString();
                if (obj2.startsWith("{")) {
                    sb.append(obj2);
                } else {
                    sb.append('\"');
                    sb.append(obj2);
                    sb.append('\"');
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (Looper.myLooper() == handler.getLooper()) {
            k(webView, sb2);
        } else {
            handler.post(new qa3(this, webView, sb2));
        }
    }
}
