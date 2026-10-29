package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* compiled from: MyApplication */
public final class zs0 {

    /* renamed from: a, reason: collision with root package name */
    private final ys0 f20313a;

    /* renamed from: b, reason: collision with root package name */
    private final at0 f20314b;

    public zs0(at0 at0Var, ys0 ys0Var) {
        this.f20313a = ys0Var;
        this.f20314b = at0Var;
    }

    final /* synthetic */ void a(String str) {
        this.f20313a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            v2.n1.k("Click string is empty, not proceeding.");
            return "";
        }
        at0 at0Var = this.f20314b;
        fn P = ((jt0) at0Var).P();
        if (P == null) {
            v2.n1.k("Signal utils is empty, ignoring.");
            return "";
        }
        zm b8 = P.b();
        if (b8 == null) {
            v2.n1.k("Signals object is empty, ignoring.");
            return "";
        }
        if (at0Var.getContext() != null) {
            return b8.g(at0Var.getContext(), str, ((lt0) at0Var).Z(), at0Var.i());
        }
        v2.n1.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        at0 at0Var = this.f20314b;
        fn P = ((jt0) at0Var).P();
        if (P == null) {
            v2.n1.k("Signal utils is empty, ignoring.");
            return "";
        }
        zm b8 = P.b();
        if (b8 == null) {
            v2.n1.k("Signals object is empty, ignoring.");
            return "";
        }
        if (at0Var.getContext() != null) {
            return b8.m(at0Var.getContext(), ((lt0) at0Var).Z(), at0Var.i());
        }
        v2.n1.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ws0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zs0.this.a(str);
                }
            });
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("URL is empty, ignoring message");
        }
    }
}
