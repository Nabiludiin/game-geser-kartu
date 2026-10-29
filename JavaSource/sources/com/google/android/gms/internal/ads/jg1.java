package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public final class jg1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final gg1 f10536a;

    private jg1(gg1 gg1Var) {
        this.f10536a = gg1Var;
    }

    public static jg1 a(gg1 gg1Var) {
        return new jg1(gg1Var);
    }

    public static Set c(gg1 gg1Var) {
        Set set = Collections.EMPTY_SET;
        v85.b(set);
        return set;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        return c(this.f10536a);
    }
}
