package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class d32 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f6914a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f6915b;

    private d32(w85 w85Var, w85 w85Var2) {
        this.f6914a = w85Var;
        this.f6915b = w85Var2;
    }

    public static d32 a(w85 w85Var, w85 w85Var2) {
        return new d32(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        f53 f53Var = (f53) this.f6914a.b();
        final CookieManager a8 = r2.t.j().a((Context) this.f6915b.b());
        z43 z43Var = z43.WEBVIEW_COOKIE;
        Objects.requireNonNull(f53Var);
        return q43.b(new Callable() { // from class: com.google.android.gms.internal.ads.y22
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                CookieManager cookieManager = a8;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) s2.b0.c().d(uy.f17092f1));
            }
        }, z43Var, f53Var).h(1L, TimeUnit.SECONDS).f(Exception.class, v22.f17364a).i();
    }
}
