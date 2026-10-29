package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
final class pl1 implements u41 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13917a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f13918b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f13919c;

    /* renamed from: d, reason: collision with root package name */
    private final b95 f13920d;

    /* renamed from: e, reason: collision with root package name */
    private final ao1 f13921e;

    pl1(Map map, Map map2, Map map3, b95 b95Var, ao1 ao1Var) {
        this.f13917a = map;
        this.f13918b = map2;
        this.f13919c = map3;
        this.f13920d = b95Var;
        this.f13921e = ao1Var;
    }

    @Override // com.google.android.gms.internal.ads.u41
    public final ka2 m0(int i7, String str) {
        ka2 m02;
        ka2 ka2Var = (ka2) this.f13917a.get(str);
        if (ka2Var != null) {
            return ka2Var;
        }
        if (i7 != 1) {
            if (i7 != 4) {
                return null;
            }
            sc2 sc2Var = (sc2) this.f13919c.get(str);
            if (sc2Var != null) {
                return z41.a(sc2Var);
            }
            m02 = (ka2) this.f13918b.get(str);
            if (m02 == null) {
                return null;
            }
        } else if (this.f13921e.d() == null || (m02 = ((u41) this.f13920d.b()).m0(i7, str)) == null) {
            return null;
        }
        return z41.b(m02);
    }
}
