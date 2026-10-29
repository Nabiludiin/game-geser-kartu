package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.cf;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import z4.j;

/* compiled from: MyApplication */
public final class w9 extends e5 {

    /* renamed from: c, reason: collision with root package name */
    protected k9 f22797c;

    /* renamed from: d, reason: collision with root package name */
    private t4.z f22798d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f22799e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22800f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f22801g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f22802h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22803i;

    /* renamed from: j, reason: collision with root package name */
    private int f22804j;

    /* renamed from: k, reason: collision with root package name */
    private x f22805k;

    /* renamed from: l, reason: collision with root package name */
    private x f22806l;

    /* renamed from: m, reason: collision with root package name */
    private PriorityQueue f22807m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f22808n;

    /* renamed from: o, reason: collision with root package name */
    private d8 f22809o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f22810p;

    /* renamed from: q, reason: collision with root package name */
    private long f22811q;

    /* renamed from: r, reason: collision with root package name */
    final ge f22812r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f22813s;

    /* renamed from: t, reason: collision with root package name */
    private x f22814t;

    /* renamed from: u, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f22815u;

    /* renamed from: v, reason: collision with root package name */
    private x f22816v;

    /* renamed from: w, reason: collision with root package name */
    private final xd f22817w;

    protected w9(w6 w6Var) {
        super(w6Var);
        this.f22799e = new CopyOnWriteArraySet();
        this.f22802h = new Object();
        this.f22803i = false;
        this.f22804j = 1;
        this.f22813s = true;
        this.f22817w = new a9(this);
        this.f22801g = new AtomicReference();
        this.f22809o = d8.f22051c;
        this.f22811q = -1L;
        this.f22810p = new AtomicLong(0L);
        this.f22812r = new ge(w6Var);
    }

