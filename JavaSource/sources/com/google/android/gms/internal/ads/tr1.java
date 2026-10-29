package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class tr1 {

    /* renamed from: a, reason: collision with root package name */
    private final w03 f16321a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16322b;

    /* renamed from: c, reason: collision with root package name */
    private final ku1 f16323c;

    /* renamed from: d, reason: collision with root package name */
    private final dt1 f16324d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f16325e;

    /* renamed from: f, reason: collision with root package name */
    private final rx1 f16326f;

    /* renamed from: g, reason: collision with root package name */
    private final x73 f16327g;

    /* renamed from: h, reason: collision with root package name */
    private final v82 f16328h;

    /* renamed from: i, reason: collision with root package name */
    private final lx1 f16329i;

    /* renamed from: j, reason: collision with root package name */
    private final vy1 f16330j;

    public tr1(w03 w03Var, Executor executor, ku1 ku1Var, Context context, rx1 rx1Var, x73 x73Var, v82 v82Var, dt1 dt1Var, lx1 lx1Var, vy1 vy1Var) {
        this.f16321a = w03Var;
        this.f16322b = executor;
        this.f16323c = ku1Var;
        this.f16325e = context;
        this.f16326f = rx1Var;
        this.f16327g = x73Var;
        this.f16328h = v82Var;
        this.f16324d = dt1Var;
        this.f16329i = lx1Var;
        this.f16330j = vy1Var;
    }

    private final void h(mr0 mr0Var, gm0 gm0Var) {
        s2.u4 u4Var = this.f16321a.f17955a;
        if (u4Var != null && mr0Var.g() != null) {
            mr0Var.g().k8(u4Var);
        }
        gm0Var.g();
    }

    private final void i(mr0 mr0Var, r2.b bVar, vj0 vj0Var) {
        vy1 vy1Var;
        j(mr0Var);
        mr0Var.O0("/video", x50.f18553l);
        mr0Var.O0("/videoMeta", x50.f18554m);
        mr0Var.O0("/precache", new rp0());
        mr0Var.O0("/delayPageLoaded", x50.f18557p);
        mr0Var.O0("/instrument", x50.f18555n);
        mr0Var.O0("/log", x50.f18548g);
        mr0Var.O0("/click", x50.b(null, null));
        if (this.f16321a.f17956b != null) {
            mr0Var.s0().N(true);
            mr0Var.O0("/open", new m60(true != ((Boolean) s2.b0.c().d(uy.Ce)).booleanValue() ? null : bVar, null, null, null, null, null));
        } else {
            mr0Var.s0().N(false);
        }
        if (r2.t.d().a(mr0Var.getContext())) {
            Map hashMap = new HashMap();
            if (mr0Var.T() != null) {
                hashMap = mr0Var.T().f6195w0;
            }
            mr0Var.O0("/logScionEvent", new f60(mr0Var.getContext(), hashMap));
        }
        if (((Boolean) s2.b0.c().d(uy.Ce)).booleanValue()) {
            mr0Var.s0().G(bVar);
            mr0Var.s0().b0(vj0Var);
        }
        if (!((Boolean) s2.b0.c().d(uy.u8)).booleanValue() || (vy1Var = this.f16330j) == null) {
            return;
        }
        mr0Var.O0("/onDeviceStorageEvent", new h60(vy1Var));
    }

    private static final void j(mr0 mr0Var) {
        mr0Var.O0("/videoClicked", x50.f18549h);
        mr0Var.s0().k1(true);
        mr0Var.O0("/getNativeAdViewSignals", x50.f18560s);
        mr0Var.O0("/getNativeClickMeta", x50.f18561t);
    }

    public final a5.d a(final JSONObject jSONObject, final r2.b bVar, final vj0 vj0Var) {
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f16329i.e().putLong(yw1.NATIVE_ASSETS_LOADING_VIDEO_START.c(), r2.t.o().a());
        }
        a5.d a8 = p64.a(null);
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.or1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return tr1.this.e(bVar, vj0Var, obj);
            }
        };
        Executor executor = this.f16322b;
        return p64.j(p64.j(a8, w54Var, executor), new w54() { // from class: com.google.android.gms.internal.ads.sr1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return tr1.this.c(jSONObject, (mr0) obj);
            }
        }, executor);
    }

    public final a5.d b(final String str, final String str2, final c03 c03Var, final f03 f03Var, final s2.g5 g5Var, final r2.b bVar, final vj0 vj0Var) {
        if (((Boolean) s2.b0.c().d(uy.C2)).booleanValue()) {
            this.f16329i.e().putLong(yw1.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.c(), r2.t.o().a());
        }
        return p64.j(p64.a(null), new w54() { // from class: com.google.android.gms.internal.ads.nr1
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return tr1.this.d(g5Var, c03Var, f03Var, bVar, vj0Var, str, str2, obj);
            }
        }, this.f16322b);
    }

    final /* synthetic */ a5.d c(JSONObject jSONObject, final mr0 mr0Var) {
        f80 f80Var = this.f16321a.f17956b;
        final gm0 f8 = gm0.f(mr0Var);
        if (f80Var != null) {
            mr0Var.T0(bu0.e());
        } else {
            mr0Var.T0(bu0.d());
        }
        mr0Var.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.rr1
            @Override // com.google.android.gms.internal.ads.mt0
            public final /* synthetic */ void a(boolean z7, int i7, String str, String str2) {
                tr1.this.g(mr0Var, f8, z7, i7, str, str2);
            }
        });
        mr0Var.c("google.afma.nativeAds.renderVideo", jSONObject);
        return f8;
    }

    final /* synthetic */ a5.d d(s2.g5 g5Var, c03 c03Var, f03 f03Var, r2.b bVar, vj0 vj0Var, String str, String str2, Object obj) {
        final mr0 a8 = this.f16323c.a(g5Var, c03Var, f03Var);
        final gm0 f8 = gm0.f(a8);
        if (this.f16321a.f17956b != null) {
            i(a8, bVar, vj0Var);
            a8.T0(bu0.e());
        } else {
            at1 a9 = this.f16324d.a();
            ot0 s02 = a8.s0();
            ly lyVar = uy.Ce;
            s02.L(a9, a9, a9, a9, a9, false, null, !((Boolean) s2.b0.c().d(lyVar)).booleanValue() ? new r2.b(this.f16325e, null, null) : bVar, null, true != ((Boolean) s2.b0.c().d(lyVar)).booleanValue() ? null : vj0Var, this.f16328h, this.f16327g, this.f16326f, null, a9, null, null, null, null, this.f16330j, null);
            j(a8);
        }
        a8.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.qr1
            @Override // com.google.android.gms.internal.ads.mt0
            public final /* synthetic */ void a(boolean z7, int i7, String str3, String str4) {
                tr1.this.f(a8, f8, z7, i7, str3, str4);
            }
        });
        a8.a1(str, str2, null);
        return f8;
    }

    final /* synthetic */ a5.d e(r2.b bVar, vj0 vj0Var, Object obj) {
        mr0 a8 = this.f16323c.a(s2.g5.N0(), null, null);
        final gm0 f8 = gm0.f(a8);
        i(a8, bVar, vj0Var);
        a8.s0().Y(new nt0() { // from class: com.google.android.gms.internal.ads.pr1
            @Override // com.google.android.gms.internal.ads.nt0
            public final /* synthetic */ void a() {
                gm0.this.g();
            }
        });
        a8.loadUrl((String) s2.b0.c().d(uy.f17170o4));
        return f8;
    }

    final /* synthetic */ void f(mr0 mr0Var, gm0 gm0Var, boolean z7, int i7, String str, String str2) {
        if (z7) {
            s2.u4 u4Var = this.f16321a.f17955a;
            if (u4Var != null && mr0Var.g() != null) {
                mr0Var.g().k8(u4Var);
            }
            gm0Var.g();
            return;
        }
        int length = String.valueOf(i7).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i7);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        gm0Var.e(new ce2(1, sb.toString()));
    }

    final /* synthetic */ void g(mr0 mr0Var, gm0 gm0Var, boolean z7, int i7, String str, String str2) {
        if (!((Boolean) s2.b0.c().d(uy.f17234w4)).booleanValue()) {
            h(mr0Var, gm0Var);
            return;
        }
        if (z7) {
            h(mr0Var, gm0Var);
            return;
        }
        int length = String.valueOf(i7).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i7);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        gm0Var.e(new ce2(1, sb.toString()));
    }
}
