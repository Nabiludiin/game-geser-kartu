package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class u01 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v01 f16535a;

    u01(v01 v01Var) {
        Objects.requireNonNull(v01Var);
        this.f16535a = v01Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        v01 v01Var = this.f16535a;
        if (v01Var.e(map)) {
            v01Var.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.t01
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    u01.this.f16535a.g().b();
                }
            });
        }
    }
}
