package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.q7;

/* compiled from: MyApplication */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4041a;

    /* renamed from: b, reason: collision with root package name */
    private w1.f f4042b;

    p0(Context context) {
        try {
            y1.t.f(context);
            this.f4042b = y1.t.c().g(com.google.android.datatransport.cct.a.f4318g).a("PLAY_BILLING_LIBRARY", q7.class, w1.b.b("proto"), new w1.e() { // from class: p1.v
                @Override // w1.e
                public final Object apply(Object obj) {
                    return ((q7) obj).b();
                }
            });
        } catch (Throwable unused) {
            this.f4041a = true;
        }
    }

    public final void a(q7 q7Var) {
        if (this.f4041a) {
            com.google.android.gms.internal.play_billing.q0.l("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f4042b.a(w1.c.d(q7Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.q0.l("BillingLogger", "logging failed.");
        }
    }
}
