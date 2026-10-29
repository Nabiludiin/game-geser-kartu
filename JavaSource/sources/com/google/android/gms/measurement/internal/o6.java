package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.jg;
import com.google.android.gms.internal.measurement.kg;
import com.google.android.gms.internal.measurement.of;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class o6 extends ad implements l {

    /* renamed from: d, reason: collision with root package name */
    private final Map f22424d;

    /* renamed from: e, reason: collision with root package name */
    final Map f22425e;

    /* renamed from: f, reason: collision with root package name */
    final Map f22426f;

    /* renamed from: g, reason: collision with root package name */
    final Map f22427g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f22428h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f22429i;

    /* renamed from: j, reason: collision with root package name */
    final r.f f22430j;

    /* renamed from: k, reason: collision with root package name */
    final of f22431k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f22432l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f22433m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f22434n;

    o6(pd pdVar) {
        super(pdVar);
        this.f22424d = new r.a();
        this.f22425e = new r.a();
        this.f22426f = new r.a();
        this.f22427g = new r.a();
        this.f22428h = new r.a();
        this.f22432l = new r.a();
        this.f22433m = new r.a();
        this.f22434n = new r.a();
        this.f22429i = new r.a();
        this.f22430j = new h6(this, 20);
        this.f22431k = new i6(this);
    }

    private final void q(String str) {
        j();
        h();
        p3.o.g(str);
        Map map = this.f22428h;
        if (map.get(str) == null) {
            p N0 = this.f22755b.F0().N0(str);
            if (N0 != null) {
                com.google.android.gms.internal.measurement.z4 z4Var = (com.google.android.gms.internal.measurement.z4) t(str, N0.f22452a).s();
                r(str, z4Var);
                this.f22424d.put(str, u((com.google.android.gms.internal.measurement.a5) z4Var.s()));
                map.put(str, (com.google.android.gms.internal.measurement.a5) z4Var.s());
                s(str, (com.google.android.gms.internal.measurement.a5) z4Var.s());
                this.f22432l.put(str, z4Var.E());
                this.f22433m.put(str, N0.f22453b);
                this.f22434n.put(str, N0.f22454c);
                return;
            }
            this.f22424d.put(str, null);
            this.f22426f.put(str, null);
            this.f22425e.put(str, null);
            this.f22427g.put(str, null);
            map.put(str, null);
            this.f22432l.put(str, null);
            this.f22433m.put(str, null);
            this.f22434n.put(str, null);
            this.f22429i.put(str, null);
        }
    }

    private final void r(String str, com.google.android.gms.internal.measurement.z4 z4Var) {
        HashSet hashSet = new HashSet();
        r.a aVar = new r.a();
        r.a aVar2 = new r.a();
        r.a aVar3 = new r.a();
        Iterator it = z4Var.D().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.w4) it.next()).F());
        }
        for (int i7 = 0; i7 < z4Var.x(); i7++) {
            com.google.android.gms.internal.measurement.x4 x4Var = (com.google.android.gms.internal.measurement.x4) z4Var.y(i7).s();
            if (x4Var.x().isEmpty()) {
                this.f22928a.a().r().a("EventConfig contained null event name");
            } else {
                String x7 = x4Var.x();
                String b8 = t4.w.b(x4Var.x());
                if (!TextUtils.isEmpty(b8)) {
                    x4Var.y(b8);
                    z4Var.z(i7, x4Var);
                }
                if (x4Var.z() && x4Var.A()) {
                    aVar.put(x7, Boolean.TRUE);
                }
                if (x4Var.B() && x4Var.C()) {
                    aVar2.put(x4Var.x(), Boolean.TRUE);
                }
                if (x4Var.D()) {
                    if (x4Var.E() < 2 || x4Var.E() > 65535) {
                        this.f22928a.a().r().c("Invalid sampling rate. Event name, sample rate", x4Var.x(), Integer.valueOf(x4Var.E()));
                    } else {
                        aVar3.put(x4Var.x(), Integer.valueOf(x4Var.E()));
                    }
                }
            }
        }
        this.f22425e.put(str, hashSet);
        this.f22426f.put(str, aVar);
        this.f22427g.put(str, aVar2);
        this.f22429i.put(str, aVar3);
    }

    private final void s(final String str, com.google.android.gms.internal.measurement.a5 a5Var) {
        if (a5Var.O() == 0) {
            this.f22430j.e(str);
            return;
        }
        w6 w6Var = this.f22928a;
        w6Var.a().w().b("EES programs found", Integer.valueOf(a5Var.O()));
        com.google.android.gms.internal.measurement.s7 s7Var = (com.google.android.gms.internal.measurement.s7) a5Var.N().get(0);
        try {
            com.google.android.gms.internal.measurement.e1 e1Var = new com.google.android.gms.internal.measurement.e1();
            e1Var.a("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.n6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new com.google.android.gms.internal.measurement.kb("internal.remoteConfig", new j6(o6.this, str));
                }
            });
            e1Var.a("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.k6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    final o6 o6Var = o6.this;
                    final String str2 = str;
                    return new kg("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.m6
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            o6 o6Var2 = o6.this;
                            u F0 = o6Var2.f22755b.F0();
                            String str3 = str2;
                            v5 J0 = F0.J0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            o6Var2.f22928a.w().A();
                            hashMap.put("gmp_version", 133005L);
                            if (J0 != null) {
                                String D0 = J0.D0();
                                if (D0 != null) {
                                    hashMap.put("app_version", D0);
                                }
                                hashMap.put("app_version_int", Long.valueOf(J0.F0()));
                                hashMap.put("dynamite_version", Long.valueOf(J0.b()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            e1Var.a("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.l6
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return new jg(o6.this.f22431k);
                }
            });
            e1Var.f(s7Var);
            this.f22430j.d(str, e1Var);
            w6Var.a().w().c("EES program loaded for appId, activities", str, Integer.valueOf(s7Var.G().G()));
            Iterator it = s7Var.G().F().iterator();
            while (it.hasNext()) {
                w6Var.a().w().b("EES program activity", ((com.google.android.gms.internal.measurement.p7) it.next()).F());
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f22928a.a().o().b("Failed to load EES program. appId", str);
        }
    }

    private final com.google.android.gms.internal.measurement.a5 t(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.a5.W();
        }
        try {
            com.google.android.gms.internal.measurement.a5 a5Var = (com.google.android.gms.internal.measurement.a5) ((com.google.android.gms.internal.measurement.z4) td.W(com.google.android.gms.internal.measurement.a5.V(), bArr)).s();
            this.f22928a.a().w().c("Parsed config. version, gmp_app_id", a5Var.F() ? Long.valueOf(a5Var.G()) : null, a5Var.H() ? a5Var.I() : null);
            return a5Var;
        } catch (com.google.android.gms.internal.measurement.gb e8) {
            this.f22928a.a().r().c("Unable to merge remote config. appId", p5.x(str), e8);
            return com.google.android.gms.internal.measurement.a5.W();
        } catch (RuntimeException e9) {
            this.f22928a.a().r().c("Unable to merge remote config. appId", p5.x(str), e9);
            return com.google.android.gms.internal.measurement.a5.W();
        }
    }

    private static final Map u(com.google.android.gms.internal.measurement.a5 a5Var) {
        r.a aVar = new r.a();
        if (a5Var != null) {
            for (com.google.android.gms.internal.measurement.i5 i5Var : a5Var.J()) {
                aVar.put(i5Var.F(), i5Var.G());
            }
        }
        return aVar;
    }

    private static final t4.v v(int i7) {
        int i8 = i7 - 1;
        if (i8 == 1) {
            return t4.v.AD_STORAGE;
        }
        if (i8 == 2) {
            return t4.v.ANALYTICS_STORAGE;
        }
        if (i8 == 3) {
            return t4.v.AD_USER_DATA;
        }
        if (i8 != 4) {
            return null;
        }
        return t4.v.AD_PERSONALIZATION;
    }

    protected final void A(String str) {
        h();
        this.f22433m.put(str, null);
    }

    final void B(String str) {
        h();
        this.f22428h.remove(str);
    }

    protected final boolean C(String str, byte[] bArr, String str2, String str3) {
        j();
        h();
        p3.o.g(str);
        com.google.android.gms.internal.measurement.z4 z4Var = (com.google.android.gms.internal.measurement.z4) t(str, bArr).s();
        r(str, z4Var);
        s(str, (com.google.android.gms.internal.measurement.a5) z4Var.s());
        this.f22428h.put(str, (com.google.android.gms.internal.measurement.a5) z4Var.s());
        this.f22432l.put(str, z4Var.E());
        this.f22433m.put(str, str2);
        this.f22434n.put(str, str3);
        this.f22424d.put(str, u((com.google.android.gms.internal.measurement.a5) z4Var.s()));
        this.f22755b.F0().Y(str, new ArrayList(z4Var.A()));
        try {
            z4Var.B();
            bArr = ((com.google.android.gms.internal.measurement.a5) z4Var.s()).c();
        } catch (RuntimeException e8) {
            this.f22928a.a().r().c("Unable to serialize reduced-size config. Storing full config instead. appId", p5.x(str), e8);
        }
        u F0 = this.f22755b.F0();
        p3.o.g(str);
        F0.h();
        F0.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (F0.u0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                F0.f22928a.a().o().b("Failed to update remote config (got 0). appId", p5.x(str));
            }
        } catch (SQLiteException e9) {
            F0.f22928a.a().o().c("Error storing remote config. appId", p5.x(str), e9);
        }
        z4Var.C();
        this.f22428h.put(str, (com.google.android.gms.internal.measurement.a5) z4Var.s());
        return true;
    }

    final boolean D(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if (H(str) && yd.N(str2)) {
            return true;
        }
        if (I(str) && yd.r0(str2)) {
            return true;
        }
        Map map = (Map) this.f22426f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean E(String str, String str2) {
        Boolean bool;
        h();
        q(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f22427g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final Set F(String str) {
        h();
        q(str);
        return (Set) this.f22425e.get(str);
    }

    final int G(String str, String str2) {
        Integer num;
        h();
        q(str);
        Map map = (Map) this.f22429i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean H(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    final boolean I(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    final boolean J(String str) {
        h();
        q(str);
        Map map = this.f22425e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean K(String str) {
        h();
        q(str);
        Map map = this.f22425e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean L(String str) {
        h();
        q(str);
        Map map = this.f22425e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    final boolean M(String str) {
        h();
        q(str);
        Map map = this.f22425e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    final boolean N(String str) {
        h();
        q(str);
        Map map = this.f22425e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    final boolean O(String str) {
        h();
        q(str);
        Map map = this.f22425e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean P(String str, t4.v vVar) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.u4 R = R(str);
        if (R == null) {
            return false;
        }
        Iterator it = R.F().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.i4 i4Var = (com.google.android.gms.internal.measurement.i4) it.next();
            if (vVar == v(i4Var.G())) {
                if (i4Var.H() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final t4.v Q(String str, t4.v vVar) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.u4 R = R(str);
        if (R == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.k4 k4Var : R.G()) {
            if (vVar == v(k4Var.G())) {
                return v(k4Var.H());
            }
        }
        return null;
    }

    final com.google.android.gms.internal.measurement.u4 R(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.a5 w7 = w(str);
        if (w7 == null || !w7.R()) {
            return null;
        }
        return w7.S();
    }

    final boolean S(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.u4 R = R(str);
        return R == null || !R.I() || R.J();
    }

    final SortedSet T(String str) {
        h();
        q(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.u4 R = R(str);
        if (R != null) {
            Iterator it = R.H().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.r4) it.next()).F());
            }
        }
        return treeSet;
    }

    @Override // com.google.android.gms.measurement.internal.l
    public final String d(String str, String str2) {
        h();
        q(str);
        Map map = (Map) this.f22424d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        return false;
    }

    final t4.u m(String str, t4.v vVar) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.u4 R = R(str);
        if (R == null) {
            return t4.u.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.i4 i4Var : R.K()) {
            if (v(i4Var.G()) == vVar) {
                int H = i4Var.H() - 1;
                return H != 1 ? H != 2 ? t4.u.UNINITIALIZED : t4.u.DENIED : t4.u.GRANTED;
            }
        }
        return t4.u.UNINITIALIZED;
    }

    final boolean n(String str) {
        h();
        q(str);
        com.google.android.gms.internal.measurement.u4 R = R(str);
        if (R == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.i4 i4Var : R.F()) {
            if (i4Var.G() == 3 && i4Var.I() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.e1 o(String str) {
        j();
        p3.o.g(str);
        p N0 = this.f22755b.F0().N0(str);
        if (N0 == null) {
            return null;
        }
        this.f22928a.a().w().b("Populate EES config from database on cache miss. appId", str);
        s(str, t(str, N0.f22452a));
        return (com.google.android.gms.internal.measurement.e1) this.f22430j.h().get(str);
    }

    final /* synthetic */ Map p() {
        return this.f22424d;
    }

    protected final com.google.android.gms.internal.measurement.a5 w(String str) {
        j();
        h();
        p3.o.g(str);
        q(str);
        return (com.google.android.gms.internal.measurement.a5) this.f22428h.get(str);
    }

    final String x(String str) {
        h();
        q(str);
        return (String) this.f22432l.get(str);
    }

    protected final String y(String str) {
        h();
        return (String) this.f22433m.get(str);
    }

    protected final String z(String str) {
        h();
        return (String) this.f22434n.get(str);
    }
}
