package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ju1 {

    /* renamed from: a, reason: collision with root package name */
    private final u91 f10765a;

    /* renamed from: b, reason: collision with root package name */
    private final ni1 f10766b;

    /* renamed from: c, reason: collision with root package name */
    private final eb1 f10767c;

    /* renamed from: d, reason: collision with root package name */
    private final wb1 f10768d;

    /* renamed from: e, reason: collision with root package name */
    private final nc1 f10769e;

    /* renamed from: f, reason: collision with root package name */
    private final jf1 f10770f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f10771g;

    /* renamed from: h, reason: collision with root package name */
    private final ji1 f10772h;

    /* renamed from: i, reason: collision with root package name */
    private final b11 f10773i;

    /* renamed from: j, reason: collision with root package name */
    private final r2.b f10774j;

    /* renamed from: k, reason: collision with root package name */
    private final vj0 f10775k;

    /* renamed from: l, reason: collision with root package name */
    private final fn f10776l;

    /* renamed from: m, reason: collision with root package name */
    private final af1 f10777m;

    /* renamed from: n, reason: collision with root package name */
    private final v82 f10778n;

    /* renamed from: o, reason: collision with root package name */
    private final x73 f10779o;

    /* renamed from: p, reason: collision with root package name */
    private final rx1 f10780p;

    /* renamed from: q, reason: collision with root package name */
    private final d01 f10781q;

    /* renamed from: r, reason: collision with root package name */
    private final pu1 f10782r;

    /* renamed from: s, reason: collision with root package name */
    private final vy1 f10783s;

    /* renamed from: t, reason: collision with root package name */
    private final u81 f10784t;

    public ju1(u91 u91Var, eb1 eb1Var, wb1 wb1Var, nc1 nc1Var, jf1 jf1Var, Executor executor, ji1 ji1Var, b11 b11Var, r2.b bVar, vj0 vj0Var, fn fnVar, af1 af1Var, v82 v82Var, x73 x73Var, rx1 rx1Var, ni1 ni1Var, d01 d01Var, pu1 pu1Var, vy1 vy1Var, u81 u81Var) {
        this.f10765a = u91Var;
        this.f10767c = eb1Var;
        this.f10768d = wb1Var;
        this.f10769e = nc1Var;
        this.f10770f = jf1Var;
        this.f10771g = executor;
        this.f10772h = ji1Var;
        this.f10773i = b11Var;
        this.f10774j = bVar;
        this.f10775k = vj0Var;
        this.f10776l = fnVar;
        this.f10777m = af1Var;
        this.f10778n = v82Var;
        this.f10779o = x73Var;
        this.f10780p = rx1Var;
        this.f10766b = ni1Var;
        this.f10781q = d01Var;
        this.f10782r = pu1Var;
        this.f10783s = vy1Var;
        this.f10784t = u81Var;
    }

    public static final a5.d j(mr0 mr0Var, String str, String str2, final Bundle bundle, b63 b63Var) {
        if (((Boolean) s2.b0.c().d(uy.f17248y2)).booleanValue()) {
            bundle.putLong(yw1.RENDERING_WEBVIEW_LOAD_HTML_START.c(), r2.t.o().a());
        }
        final im0 im0Var = new im0();
        if (((Boolean) s2.b0.c().d(uy.Q9)).booleanValue()) {
            r53 a8 = q53.a(mr0Var.getContext(), 112);
            a8.a();
            a63.d(im0Var, b63Var, a8);
        }
        mr0Var.s0().g1(new mt0() { // from class: com.google.android.gms.internal.ads.hu1
            @Override // com.google.android.gms.internal.ads.mt0
            public final /* synthetic */ void a(boolean z7, int i7, String str3, String str4) {
                im0 im0Var2 = im0Var;
                if (z7) {
                    if (((Boolean) s2.b0.c().d(uy.f17248y2)).booleanValue()) {
                        bundle.putLong(yw1.RENDERING_WEBVIEW_LOAD_HTML_END.c(), r2.t.o().a());
                    }
                    im0Var2.b(null);
                    return;
                }
                int length = String.valueOf(i7).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Ad Web View failed to load. Error code: ");
                sb.append(i7);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                im0Var2.e(new Exception(sb.toString()));
            }
        });
        mr0Var.a1(str, str2, null);
        return im0Var;
    }

    final /* synthetic */ void a() {
        this.f10765a.c0();
    }

    final /* synthetic */ void b(String str, String str2) {
        this.f10770f.Y0(str, str2);
    }

    final /* synthetic */ void c() {
        this.f10767c.U0();
    }

    final /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        if (((Boolean) s2.b0.c().d(uy.cb)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f10782r.a(motionEvent);
        }
        this.f10774j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    final /* synthetic */ void e(View view) {
        this.f10774j.a();
    }

    final /* synthetic */ void f(mr0 mr0Var, mr0 mr0Var2, Map map) {
        this.f10773i.c(mr0Var);
    }

    final /* synthetic */ eb1 g() {
        return this.f10767c;
    }

    final /* synthetic */ af1 h() {
        return this.f10777m;
    }

    public final void i(final mr0 mr0Var, boolean z7, c60 c60Var, Bundle bundle) {
        zm b8;
        ly lyVar = uy.f17248y2;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            bundle.putLong(yw1.RENDERING_CONFIGURE_WEBVIEW_START.c(), r2.t.o().a());
        }
        mr0Var.s0().L(new s2.a() { // from class: com.google.android.gms.internal.ads.iu1
            @Override // s2.a
            public final /* synthetic */ void c0() {
                ju1.this.a();
            }
        }, this.f10768d, this.f10769e, new p40() { // from class: com.google.android.gms.internal.ads.au1
            @Override // com.google.android.gms.internal.ads.p40
            public final /* synthetic */ void Y0(String str, String str2) {
                ju1.this.b(str, str2);
            }
        }, new u2.e() { // from class: com.google.android.gms.internal.ads.bu1
            @Override // u2.e
            public final /* synthetic */ void k() {
                ju1.this.c();
            }
        }, z7, c60Var, this.f10774j, new zt1(this), this.f10775k, this.f10778n, this.f10779o, this.f10780p, null, this.f10766b, null, null, null, this.f10781q, this.f10783s, this.f10784t);
        mr0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.cu1
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                ju1.this.d(view, motionEvent);
                return false;
            }
        });
        mr0Var.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.du1
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ju1.this.e(view);
            }
        });
        if (((Boolean) s2.b0.c().d(uy.Z2)).booleanValue() && (b8 = this.f10776l.b()) != null) {
            b8.k(mr0Var.Z());
        }
        ji1 ji1Var = this.f10772h;
        Executor executor = this.f10771g;
        ji1Var.y0(mr0Var, executor);
        ji1Var.y0(new gr() { // from class: com.google.android.gms.internal.ads.eu1
            @Override // com.google.android.gms.internal.ads.gr
            public final /* synthetic */ void t(fr frVar) {
                Rect rect = frVar.f8424d;
                mr0.this.s0().h0(rect.left, rect.top, false);
            }
        }, executor);
        ji1Var.U0(mr0Var.Z());
        mr0Var.O0("/trackActiveViewUnit", new y50() { // from class: com.google.android.gms.internal.ads.gu1
            @Override // com.google.android.gms.internal.ads.y50
            public final /* synthetic */ void a(Object obj, Map map) {
                ju1.this.f(mr0Var, (mr0) obj, map);
            }
        });
        this.f10773i.e(mr0Var);
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            bundle.putLong(yw1.RENDERING_CONFIGURE_WEBVIEW_END.c(), r2.t.o().a());
        }
    }
}
