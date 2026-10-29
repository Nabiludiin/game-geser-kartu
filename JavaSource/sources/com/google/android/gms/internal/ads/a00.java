package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import k2.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class a00 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f4627a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.j1 f4628b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.a1 f4629c;

    /* renamed from: d, reason: collision with root package name */
    private final wx1 f4630d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f4631e;

    /* renamed from: f, reason: collision with root package name */
    private xz f4632f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.browser.customtabs.f f4633g;

    /* renamed from: h, reason: collision with root package name */
    private String f4634h;

    /* renamed from: i, reason: collision with root package name */
    private long f4635i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f4636j;

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f4637k;

    /* renamed from: l, reason: collision with root package name */
    private Context f4638l;

    public a00(ScheduledExecutorService scheduledExecutorService, b3.j1 j1Var, b3.a1 a1Var, wx1 wx1Var) {
        this.f4627a = scheduledExecutorService;
        this.f4628b = j1Var;
        this.f4629c = a1Var;
        this.f4630d = wx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.Sa)).booleanValue() != false) goto L23;
     */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.xz r0 = r5.f4632f
            if (r0 != 0) goto Lc
            int r0 = v2.n1.f26802b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            w2.p.c(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.l()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r5.f4634h
            if (r0 == 0) goto L70
            androidx.browser.customtabs.f r0 = r5.f4633g
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.f4627a
            if (r0 == 0) goto L70
            long r1 = r5.f4635i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3b
        L2c:
            com.google.android.gms.common.util.e r1 = r2.t.o()
            long r1 = r1.b()
            long r3 = r5.f4635i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3b
            goto L4d
        L3b:
            com.google.android.gms.internal.ads.ly r1 = com.google.android.gms.internal.ads.uy.Sa
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r1 = r2.d(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L70
        L4d:
            androidx.browser.customtabs.f r1 = r5.f4633g
            java.lang.String r2 = r5.f4634h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.h(r2)
            java.lang.Runnable r1 = r5.f4631e
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.Ta
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()
            java.lang.Object r2 = r3.d(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            v2.n1.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a00.h():void");
    }

    private final void k(JSONObject jSONObject) {
        try {
            if (this.f4637k == null) {
                this.f4637k = new JSONArray((String) s2.b0.c().d(uy.Va));
            }
            jSONObject.put("eids", this.f4637k);
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error fetching the PACT active eids JSON: ", e8);
        }
    }

    public final void a(Context context, androidx.browser.customtabs.c cVar, String str, androidx.browser.customtabs.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.f4638l = context;
        this.f4634h = str;
        wx1 wx1Var = this.f4630d;
        xz xzVar = new xz(this, bVar, wx1Var);
        this.f4632f = xzVar;
        androidx.browser.customtabs.f e8 = cVar.e(xzVar);
        this.f4633g = e8;
        if (e8 == null) {
            int i7 = v2.n1.f26802b;
            w2.p.c("CustomTabsClient failed to create new session.");
        }
        b3.c.e(wx1Var, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final androidx.browser.customtabs.f b() {
        return this.f4633g;
    }

    final void c() {
        this.f4635i = r2.t.o().b() + ((Integer) s2.b0.c().d(uy.Ra)).intValue();
        if (this.f4631e == null) {
            this.f4631e = new Runnable() { // from class: com.google.android.gms.internal.ads.zz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    a00.this.h();
                }
            };
        }
        h();
    }

    final void d(String str) {
        try {
            androidx.browser.customtabs.f fVar = this.f4633g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f4636j).toString());
            k(jSONObject);
            if (((Boolean) b10.f5453c.e()).booleanValue()) {
                jSONObject.put("as", this.f4629c.b());
            }
            fVar.g(jSONObject.toString(), null);
            yz yzVar = new yz(this, str);
            if (((Boolean) b10.f5455e.e()).booleanValue()) {
                this.f4628b.b(this.f4633g, yzVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            e3.a.a(this.f4638l, k2.c.BANNER, ((g.a) new g.a().c(AdMobAdapter.class, bundle)).k(), yzVar);
        } catch (JSONException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error creating JSON: ", e8);
        }
    }

    final JSONObject e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) b10.f5455e.e()).booleanValue() ? ((Long) b10.f5458h.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) b10.f5453c.e()).booleanValue()) {
            jSONObject.put("as", this.f4629c.b());
        }
        return jSONObject;
    }

    final JSONObject f(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) b10.f5455e.e()).booleanValue() ? ((Long) b10.f5458h.e()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) b10.f5453c.e()).booleanValue()) {
            jSONObject.put("as", this.f4629c.b());
        }
        return jSONObject;
    }

    public final void g(long j7) {
        this.f4636j = j7;
    }

    final /* synthetic */ androidx.browser.customtabs.f i() {
        return this.f4633g;
    }
}
