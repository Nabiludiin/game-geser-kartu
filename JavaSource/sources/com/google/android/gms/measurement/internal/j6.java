package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class j6 implements com.google.android.gms.internal.measurement.lc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o6 f22265b;

    j6(o6 o6Var, String str) {
        this.f22264a = str;
        Objects.requireNonNull(o6Var);
        this.f22265b = o6Var;
    }

    @Override // com.google.android.gms.internal.measurement.lc
    public final String b(String str) {
        Map map = (Map) this.f22265b.p().get(this.f22264a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
