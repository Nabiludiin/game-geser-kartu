package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ot2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    final z64 f13482a;

    public ot2(xt xtVar, z64 z64Var, Context context) {
        this.f13482a = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f13482a.B0(new Callable(this) { // from class: com.google.android.gms.internal.ads.nt2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new pt2(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 45;
    }
}
