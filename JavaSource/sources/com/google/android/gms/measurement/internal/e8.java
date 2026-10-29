package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* compiled from: MyApplication */
final class e8 implements t4.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w6 f22089a;

    e8(f8 f8Var, w6 w6Var) {
        this.f22089a = w6Var;
        Objects.requireNonNull(f8Var);
    }

    @Override // t4.l
    public final boolean a() {
        return Log.isLoggable(this.f22089a.a().z(), 3);
    }
}
