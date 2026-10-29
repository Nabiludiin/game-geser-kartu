package v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.hs;
import com.google.android.gms.internal.ads.ll0;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.o00;
import com.google.android.gms.internal.ads.uy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class s1 implements p1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f26821b;

    /* renamed from: d, reason: collision with root package name */
    private a5.d f26823d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f26825f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f26826g;

    /* renamed from: i, reason: collision with root package name */
    private String f26828i;

    /* renamed from: j, reason: collision with root package name */
    private String f26829j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f26820a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f26822c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private hs f26824e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26827h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26830k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f26831l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private int f26832m = -1;

    /* renamed from: n, reason: collision with root package name */
    private ll0 f26833n = new ll0("", 0);

    /* renamed from: o, reason: collision with root package name */
    private long f26834o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f26835p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f26836q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f26837r = 0;

    /* renamed from: s, reason: collision with root package name */
    private Set f26838s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f26839t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    private boolean f26840u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26841v = true;

    /* renamed from: w, reason: collision with root package name */
    private String f26842w = null;

    /* renamed from: x, reason: collision with root package name */
    private String f26843x = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f26844y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f26845z = "";
    private String A = "{}";
    private int B = -1;
    private int C = -1;
    private long D = 0;

    private final void F() {
        a5.d dVar = this.f26823d;
        if (dVar == null || dVar.isDone()) {
            return;
        }
        try {
            this.f26823d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            int i7 = n1.f26802b;
            w2.p.g("Interrupted while waiting for preferences loaded.", e8);
        } catch (CancellationException e9) {
            e = e9;
            int i8 = n1.f26802b;
            w2.p.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e10) {
            e = e10;
            int i82 = n1.f26802b;
            w2.p.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e11) {
            e = e11;
            int i822 = n1.f26802b;
            w2.p.d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void G() {
        cm0.f6500a.execute(new Runnable() { // from class: v2.q1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                s1.this.C();
            }
        });
    }

    @Override // v2.p1
    public final void A(long j7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.f26835p == j7) {
                    return;
                }
                this.f26835p = j7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void B(int i7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.f26837r == i7) {
                    return;
                }
                this.f26837r = i7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putInt("version_code", i7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hs C() {
        if (!this.f26821b) {
            return null;
        }
        if ((d() && c()) || !((Boolean) n00.f12513b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f26820a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f26824e == null) {
                    this.f26824e = new hs();
                }
                this.f26824e.a();
                int i7 = n1.f26802b;
                w2.p.e("start fetching content...");
                return this.f26824e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final long D() {
        long j7;
        F();
        synchronized (this.f26820a) {
            j7 = this.D;
        }
        return j7;
    }

    final /* synthetic */ void E(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.f26820a) {
                try {
                    this.f26825f = sharedPreferences;
                    this.f26826g = edit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    this.f26827h = this.f26825f.getBoolean("use_https", this.f26827h);
                    this.f26840u = this.f26825f.getBoolean("content_url_opted_out", this.f26840u);
                    this.f26828i = this.f26825f.getString("content_url_hashes", this.f26828i);
                    this.f26830k = this.f26825f.getBoolean("gad_idless", this.f26830k);
                    this.f26841v = this.f26825f.getBoolean("content_vertical_opted_out", this.f26841v);
                    this.f26829j = this.f26825f.getString("content_vertical_hashes", this.f26829j);
                    this.f26837r = this.f26825f.getInt("version_code", this.f26837r);
                    if (((Boolean) o00.f13127g.e()).booleanValue() && s2.b0.c().c()) {
                        this.f26833n = new ll0("", 0L);
                    } else {
                        this.f26833n = new ll0(this.f26825f.getString("app_settings_json", this.f26833n.d()), this.f26825f.getLong("app_settings_last_update_ms", this.f26833n.b()));
                    }
                    this.f26834o = this.f26825f.getLong("app_last_background_time_ms", this.f26834o);
                    this.f26836q = this.f26825f.getInt("request_in_session_count", this.f26836q);
                    this.f26835p = this.f26825f.getLong("first_ad_req_time_ms", this.f26835p);
                    this.f26838s = this.f26825f.getStringSet("never_pool_slots", this.f26838s);
                    this.f26842w = this.f26825f.getString("display_cutout", this.f26842w);
                    this.B = this.f26825f.getInt("app_measurement_npa", this.B);
                    this.C = this.f26825f.getInt("sd_app_measure_npa", this.C);
                    this.D = this.f26825f.getLong("sd_app_measure_npa_ts", this.D);
                    this.f26843x = this.f26825f.getString("inspector_info", this.f26843x);
                    this.f26844y = this.f26825f.getBoolean("linked_device", this.f26844y);
                    this.f26845z = this.f26825f.getString("linked_ad_unit", this.f26845z);
                    this.A = this.f26825f.getString("inspector_ui_storage", this.A);
                    this.f26831l = this.f26825f.getString("IABTCF_TCString", this.f26831l);
                    this.f26832m = this.f26825f.getInt("gad_has_consent_for_cookies", this.f26832m);
                    try {
                        this.f26839t = new JSONObject(this.f26825f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e8) {
                        int i7 = n1.f26802b;
                        w2.p.g("Could not convert native advanced settings to json object", e8);
                    }
                    G();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            r2.t.l().i(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            n1.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // v2.p1
    public final boolean H() {
        boolean z7;
        if (!((Boolean) s2.b0.c().d(uy.O0)).booleanValue()) {
            return false;
        }
        F();
        synchronized (this.f26820a) {
            z7 = this.f26830k;
        }
        return z7;
    }

    @Override // v2.p1
    public final String J() {
        F();
        return this.f26831l;
    }

    @Override // v2.p1
    public final void J0(long j7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.f26834o == j7) {
                    return;
                }
                this.f26834o = j7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final String M() {
        String str;
        F();
        synchronized (this.f26820a) {
            str = this.f26843x;
        }
        return str;
    }

    @Override // v2.p1
    public final String O() {
        String str;
        F();
        synchronized (this.f26820a) {
            str = this.f26845z;
        }
        return str;
    }

    @Override // v2.p1
    public final int Q() {
        F();
        return this.f26832m;
    }

    @Override // v2.p1
    public final String R() {
        String str;
        F();
        synchronized (this.f26820a) {
            str = this.A;
        }
        return str;
    }

    @Override // v2.p1
    public final boolean V() {
        boolean z7;
        F();
        synchronized (this.f26820a) {
            z7 = this.f26844y;
        }
        return z7;
    }

    @Override // v2.p1
    public final void a(String str) {
        F();
        synchronized (this.f26820a) {
            try {
                this.f26831l = str;
                if (this.f26826g != null) {
                    if (str.equals("-1")) {
                        this.f26826g.remove("IABTCF_TCString");
                    } else {
                        this.f26826g.putString("IABTCF_TCString", str);
                    }
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void b(int i7) {
        F();
        synchronized (this.f26820a) {
            try {
                this.f26832m = i7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    if (i7 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i7);
                    }
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final boolean c() {
        boolean z7;
        F();
        synchronized (this.f26820a) {
            z7 = this.f26841v;
        }
        return z7;
    }

    @Override // v2.p1
    public final boolean d() {
        boolean z7;
        F();
        synchronized (this.f26820a) {
            z7 = this.f26840u;
        }
        return z7;
    }

    @Override // v2.p1
    public final void e(boolean z7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.f26841v == z7) {
                    return;
                }
                this.f26841v = z7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final int f() {
        int i7;
        F();
        synchronized (this.f26820a) {
            i7 = this.f26837r;
        }
        return i7;
    }

    @Override // v2.p1
    public final void g(int i7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.f26836q == i7) {
                    return;
                }
                this.f26836q = i7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void h(final Context context) {
        synchronized (this.f26820a) {
            try {
                if (this.f26825f != null) {
                    return;
                }
                final String str = "admob";
                this.f26823d = cm0.f6500a.H0(new Runnable(context, str) { // from class: v2.r1

                    /* renamed from: r, reason: collision with root package name */
                    private final /* synthetic */ Context f26811r;

                    /* renamed from: s, reason: collision with root package name */
                    private final /* synthetic */ String f26812s = "admob";

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        s1.this.E(this.f26811r, this.f26812s);
                    }
                });
                this.f26821b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final ll0 i() {
        ll0 ll0Var;
        synchronized (this.f26820a) {
            ll0Var = this.f26833n;
        }
        return ll0Var;
    }

    @Override // v2.p1
    public final void i0(String str) {
        F();
        synchronized (this.f26820a) {
            try {
                if (TextUtils.equals(this.f26842w, str)) {
                    return;
                }
                this.f26842w = str;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final ll0 j() {
        ll0 ll0Var;
        F();
        synchronized (this.f26820a) {
            try {
                if (((Boolean) s2.b0.c().d(uy.Ic)).booleanValue() && this.f26833n.j()) {
                    Iterator it = this.f26822c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                ll0Var = this.f26833n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ll0Var;
    }

    @Override // v2.p1
    public final void k(String str, String str2, boolean z7) {
        F();
        synchronized (this.f26820a) {
            try {
                JSONArray optJSONArray = this.f26839t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z7 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i7;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z7);
                    jSONObject.put("timestamp_ms", r2.t.o().a());
                    optJSONArray.put(length, jSONObject);
                    this.f26839t.put(str, optJSONArray);
                } catch (JSONException e8) {
                    int i8 = n1.f26802b;
                    w2.p.g("Could not update native advanced settings", e8);
                }
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f26839t.toString());
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void l(String str) {
        if (((Boolean) s2.b0.c().d(uy.U9)).booleanValue()) {
            F();
            synchronized (this.f26820a) {
                try {
                    if (this.f26843x.equals(str)) {
                        return;
                    }
                    this.f26843x = str;
                    SharedPreferences.Editor editor = this.f26826g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f26826g.apply();
                    }
                    G();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // v2.p1
    public final long m() {
        long j7;
        F();
        synchronized (this.f26820a) {
            j7 = this.f26835p;
        }
        return j7;
    }

    @Override // v2.p1
    public final long n() {
        long j7;
        F();
        synchronized (this.f26820a) {
            j7 = this.f26834o;
        }
        return j7;
    }

    @Override // v2.p1
    public final void o(boolean z7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.f26840u == z7) {
                    return;
                }
                this.f26840u = z7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final JSONObject p() {
        JSONObject jSONObject;
        F();
        synchronized (this.f26820a) {
            jSONObject = this.f26839t;
        }
        return jSONObject;
    }

    @Override // v2.p1
    public final void p0(String str) {
        F();
        synchronized (this.f26820a) {
            try {
                long a8 = r2.t.o().a();
                if (str != null && !str.equals(this.f26833n.d())) {
                    this.f26833n = new ll0(str, a8);
                    SharedPreferences.Editor editor = this.f26826g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f26826g.putLong("app_settings_last_update_ms", a8);
                        this.f26826g.apply();
                    }
                    G();
                    Iterator it = this.f26822c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f26833n.a(a8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final int q() {
        int i7;
        F();
        synchronized (this.f26820a) {
            i7 = this.f26836q;
        }
        return i7;
    }

    @Override // v2.p1
    public final void r() {
        F();
        synchronized (this.f26820a) {
            try {
                this.f26839t = new JSONObject();
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void s(boolean z7) {
        F();
        synchronized (this.f26820a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) s2.b0.c().d(uy.yb)).longValue();
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z7);
                    this.f26826g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final String t() {
        String str;
        F();
        synchronized (this.f26820a) {
            str = this.f26842w;
        }
        return str;
    }

    @Override // v2.p1
    public final void u(long j7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.D == j7) {
                    return;
                }
                this.D = j7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void v(String str) {
        if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
            F();
            synchronized (this.f26820a) {
                try {
                    if (this.f26845z.equals(str)) {
                        return;
                    }
                    this.f26845z = str;
                    SharedPreferences.Editor editor = this.f26826g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f26826g.apply();
                    }
                    G();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // v2.p1
    public final void w(int i7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (this.C == i7) {
                    return;
                }
                this.C = i7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final boolean x() {
        F();
        synchronized (this.f26820a) {
            try {
                SharedPreferences sharedPreferences = this.f26825f;
                boolean z7 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f26825f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f26830k) {
                    z7 = true;
                }
                return z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void x0(boolean z7) {
        F();
        synchronized (this.f26820a) {
            try {
                if (z7 == this.f26830k) {
                    return;
                }
                this.f26830k = z7;
                SharedPreferences.Editor editor = this.f26826g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z7);
                    this.f26826g.apply();
                }
                G();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v2.p1
    public final void y(Runnable runnable) {
        this.f26822c.add(runnable);
    }

    @Override // v2.p1
    public final void z(String str) {
        if (((Boolean) s2.b0.c().d(uy.xa)).booleanValue()) {
            F();
            synchronized (this.f26820a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.f26826g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f26826g.apply();
                    }
                    G();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // v2.p1
    public final void z0(boolean z7) {
        if (((Boolean) s2.b0.c().d(uy.ja)).booleanValue()) {
            F();
            synchronized (this.f26820a) {
                try {
                    if (this.f26844y == z7) {
                        return;
                    }
                    this.f26844y = z7;
                    SharedPreferences.Editor editor = this.f26826g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z7);
                        this.f26826g.apply();
                    }
                    G();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
