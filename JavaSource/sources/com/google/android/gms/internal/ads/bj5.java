package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class bj5 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dj5 f5834a;

    /* synthetic */ bj5(dj5 dj5Var, byte[] bArr) {
        Objects.requireNonNull(dj5Var);
        this.f5834a = dj5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        dj5 dj5Var = this.f5834a;
        dj5Var.f(yi5.b(context, intent, dj5Var.j(), dj5Var.h()));
    }
}
