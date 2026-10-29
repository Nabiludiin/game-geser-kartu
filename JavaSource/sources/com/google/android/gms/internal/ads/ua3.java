package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class ua3 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ va3 f16669a;

    ua3(va3 va3Var) {
        Objects.requireNonNull(va3Var);
        this.f16669a = va3Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            va3 va3Var = this.f16669a;
            va3Var.d(true, va3Var.f());
            va3Var.e(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            va3 va3Var2 = this.f16669a;
            va3Var2.d(false, va3Var2.f());
            va3Var2.e(false);
        }
    }
}
