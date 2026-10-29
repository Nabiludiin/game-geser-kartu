package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: MyApplication */
public final class y92 implements aa2 {
    static /* synthetic */ fa2 l(String str, String str2, String str3, ba2 ba2Var, String str4, WebView webView, String str5, String str6, ca2 ca2Var) {
        ba3 a8 = ba3.a("Google", str2);
        aa3 n7 = n("javascript");
        r93 p7 = p(ba2Var.toString());
        aa3 aa3Var = aa3.NONE;
        if (n7 == aa3Var) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (p7 == null) {
            String valueOf = String.valueOf(ba2Var);
            int i8 = v2.n1.f26802b;
            w2.p.f("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        aa3 n8 = n(str4);
        if (p7 != r93.VIDEO || n8 != aa3Var) {
            o93 a9 = o93.a(a8, webView, str5, "");
            return new fa2(m93.e(n93.a(p7, o(ca2Var.toString()), n7, n8, true), a9), a9);
        }
        String valueOf2 = String.valueOf(str4);
        int i9 = v2.n1.f26802b;
        w2.p.f("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    static /* synthetic */ fa2 m(String str, String str2, String str3, String str4, ba2 ba2Var, WebView webView, String str5, String str6, ca2 ca2Var) {
        ba3 a8 = ba3.a(str, str2);
        aa3 n7 = n("javascript");
        aa3 n8 = n(str4);
        r93 p7 = p(ba2Var.toString());
        aa3 aa3Var = aa3.NONE;
        if (n7 == aa3Var) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (p7 == null) {
            String valueOf = String.valueOf(ba2Var);
            int i8 = v2.n1.f26802b;
            w2.p.f("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        if (p7 != r93.VIDEO || n8 != aa3Var) {
            o93 b8 = o93.b(a8, webView, str5, "");
            return new fa2(m93.e(n93.a(p7, o(ca2Var.toString()), n7, n8, true), b8), b8);
        }
        String valueOf2 = String.valueOf(str4);
        int i9 = v2.n1.f26802b;
        w2.p.f("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
        return null;
    }

    private static aa3 n(String str) {
        return "native".equals(str) ? aa3.NATIVE : "javascript".equals(str) ? aa3.JAVASCRIPT : aa3.NONE;
    }

    private static v93 o(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    return v93.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return v93.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return v93.BEGIN_TO_RENDER;
        }
        return v93.UNSPECIFIED;
    }

    private static r93 p(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return r93.HTML_DISPLAY;
            }
            return null;
        }
        if (hashCode == 112202875) {
            if (str.equals("video")) {
                return r93.VIDEO;
            }
            return null;
        }
        if (hashCode == 714893483 && str.equals("nativeDisplay")) {
            return r93.NATIVE_DISPLAY;
        }
        return null;
    }

    private static final Object q(x92 x92Var) {
        try {
            return x92Var.a();
        } catch (RuntimeException e8) {
            r2.t.l().j(e8, "omid exception");
            return null;
        }
    }

    private static final void r(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e8) {
            r2.t.l().j(e8, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final void a(final m93 m93Var, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.s92
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue() && k93.b()) {
                    m93.this.b(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final void b(final m93 m93Var) {
        if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue() && k93.b()) {
            Objects.requireNonNull(m93Var);
            r(new Runnable() { // from class: com.google.android.gms.internal.ads.m92
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    m93.this.a();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final void c(final m93 m93Var, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.r92
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue() && k93.b()) {
                    m93.this.d(view, u93.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final void d(final z93 z93Var, final y93 y93Var) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.u92
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                z93.this.b(y93Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final z93 e(final w2.a aVar, final WebView webView, boolean z7) {
        final boolean z8 = true;
        return (z93) q(new x92(webView, z8) { // from class: com.google.android.gms.internal.ads.t92

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ WebView f16043b;

            @Override // com.google.android.gms.internal.ads.x92
            public final /* synthetic */ Object a() {
                w2.a aVar2 = w2.a.this;
                int i7 = aVar2.f27052r;
                int i8 = aVar2.f27053s;
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
                sb.append(i7);
                sb.append(".");
                sb.append(i8);
                return z93.a(ba3.a("Google", sb.toString()), this.f16043b, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final fa2 f(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final ca2 ca2Var, final ba2 ba2Var, final String str6) {
        if (!((Boolean) s2.b0.c().d(uy.P5)).booleanValue() || !k93.b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (fa2) q(new x92(str5, str, str8, str4, ba2Var, webView, str6, str7, ca2Var) { // from class: com.google.android.gms.internal.ads.p92

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ String f13732a;

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ String f13733b;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ String f13735d;

            /* renamed from: e, reason: collision with root package name */
            private final /* synthetic */ ba2 f13736e;

            /* renamed from: f, reason: collision with root package name */
            private final /* synthetic */ WebView f13737f;

            /* renamed from: g, reason: collision with root package name */
            private final /* synthetic */ String f13738g;

            /* renamed from: i, reason: collision with root package name */
            private final /* synthetic */ ca2 f13740i;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ String f13734c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            private final /* synthetic */ String f13739h = "";

            {
                this.f13735d = str4;
                this.f13736e = ba2Var;
                this.f13737f = webView;
                this.f13738g = str6;
                this.f13740i = ca2Var;
            }

            @Override // com.google.android.gms.internal.ads.x92
            public final /* synthetic */ Object a() {
                return y92.m(this.f13732a, this.f13733b, this.f13734c, this.f13735d, this.f13736e, this.f13737f, this.f13738g, this.f13739h, this.f13740i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final fa2 g(final String str, final WebView webView, String str2, String str3, final String str4, final ca2 ca2Var, final ba2 ba2Var, final String str5) {
        if (!((Boolean) s2.b0.c().d(uy.P5)).booleanValue() || !k93.b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (fa2) q(new x92(str7, str, str6, ba2Var, str4, webView, str5, str8, ca2Var) { // from class: com.google.android.gms.internal.ads.o92

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ String f13235b;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ ba2 f13237d;

            /* renamed from: e, reason: collision with root package name */
            private final /* synthetic */ String f13238e;

            /* renamed from: f, reason: collision with root package name */
            private final /* synthetic */ WebView f13239f;

            /* renamed from: g, reason: collision with root package name */
            private final /* synthetic */ String f13240g;

            /* renamed from: i, reason: collision with root package name */
            private final /* synthetic */ ca2 f13242i;

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ String f13234a = "Google";

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ String f13236c = "javascript";

            /* renamed from: h, reason: collision with root package name */
            private final /* synthetic */ String f13241h = "";

            {
                this.f13235b = str;
                this.f13237d = ba2Var;
                this.f13238e = str4;
                this.f13239f = webView;
                this.f13240g = str5;
                this.f13242i = ca2Var;
            }

            @Override // com.google.android.gms.internal.ads.x92
            public final /* synthetic */ Object a() {
                return y92.l(this.f13234a, this.f13235b, this.f13236c, this.f13237d, this.f13238e, this.f13239f, this.f13240g, this.f13241h, this.f13242i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final boolean h(final Context context) {
        if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue()) {
            Boolean bool = (Boolean) q(new x92() { // from class: com.google.android.gms.internal.ads.w92
                @Override // com.google.android.gms.internal.ads.x92
                public final /* synthetic */ Object a() {
                    if (k93.b()) {
                        return Boolean.TRUE;
                    }
                    k93.a(context);
                    return Boolean.valueOf(k93.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i7 = v2.n1.f26802b;
        w2.p.f("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final void i(final z93 z93Var, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.v92
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                z93.this.d(view, u93.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final String j(Context context) {
        if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue()) {
            return (String) q(n92.f12635a);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.aa2
    public final void k(final m93 m93Var) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.q92
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) s2.b0.c().d(uy.P5)).booleanValue() && k93.b()) {
                    m93.this.c();
                }
            }
        });
    }
}
