package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: MyApplication */
public final class m extends z7 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f22344b;

    /* renamed from: c, reason: collision with root package name */
    private String f22345c;

    /* renamed from: d, reason: collision with root package name */
    private l f22346d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f22347e;

    m(w6 w6Var) {
        super(w6Var);
        this.f22346d = k.f22287a;
    }

    public static final long n() {
        return ((Long) c5.f21945e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) c5.f21960j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) c5.f21966l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) c5.S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) c5.N.b(null)).longValue();
    }

    private final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            p3.o.m(str3);
            return str3;
        } catch (ClassNotFoundException e8) {
            this.f22928a.a().o().b("Could not find SystemProperties class", e8);
            return "";
        } catch (IllegalAccessException e9) {
            this.f22928a.a().o().b("Could not access SystemProperties.get()", e9);
            return "";
        } catch (NoSuchMethodException e10) {
            this.f22928a.a().o().b("Could not find SystemProperties.get() method", e10);
            return "";
        } catch (InvocationTargetException e11) {
            this.f22928a.a().o().b("SystemProperties.get() threw an exception", e11);
            return "";
        }
    }

    public final long A() {
        this.f22928a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f22347e == null) {
            synchronized (this) {
                try {
                    if (this.f22347e == null) {
                        w6 w6Var = this.f22928a;
                        ApplicationInfo applicationInfo = w6Var.e().getApplicationInfo();
                        String a8 = com.google.android.gms.common.util.q.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z7 = false;
                            if (str != null && str.equals(a8)) {
                                z7 = true;
                            }
                            this.f22347e = Boolean.valueOf(z7);
                        }
                        if (this.f22347e == null) {
                            this.f22347e = Boolean.TRUE;
                            w6Var.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f22347e.booleanValue();
    }

    public final String C(String str, b5 b5Var) {
        return TextUtils.isEmpty(str) ? (String) b5Var.b(null) : (String) b5Var.b(this.f22346d.d(str, b5Var.a()));
    }

    public final long D(String str, b5 b5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) b5Var.b(null)).longValue();
        }
        String d8 = this.f22346d.d(str, b5Var.a());
        if (TextUtils.isEmpty(d8)) {
            return ((Long) b5Var.b(null)).longValue();
        }
        try {
            return ((Long) b5Var.b(Long.valueOf(Long.parseLong(d8)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) b5Var.b(null)).longValue();
        }
    }

    public final int E(String str, b5 b5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) b5Var.b(null)).intValue();
        }
        String d8 = this.f22346d.d(str, b5Var.a());
        if (TextUtils.isEmpty(d8)) {
            return ((Integer) b5Var.b(null)).intValue();
        }
        try {
            return ((Integer) b5Var.b(Integer.valueOf(Integer.parseInt(d8)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) b5Var.b(null)).intValue();
        }
    }

    public final int F(String str, b5 b5Var, int i7, int i8) {
        return Math.max(Math.min(E(str, b5Var), i8), i7);
    }

    public final double G(String str, b5 b5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) b5Var.b(null)).doubleValue();
        }
        String d8 = this.f22346d.d(str, b5Var.a());
        if (TextUtils.isEmpty(d8)) {
            return ((Double) b5Var.b(null)).doubleValue();
        }
        try {
            return ((Double) b5Var.b(Double.valueOf(Double.parseDouble(d8)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) b5Var.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, b5 b5Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) b5Var.b(null)).booleanValue();
        }
        String d8 = this.f22346d.d(str, b5Var.a());
        return TextUtils.isEmpty(d8) ? ((Boolean) b5Var.b(null)).booleanValue() : ((Boolean) b5Var.b(Boolean.valueOf("1".equals(d8)))).booleanValue();
    }

    final Bundle I() {
        try {
            w6 w6Var = this.f22928a;
            if (w6Var.e().getPackageManager() == null) {
                w6Var.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c8 = u3.e.a(w6Var.e()).c(w6Var.e().getPackageName(), 128);
            if (c8 != null) {
                return c8.metaData;
            }
            w6Var.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            this.f22928a.a().o().b("Failed to load metadata: Package name not found", e8);
            return null;
        }
    }

    final Boolean J(String str) {
        p3.o.g(str);
        Bundle I = I();
        if (I == null) {
            this.f22928a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (I.containsKey(str)) {
            return Boolean.valueOf(I.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List K(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p3.o.g(r4)
            android.os.Bundle r0 = r3.I()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.w6 r4 = r3.f22928a
            com.google.android.gms.measurement.internal.p5 r4 = r4.a()
            com.google.android.gms.measurement.internal.n5 r4 = r4.o()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.w6 r0 = r3.f22928a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.e()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w6 r0 = r3.f22928a
            com.google.android.gms.measurement.internal.p5 r0 = r0.a()
            com.google.android.gms.measurement.internal.n5 r0 = r0.o()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.K(java.lang.String):java.util.List");
    }

    public final boolean L() {
        this.f22928a.c();
        Boolean J = J("firebase_analytics_collection_deactivated");
        return J != null && J.booleanValue();
    }

    public final boolean M() {
        Boolean J = J("google_analytics_adid_collection_enabled");
        return J == null || J.booleanValue();
    }

    public final boolean N() {
        Boolean J = J("google_analytics_automatic_screen_reporting_enabled");
        return J == null || J.booleanValue();
    }

    public final t4.u O(String str, boolean z7) {
        Object obj;
        p3.o.g(str);
        w6 w6Var = this.f22928a;
        Bundle I = I();
        if (I == null) {
            w6Var.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = I.get(str);
        }
        if (obj == null) {
            return t4.u.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return t4.u.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return t4.u.DENIED;
        }
        if (z7 && "eu_consent_policy".equals(obj)) {
            return t4.u.POLICY;
        }
        w6Var.a().r().b("Invalid manifest metadata for", str);
        return t4.u.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean J = J("google_analytics_sgtm_upload_enabled");
        if (J == null) {
            return false;
        }
        return J.booleanValue();
    }

    public final void Q(String str) {
        this.f22345c = str;
    }

    public final String R() {
        return this.f22345c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f22346d.d(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f22346d.d(str, "measurement.event_sampling_enabled"));
    }

    final boolean m() {
        if (this.f22344b == null) {
            Boolean J = J("app_measurement_lite");
            this.f22344b = J;
            if (J == null) {
                this.f22344b = Boolean.FALSE;
            }
        }
        return this.f22344b.booleanValue() || !this.f22928a.G();
    }

    final void t(l lVar) {
        this.f22346d = lVar;
    }

    final String u() {
        this.f22928a.c();
        return "FA";
    }

    public final int v() {
        return this.f22928a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, c5.Y, 25, 100);
    }

    final int x(String str, boolean z7) {
        if (z7) {
            return F(str, c5.f21958i0, 100, 500);
        }
        return 500;
    }

    final int y(String str, boolean z7) {
        return Math.max(x(str, z7), 256);
    }

    final int z(String str) {
        return F(str, c5.X, 500, 2000);
    }
}
