package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class la extends e5 {

    /* renamed from: c, reason: collision with root package name */
    private volatile da f22327c;

    /* renamed from: d, reason: collision with root package name */
    private volatile da f22328d;

    /* renamed from: e, reason: collision with root package name */
    protected da f22329e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f22330f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.j2 f22331g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f22332h;

    /* renamed from: i, reason: collision with root package name */
    private volatile da f22333i;

    /* renamed from: j, reason: collision with root package name */
    private da f22334j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22335k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f22336l;

    public la(w6 w6Var) {
        super(w6Var);
        this.f22336l = new Object();
        this.f22330f = new ConcurrentHashMap();
    }

    private final void F(String str, da daVar, boolean z7) {
        da daVar2;
        da daVar3 = this.f22327c == null ? this.f22328d : this.f22327c;
        if (daVar.f22057b == null) {
            daVar2 = new da(daVar.f22056a, str != null ? r(str, "Activity") : null, daVar.f22058c, daVar.f22060e, daVar.f22061f);
        } else {
            daVar2 = daVar;
        }
        this.f22328d = this.f22327c;
        this.f22327c = daVar2;
        w6 w6Var = this.f22928a;
        w6Var.b().t(new fa(this, daVar2, daVar3, w6Var.f().b(), z7));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(com.google.android.gms.measurement.internal.da r15, com.google.android.gms.measurement.internal.da r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r20
            r14.h()
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L2a
            long r7 = r0.f22058c
            long r9 = r1.f22058c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L2a
            java.lang.String r7 = r1.f22057b
            java.lang.String r8 = r0.f22057b
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.lang.String r7 = r1.f22056a
            java.lang.String r8 = r0.f22056a
            boolean r7 = java.util.Objects.equals(r7, r8)
            if (r7 != 0) goto L2c
        L2a:
            r7 = r6
            goto L2d
        L2c:
            r7 = r5
        L2d:
            if (r19 == 0) goto L34
            com.google.android.gms.measurement.internal.da r8 = r14.f22329e
            if (r8 == 0) goto L34
            r5 = r6
        L34:
            if (r7 == 0) goto Lbf
            if (r4 == 0) goto L3f
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r4)
        L3d:
            r13 = r7
            goto L45
        L3f:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            goto L3d
        L45:
            com.google.android.gms.measurement.internal.yd.k0(r15, r13, r6)
            if (r1 == 0) goto L63
            java.lang.String r4 = r1.f22056a
            if (r4 == 0) goto L53
            java.lang.String r7 = "_pn"
            r13.putString(r7, r4)
        L53:
            java.lang.String r4 = r1.f22057b
            if (r4 == 0) goto L5c
            java.lang.String r7 = "_pc"
            r13.putString(r7, r4)
        L5c:
            long r7 = r1.f22058c
            java.lang.String r1 = "_pi"
            r13.putLong(r1, r7)
        L63:
            r7 = 0
            if (r5 == 0) goto L82
            com.google.android.gms.measurement.internal.w6 r1 = r14.f22928a
            com.google.android.gms.measurement.internal.mc r1 = r1.z()
            com.google.android.gms.measurement.internal.kc r1 = r1.f22377f
            long r9 = r1.f22305b
            long r9 = r2 - r9
            r1.f22305b = r2
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L82
            com.google.android.gms.measurement.internal.w6 r1 = r14.f22928a
            com.google.android.gms.measurement.internal.yd r1 = r1.C()
            r1.Z(r13, r9)
        L82:
            com.google.android.gms.measurement.internal.w6 r1 = r14.f22928a
            com.google.android.gms.measurement.internal.m r4 = r1.w()
            boolean r4 = r4.N()
            if (r4 != 0) goto L95
            java.lang.String r4 = "_mst"
            r9 = 1
            r13.putLong(r4, r9)
        L95:
            boolean r4 = r0.f22060e
            if (r6 == r4) goto L9c
            java.lang.String r9 = "auto"
            goto L9e
        L9c:
            java.lang.String r9 = "app"
        L9e:
            com.google.android.gms.common.util.e r1 = r1.f()
            long r10 = r1.a()
            if (r4 == 0) goto Lb3
            r19 = r7
            long r7 = r0.f22061f
            int r1 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r1 != 0) goto Lb1
            goto Lb3
        Lb1:
            r11 = r7
            goto Lb4
        Lb3:
            r11 = r10
        Lb4:
            com.google.android.gms.measurement.internal.w6 r1 = r14.f22928a
            java.lang.String r10 = "_vs"
            com.google.android.gms.measurement.internal.w9 r8 = r1.B()
            r8.u(r9, r10, r11, r13)
        Lbf:
            if (r5 == 0) goto Lc6
            com.google.android.gms.measurement.internal.da r1 = r14.f22329e
            r14.o(r1, r6, r2)
        Lc6:
            r14.f22329e = r0
            boolean r1 = r0.f22060e
            if (r1 == 0) goto Lce
            r14.f22334j = r0
        Lce:
            com.google.android.gms.measurement.internal.w6 r1 = r14.f22928a
            com.google.android.gms.measurement.internal.vb r1 = r1.J()
            r1.u(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.la.G(com.google.android.gms.measurement.internal.da, com.google.android.gms.measurement.internal.da, long, boolean, android.os.Bundle):void");
    }

    private final void o(da daVar, boolean z7, long j7) {
        w6 w6Var = this.f22928a;
        w6Var.M().k(w6Var.f().b());
        if (!w6Var.z().f22377f.d(daVar != null && daVar.f22059d, z7, j7) || daVar == null) {
            return;
        }
        daVar.f22059d = false;
    }

    private final da p(com.google.android.gms.internal.measurement.j2 j2Var) {
        p3.o.m(j2Var);
        Integer valueOf = Integer.valueOf(j2Var.f21050q);
        Map map = this.f22330f;
        da daVar = (da) map.get(valueOf);
        if (daVar == null) {
            da daVar2 = new da(null, r(j2Var.f21051r, "Activity"), this.f22928a.C().p0());
            map.put(valueOf, daVar2);
            daVar = daVar2;
        }
        return this.f22333i != null ? this.f22333i : daVar;
    }

    final /* synthetic */ void A(Bundle bundle, da daVar, da daVar2, long j7) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(daVar, daVar2, j7, true, this.f22928a.C().t(null, "screen_view", bundle, null, false));
    }

    final /* synthetic */ void B(da daVar, da daVar2, long j7, boolean z7, Bundle bundle) {
        G(daVar, daVar2, j7, z7, null);
    }

    final /* synthetic */ void C(da daVar, boolean z7, long j7) {
        o(daVar, false, j7);
    }

    final /* synthetic */ da D() {
        return this.f22334j;
    }

    final /* synthetic */ void E(da daVar) {
        this.f22334j = null;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    protected final boolean m() {
        return false;
    }

    public final da q(boolean z7) {
        j();
        h();
        if (!z7) {
            return this.f22329e;
        }
        da daVar = this.f22329e;
        return daVar != null ? daVar : this.f22334j;
    }

    final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = length > 0 ? split[length - 1] : "";
        w6 w6Var = this.f22928a;
        return str3.length() > w6Var.w().x(null, false) ? str3.substring(0, w6Var.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j7) {
        synchronized (this.f22336l) {
            try {
                if (!this.f22335k) {
                    this.f22928a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f22928a.w().x(null, false))) {
                    this.f22928a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f22928a.w().x(null, false))) {
                    this.f22928a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.j2 j2Var = this.f22331g;
                    string2 = j2Var != null ? r(j2Var.f21051r, "Activity") : "Activity";
                }
                da daVar = this.f22327c;
                if (this.f22332h && daVar != null) {
                    this.f22332h = false;
                    boolean equals = Objects.equals(daVar.f22057b, string2);
                    boolean equals2 = Objects.equals(daVar.f22056a, string);
                    if (equals && equals2) {
                        this.f22928a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                w6 w6Var = this.f22928a;
                w6Var.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                da daVar2 = this.f22327c == null ? this.f22328d : this.f22327c;
                da daVar3 = new da(string, string2, w6Var.C().p0(), true, j7);
                this.f22327c = daVar3;
                this.f22328d = daVar2;
                this.f22333i = daVar3;
                w6Var.b().t(new ea(this, bundle, daVar3, daVar2, w6Var.f().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(com.google.android.gms.internal.measurement.j2 j2Var, String str, String str2) {
        w6 w6Var = this.f22928a;
        if (!w6Var.w().N()) {
            w6Var.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        da daVar = this.f22327c;
        if (daVar == null) {
            w6Var.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f22330f;
        Integer valueOf = Integer.valueOf(j2Var.f21050q);
        if (map.get(valueOf) == null) {
            w6Var.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(j2Var.f21051r, "Activity");
        }
        String str3 = daVar.f22057b;
        String str4 = daVar.f22056a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            w6Var.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > w6Var.w().x(null, false))) {
            w6Var.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > w6Var.w().x(null, false))) {
            w6Var.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        w6Var.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        da daVar2 = new da(str, str2, w6Var.C().p0());
        map.put(valueOf, daVar2);
        F(j2Var.f21051r, daVar2, true);
    }

    public final da u() {
        return this.f22327c;
    }

    public final void v(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle) {
        Bundle bundle2;
        if (!this.f22928a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f22330f.put(Integer.valueOf(j2Var.f21050q), new da(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(com.google.android.gms.internal.measurement.j2 j2Var) {
        Object obj = this.f22336l;
        synchronized (obj) {
            this.f22335k = true;
            if (!Objects.equals(j2Var, this.f22331g)) {
                synchronized (obj) {
                    this.f22331g = j2Var;
                    this.f22332h = false;
                    w6 w6Var = this.f22928a;
                    if (w6Var.w().N()) {
                        this.f22333i = null;
                        w6Var.b().t(new ka(this));
                    }
                }
            }
        }
        w6 w6Var2 = this.f22928a;
        if (!w6Var2.w().N()) {
            this.f22327c = this.f22333i;
            w6Var2.b().t(new ga(this));
            return;
        }
        F(j2Var.f21051r, p(j2Var), false);
        b2 M = this.f22928a.M();
        w6 w6Var3 = M.f22928a;
        w6Var3.b().t(new a1(M, w6Var3.f().b()));
    }

    public final void x(com.google.android.gms.internal.measurement.j2 j2Var) {
        synchronized (this.f22336l) {
            this.f22335k = false;
            this.f22332h = true;
        }
        w6 w6Var = this.f22928a;
        long b8 = w6Var.f().b();
        if (!w6Var.w().N()) {
            this.f22327c = null;
            w6Var.b().t(new ha(this, b8));
        } else {
            da p7 = p(j2Var);
            this.f22328d = this.f22327c;
            this.f22327c = null;
            w6Var.b().t(new ia(this, p7, b8));
        }
    }

    public final void y(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle) {
        da daVar;
        if (!this.f22928a.w().N() || bundle == null || (daVar = (da) this.f22330f.get(Integer.valueOf(j2Var.f21050q))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", daVar.f22058c);
        bundle2.putString("name", daVar.f22056a);
        bundle2.putString("referrer_name", daVar.f22057b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(com.google.android.gms.internal.measurement.j2 j2Var) {
        synchronized (this.f22336l) {
            try {
                if (Objects.equals(this.f22331g, j2Var)) {
                    this.f22331g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f22928a.w().N()) {
            this.f22330f.remove(Integer.valueOf(j2Var.f21050q));
        }
    }
}
