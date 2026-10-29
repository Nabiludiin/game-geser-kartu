package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class w6 implements b8 {
    private static volatile w6 E;
    private int A;
    private int B;
    final long D;

    /* renamed from: a, reason: collision with root package name */
    private final Context f22765a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22766b;

    /* renamed from: c, reason: collision with root package name */
    private final f f22767c;

    /* renamed from: d, reason: collision with root package name */
    private final m f22768d;

    /* renamed from: e, reason: collision with root package name */
    private final d6 f22769e;

    /* renamed from: f, reason: collision with root package name */
    private final p5 f22770f;

    /* renamed from: g, reason: collision with root package name */
    private final s6 f22771g;

    /* renamed from: h, reason: collision with root package name */
    private final mc f22772h;

    /* renamed from: i, reason: collision with root package name */
    private final yd f22773i;

    /* renamed from: j, reason: collision with root package name */
    private final i5 f22774j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f22775k;

    /* renamed from: l, reason: collision with root package name */
    private final la f22776l;

    /* renamed from: m, reason: collision with root package name */
    private final w9 f22777m;

    /* renamed from: n, reason: collision with root package name */
    private final b2 f22778n;

    /* renamed from: o, reason: collision with root package name */
    private final aa f22779o;

    /* renamed from: p, reason: collision with root package name */
    private final String f22780p;

    /* renamed from: q, reason: collision with root package name */
    private h5 f22781q;

    /* renamed from: r, reason: collision with root package name */
    private vb f22782r;

    /* renamed from: s, reason: collision with root package name */
    private a0 f22783s;

    /* renamed from: t, reason: collision with root package name */
    private f5 f22784t;

    /* renamed from: u, reason: collision with root package name */
    private ca f22785u;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f22787w;

    /* renamed from: x, reason: collision with root package name */
    private long f22788x;

    /* renamed from: y, reason: collision with root package name */
    private volatile Boolean f22789y;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f22790z;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22786v = false;
    private final AtomicInteger C = new AtomicInteger(0);

    w6(f8 f8Var) {
        p3.o.m(f8Var);
        Context context = f8Var.f22133a;
        f fVar = new f(context);
        this.f22767c = fVar;
        v4.f22711a = fVar;
        this.f22765a = context;
        this.f22766b = f8Var.f22137e;
        this.f22789y = f8Var.f22134b;
        this.f22780p = f8Var.f22139g;
        this.f22790z = true;
        com.google.android.gms.internal.measurement.i9.b(context);
        com.google.android.gms.common.util.e d8 = com.google.android.gms.common.util.h.d();
        this.f22775k = d8;
        Long l7 = f8Var.f22138f;
        this.D = l7 != null ? l7.longValue() : d8.a();
        this.f22768d = new m(this);
        d6 d6Var = new d6(this);
        d6Var.m();
        this.f22769e = d6Var;
        p5 p5Var = new p5(this);
        p5Var.m();
        this.f22770f = p5Var;
        yd ydVar = new yd(this);
        ydVar.m();
        this.f22773i = ydVar;
        this.f22774j = new i5(new e8(f8Var, this));
        this.f22778n = new b2(this);
        la laVar = new la(this);
        laVar.k();
        this.f22776l = laVar;
        w9 w9Var = new w9(this);
        w9Var.k();
        this.f22777m = w9Var;
        mc mcVar = new mc(this);
        mcVar.k();
        this.f22772h = mcVar;
        aa aaVar = new aa(this);
        aaVar.m();
        this.f22779o = aaVar;
        s6 s6Var = new s6(this);
        s6Var.m();
        this.f22771g = s6Var;
        com.google.android.gms.internal.measurement.h2 h2Var = f8Var.f22136d;
        boolean z7 = h2Var == null || h2Var.f20994r == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(w9Var);
            if (w9Var.f22928a.f22765a.getApplicationContext() instanceof Application) {
                Application application = (Application) w9Var.f22928a.f22765a.getApplicationContext();
                if (w9Var.f22797c == null) {
                    w9Var.f22797c = new k9(w9Var);
                }
                if (z7) {
                    application.unregisterActivityLifecycleCallbacks(w9Var.f22797c);
                    application.registerActivityLifecycleCallbacks(w9Var.f22797c);
                    p5 p5Var2 = w9Var.f22928a.f22770f;
                    u(p5Var2);
                    p5Var2.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(p5Var);
            p5Var.r().a("Application context is not an Application");
        }
        s6Var.t(new u6(this, f8Var));
    }

    public static w6 O(Context context, com.google.android.gms.internal.measurement.h2 h2Var, Long l7) {
        Bundle bundle;
        if (h2Var != null) {
            Bundle bundle2 = h2Var.f20996t;
            h2Var = new com.google.android.gms.internal.measurement.h2(h2Var.f20993q, h2Var.f20994r, h2Var.f20995s, bundle2, null);
        }
        p3.o.m(context);
        p3.o.m(context.getApplicationContext());
        if (E == null) {
            synchronized (w6.class) {
                try {
                    if (E == null) {
                        E = new w6(new f8(context, h2Var, l7));
                    }
                } finally {
                }
            }
        } else if (h2Var != null && (bundle = h2Var.f20996t) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            p3.o.m(E);
            E.f22789y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        p3.o.m(E);
        return E;
    }

    static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void r(d4 d4Var) {
        if (d4Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void s(z7 z7Var) {
        if (z7Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void t(e5 e5Var) {
        if (e5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!e5Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e5Var.getClass())));
        }
    }

    private static final void u(a8 a8Var) {
        if (a8Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!a8Var.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(a8Var.getClass())));
        }
    }

    final s6 A() {
        return this.f22771g;
    }

    public final w9 B() {
        w9 w9Var = this.f22777m;
        t(w9Var);
        return w9Var;
    }

    public final yd C() {
        yd ydVar = this.f22773i;
        s(ydVar);
        return ydVar;
    }

    public final i5 D() {
        return this.f22774j;
    }

    public final h5 E() {
        t(this.f22781q);
        return this.f22781q;
    }

    public final aa F() {
        aa aaVar = this.f22779o;
        u(aaVar);
        return aaVar;
    }

    public final boolean G() {
        return this.f22766b;
    }

    public final String H() {
        return this.f22780p;
    }

    public final la I() {
        la laVar = this.f22776l;
        t(laVar);
        return laVar;
    }

    public final vb J() {
        t(this.f22782r);
        return this.f22782r;
    }

    public final a0 K() {
        u(this.f22783s);
        return this.f22783s;
    }

    public final f5 L() {
        t(this.f22784t);
        return this.f22784t;
    }

    public final b2 M() {
        b2 b2Var = this.f22778n;
        r(b2Var);
        return b2Var;
    }

    public final ca N() {
        r(this.f22785u);
        return this.f22785u;
    }

    final void P(boolean z7) {
        this.f22789y = Boolean.valueOf(z7);
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final p5 a() {
        p5 p5Var = this.f22770f;
        u(p5Var);
        return p5Var;
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final s6 b() {
        s6 s6Var = this.f22771g;
        u(s6Var);
        return s6Var;
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final f c() {
        return this.f22767c;
    }

    public final boolean d() {
        return this.f22789y != null && this.f22789y.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final Context e() {
        return this.f22765a;
    }

    @Override // com.google.android.gms.measurement.internal.b8
    public final com.google.android.gms.common.util.e f() {
        return this.f22775k;
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        s6 s6Var = this.f22771g;
        u(s6Var);
        s6Var.h();
        m mVar = this.f22768d;
        if (mVar.L()) {
            return 1;
        }
        u(s6Var);
        s6Var.h();
        if (!this.f22790z) {
            return 8;
        }
        d6 d6Var = this.f22769e;
        s(d6Var);
        Boolean t7 = d6Var.t();
        if (t7 != null) {
            return t7.booleanValue() ? 0 : 3;
        }
        f fVar = mVar.f22928a.f22767c;
        Boolean J = mVar.J("firebase_analytics_collection_enabled");
        return J != null ? J.booleanValue() ? 0 : 4 : (this.f22789y == null || this.f22789y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z7) {
        s6 s6Var = this.f22771g;
        u(s6Var);
        s6Var.h();
        this.f22790z = z7;
    }

    public final boolean j() {
        s6 s6Var = this.f22771g;
        u(s6Var);
        s6Var.h();
        return this.f22790z;
    }

    final void k() {
        this.A++;
    }

    final void l() {
        this.C.incrementAndGet();
    }

    protected final boolean m() {
        if (!this.f22786v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        s6 s6Var = this.f22771g;
        u(s6Var);
        s6Var.h();
        Boolean bool = this.f22787w;
        if (bool == null || this.f22788x == 0 || (!bool.booleanValue() && Math.abs(this.f22775k.b() - this.f22788x) > 1000)) {
            this.f22788x = this.f22775k.b();
            yd ydVar = this.f22773i;
            s(ydVar);
            boolean z7 = false;
            if (ydVar.M("android.permission.INTERNET")) {
                s(ydVar);
                if (ydVar.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f22765a;
                    if (u3.e.a(context).g() || this.f22768d.m() || (yd.j0(context) && yd.E(context, false))) {
                        z7 = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z7);
            this.f22787w = valueOf;
            if (valueOf.booleanValue()) {
                s(ydVar);
                this.f22787w = Boolean.valueOf(ydVar.o(L().r()));
            }
        }
        return this.f22787w.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r3.W() >= 234200) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w6.n():boolean");
    }

    final /* synthetic */ void o(String str, int i7, Throwable th, byte[] bArr, Map map) {
        int i8;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (i7 == 200 || i7 == 204) {
            i8 = i7;
        } else {
            i8 = 304;
            if (i7 != 304) {
                i8 = i7;
                p5 p5Var = this.f22770f;
                u(p5Var);
                p5Var.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
            }
        }
        if (th == null) {
            d6 d6Var = this.f22769e;
            s(d6Var);
            d6Var.f22041u.b(true);
            if (bArr == null || bArr.length == 0) {
                p5 p5Var2 = this.f22770f;
                u(p5Var2);
                p5Var2.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    p5 p5Var3 = this.f22770f;
                    u(p5Var3);
                    p5Var3.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle2 = new Bundle();
                yd ydVar = this.f22773i;
                s(ydVar);
                w6 w6Var = ydVar.f22928a;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = w6Var.f22765a;
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle2.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle2.putString("gad_source", optString4);
                        }
                        bundle2.putString("gclid", optString2);
                        bundle2.putString("_cis", "ddp");
                        this.f22777m.t("auto", "_cmp", bundle2);
                        s(ydVar);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = ydVar.f22928a.f22765a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                }
                                makeBasic = BroadcastOptions.makeBasic();
                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                bundle = shareIdentityEnabled.toBundle();
                                context2.sendBroadcast(intent, null, bundle);
                                return;
                            }
                            return;
                        } catch (RuntimeException e8) {
                            p5 p5Var4 = ydVar.f22928a.f22770f;
                            u(p5Var4);
                            p5Var4.o().b("Failed to persist Deferred Deep Link. exception", e8);
                            return;
                        }
                    }
                }
                p5 p5Var5 = this.f22770f;
                u(p5Var5);
                p5Var5.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e9) {
                p5 p5Var6 = this.f22770f;
                u(p5Var6);
                p5Var6.o().b("Failed to parse the Deferred Deep Link response. exception", e9);
                return;
            }
        }
        p5 p5Var7 = this.f22770f;
        u(p5Var7);
        p5Var7.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
    }

    final /* synthetic */ void p(f8 f8Var) {
        s6 s6Var = this.f22771g;
        u(s6Var);
        s6Var.h();
        m mVar = this.f22768d;
        mVar.u();
        a0 a0Var = new a0(this);
        a0Var.m();
        this.f22783s = a0Var;
        com.google.android.gms.internal.measurement.h2 h2Var = f8Var.f22136d;
        f5 f5Var = new f5(this, f8Var.f22135c, h2Var == null ? 0L : h2Var.f20993q);
        f5Var.k();
        this.f22784t = f5Var;
        h5 h5Var = new h5(this);
        h5Var.k();
        this.f22781q = h5Var;
        vb vbVar = new vb(this);
        vbVar.k();
        this.f22782r = vbVar;
        yd ydVar = this.f22773i;
        ydVar.n();
        this.f22769e.n();
        this.f22784t.l();
        ca caVar = new ca(this);
        caVar.k();
        this.f22785u = caVar;
        caVar.l();
        p5 p5Var = this.f22770f;
        u(p5Var);
        n5 u7 = p5Var.u();
        mVar.A();
        u7.b("App measurement initialized, version", 133005L);
        u(p5Var);
        p5Var.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q7 = f5Var.q();
        s(ydVar);
        if (ydVar.P(q7, mVar.R())) {
            u(p5Var);
            p5Var.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(p5Var);
            p5Var.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q7)));
        }
        u(p5Var);
        p5Var.v().a("Debug-level message logging enabled");
        int i7 = this.A;
        AtomicInteger atomicInteger = this.C;
        if (i7 != atomicInteger.get()) {
            u(p5Var);
            p5Var.o().c("Not all components initialized", Integer.valueOf(this.A), Integer.valueOf(atomicInteger.get()));
        }
        this.f22786v = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r1.G() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void v(com.google.android.gms.internal.measurement.h2 r14) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w6.v(com.google.android.gms.internal.measurement.h2):void");
    }

    public final m w() {
        return this.f22768d;
    }

    public final d6 x() {
        d6 d6Var = this.f22769e;
        s(d6Var);
        return d6Var;
    }

    public final p5 y() {
        p5 p5Var = this.f22770f;
        if (p5Var == null || !p5Var.k()) {
            return null;
        }
        return p5Var;
    }

    public final mc z() {
        mc mcVar = this.f22772h;
        t(mcVar);
        return mcVar;
    }
}
