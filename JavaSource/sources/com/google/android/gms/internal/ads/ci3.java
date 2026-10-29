package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: MyApplication */
final class ci3 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f6440a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fi3 f6441b;

    ci3(fi3 fi3Var, Context context) {
        this.f6440a = context;
        Objects.requireNonNull(fi3Var);
        this.f6441b = fi3Var;
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* bridge */ /* synthetic */ a5.d d(Object obj) {
        return this.f6441b.g().b(this.f6440a);
    }
}
