package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class qj0 implements vj0 {

    /* renamed from: l, reason: collision with root package name */
    private static final List f14448l = Collections.synchronizedList(new ArrayList());

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f14449m = 0;

    /* renamed from: a, reason: collision with root package name */
    private final x35 f14450a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f14451b;

    /* renamed from: e, reason: collision with root package name */
    private final Context f14454e;

    /* renamed from: f, reason: collision with root package name */
    boolean f14455f;

    /* renamed from: g, reason: collision with root package name */
    private final sj0 f14456g;

    /* renamed from: c, reason: collision with root package name */
    private final List f14452c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f14453d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Object f14457h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private HashSet f14458i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    private boolean f14459j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14460k = false;

    public qj0(Context context, w2.a aVar, sj0 sj0Var, String str, rj0 rj0Var) {
        p3.o.n(sj0Var, "SafeBrowsing config is not present.");
        this.f14454e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f14451b = new LinkedHashMap();
        this.f14456g = sj0Var;
        Iterator it = sj0Var.f15649u.iterator();
        while (it.hasNext()) {
            this.f14458i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f14458i.remove("cookie".toLowerCase(Locale.ENGLISH));
        x35 g02 = e65.g0();
        g02.R(9);
        if (str != null) {
            g02.F(str);
            g02.G(str);
        }
        y35 d02 = z35.d0();
        String str2 = this.f14456g.f15645q;
        if (str2 != null) {
            d02.E(str2);
        }
        g02.H((z35) d02.A());
        p55 d03 = q55.d0();
        d03.G(u3.e.a(this.f14454e).g());
        String str3 = aVar.f27051q;
        if (str3 != null) {
            d03.E(str3);
        }
        long b8 = k3.h.h().b(this.f14454e);
        if (b8 > 0) {
            d03.F(b8);
        }
        g02.O((q55) d03.A());
        this.f14450a = g02;
    }

    @Override // com.google.android.gms.internal.ads.vj0
    public final sj0 a() {
        return this.f14456g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    @Override // com.google.android.gms.internal.ads.vj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.sj0 r0 = r7.f14456g
            boolean r0 = r0.f15647s
            if (r0 != 0) goto L8
            goto L88
        L8:
            boolean r0 = r7.f14459j
            if (r0 != 0) goto L88
            r2.t.g()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L15
            goto L76
        L15:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L27
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L27
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L27
            if (r3 == 0) goto L29
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L27
            goto L2a
        L27:
            r2 = move-exception
            goto L30
        L29:
            r3 = r1
        L2a:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2e
            goto L38
        L2e:
            r2 = move-exception
            goto L31
        L30:
            r3 = r1
        L31:
            int r4 = v2.n1.f26802b
            java.lang.String r4 = "Fail to capture the web view"
            w2.p.d(r4, r2)
        L38:
            if (r3 != 0) goto L75
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            if (r2 == 0) goto L65
            if (r3 != 0) goto L47
            goto L65
        L47:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L63
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L63
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L63
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L63
            r1 = r4
            goto L76
        L63:
            r8 = move-exception
            goto L6d
        L65:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = v2.n1.f26802b     // Catch: java.lang.RuntimeException -> L63
            w2.p.f(r8)     // Catch: java.lang.RuntimeException -> L63
            goto L76
        L6d:
            int r2 = v2.n1.f26802b
            java.lang.String r2 = "Fail to capture the webview"
            w2.p.d(r2, r8)
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto L7e
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.uj0.a(r8)
            return
        L7e:
            r7.f14459j = r0
            com.google.android.gms.internal.ads.pj0 r8 = new com.google.android.gms.internal.ads.pj0
            r8.<init>()
            v2.f2.T(r8)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qj0.b(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.vj0
    public final void c(String str, Map map, int i7) {
        synchronized (this.f14457h) {
            if (i7 == 3) {
                try {
                    this.f14460k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.f14451b;
            if (linkedHashMap.containsKey(str)) {
                if (i7 == 3) {
                    ((n55) linkedHashMap.get(str)).I(4);
                }
                return;
            }
            n55 f02 = o55.f0();
            int a8 = m55.a(i7);
            if (a8 != 0) {
                f02.I(a8);
            }
            f02.E(linkedHashMap.size());
            f02.F(str);
            l45 d02 = o45.d0();
            if (!this.f14458i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f14458i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        j45 d03 = k45.d0();
                        d03.E(qy4.t(str2));
                        d03.F(qy4.t(str3));
                        d02.E((k45) d03.A());
                    }
                }
            }
            f02.G((o45) d02.A());
            linkedHashMap.put(str, f02);
        }
    }

    @Override // com.google.android.gms.internal.ads.vj0
    public final boolean d() {
        return this.f14456g.f15647s && !this.f14459j;
    }

    @Override // com.google.android.gms.internal.ads.vj0
    public final void e() {
        synchronized (this.f14457h) {
            this.f14451b.keySet();
            a5.d a8 = p64.a(Collections.EMPTY_MAP);
            w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.mj0
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return qj0.this.g((Map) obj);
                }
            };
            z64 z64Var = cm0.f6506g;
            a5.d j7 = p64.j(a8, w54Var, z64Var);
            a5.d i7 = p64.i(j7, 10L, TimeUnit.SECONDS, cm0.f6503d);
            p64.r(j7, new lj0(this, i7), z64Var);
            f14448l.add(i7);
        }
    }

    final /* synthetic */ void f(Bitmap bitmap) {
        py4 x7 = qy4.x();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, x7);
        synchronized (this.f14457h) {
            x35 x35Var = this.f14450a;
            h55 d02 = j55.d0();
            d02.F(x7.a());
            d02.E("image/png");
            d02.G(2);
            x35Var.N((j55) d02.A());
        }
    }

    final /* synthetic */ a5.d g(Map map) {
        int length;
        n55 n55Var;
        a5.d k7;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = this.f14457h;
                        synchronized (obj) {
                            try {
                                length = optJSONArray.length();
                                synchronized (obj) {
                                    n55Var = (n55) this.f14451b.get(str);
                                }
                            } finally {
                            }
                        }
                        if (n55Var == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            uj0.a(sb.toString());
                        } else {
                            for (int i7 = 0; i7 < length; i7++) {
                                n55Var.H(optJSONArray.getJSONObject(i7).getString("threat_type"));
                            }
                            this.f14455f = (length > 0) | this.f14455f;
                        }
                    }
                }
            } catch (JSONException e8) {
                if (((Boolean) e10.f7386a.e()).booleanValue()) {
                    int i8 = v2.n1.f26802b;
                    w2.p.b("Failed to get SafeBrowsing metadata", e8);
                }
                return p64.c(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f14455f) {
            synchronized (this.f14457h) {
                this.f14450a.R(10);
            }
        }
        boolean z7 = this.f14455f;
        if (!(z7 && this.f14456g.f15651w) && (!(this.f14460k && this.f14456g.f15650v) && (z7 || !this.f14456g.f15648t))) {
            return p64.a(null);
        }
        synchronized (this.f14457h) {
            try {
                Iterator it = this.f14451b.values().iterator();
                while (it.hasNext()) {
                    this.f14450a.J((o55) ((n55) it.next()).A());
                }
                x35 x35Var = this.f14450a;
                x35Var.P(this.f14452c);
                x35Var.Q(this.f14453d);
                if (uj0.b()) {
                    String E = x35Var.E();
                    String K = x35Var.K();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(E).length() + 38 + String.valueOf(K).length() + 15);
                    sb2.append("Sending SB report\n  url: ");
                    sb2.append(E);
                    sb2.append("\n  clickUrl: ");
                    sb2.append(K);
                    sb2.append("\n  resources: \n");
                    StringBuilder sb3 = new StringBuilder(sb2.toString());
                    for (o55 o55Var : x35Var.I()) {
                        sb3.append("    [");
                        sb3.append(o55Var.e0());
                        sb3.append("] ");
                        sb3.append(o55Var.d0());
                    }
                    uj0.a(sb3.toString());
                }
                a5.d b8 = new v2.n0(this.f14454e).b(1, this.f14456g.f15646r, null, ((e65) x35Var.A()).e());
                if (uj0.b()) {
                    b8.c(oj0.f13341q, cm0.f6500a);
                }
                k7 = p64.k(b8, nj0.f12751a, cm0.f6506g);
            } finally {
            }
        }
        return k7;
    }

    @Override // com.google.android.gms.internal.ads.vj0
    public final void v(String str) {
        synchronized (this.f14457h) {
            try {
                if (str == null) {
                    this.f14450a.M();
                } else {
                    this.f14450a.L(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
