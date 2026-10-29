package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class bt0 extends yr0 {
    public bt0(mr0 mr0Var, iu iuVar, boolean z7, i92 i92Var) {
        super(mr0Var, iuVar, z7, new le0(mr0Var, mr0Var.S(), new ay(mr0Var.getContext())), null, i92Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse X0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof mr0)) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        mr0 mr0Var = (mr0) webView;
        vj0 vj0Var = this.O;
        if (vj0Var != null) {
            vj0Var.c(str, map, 1);
        }
        se3.a();
        ze3 ze3Var = ze3.f20155a;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.h(str, map);
        }
        if (mr0Var.s0() != null) {
            mr0Var.s0().O();
        }
        if (mr0Var.R().g()) {
            str2 = (String) s2.b0.c().d(uy.f17118i0);
        } else if (mr0Var.W()) {
            str2 = (String) s2.b0.c().d(uy.f17109h0);
        } else {
            str2 = (String) s2.b0.c().d(uy.f17100g0);
        }
        r2.t.g();
        return v2.f2.b(mr0Var.getContext(), mr0Var.p().f27051q, str2);
    }
}
