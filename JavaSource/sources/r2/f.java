package r2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.e63;
import com.google.android.gms.internal.ads.fa0;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.ja0;
import com.google.android.gms.internal.ads.ll0;
import com.google.android.gms.internal.ads.ly;
import com.google.android.gms.internal.ads.ma0;
import com.google.android.gms.internal.ads.p64;
import com.google.android.gms.internal.ads.pa0;
import com.google.android.gms.internal.ads.q53;
import com.google.android.gms.internal.ads.qx1;
import com.google.android.gms.internal.ads.r53;
import com.google.android.gms.internal.ads.rx1;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.w54;
import com.google.android.gms.internal.ads.z64;
import org.json.JSONObject;
import s2.b0;
import v2.n1;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f25794a;

    /* renamed from: b, reason: collision with root package name */
    private long f25795b = 0;

    static final /* synthetic */ a5.d d(Long l7, rx1 rx1Var, r53 r53Var, e63 e63Var, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            t.l().q().p0(jSONObject.getString("appSettingsJson"));
            if (l7 != null) {
                f(rx1Var, "cld_s", t.o().b() - l7.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(optString)) {
            r53Var.h0(optString);
        }
        r53Var.e(optBoolean);
        e63Var.b(r53Var.n());
        return p64.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(rx1 rx1Var, String str, long j7) {
        if (rx1Var != null) {
            if (((Boolean) b0.c().d(uy.Id)).booleanValue()) {
                qx1 a8 = rx1Var.a();
                a8.c("action", "lat_init");
                a8.c(str, Long.toString(j7));
                a8.d();
            }
        }
    }

    public final void a(Context context, w2.a aVar, String str, Runnable runnable, e63 e63Var, rx1 rx1Var, Long l7, boolean z7) {
        c(context, aVar, true, null, str, null, runnable, e63Var, rx1Var, l7, z7);
    }

    public final void b(Context context, w2.a aVar, String str, ll0 ll0Var, e63 e63Var, boolean z7) {
        c(context, aVar, false, ll0Var, ll0Var != null ? ll0Var.e() : null, str, null, e63Var, null, null, z7);
    }

    final void c(Context context, w2.a aVar, boolean z7, ll0 ll0Var, String str, String str2, Runnable runnable, final e63 e63Var, final rx1 rx1Var, final Long l7, boolean z8) {
        r53 r53Var;
        Exception exc;
        PackageInfo f8;
        if (t.o().b() - this.f25795b < 5000) {
            int i7 = n1.f26802b;
            w2.p.f("Not retrying to fetch app settings");
            return;
        }
        this.f25795b = t.o().b();
        if (ll0Var != null && !TextUtils.isEmpty(ll0Var.d())) {
            if (t.o().a() - ll0Var.b() <= ((Long) b0.c().d(uy.J4)).longValue() && ll0Var.c()) {
                return;
            }
        }
        if (context == null) {
            int i8 = n1.f26802b;
            w2.p.f("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i9 = n1.f26802b;
            w2.p.f("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f25794a = applicationContext;
        final r53 a8 = q53.a(context, 4);
        a8.a();
        pa0 b8 = t.v().b(this.f25794a, aVar, e63Var);
        ja0 ja0Var = ma0.f12152b;
        fa0 a9 = b8.a("google.afma.config.fetchAppSettings", ja0Var, ja0Var);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z7);
                jSONObject.put("pn", context.getPackageName());
                ly lyVar = uy.f17045a;
                jSONObject.put("experiment_ids", TextUtils.join(",", b0.b().e()));
                jSONObject.put("js", aVar.f27051q);
                if (((Boolean) b0.c().d(uy.Aa)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z8);
                }
                try {
                    ApplicationInfo applicationInfo = this.f25794a.getApplicationInfo();
                    if (applicationInfo != null && (f8 = u3.e.a(context).f(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", f8.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    n1.k("Error fetching PackageInfo.");
                }
                a5.d b9 = a9.b(jSONObject);
                try {
                    w54 w54Var = new w54(this) { // from class: r2.d
                        @Override // com.google.android.gms.internal.ads.w54
                        public final /* synthetic */ a5.d d(Object obj) {
                            return f.d(l7, rx1Var, a8, e63Var, (JSONObject) obj);
                        }
                    };
                    r53Var = a8;
                    try {
                        z64 z64Var = cm0.f6506g;
                        a5.d j7 = p64.j(b9, w54Var, z64Var);
                        if (runnable != null) {
                            b9.c(runnable, z64Var);
                        }
                        if (l7 != null) {
                            b9.c(new Runnable(this) { // from class: r2.e
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    f.f(rx1Var, "cld_r", t.o().b() - l7.longValue());
                                }
                            }, z64Var);
                        }
                        if (((Boolean) b0.c().d(uy.q8)).booleanValue()) {
                            fm0.b(j7, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            fm0.a(j7, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    } catch (Exception e8) {
                        e = e8;
                        exc = e;
                        int i10 = n1.f26802b;
                        w2.p.d("Error requesting application settings", exc);
                        r53Var.j0(exc);
                        r53Var.e(false);
                        e63Var.b(r53Var.n());
                    }
                } catch (Exception e9) {
                    e = e9;
                    r53Var = a8;
                }
            } catch (Exception e10) {
                exc = e10;
                r53Var = a8;
                int i102 = n1.f26802b;
                w2.p.d("Error requesting application settings", exc);
                r53Var.j0(exc);
                r53Var.e(false);
                e63Var.b(r53Var.n());
            }
        } catch (Exception e11) {
            e = e11;
            r53Var = a8;
        }
    }
}
