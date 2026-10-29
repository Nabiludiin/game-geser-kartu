package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class yl1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f19639a;

    private yl1(w85 w85Var) {
        this.f19639a = w85Var;
    }

    public static yl1 a(w85 w85Var) {
        return new yl1(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = ((ul1) this.f19639a).a().d() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        v85.b(singleton);
        return singleton;
    }
}
