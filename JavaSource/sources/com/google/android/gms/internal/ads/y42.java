package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: MyApplication */
public final class y42 implements a52 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19368a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f19369b;

    /* renamed from: c, reason: collision with root package name */
    private final hd1 f19370c;

    public y42(Map map, z64 z64Var, hd1 hd1Var) {
        this.f19368a = map;
        this.f19369b = z64Var;
        this.f19370c = hd1Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final a5.d a(final eh0 eh0Var) {
        this.f19370c.J(eh0Var);
        a5.d c8 = p64.c(new j22(3));
        for (String str : ((String) s2.b0.c().d(uy.d9)).split(",")) {
            final b95 b95Var = (b95) this.f19368a.get(str.trim());
            if (b95Var != null) {
                c8 = p64.h(c8, j22.class, new w54() { // from class: com.google.android.gms.internal.ads.x42
                    @Override // com.google.android.gms.internal.ads.w54
                    public final /* synthetic */ a5.d d(Object obj) {
                        return ((a52) b95.this.b()).a(eh0Var);
                    }
                }, this.f19369b);
            }
        }
        p64.r(c8, new w42(this), cm0.f6506g);
        return c8;
    }

    final /* synthetic */ hd1 b() {
        return this.f19370c;
    }
}
