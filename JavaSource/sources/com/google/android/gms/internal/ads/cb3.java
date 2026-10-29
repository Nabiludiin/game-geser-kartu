package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: MyApplication */
public final class cb3 extends bb3 {
    public cb3(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        c(webView);
    }
}
