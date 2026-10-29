package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* compiled from: MyApplication */
public final class ft0 extends ct0 {
    public ft0(mr0 mr0Var, iu iuVar, boolean z7, i92 i92Var) {
        super(mr0Var, iuVar, z7, i92Var);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        mr0 mr0Var = this.f19732q;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return mr0Var.n1(didCrash, rendererPriorityAtExit);
    }
}
