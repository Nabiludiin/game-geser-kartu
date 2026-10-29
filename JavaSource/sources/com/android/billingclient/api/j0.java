package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: MyApplication */
final class j0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k0 f3995a;

    /* synthetic */ j0(k0 k0Var, p1.r rVar) {
        Objects.requireNonNull(k0Var);
        this.f3995a = k0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.q0.k("BillingClientTesting", "Billing Override Service connected.");
        k0 k0Var = this.f3995a;
        k0Var.M = com.google.android.gms.internal.play_billing.i.O(iBinder);
        k0Var.L = 2;
        k0Var.Q0(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.q0.l("BillingClientTesting", "Billing Override Service disconnected.");
        k0 k0Var = this.f3995a;
        k0Var.M = null;
        k0Var.L = 0;
    }
}
