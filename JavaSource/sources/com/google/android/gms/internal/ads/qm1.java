package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: MyApplication */
public final class qm1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f14503a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f14504b;

    private qm1(w85 w85Var, w85 w85Var2) {
        this.f14503a = w85Var;
        this.f14504b = w85Var2;
    }

    public static qm1 a(w85 w85Var, w85 w85Var2) {
        return new qm1(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        return new ji1((Context) this.f14503a.b(), new HashSet(), ((j51) this.f14504b).a());
    }
}
