package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class h11 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9284a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9285b;

    private h11(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f9284a = w85Var;
        this.f9285b = w85Var3;
    }

    public static h11 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new h11(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = ((JSONObject) this.f9285b.b()) == null ? Collections.EMPTY_SET : Collections.singleton(new hi1((b11) this.f9284a.b(), z33.c()));
        v85.b(singleton);
        return singleton;
    }
}
