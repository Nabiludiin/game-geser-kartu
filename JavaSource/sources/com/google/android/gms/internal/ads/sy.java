package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class sy implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f15870g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15864a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f15865b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f15866c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f15867d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f15868e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f15869f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f15871h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    private boolean f15872i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15873j = false;

    private final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.f15871h = new JSONObject((String) wy.a(new jy3() { // from class: com.google.android.gms.internal.ads.py
                    @Override // com.google.android.gms.internal.ads.jy3
                    public final /* synthetic */ Object a() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0118, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.wy.a(new com.google.android.gms.internal.ads.qy(r3))).optBoolean("local_flags_enabled") != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x0012, B:13:0x0017, B:14:0x0019, B:16:0x002b, B:17:0x002f, B:19:0x0031, B:38:0x009f, B:39:0x00a3, B:40:0x00a6, B:49:0x00d6, B:55:0x011e, B:67:0x0163, B:68:0x016a, B:84:0x016c, B:85:0x0173, B:22:0x0046, B:25:0x0050, B:28:0x005d, B:30:0x0068, B:31:0x0070, B:33:0x0076, B:35:0x0086, B:37:0x009b, B:42:0x00a9, B:44:0x00ad, B:46:0x00bd, B:48:0x00d2, B:50:0x00db, B:53:0x011a, B:56:0x0123, B:58:0x0130, B:60:0x013e, B:61:0x0147, B:63:0x0155, B:65:0x0159, B:66:0x015c, B:70:0x00ec, B:72:0x00fa, B:74:0x0102, B:76:0x010d), top: B:5:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:28:0x005d, B:30:0x0068, B:31:0x0070, B:33:0x0076, B:35:0x0086, B:37:0x009b, B:42:0x00a9, B:44:0x00ad, B:46:0x00bd, B:48:0x00d2, B:50:0x00db, B:53:0x011a, B:56:0x0123, B:58:0x0130, B:60:0x013e, B:61:0x0147, B:63:0x0155, B:65:0x0159, B:66:0x015c, B:70:0x00ec, B:72:0x00fa, B:74:0x0102, B:76:0x010d), top: B:21:0x0046, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sy.a(android.content.Context):void");
    }

    final boolean b() {
        return this.f15872i;
    }

    public final boolean c() {
        return this.f15873j;
    }

    public final Object d(final ly lyVar) {
        if (!this.f15865b.block(5000L)) {
            synchronized (this.f15864a) {
                try {
                    if (!this.f15867d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f15866c || this.f15868e == null || this.f15873j) {
            synchronized (this.f15864a) {
                if (this.f15866c && this.f15868e != null && !this.f15873j) {
                }
                return lyVar.f();
            }
        }
        if (lyVar.m() != 2) {
            return (lyVar.m() == 1 && this.f15871h.has(lyVar.e())) ? lyVar.c(this.f15871h) : wy.a(new jy3() { // from class: com.google.android.gms.internal.ads.ry
                @Override // com.google.android.gms.internal.ads.jy3
                public final /* synthetic */ Object a() {
                    return sy.this.f(lyVar);
                }
            });
        }
        Bundle bundle = this.f15869f;
        return bundle == null ? lyVar.f() : lyVar.a(bundle);
    }

    public final Object e(ly lyVar) {
        return (this.f15866c || this.f15867d) ? d(lyVar) : lyVar.f();
    }

    final /* synthetic */ Object f(ly lyVar) {
        return lyVar.d(this.f15868e);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
