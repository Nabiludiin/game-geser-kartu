package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class qp5 extends lp5 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f14553e = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f14554c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f14555d;

    private qp5(az azVar, Object obj, Object obj2) {
        super(azVar);
        this.f14554c = obj;
        this.f14555d = obj2;
    }

    public static qp5 p(j9 j9Var) {
        return new qp5(new rp5(j9Var), yx.f19894o, f14553e);
    }

    public static qp5 q(az azVar, Object obj, Object obj2) {
        return new qp5(azVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.lp5, com.google.android.gms.internal.ads.az
    public final yx b(int i7, yx yxVar, long j7) {
        this.f11719b.b(i7, yxVar, j7);
        if (Objects.equals(yxVar.f19896a, this.f14554c)) {
            yxVar.f19896a = yx.f19894o;
        }
        return yxVar;
    }

    @Override // com.google.android.gms.internal.ads.lp5, com.google.android.gms.internal.ads.az
    public final ot d(int i7, ot otVar, boolean z7) {
        this.f11719b.d(i7, otVar, z7);
        if (Objects.equals(otVar.f13476b, this.f14555d) && z7) {
            otVar.f13476b = f14553e;
        }
        return otVar;
    }

    @Override // com.google.android.gms.internal.ads.lp5, com.google.android.gms.internal.ads.az
    public final int e(Object obj) {
        Object obj2;
        if (f14553e.equals(obj) && (obj2 = this.f14555d) != null) {
            obj = obj2;
        }
        return this.f11719b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.lp5, com.google.android.gms.internal.ads.az
    public final Object f(int i7) {
        Object f8 = this.f11719b.f(i7);
        return Objects.equals(f8, this.f14555d) ? f14553e : f8;
    }

    public final qp5 r(az azVar) {
        return new qp5(azVar, this.f14554c, this.f14555d);
    }

    final /* synthetic */ Object s() {
        return this.f14555d;
    }
}
