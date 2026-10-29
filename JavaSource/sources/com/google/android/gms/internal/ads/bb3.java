package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class bb3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5675a;

    /* renamed from: b, reason: collision with root package name */
    private dc3 f5676b;

    /* renamed from: c, reason: collision with root package name */
    private long f5677c;

    /* renamed from: d, reason: collision with root package name */
    private int f5678d;

    public bb3(String str) {
        p();
        this.f5675a = str;
        this.f5676b = new dc3(null);
    }

    public void b() {
        this.f5676b.clear();
    }

    final void c(WebView webView) {
        this.f5676b = new dc3(webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView d() {
        return (WebView) this.f5676b.get();
    }

    public final boolean e() {
        return this.f5676b.get() != 0;
    }

    public final void f(boolean z7) {
        if (e()) {
            ra3.a().f(d(), this.f5675a, true != z7 ? "backgrounded" : "foregrounded");
        }
    }

    public final void g(boolean z7) {
        if (e()) {
            ra3.a().g(d(), this.f5675a, true != z7 ? "unlocked" : "locked");
        }
    }

    public final void h(String str, long j7) {
        if (j7 >= this.f5677c) {
            this.f5678d = 2;
            ra3.a().e(d(), this.f5675a, str);
        }
    }

    public final void i(String str, long j7) {
        if (j7 < this.f5677c || this.f5678d == 3) {
            return;
        }
        this.f5678d = 3;
        ra3.a().e(d(), this.f5675a, str);
    }

    public final void j(n93 n93Var) {
        ra3.a().b(d(), this.f5675a, n93Var.b());
    }

    public void k(q93 q93Var, o93 o93Var) {
        l(q93Var, o93Var, null);
    }

    protected final void l(q93 q93Var, o93 o93Var, JSONObject jSONObject) {
        String h8 = q93Var.h();
        JSONObject jSONObject2 = new JSONObject();
        hb3.c(jSONObject2, "environment", "app");
        hb3.c(jSONObject2, "adSessionType", o93Var.i());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        hb3.c(jSONObject3, "deviceType", sb.toString());
        hb3.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        hb3.c(jSONObject3, "os", "Android");
        hb3.c(jSONObject2, "deviceInfo", jSONObject3);
        hb3.c(jSONObject2, "deviceCategory", gb3.b().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        hb3.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        hb3.c(jSONObject4, "partnerName", o93Var.c().b());
        hb3.c(jSONObject4, "partnerVersion", o93Var.c().c());
        hb3.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        hb3.c(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        hb3.c(jSONObject5, "appId", pa3.a().b().getApplicationContext().getPackageName());
        hb3.c(jSONObject2, "app", jSONObject5);
        if (o93Var.g() != null) {
            hb3.c(jSONObject2, "contentUrl", o93Var.g());
        }
        if (o93Var.h() != null) {
            hb3.c(jSONObject2, "customReferenceData", o93Var.h());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = o93Var.d().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        ra3.a().c(d(), h8, jSONObject2, jSONObject6, jSONObject);
    }

    public final void m() {
        ra3.a().d(d(), this.f5675a);
    }

    public final void n(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        hb3.c(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        ra3.a().i(d(), jSONObject);
    }

    public final void o(float f8) {
        ra3.a().h(d(), this.f5675a, f8);
    }

    public final void p() {
        this.f5677c = System.nanoTime();
        this.f5678d = 1;
    }

    public void a() {
    }
}
