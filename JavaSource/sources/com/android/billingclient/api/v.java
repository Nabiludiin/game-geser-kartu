package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.i8;
import java.util.Objects;

/* compiled from: MyApplication */
final class v implements p1.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i8 f4059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f4060b;

    v(b bVar, i8 i8Var) {
        this.f4059a = i8Var;
        Objects.requireNonNull(bVar);
        this.f4060b = bVar;
    }

    @Override // p1.d
    public final void a(final d dVar) {
        p1.d dVar2;
        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Reconnection finished with result: " + dVar.c());
        try {
            this.f4059a.b(dVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception setting completer.", th);
        }
        b bVar = this.f4060b;
        dVar2 = bVar.G;
        if (dVar2 != null) {
            bVar.R(new Runnable() { // from class: com.android.billingclient.api.u
                @Override // java.lang.Runnable
                public final void run() {
                    p1.d dVar3;
                    v vVar = v.this;
                    d dVar4 = dVar;
                    try {
                        dVar3 = vVar.f4060b.G;
                        dVar3.a(dVar4);
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception calling onBillingSetupFinished.", th2);
                    }
                }
            });
        }
    }

    @Override // p1.d
    public final void b() {
        p1.d dVar;
        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Reconnection attempt failed.");
        try {
            this.f4059a.b(n0.f4017j);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception setting completer.", th);
        }
        b bVar = this.f4060b;
        dVar = bVar.G;
        if (dVar != null) {
            bVar.R(new Runnable() { // from class: com.android.billingclient.api.t
                @Override // java.lang.Runnable
                public final void run() {
                    p1.d dVar2;
                    try {
                        dVar2 = v.this.f4060b.G;
                        dVar2.b();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception calling onBillingServiceDisconnected.", th2);
                    }
                }
            });
        }
    }
}
