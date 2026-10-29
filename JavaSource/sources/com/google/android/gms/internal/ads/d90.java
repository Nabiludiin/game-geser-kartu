package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class d90 implements u80, s80 {

    /* renamed from: q, reason: collision with root package name */
    private final mr0 f6987q;

    public d90(Context context, w2.a aVar, fn fnVar, r2.a aVar2) {
        r2.t.h();
        mr0 a8 = ds0.a(context, bu0.b(), "", false, false, null, null, aVar, null, null, null, iu.a(), null, null, null, null, null);
        this.f6987q = a8;
        a8.Z().setWillNotDraw(true);
    }

    private static final void r(Runnable runnable) {
        s2.z.a();
        if (w2.g.C()) {
            v2.n1.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            v2.n1.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (v2.f2.f26746l.post(runnable)) {
                return;
            }
            w2.p.f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.q80
    public /* synthetic */ void B(String str, Map map) {
        r80.d(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void J(String str, final y50 y50Var) {
        this.f6987q.o1(str, new com.google.android.gms.common.util.o() { // from class: com.google.android.gms.internal.ads.b90
            @Override // com.google.android.gms.common.util.o
            public final /* synthetic */ boolean apply(Object obj) {
                y50 y50Var2 = (y50) obj;
                if (y50Var2 instanceof v80) {
                    return ((v80) y50Var2).b().equals(y50.this);
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void K(String str, y50 y50Var) {
        this.f6987q.O0(str, new v80(this, y50Var));
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void X0(final t80 t80Var) {
        ot0 s02 = this.f6987q.s0();
        Objects.requireNonNull(t80Var);
        s02.Y(new nt0() { // from class: com.google.android.gms.internal.ads.w80
            @Override // com.google.android.gms.internal.ads.nt0
            public final /* synthetic */ void a() {
                t80.this.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q80, com.google.android.gms.internal.ads.s80
    public /* synthetic */ void a(String str, JSONObject jSONObject) {
        r80.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void a0(final String str) {
        v2.n1.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.a90
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d90.this.q(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.e90, com.google.android.gms.internal.ads.s80
    public final void b(final String str) {
        v2.n1.k("invokeJavascript on adWebView from js");
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.c90
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d90.this.d(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.e90
    public /* synthetic */ void c(String str, JSONObject jSONObject) {
        r80.a(this, str, jSONObject);
    }

    final /* synthetic */ void d(String str) {
        this.f6987q.b(str);
    }

    final /* synthetic */ void e(String str) {
        this.f6987q.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void f(String str) {
        this.f6987q.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.e90, com.google.android.gms.internal.ads.s80
    public /* synthetic */ void h(String str, String str2) {
        r80.b(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void i() {
        this.f6987q.destroy();
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final da0 k() {
        return new da0(this);
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final boolean l() {
        return this.f6987q.q0();
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void p0(final String str) {
        v2.n1.k("loadHtml on adWebView from html");
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.z80
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d90.this.f(str);
            }
        });
    }

    final /* synthetic */ void q(String str) {
        this.f6987q.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void u(String str) {
        v2.n1.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.x80
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d90.this.e(format);
            }
        });
    }
}
