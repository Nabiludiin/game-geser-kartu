package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class j81 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f10390a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f10391b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f10392c;

    private j81(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f10390a = w85Var;
        this.f10391b = w85Var2;
        this.f10392c = w85Var3;
    }

    public static j81 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new j81(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        final Context context = (Context) this.f10390a.b();
        final w2.a a8 = ((ev0) this.f10391b).a();
        final w03 a9 = ((n91) this.f10392c).a();
        return new hx3() { // from class: com.google.android.gms.internal.ads.i81
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                c03 c03Var = (c03) obj;
                v2.u uVar = new v2.u(context);
                uVar.e(c03Var.B);
                uVar.f(c03Var.C.toString());
                uVar.d(a8.f27051q);
                uVar.c(a9.f17961g);
                return uVar;
            }
        };
    }
}
