package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class z implements ac0 {

    /* renamed from: a, reason: collision with root package name */
    private final z90 f19932a = new y(false);

    public z(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.ac0
    public final zd0 a(Context context, w25 w25Var, ac5 ac5Var, zc0 zc0Var, Executor executor, long j7, boolean z7) {
        try {
            ((ac0) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(z90.class).newInstance(this.f19932a)).a(context, w25Var, ac5Var, zc0Var, executor, 0L, false);
            return null;
        } catch (Exception e8) {
            throw new IllegalStateException(e8);
        }
    }
}
