package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.t1;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class h0 implements t1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ androidx.core.util.a f3982a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f3983b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k0 f3984c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f3985d;

    h0(k0 k0Var, int i7, androidx.core.util.a aVar, Runnable runnable) {
        this.f3985d = i7;
        this.f3982a = aVar;
        this.f3983b = runnable;
        Objects.requireNonNull(k0Var);
        this.f3984c = k0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f3984c.P0(l6.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, n0.F);
            com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f3984c.P0(l6.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, n0.F);
            com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f3983b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean M0;
        d N0;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        k0 k0Var = this.f3984c;
        M0 = k0.M0(intValue);
        if (!M0) {
            this.f3983b.run();
        } else {
            N0 = k0Var.N0(this.f3985d, num.intValue());
            this.f3982a.accept(N0);
        }
    }
}