    private final t4.j0 e0(final wc wcVar) {
        try {
            URL url = new URI(wcVar.f22825s).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String s7 = this.f22928a.L().s();
            w6 w6Var = this.f22928a;
            n5 w7 = w6Var.a().w();
            Long valueOf = Long.valueOf(wcVar.f22823q);
            w7.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, wcVar.f22825s, Integer.valueOf(wcVar.f22824r.length));
            if (!TextUtils.isEmpty(wcVar.f22829w)) {
                w6Var.a().w().c("[sgtm] Uploading data from app. row_id", valueOf, wcVar.f22829w);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = wcVar.f22826t;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            aa F = w6Var.F();
            byte[] bArr = wcVar.f22824r;
            x9 x9Var = new x9() { // from class: com.google.android.gms.measurement.internal.l9
                /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
                @Override // com.google.android.gms.measurement.internal.x9
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
                    /*
                        r6 = this;
                        com.google.android.gms.measurement.internal.w9 r7 = com.google.android.gms.measurement.internal.w9.this
                        r7.h()
                        com.google.android.gms.measurement.internal.wc r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        com.google.android.gms.measurement.internal.w6 r8 = r7.f22928a
                        com.google.android.gms.measurement.internal.p5 r8 = r8.a()
                        com.google.android.gms.measurement.internal.n5 r8 = r8.w()
                        long r0 = r10.f22823q
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.b(r11, r9)
                        t4.j0 r8 = t4.j0.SUCCESS
                        goto L69
                    L2e:
                        com.google.android.gms.measurement.internal.w6 r11 = r7.f22928a
                        com.google.android.gms.measurement.internal.p5 r11 = r11.a()
                        com.google.android.gms.measurement.internal.n5 r11 = r11.r()
                        long r0 = r10.f22823q
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.d(r2, r0, r1, r9)
                        com.google.android.gms.measurement.internal.b5 r9 = com.google.android.gms.measurement.internal.c5.f21985u
                        r11 = 0
                        java.lang.Object r9 = r9.b(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        t4.j0 r8 = t4.j0.BACKOFF
                        goto L69
                    L67:
                        t4.j0 r8 = t4.j0.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        com.google.android.gms.measurement.internal.w6 r11 = r7.f22928a
                        com.google.android.gms.measurement.internal.vb r11 = r11.J()
                        com.google.android.gms.measurement.internal.g r0 = new com.google.android.gms.measurement.internal.g
                        long r1 = r10.f22823q
                        int r3 = r8.a()
                        long r4 = r10.f22828v
                        r0.<init>(r1, r3, r4)
                        r11.k0(r0)
                        com.google.android.gms.measurement.internal.w6 r7 = r7.f22928a
                        com.google.android.gms.measurement.internal.p5 r7 = r7.a()
                        com.google.android.gms.measurement.internal.n5 r7 = r7.w()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.c(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l9.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            F.l();
            p3.o.m(url);
            p3.o.m(bArr);
            p3.o.m(x9Var);
            F.f22928a.b().w(new z9(F, s7, url, bArr, hashMap, x9Var));
            try {
                w6 w6Var2 = w6Var.C().f22928a;
                long a8 = w6Var2.f().a() + 60000;
                synchronized (atomicReference) {
                    for (long j7 = 60000; atomicReference.get() == null && j7 > 0; j7 = a8 - w6Var2.f().a()) {
                        try {
                            atomicReference.wait(j7);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f22928a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? t4.j0.UNKNOWN : (t4.j0) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e8) {
            this.f22928a.a().o().d("[sgtm] Bad upload url for row_id", wcVar.f22825s, Long.valueOf(wcVar.f22823q), e8);
            return t4.j0.FAILURE;
        }
    }

    private final void f0(Boolean bool, boolean z7) {
        h();
        j();
        w6 w6Var = this.f22928a;
        w6Var.a().v().b("Setting app measurement enabled (FE)", bool);
        w6Var.x().s(bool);
        if (z7) {
            d6 x7 = w6Var.x();
            w6 w6Var2 = x7.f22928a;
            x7.h();
            SharedPreferences.Editor edit = x7.p().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f22928a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        w9 w9Var;
        h();
        w6 w6Var = this.f22928a;
        String a8 = w6Var.x().f22034n.a();
        if (a8 == null) {
            w9Var = this;
        } else if ("unset".equals(a8)) {
            w9Var = this;
            w9Var.B("app", "_npa", null, w6Var.f().a());
        } else {
            B("app", "_npa", Long.valueOf(true != "true".equals(a8) ? 0L : 1L), w6Var.f().a());
            w9Var = this;
        }
        if (!w9Var.f22928a.g() || !w9Var.f22813s) {
            w6Var.a().v().a("Updating Scion state (FE)");
            w9Var.f22928a.J().X();
        } else {
            w6Var.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            w9Var.f22928a.z().f22376e.a();
            w6Var.b().t(new m8(this));
        }
    }

    final void A(String str, String str2, long j7, Object obj) {
        this.f22928a.b().t(new r8(this, str, str2, obj, j7));
    }

    final void B(String str, String str2, Object obj, long j7) {
        p3.o.g(str);
        p3.o.g(str2);
        h();
        j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j8 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    w6 w6Var = this.f22928a;
                    Long valueOf = Long.valueOf(j8);
                    w6Var.x().f22034n.b(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    this.f22928a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                    obj2 = obj;
                }
            }
            if (obj == null) {
                this.f22928a.x().f22034n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f22928a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        w6 w6Var2 = this.f22928a;
        if (!w6Var2.g()) {
            this.f22928a.a().w().a("User property not set since app measurement is disabled");
        } else if (w6Var2.m()) {
            this.f22928a.J().o(new ud(str4, j7, obj3, str));
        }
    }

    public final Map C(String str, String str2, boolean z7) {
        w6 w6Var = this.f22928a;
        if (w6Var.b().p()) {
            w6Var.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        w6Var.c();
        if (f.a()) {
            w6Var.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f22928a.b().u(atomicReference, 5000L, "get user properties", new y8(this, atomicReference, null, str, str2, z7));
        List<ud> list = (List) atomicReference.get();
        if (list == null) {
            w6Var.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
            return Collections.EMPTY_MAP;
        }
        r.a aVar = new r.a(list.size());
        for (ud udVar : list) {
            Object M0 = udVar.M0();
            if (M0 != null) {
                aVar.put(udVar.f22701r, M0);
            }
        }
        return aVar;
    }

    public final String D() {
        return (String) this.f22801g.get();
    }

    final void E(String str) {
        this.f22801g.set(str);
    }

    public final void F() {
        h();
        w6 w6Var = this.f22928a;
        if (w6Var.x().f22041u.a()) {
            w6Var.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a8 = w6Var.x().f22042v.a();
        w6Var.x().f22042v.b(1 + a8);
        w6Var.w();
        if (a8 >= 5) {
            w6Var.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            w6Var.x().f22041u.b(true);
        } else {
            if (this.f22814t == null) {
                this.f22814t = new t8(this, this.f22928a);
            }
            this.f22814t.b(0L);
        }
    }

    public final void G(long j7) {
        this.f22801g.set(null);
        this.f22928a.b().t(new u8(this, j7));
    }

    public final void H() {
        h();
        j();
        if (this.f22928a.m()) {
            w6 w6Var = this.f22928a;
            m w7 = w6Var.w();
            w7.f22928a.c();
            Boolean J = w7.J("google_analytics_deferred_deep_link_enabled");
            if (J != null && J.booleanValue()) {
                w6Var.a().v().a("Deferred Deep Link feature enabled.");
                w6Var.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.u9
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        w9.this.F();
                    }
                });
            }
            this.f22928a.J().s();
            this.f22813s = false;
            d6 x7 = w6Var.x();
            x7.h();
            String string = x7.p().getString("previous_os_version", null);
            x7.f22928a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = x7.p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            w6Var.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(t4.z zVar) {
        t4.z zVar2;
        h();
        j();
        if (zVar != null && zVar != (zVar2 = this.f22798d)) {
            p3.o.q(zVar2 == null, "EventInterceptor already set.");
        }
        this.f22798d = zVar;
    }

    public final void J(t4.a0 a0Var) {
        j();
        p3.o.m(a0Var);
        if (this.f22799e.add(a0Var)) {
            return;
        }
        this.f22928a.a().r().a("OnEventListener already registered");
    }

    public final void K(t4.a0 a0Var) {
        j();
        p3.o.m(a0Var);
        if (this.f22799e.remove(a0Var)) {
            return;
        }
        this.f22928a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        p3.o.g(str);
        this.f22928a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f22928a.f().a());
    }

    public final void N(Bundle bundle, long j7) {
        p3.o.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f22928a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        p3.o.m(bundle2);
        t4.t.b(bundle2, "app_id", String.class, null);
        t4.t.b(bundle2, "origin", String.class, null);
        t4.t.b(bundle2, "name", String.class, null);
        t4.t.b(bundle2, "value", Object.class, null);
        t4.t.b(bundle2, "trigger_event_name", String.class, null);
        t4.t.b(bundle2, "trigger_timeout", Long.class, 0L);
        t4.t.b(bundle2, "timed_out_event_name", String.class, null);
        t4.t.b(bundle2, "timed_out_event_params", Bundle.class, null);
        t4.t.b(bundle2, "triggered_event_name", String.class, null);
        t4.t.b(bundle2, "triggered_event_params", Bundle.class, null);
        t4.t.b(bundle2, "time_to_live", Long.class, 0L);
        t4.t.b(bundle2, "expired_event_name", String.class, null);
        t4.t.b(bundle2, "expired_event_params", Bundle.class, null);
        p3.o.g(bundle2.getString("name"));
        p3.o.g(bundle2.getString("origin"));
        p3.o.m(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        w6 w6Var = this.f22928a;
        if (w6Var.C().y0(string) != 0) {
            w6Var.a().o().b("Invalid conditional user property name", w6Var.D().c(string));
            return;
        }
        if (w6Var.C().y(string, obj) != 0) {
            w6Var.a().o().c("Invalid conditional user property value", w6Var.D().c(string), obj);
            return;
        }
        Object z7 = w6Var.C().z(string, obj);
        if (z7 == null) {
            w6Var.a().o().c("Unable to normalize conditional user property value", w6Var.D().c(string), obj);
            return;
        }
        t4.t.a(bundle2, z7);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            w6Var.w();
            if (j8 > 15552000000L || j8 < 1) {
                w6Var.a().o().c("Invalid conditional user property timeout", w6Var.D().c(string), Long.valueOf(j8));
                return;
            }
        }
        long j9 = bundle2.getLong("time_to_live");
        w6Var.w();
        if (j9 > 15552000000L || j9 < 1) {
            w6Var.a().o().c("Invalid conditional user property time to live", w6Var.D().c(string), Long.valueOf(j9));
        } else {
            w6Var.b().t(new v8(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        w6 w6Var = this.f22928a;
        long a8 = w6Var.f().a();
        p3.o.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a8);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        w6Var.b().t(new w8(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        w6 w6Var = this.f22928a;
        if (w6Var.b().p()) {
            w6Var.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        w6Var.c();
        if (f.a()) {
            w6Var.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f22928a.b().u(atomicReference, 5000L, "get conditional user properties", new x8(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return yd.h0(list);
        }
        w6Var.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        da u7 = this.f22928a.I().u();
        if (u7 != null) {
            return u7.f22056a;
        }
        return null;
    }

    public final String R() {
        da u7 = this.f22928a.I().u();
        if (u7 != null) {
            return u7.f22057b;
        }
        return null;
    }

    public final String S() {
        try {
            return t4.l0.a(this.f22928a.e(), "google_app_id", this.f22928a.H());
        } catch (IllegalStateException e8) {
            this.f22928a.a().o().b("getGoogleAppId failed with exception", e8);
            return null;
        }
    }

    final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        w6 w6Var = this.f22928a;
        if (!w6Var.w().H(null, c5.f21935a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                w6Var.a().w().a("IABTCF_TCString change picked up in listener.");
                ((x) p3.o.m(this.f22816v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            w6Var.a().w().a("IABTCF_TCString change picked up in listener.");
            ((x) p3.o.m(this.f22816v)).b(500L);
        }
    }

    final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i7;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            w6 w6Var = this.f22928a;
            bundle2 = new Bundle(w6Var.x().f22046z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i7 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (w6Var.C().B0(obj)) {
                        w6Var.C().B(this.f22817w, null, 27, null, null, 0);
                    }
                    w6Var.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (yd.N(next)) {
                    w6Var.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (w6Var.C().C0("param", next, w6Var.w().x(null, false), obj)) {
                    w6Var.C().A(bundle2, next, obj);
                }
            }
            w6Var.C();
            int v7 = w6Var.w().v();
            if (bundle2.size() > v7) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i7++;
                    if (i7 > v7) {
                        bundle2.remove(str);
                    }
                }
                w6Var.C().B(this.f22817w, null, 26, null, null, 0);
                w6Var.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        w6 w6Var2 = this.f22928a;
        w6Var2.x().f22046z.b(bundle2);
        if (!bundle.isEmpty() || w6Var2.w().H(null, c5.X0)) {
            this.f22928a.J().v(bundle2);
        }
    }

    final /* synthetic */ void V(int i7) {
        if (this.f22805k == null) {
            this.f22805k = new k8(this, this.f22928a);
        }
        this.f22805k.b(i7 * 1000);
    }

    final /* synthetic */ void W(Boolean bool, boolean z7) {
        f0(bool, true);
    }

    final /* synthetic */ void X(d8 d8Var, long j7, boolean z7, boolean z8) {
        h();
        j();
        w6 w6Var = this.f22928a;
        d8 w7 = w6Var.x().w();
        if (j7 <= this.f22811q && d8.u(w7.b(), d8Var.b())) {
            w6Var.a().u().b("Dropped out-of-date consent setting, proposed settings", d8Var);
            return;
        }
        d6 x7 = w6Var.x();
        w6 w6Var2 = x7.f22928a;
        x7.h();
        int b8 = d8Var.b();
        if (!x7.v(b8)) {
            w6Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(d8Var.b()));
            return;
        }
        w6 w6Var3 = this.f22928a;
        SharedPreferences.Editor edit = x7.p().edit();
        edit.putString("consent_settings", d8Var.l());
        edit.putInt("consent_source", b8);
        edit.apply();
        w6Var.a().w().b("Setting storage consent(FE)", d8Var);
        this.f22811q = j7;
        if (w6Var3.J().D()) {
            w6Var3.J().Z(z7);
        } else {
            w6Var3.J().Y(z7);
        }
        if (z8) {
            w6Var3.J().q(new AtomicReference());
        }
    }

    final /* synthetic */ void Z(boolean z7) {
        this.f22803i = false;
    }

    final /* synthetic */ int a0() {
        return this.f22804j;
    }

    final /* synthetic */ void b0(int i7) {
        this.f22804j = i7;
    }

    final /* synthetic */ x c0() {
        return this.f22814t;
    }

    final /* synthetic */ int d0(Throwable th) {
        String message = th.getMessage();
        this.f22808n = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f22808n = true;
        return 1;
    }

    public final void h0() {
        w6 w6Var = this.f22928a;
        if (!(w6Var.e().getApplicationContext() instanceof Application) || this.f22797c == null) {
            return;
        }
        ((Application) w6Var.e().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f22797c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f22928a.b().u(atomicReference, 15000L, "boolean test flag value", new s8(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f22928a.b().u(atomicReference, 15000L, "String test flag value", new b9(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f22928a.b().u(atomicReference, 15000L, "long test flag value", new c9(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f22928a.b().u(atomicReference, 15000L, "int test flag value", new d9(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.e5
    protected final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f22928a.b().u(atomicReference, 15000L, "double test flag value", new e9(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f22928a.b().t(new f9(this, bool));
    }

    final void o(d8 d8Var) {
        h();
        boolean z7 = (d8Var.o(t4.v.ANALYTICS_STORAGE) && d8Var.o(t4.v.AD_STORAGE)) || this.f22928a.J().C();
        w6 w6Var = this.f22928a;
        if (z7 != w6Var.j()) {
            w6Var.i(z7);
            d6 x7 = this.f22928a.x();
            w6 w6Var2 = x7.f22928a;
            x7.h();
            Boolean valueOf = x7.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(x7.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z7 || valueOf == null || valueOf.booleanValue()) {
                f0(Boolean.valueOf(z7), false);
            }
        }
    }

    final void o0(Bundle bundle, int i7, long j7) {
        Object obj;
        String string;
        j();
        d8 d8Var = d8.f22051c;
        t4.v[] d8 = c8.STORAGE.d();
        int length = d8.length;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= length) {
                break;
            }
            String str = d8[i8].f26428q;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i8++;
        }
        if (obj != null) {
            w6 w6Var = this.f22928a;
            w6Var.a().t().b("Ignoring invalid consent setting", obj);
            w6Var.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean p7 = this.f22928a.b().p();
        d8 e8 = d8.e(bundle, i7);
        if (e8.c()) {
            q0(e8, p7);
        }
        y h8 = y.h(bundle, i7);
        if (h8.d()) {
            p0(h8, p7);
        }
        Boolean i9 = y.i(bundle);
        if (i9 != null) {
            String str2 = i7 == -30 ? "tcf" : "app";
            if (p7) {
                B(str2, "allow_personalized_ads", i9.toString(), j7);
            } else {
                z(str2, "allow_personalized_ads", i9.toString(), false, j7);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f22928a.f().a());
    }

    final void p0(y yVar, boolean z7) {
        g9 g9Var = new g9(this, yVar);
        if (!z7) {
            this.f22928a.b().t(g9Var);
        } else {
            h();
            g9Var.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f22928a.I().s(bundle2, j7);
            return;
        }
        boolean z9 = true;
        if (z8 && this.f22798d != null && !yd.N(str2)) {
            z9 = false;
        }
        boolean z10 = z9;
        if (str == null) {
            str = "app";
        }
        x(str, str2, j7, bundle2, z8, z10, z7, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void q0(com.google.android.gms.measurement.internal.d8 r10, boolean r11) {
        /*
            r9 = this;
            r9.j()
            int r0 = r10.b()
            r1 = -10
            if (r0 == r1) goto L2a
            t4.u r2 = r10.p()
            t4.u r3 = t4.u.UNINITIALIZED
            if (r2 != r3) goto L2a
            t4.u r2 = r10.q()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            com.google.android.gms.measurement.internal.w6 r10 = r9.f22928a
            com.google.android.gms.measurement.internal.p5 r10 = r10.a()
            com.google.android.gms.measurement.internal.n5 r10 = r10.t()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.a(r11)
            return
        L2a:
            java.lang.Object r2 = r9.f22802h
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.d8 r3 = r9.f22809o     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.b()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.measurement.internal.d8.u(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            com.google.android.gms.measurement.internal.d8 r3 = r9.f22809o     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.r(r3)     // Catch: java.lang.Throwable -> L53
            t4.v r5 = t4.v.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.o(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            com.google.android.gms.measurement.internal.d8 r6 = r9.f22809o     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.o(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            com.google.android.gms.measurement.internal.d8 r5 = r9.f22809o     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.d8 r10 = r10.t(r5)     // Catch: java.lang.Throwable -> L53
            r9.f22809o = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            com.google.android.gms.measurement.internal.w6 r10 = r9.f22928a
            com.google.android.gms.measurement.internal.p5 r10 = r10.a()
            com.google.android.gms.measurement.internal.n5 r10 = r10.u()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.b(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.f22810p
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.f22801g
            r0 = 0
            r10.set(r0)
            com.google.android.gms.measurement.internal.h9 r3 = new com.google.android.gms.measurement.internal.h9
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.h()
            r3.run()
            return
        L97:
            com.google.android.gms.measurement.internal.w6 r10 = r4.f22928a
            com.google.android.gms.measurement.internal.s6 r10 = r10.b()
            r10.v(r3)
            return
        La1:
            r4 = r9
            com.google.android.gms.measurement.internal.i9 r3 = new com.google.android.gms.measurement.internal.i9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.h()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            com.google.android.gms.measurement.internal.w6 r10 = r4.f22928a
            com.google.android.gms.measurement.internal.s6 r10 = r10.b()
            r10.t(r3)
            return
        Lc1:
            com.google.android.gms.measurement.internal.w6 r10 = r4.f22928a
            com.google.android.gms.measurement.internal.s6 r10 = r10.b()
            r10.v(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w9.q0(com.google.android.gms.measurement.internal.d8, boolean):void");
    }

    public final void r() {
        w6 w6Var;
        nc ncVar;
        nc ncVar2;
        com.google.android.gms.internal.measurement.m9 m9Var;
        h();
        w6 w6Var2 = this.f22928a;
        w6Var2.a().v().a("Handle tcf update.");
        SharedPreferences q7 = w6Var2.x().q();
        HashMap hashMap = new HashMap();
        b5 b5Var = c5.f21935a1;
        if (((Boolean) b5Var.b(null)).booleanValue()) {
            z4.i iVar = pc.f22486a;
            com.google.android.gms.internal.measurement.l9 l9Var = com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            oc ocVar = oc.CONSENT;
            Map.Entry a8 = t4.g0.a(l9Var, ocVar);
            int i7 = 2;
            com.google.android.gms.internal.measurement.l9 l9Var2 = com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i8 = 1;
            oc ocVar2 = oc.FLEXIBLE_LEGITIMATE_INTEREST;
            w6Var = w6Var2;
            z4.j k7 = z4.j.k(a8, t4.g0.a(l9Var2, ocVar2), t4.g0.a(com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, ocVar), t4.g0.a(com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, ocVar), t4.g0.a(com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, ocVar2), t4.g0.a(com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, ocVar2), t4.g0.a(com.google.android.gms.internal.measurement.l9.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, ocVar2));
            z4.k p7 = z4.k.p("CH");
            char[] cArr = new char[5];
            boolean contains = q7.contains("IABTCF_TCString");
            int b8 = pc.b(q7, "IABTCF_CmpSdkID");
            int b9 = pc.b(q7, "IABTCF_PolicyVersion");
            int b10 = pc.b(q7, "IABTCF_gdprApplies");
            int b11 = pc.b(q7, "IABTCF_PurposeOneTreatment");
            int b12 = pc.b(q7, "IABTCF_EnableAdvertiserConsentMode");
            String a9 = pc.a(q7, "IABTCF_PublisherCC");
            j.a a10 = z4.j.a();
            z4.z it = k7.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.l9 l9Var3 = (com.google.android.gms.internal.measurement.l9) it.next();
                int a11 = l9Var3.a();
                StringBuilder sb = new StringBuilder(String.valueOf(a11).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(a11);
                String a12 = pc.a(q7, sb.toString());
                if (TextUtils.isEmpty(a12) || a12.length() < 755) {
                    m9Var = com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(a12.charAt(754), 10);
                    m9Var = (digit < 0 || digit > com.google.android.gms.internal.measurement.m9.values().length || digit == 0) ? com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != i8 ? digit != i7 ? com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.m9.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                a10.f(l9Var3, m9Var);
                i7 = 2;
                i8 = 1;
            }
            z4.j c8 = a10.c();
            String a13 = pc.a(q7, "IABTCF_PurposeConsents");
            String a14 = pc.a(q7, "IABTCF_VendorConsents");
            boolean z7 = !TextUtils.isEmpty(a14) && a14.length() >= 755 && a14.charAt(754) == '1';
            String a15 = pc.a(q7, "IABTCF_PurposeLegitimateInterests");
            String a16 = pc.a(q7, "IABTCF_VendorLegitimateInterests");
            boolean z8 = !TextUtils.isEmpty(a16) && a16.length() >= 755 && a16.charAt(754) == '1';
            cArr[0] = '2';
            ncVar = new nc(pc.d(k7, c8, p7, cArr, b8, b12, b10, b9, b11, a9, a13, a15, z7, z8, contains));
        } else {
            w6Var = w6Var2;
            String a17 = pc.a(q7, "IABTCF_VendorConsents");
            if (!"".equals(a17) && a17.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a17.charAt(754)));
            }
            int b13 = pc.b(q7, "IABTCF_gdprApplies");
            if (b13 != -1) {
                hashMap.put("gdprApplies", String.valueOf(b13));
            }
            int b14 = pc.b(q7, "IABTCF_EnableAdvertiserConsentMode");
            if (b14 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(b14));
            }
            int b15 = pc.b(q7, "IABTCF_PolicyVersion");
            if (b15 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(b15));
            }
            String a18 = pc.a(q7, "IABTCF_PurposeConsents");
            if (!"".equals(a18)) {
                hashMap.put("PurposeConsents", a18);
            }
            int b16 = pc.b(q7, "IABTCF_CmpSdkID");
            if (b16 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(b16));
            }
            ncVar = new nc(hashMap);
        }
        w6Var.a().w().b("Tcf preferences read", ncVar);
        if (!w6Var.w().H(null, b5Var)) {
            if (w6Var.x().x(ncVar)) {
                Bundle b17 = ncVar.b();
                w6Var.a().w().b("Consent generated from Tcf", b17);
                if (b17 != Bundle.EMPTY) {
                    o0(b17, -30, w6Var.f().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", ncVar.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        d6 x7 = w6Var.x();
        x7.h();
        String string = x7.p().getString("stored_tcf_param", "");
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            ncVar2 = new nc(hashMap2);
        } else {
            for (String str : string.split(";")) {
                String[] split = str.split("=");
                if (split.length >= 2 && pc.f22486a.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            ncVar2 = new nc(hashMap2);
        }
        if (w6Var.x().x(ncVar)) {
            Bundle b18 = ncVar.b();
            w6Var.a().w().b("Consent generated from Tcf", b18);
            if (b18 != Bundle.EMPTY) {
                o0(b18, -30, w6Var.f().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", ncVar.d(ncVar2));
            bundle2.putString("_tcfd2", ncVar.c());
            bundle2.putString("_tcfd", ncVar.e());
            t("auto", "_tcf", bundle2);
        }
    }

    final void r0(Runnable runnable) {
        j();
        w6 w6Var = this.f22928a;
        if (w6Var.b().p()) {
            w6Var.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (w6Var.b().q()) {
            w6Var.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        w6Var.c();
        if (f.a()) {
            w6Var.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        w6Var.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z7 = false;
        int i7 = 0;
        int i8 = 0;
        while (!z7) {
            w6Var.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            w6Var.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.v9
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    w9.this.f22928a.J().j0(atomicReference, t4.n0.M0(t4.k0.SGTM_CLIENT));
                }
            });
            yc ycVar = (yc) atomicReference.get();
            if (ycVar == null) {
                break;
            }
            List list = ycVar.f22904q;
            if (!list.isEmpty()) {
                w6Var.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                i7 += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z7 = false;
                        break;
                    }
                    t4.j0 e02 = e0((wc) it.next());
                    if (e02 == t4.j0.SUCCESS) {
                        i8++;
                    } else if (e02 == t4.j0.BACKOFF) {
                        z7 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        w6Var.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i7), Integer.valueOf(i8));
        runnable.run();
    }

    public final void s() {
        h();
        w6 w6Var = this.f22928a;
        w6Var.a().v().a("Register tcfPrefChangeListener.");
        if (this.f22815u == null) {
            this.f22816v = new p8(this, this.f22928a);
            this.f22815u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.r9
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    w9.this.T(sharedPreferences, str);
                }
            };
        }
        w6Var.x().q().registerOnSharedPreferenceChangeListener(this.f22815u);
    }

    final void s0(long j7) {
        h();
        if (this.f22806l == null) {
            this.f22806l = new h8(this, this.f22928a);
        }
        this.f22806l.b(j7);
    }

    final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f22928a.f().a(), bundle);
    }

    final void t0() {
        h();
        x xVar = this.f22806l;
        if (xVar != null) {
            xVar.d();
        }
    }

    final void u(String str, String str2, long j7, Bundle bundle) {
        h();
        boolean z7 = true;
        if (this.f22798d != null && !yd.N(str2)) {
            z7 = false;
        }
        v(str, str2, j7, bundle, true, z7, true, null);
    }

    final void u0() {
        cf.a();
        w6 w6Var = this.f22928a;
        if (w6Var.w().H(null, c5.R0)) {
            if (w6Var.b().p()) {
                w6Var.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            w6Var.c();
            if (f.a()) {
                w6Var.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            w6Var.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            w6Var.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.n9
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    w9 w9Var = w9.this;
                    w9Var.f22928a.J().i0(atomicReference, w9Var.f22928a.x().f22035o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                w6Var.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                w6Var.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.o9
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        boolean contains;
                        w9 w9Var = w9.this;
                        w9Var.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<rc> list2 = list;
                        SparseArray r7 = w9Var.f22928a.x().r();
                        for (rc rcVar : list2) {
                            int i7 = rcVar.f22582s;
                            contains = r7.contains(i7);
                            if (!contains || ((Long) r7.get(i7)).longValue() < rcVar.f22581r) {
                                w9Var.w0().add(rcVar);
                            }
                        }
                        w9Var.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042f  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void v(java.lang.String r23, java.lang.String r24, long r25, android.os.Bundle r27, boolean r28, boolean r29, boolean r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w9.v(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    final boolean v0() {
        return this.f22808n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        w6.q();
        x("auto", str2, this.f22928a.f().a(), bundle, false, true, true, str3);
    }

    final PriorityQueue w0() {
        Comparator comparing;
        if (this.f22807m == null) {
            t4.f0.a();
            comparing = Comparator.comparing(p9.f22478a, q9.f22545q);
            this.f22807m = t4.e0.a(comparing);
        }
        return this.f22807m;
    }

    protected final void x(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        int i7 = yd.f22907k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i8];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelable);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        this.f22928a.b().t(new q8(this, str, str2, j7, bundle2, z7, z8, z9, str3));
    }

    final void x0() {
        rc rcVar;
        h();
        this.f22808n = false;
        if (w0().isEmpty() || this.f22803i || (rcVar = (rc) w0().poll()) == null) {
            return;
        }
        w6 w6Var = this.f22928a;
        q0.a H = w6Var.C().H();
        if (H != null) {
            this.f22803i = true;
            n5 w7 = w6Var.a().w();
            String str = rcVar.f22580q;
            w7.b("Registering trigger URI", str);
            a5.d d8 = H.d(Uri.parse(str));
            if (d8 != null) {
                a5.b.a(d8, new j8(this, rcVar), new i8(this));
            } else {
                this.f22803i = false;
                w0().add(rcVar);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z7) {
        z("auto", "_ldl", obj, true, this.f22928a.f().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.w6 r5 = r0.f22928a
            com.google.android.gms.measurement.internal.yd r5 = r5.C()
            int r5 = r5.y0(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            com.google.android.gms.measurement.internal.w6 r5 = r0.f22928a
            com.google.android.gms.measurement.internal.yd r5 = r5.C()
            java.lang.String r6 = "user property"
            boolean r7 = r5.t0(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = t4.y.f26437a
            r9 = 0
            boolean r7 = r5.v0(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            com.google.android.gms.measurement.internal.w6 r7 = r5.f22928a
            r7.w()
            boolean r5 = r5.w0(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            com.google.android.gms.measurement.internal.w6 r1 = r0.f22928a
            com.google.android.gms.measurement.internal.yd r6 = r1.C()
            r1.w()
            java.lang.String r14 = r6.q(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            com.google.android.gms.measurement.internal.w6 r1 = r0.f22928a
            com.google.android.gms.measurement.internal.xd r10 = r0.f22817w
            com.google.android.gms.measurement.internal.yd r9 = r1.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            com.google.android.gms.measurement.internal.w6 r7 = r0.f22928a
            com.google.android.gms.measurement.internal.yd r8 = r7.C()
            int r12 = r8.y(r2, r1)
            if (r12 == 0) goto Laa
            com.google.android.gms.measurement.internal.yd r6 = r7.C()
            r7.w()
            java.lang.String r14 = r6.q(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            com.google.android.gms.measurement.internal.w6 r1 = r0.f22928a
            com.google.android.gms.measurement.internal.xd r10 = r0.f22817w
            com.google.android.gms.measurement.internal.yd r9 = r1.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            com.google.android.gms.measurement.internal.yd r3 = r7.C()
            java.lang.Object r5 = r3.z(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.A(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.A(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w9.z(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
