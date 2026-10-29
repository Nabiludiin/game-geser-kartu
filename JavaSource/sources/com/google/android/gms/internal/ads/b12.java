package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class b12 implements e22, l02 {

    /* renamed from: a, reason: collision with root package name */
    private final m12 f5469a;

    /* renamed from: b, reason: collision with root package name */
    private final f22 f5470b;

    /* renamed from: c, reason: collision with root package name */
    private final n02 f5471c;

    /* renamed from: d, reason: collision with root package name */
    private final w02 f5472d;

    /* renamed from: e, reason: collision with root package name */
    private final k02 f5473e;

    /* renamed from: f, reason: collision with root package name */
    private final z12 f5474f;

    /* renamed from: g, reason: collision with root package name */
    private final i12 f5475g;

    /* renamed from: h, reason: collision with root package name */
    private final i12 f5476h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5477i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f5478j;

    /* renamed from: k, reason: collision with root package name */
    private final String f5479k;

    /* renamed from: p, reason: collision with root package name */
    private JSONObject f5484p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5487s;

    /* renamed from: t, reason: collision with root package name */
    private int f5488t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5489u;

    /* renamed from: l, reason: collision with root package name */
    private final Map f5480l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final Map f5481m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map f5482n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private String f5483o = "{}";

    /* renamed from: q, reason: collision with root package name */
    private long f5485q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    private x02 f5486r = x02.NONE;

    /* renamed from: v, reason: collision with root package name */
    private a12 f5490v = a12.UNKNOWN;

    /* renamed from: w, reason: collision with root package name */
    private long f5491w = 0;

    /* renamed from: x, reason: collision with root package name */
    private String f5492x = "";

    b12(m12 m12Var, f22 f22Var, n02 n02Var, Context context, w2.a aVar, w02 w02Var, z12 z12Var, i12 i12Var, i12 i12Var2, String str) {
        this.f5469a = m12Var;
        this.f5470b = f22Var;
        this.f5471c = n02Var;
        this.f5473e = new k02(context);
        this.f5477i = aVar.f27051q;
        this.f5479k = str;
        this.f5472d = w02Var;
        this.f5474f = z12Var;
        this.f5475g = i12Var;
        this.f5476h = i12Var2;
        this.f5478j = context;
        r2.t.s().a(this);
    }

    private final void A() {
        r2.t.l().q().l(i());
    }

    private final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            u(jSONObject.optBoolean("isTestMode", false), false);
            v((x02) Enum.valueOf(x02.class, jSONObject.optString("gesture", "NONE")), false);
            this.f5483o = jSONObject.optString("networkExtras", "{}");
            this.f5485q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void u(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f5487s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f5487s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.ja     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.sy r0 = s2.b0.c()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.d(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            v2.y r2 = r2.t.s()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.k()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.y()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.t()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.z()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.A()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b12.u(boolean, boolean):void");
    }

    private final synchronized void v(x02 x02Var, boolean z7) {
        try {
            if (this.f5486r != x02Var) {
                if (t()) {
                    z();
                }
                this.f5486r = x02Var;
                if (t()) {
                    y();
                }
                if (z7) {
                    A();
                }
            }
        } finally {
        }
    }

    private final synchronized JSONObject w() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f5480l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (p02 p02Var : (List) entry.getValue()) {
                    if (p02Var.a()) {
                        jSONArray.put(p02Var.e());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void x() {
        this.f5489u = true;
        this.f5472d.a();
        this.f5469a.b(this);
        this.f5470b.b(this);
        this.f5471c.b(this);
        this.f5474f.j8(this);
        ly lyVar = uy.ya;
        if (!TextUtils.isEmpty((CharSequence) s2.b0.c().d(lyVar))) {
            this.f5475g.a(PreferenceManager.getDefaultSharedPreferences(this.f5478j), Arrays.asList(((String) s2.b0.c().d(lyVar)).split(",")));
        }
        ly lyVar2 = uy.za;
        if (!TextUtils.isEmpty((CharSequence) s2.b0.c().d(lyVar2))) {
            this.f5476h.a(this.f5478j.getSharedPreferences("admob", 0), Arrays.asList(((String) s2.b0.c().d(lyVar2)).split(",")));
        }
        a(r2.t.l().q().M());
        this.f5492x = r2.t.l().q().R();
    }

    private final synchronized void y() {
        int ordinal = this.f5486r.ordinal();
        if (ordinal == 1) {
            this.f5470b.c();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f5471c.c();
        }
    }

    private final synchronized void z() {
        int ordinal = this.f5486r.ordinal();
        if (ordinal == 1) {
            this.f5470b.d();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f5471c.d();
        }
    }

    public final void b() {
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue() && r2.t.l().q().V()) {
                x();
                return;
            }
            String M = r2.t.l().q().M();
            if (TextUtils.isEmpty(M)) {
                return;
            }
            try {
                if (new JSONObject(M).optBoolean("isTestMode", false)) {
                    x();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f5489u
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.x()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f5487s
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.y()
            return
        L15:
            boolean r2 = r1.t()
            if (r2 != 0) goto L1e
            r1.z()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b12.c(boolean):void");
    }

    public final void d(boolean z7) {
        if (!this.f5489u && z7) {
            x();
        }
        u(z7, true);
    }

    public final synchronized boolean e() {
        return this.f5487s;
    }

    public final void f(x02 x02Var) {
        v(x02Var, true);
    }

    public final x02 g() {
        return this.f5486r;
    }

    public final synchronized String h() {
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && t()) {
            if (this.f5485q < r2.t.o().a() / 1000) {
                this.f5483o = "{}";
                this.f5485q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f5483o.equals("{}")) {
                return this.f5483o;
            }
        }
        return "";
    }

    public final synchronized String i() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f5487s);
            jSONObject.put("gesture", this.f5486r);
            if (this.f5485q > r2.t.o().a() / 1000) {
                jSONObject.put("networkExtras", this.f5483o);
                jSONObject.put("networkExtrasExpirationSecs", this.f5485q);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void j(String str, long j7) {
        this.f5483o = str;
        this.f5485q = j7;
        A();
    }

    public final synchronized void k(String str) {
        this.f5492x = str;
        r2.t.l().q().z(this.f5492x);
    }

    public final synchronized void l(String str, p02 p02Var) {
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue() && t()) {
            if (this.f5488t >= ((Integer) s2.b0.c().d(uy.W9)).intValue()) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.f5480l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.f5488t++;
            ((List) map.get(str)).add(p02Var);
            if (((Boolean) s2.b0.c().d(uy.sa)).booleanValue()) {
                String b8 = p02Var.b();
                this.f5481m.put(b8, p02Var);
                Map map2 = this.f5482n;
                if (map2.containsKey(b8)) {
                    List list = (List) map2.get(b8);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((im0) it.next()).b(p02Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void m(long j7) {
        this.f5491w += j7;
    }

    public final boolean n() {
        return this.f5491w < ((Long) s2.b0.c().d(uy.pa)).longValue();
    }

    public final synchronized a5.d o(String str) {
        im0 im0Var;
        try {
            im0Var = new im0();
            Map map = this.f5481m;
            if (map.containsKey(str)) {
                im0Var.b((p02) map.get(str));
            } else {
                Map map2 = this.f5482n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(im0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return im0Var;
    }

    public final synchronized void p(s2.k2 k2Var, a12 a12Var) {
        if (!t()) {
            try {
                k2Var.T0(z13.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue()) {
            this.f5490v = a12Var;
            this.f5469a.c(k2Var, new u60(this), new n60(this.f5474f), new z50(this));
            return;
        } else {
            try {
                k2Var.T0(z13.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i8 = v2.n1.f26802b;
                w2.p.f("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void q(JSONObject jSONObject) {
        this.f5484p = jSONObject;
    }

    public final boolean r() {
        return this.f5484p != null;
    }

    public final synchronized JSONObject s() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.f5479k;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append("afma-sdk-a-v");
                    sb.append(str);
                    jSONObject.put("sdkVersion", sb.toString());
                }
                jSONObject.put("internalSdkVersion", this.f5477i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f5472d.b());
                if (((Boolean) s2.b0.c().d(uy.va)).booleanValue()) {
                    String w7 = r2.t.l().w();
                    if (!TextUtils.isEmpty(w7)) {
                        jSONObject.put("plugin", w7);
                    }
                }
                if (this.f5485q < r2.t.o().a() / 1000) {
                    this.f5483o = "{}";
                }
                jSONObject.put("networkExtras", this.f5483o);
                jSONObject.put("adSlots", w());
                jSONObject.put("appInfo", this.f5473e.a());
                String d8 = r2.t.l().q().j().d();
                if (!TextUtils.isEmpty(d8)) {
                    jSONObject.put("cld", new JSONObject(d8));
                }
                if (((Boolean) s2.b0.c().d(uy.ka)).booleanValue() && (jSONObject2 = this.f5484p) != null) {
                    String obj = jSONObject2.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                    sb2.append("Server data: ");
                    sb2.append(obj);
                    String sb3 = sb2.toString();
                    int i7 = v2.n1.f26802b;
                    w2.p.a(sb3);
                    jSONObject.put("serverData", this.f5484p);
                }
                if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
                    jSONObject.put("openAction", this.f5490v);
                    jSONObject.put("gesture", this.f5486r);
                }
                jSONObject.put("isGamRegisteredTestDevice", r2.t.s().k());
                r2.t.g();
                s2.z.a();
                jSONObject.put("isSimulator", w2.g.z());
                if (((Boolean) s2.b0.c().d(uy.xa)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.f5492x));
                }
                if (!TextUtils.isEmpty((CharSequence) s2.b0.c().d(uy.za))) {
                    jSONObject.put("gmaDisk", this.f5476h.b());
                }
                if (!TextUtils.isEmpty((CharSequence) s2.b0.c().d(uy.ya))) {
                    jSONObject.put("userDisk", this.f5475g.b());
                }
            } catch (JSONException e8) {
                r2.t.l().j(e8, "Inspector.toJson");
                int i8 = v2.n1.f26802b;
                w2.p.g("Ad inspector encountered an error", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized boolean t() {
        if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
            return this.f5487s || r2.t.s().k();
        }
        return this.f5487s;
    }
}
