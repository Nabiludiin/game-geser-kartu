package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class fb3 extends bb3 {

    /* renamed from: e, reason: collision with root package name */
    private WebView f8121e;

    /* renamed from: f, reason: collision with root package name */
    private Long f8122f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f8123g;

    public fb3(String str, Map map, String str2) {
        super(str);
        this.f8122f = null;
        this.f8123g = map;
    }

    @Override // com.google.android.gms.internal.ads.bb3
    public final void a() {
        WebView webView = new WebView(pa3.a().b());
        this.f8121e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f8121e.getSettings().setAllowContentAccess(false);
        this.f8121e.getSettings().setAllowFileAccess(false);
        this.f8121e.setWebViewClient(new db3(this));
        c(this.f8121e);
        ra3.k(this.f8121e, null);
        Map map = this.f8123g;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(map.get((String) it.next()));
            throw null;
        }
        this.f8122f = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.bb3
    public final void b() {
        super.b();
        new Handler().postDelayed(new eb3(this), Math.max(4000 - (this.f8122f == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f8122f.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f8121e = null;
    }

    @Override // com.google.android.gms.internal.ads.bb3
    public final void k(q93 q93Var, o93 o93Var) {
        JSONObject jSONObject = new JSONObject();
        Map e8 = o93Var.e();
        Iterator it = e8.keySet().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(e8.get((String) it.next()));
            throw null;
        }
        l(q93Var, o93Var, jSONObject);
    }

    final /* synthetic */ WebView q() {
        return this.f8121e;
    }
}
