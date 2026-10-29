package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class ov1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f13507a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f13508b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f13509c;

    /* renamed from: d, reason: collision with root package name */
    private final w85 f13510d;

    /* renamed from: e, reason: collision with root package name */
    private final w85 f13511e;

    private ov1(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        this.f13507a = w85Var;
        this.f13508b = w85Var2;
        this.f13509c = w85Var3;
        this.f13510d = w85Var4;
        this.f13511e = w85Var5;
    }

    public static ov1 a(w85 w85Var, w85 w85Var2, w85 w85Var3, w85 w85Var4, w85 w85Var5) {
        return new ov1(w85Var, w85Var2, w85Var3, w85Var4, w85Var5);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Context a8 = ((ou0) this.f13507a).a();
        final String b8 = ((g32) this.f13508b).b();
        w2.a a9 = ((ev0) this.f13509c).a();
        final ou ouVar = (ou) this.f13510d.b();
        final String str = (String) this.f13511e.b();
        iu iuVar = new iu(new nu(a8));
        qv i02 = rv.i0();
        i02.E(a9.f27052r);
        i02.F(a9.f27053s);
        i02.G(true != a9.f27054t ? 2 : 0);
        final rv rvVar = (rv) i02.A();
        iuVar.b(new hu() { // from class: com.google.android.gms.internal.ads.nv1
            @Override // com.google.android.gms.internal.ads.hu
            public final /* synthetic */ void a(qx qxVar) {
                qu quVar = (qu) qxVar.I().Q();
                quVar.E(ou.this);
                qxVar.J(quVar);
                ix ixVar = (ix) qxVar.G().Q();
                ixVar.E(b8);
                ixVar.F(rvVar);
                qxVar.H(ixVar);
                qxVar.O(str);
            }
        });
        return iuVar;
    }
}
