package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* compiled from: MyApplication */
public final class z93 {

    /* renamed from: a, reason: collision with root package name */
    private final ba3 f20078a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f20079b;

    /* renamed from: c, reason: collision with root package name */
    private cc3 f20080c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f20081d;

    /* renamed from: e, reason: collision with root package name */
    private final oa3 f20082e;

    private z93(ba3 ba3Var, WebView webView, boolean z7) {
        HashMap hashMap = new HashMap();
        this.f20081d = hashMap;
        this.f20082e = new oa3();
        lb3.a();
        this.f20078a = ba3Var;
        this.f20079b = webView;
        if (c() != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((m93) it.next()).b(webView);
            }
            this.f20080c = new cc3(webView);
        }
        if (!c1.h.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        e();
        c1.g.b(this.f20079b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new x93(this));
    }

    public static z93 a(ba3 ba3Var, WebView webView, boolean z7) {
        return new z93(ba3Var, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e() {
        c1.g.l(this.f20079b, "omidJsSessionService");
    }

    public final void b(y93 y93Var) {
        Iterator it = this.f20081d.values().iterator();
        while (it.hasNext()) {
            ((m93) it.next()).c();
        }
        Timer timer = new Timer();
        timer.schedule(new w93(this, y93Var, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final View c() {
        cc3 cc3Var = this.f20080c;
        if (cc3Var == null) {
            return null;
        }
        return (View) cc3Var.get();
    }

    public final void d(View view, u93 u93Var, String str) {
        Iterator it = this.f20081d.values().iterator();
        while (it.hasNext()) {
            ((m93) it.next()).d(view, u93Var, "Ad overlay");
        }
        this.f20082e.b(view, u93Var, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void f(String str) {
        r93 r93Var = r93.DEFINED_BY_JAVASCRIPT;
        v93 v93Var = v93.DEFINED_BY_JAVASCRIPT;
        aa3 aa3Var = aa3.JAVASCRIPT;
        q93 q93Var = new q93(n93.a(r93Var, v93Var, aa3Var, aa3Var, false), o93.a(this.f20078a, this.f20079b, null, null), str);
        this.f20081d.put(str, q93Var);
        q93Var.b(c());
        for (na3 na3Var : this.f20082e.a()) {
            q93Var.d((View) na3Var.a().get(), na3Var.c(), na3Var.d());
        }
        q93Var.a();
    }

    final /* synthetic */ void g(String str) {
        HashMap hashMap = this.f20081d;
        m93 m93Var = (m93) hashMap.get(str);
        if (m93Var != null) {
            m93Var.c();
            hashMap.remove(str);
        }
    }
}
