package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationTargetException;

/* compiled from: MyApplication */
public final class pt0 {

    /* renamed from: a, reason: collision with root package name */
    private c1.b f14096a = null;

    pt0() {
    }

    public final void a(WebView webView) {
        if (this.f14096a != null) {
            try {
                c1.g.n(webView, "GMA_WEBVIEW_PROFILE");
                v2.n1.k("WebViewCompat Profile is defined");
            } catch (IllegalStateException e8) {
                String concat = "WebViewCompat error: ".concat(e8.toString());
                int i7 = v2.n1.f26802b;
                w2.p.f(concat);
                if (((Boolean) s2.b0.c().d(uy.Pe)).booleanValue()) {
                    r2.t.l().i(e8, "WebViewCompat.setProfile");
                }
            }
        }
    }

    final void b(ut0 ut0Var) {
        ProfileStore profileStore;
        if (!c1.h.a("MULTI_PROFILE")) {
            int i7 = v2.n1.f26802b;
            w2.p.a("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) uf3.a("androidx.webkit.ProfileStore", "getInstance", new tf3[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e8) {
            String valueOf = String.valueOf(e8.getMessage());
            int i8 = v2.n1.f26802b;
            w2.p.a("Unable to get ProfileStore instance: ".concat(valueOf));
            try {
                profileStore = (ProfileStore) uf3.a("androidx.webkit.ProfileStore$-CC", "getInstance", new tf3[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e9) {
                w2.p.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e9.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.f14096a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) s2.b0.c().d(uy.Oe)).booleanValue()) {
                long b8 = r2.t.o().b() - ut0Var.f16980a;
                qx1 a8 = ut0Var.f16981b.d().a();
                a8.c("action", "webview_p_l");
                a8.c("webview_p_l", Long.toString(b8));
                a8.d();
                return;
            }
            return;
        }
        int i9 = v2.n1.f26802b;
        w2.p.f("WebViewCompat failure: No instance");
        if (((Boolean) s2.b0.c().d(uy.Oe)).booleanValue()) {
            qx1 a9 = ut0Var.f16981b.d().a();
            a9.c("action", "webview_p_f");
            a9.c("webview_p_f", "No instance");
            a9.d();
        }
    }
}
