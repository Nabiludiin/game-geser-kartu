package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import o2.a;

/* compiled from: MyApplication */
final class d6 extends a8 {
    static final Pair A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f22023c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f22024d;

    /* renamed from: e, reason: collision with root package name */
    public b6 f22025e;

    /* renamed from: f, reason: collision with root package name */
    public final a6 f22026f;

    /* renamed from: g, reason: collision with root package name */
    public final a6 f22027g;

    /* renamed from: h, reason: collision with root package name */
    public final c6 f22028h;

    /* renamed from: i, reason: collision with root package name */
    private String f22029i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22030j;

    /* renamed from: k, reason: collision with root package name */
    private long f22031k;

    /* renamed from: l, reason: collision with root package name */
    public final a6 f22032l;

    /* renamed from: m, reason: collision with root package name */
    public final y5 f22033m;

    /* renamed from: n, reason: collision with root package name */
    public final c6 f22034n;

    /* renamed from: o, reason: collision with root package name */
    public final z5 f22035o;

    /* renamed from: p, reason: collision with root package name */
    public final y5 f22036p;

    /* renamed from: q, reason: collision with root package name */
    public final a6 f22037q;

    /* renamed from: r, reason: collision with root package name */
    public final a6 f22038r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22039s;

    /* renamed from: t, reason: collision with root package name */
    public final y5 f22040t;

    /* renamed from: u, reason: collision with root package name */
    public final y5 f22041u;

    /* renamed from: v, reason: collision with root package name */
    public final a6 f22042v;

    /* renamed from: w, reason: collision with root package name */
    public final c6 f22043w;

    /* renamed from: x, reason: collision with root package name */
    public final c6 f22044x;

    /* renamed from: y, reason: collision with root package name */
    public final a6 f22045y;

    /* renamed from: z, reason: collision with root package name */
    public final z5 f22046z;

    d6(w6 w6Var) {
        super(w6Var);
        this.f22032l = new a6(this, "session_timeout", 1800000L);
        this.f22033m = new y5(this, "start_new_session", true);
        this.f22037q = new a6(this, "last_pause_time", 0L);
        this.f22038r = new a6(this, "session_id", 0L);
        this.f22034n = new c6(this, "non_personalized_ads", null);
        this.f22035o = new z5(this, "last_received_uri_timestamps_by_source", null);
        this.f22036p = new y5(this, "allow_remote_dynamite", false);
        this.f22026f = new a6(this, "first_open_time", 0L);
        this.f22027g = new a6(this, "app_install_time", 0L);
        this.f22028h = new c6(this, "app_instance_id", null);
        this.f22040t = new y5(this, "app_backgrounded", false);
        this.f22041u = new y5(this, "deep_link_retrieval_complete", false);
        this.f22042v = new a6(this, "deep_link_retrieval_attempts", 0L);
        this.f22043w = new c6(this, "firebase_feature_rollouts", null);
        this.f22044x = new c6(this, "deferred_attribution_cache", null);
        this.f22045y = new a6(this, "deferred_attribution_cache_timestamp", 0L);
        this.f22046z = new z5(this, "default_event_parameters", null);
    }

    final boolean A(long j7) {
        return j7 - this.f22032l.a() > this.f22037q.a();
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.a8
    protected final void j() {
        w6 w6Var = this.f22928a;
        SharedPreferences sharedPreferences = w6Var.e().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f22023c = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f22039s = z7;
        if (!z7) {
            SharedPreferences.Editor edit = this.f22023c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        w6Var.w();
        this.f22025e = new b6(this, "health_monitor", Math.max(0L, ((Long) c5.f21942d.b(null)).longValue()), null);
    }

    final Pair o(String str) {
        h();
        if (!w().o(t4.v.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        w6 w6Var = this.f22928a;
        long b8 = w6Var.f().b();
        String str2 = this.f22029i;
        if (str2 != null && b8 < this.f22031k) {
            return new Pair(str2, Boolean.valueOf(this.f22030j));
        }
        this.f22031k = b8 + w6Var.w().D(str, c5.f21936b);
        o2.a.c(true);
        try {
            a.C0117a a8 = o2.a.a(w6Var.e());
            this.f22029i = "";
            String a9 = a8.a();
            if (a9 != null) {
                this.f22029i = a9;
            }
            this.f22030j = a8.b();
        } catch (Exception e8) {
            this.f22928a.a().v().b("Unable to get advertising id", e8);
            this.f22029i = "";
        }
        o2.a.c(false);
        return new Pair(this.f22029i, Boolean.valueOf(this.f22030j));
    }

    protected final SharedPreferences p() {
        h();
        l();
        p3.o.m(this.f22023c);
        return this.f22023c;
    }

    protected final SharedPreferences q() {
        h();
        l();
        if (this.f22024d == null) {
            w6 w6Var = this.f22928a;
            String valueOf = String.valueOf(w6Var.e().getPackageName());
            n5 w7 = w6Var.a().w();
            String concat = valueOf.concat("_preferences");
            w7.b("Default prefs file", concat);
            this.f22024d = w6Var.e().getSharedPreferences(concat, 0);
        }
        return this.f22024d;
    }

    final SparseArray r() {
        Bundle a8 = this.f22035o.a();
        int[] intArray = a8.getIntArray("uriSources");
        long[] longArray = a8.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f22928a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i7 = 0; i7 < intArray.length; i7++) {
            sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
        }
        return sparseArray;
    }

    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = p().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final y u() {
        h();
        return y.g(p().getString("dma_consent_settings", null));
    }

    final boolean v(int i7) {
        return d8.u(i7, p().getInt("consent_source", 100));
    }

    final d8 w() {
        h();
        return d8.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    protected final boolean x(nc ncVar) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String a8 = ncVar.a();
        if (a8.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = p().edit();
        edit.putString("stored_tcf_param", a8);
        edit.apply();
        return true;
    }

    final void y(boolean z7) {
        h();
        this.f22928a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor edit = p().edit();
        edit.putBoolean("deferred_analytics_collection", z7);
        edit.apply();
    }

    final boolean z() {
        SharedPreferences sharedPreferences = this.f22023c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
