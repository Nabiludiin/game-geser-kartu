package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: MyApplication */
public abstract class i85 {

    /* renamed from: a, reason: collision with root package name */
    final LinkedHashMap f9886a;

    i85(int i7) {
        this.f9886a = k85.c(i7);
    }

    final i85 a(Object obj, w85 w85Var) {
        v85.a(obj, "key");
        v85.a(w85Var, "provider");
        this.f9886a.put(obj, w85Var);
        return this;
    }
}
