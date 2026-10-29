package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.l6;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p1.h f4048a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f4049b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f4050c;

    s(b bVar, p1.h hVar, String str, boolean z7) {
        this.f4048a = hVar;
        this.f4049b = str;
        Objects.requireNonNull(bVar);
        this.f4050c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean I;
        p1.y i02;
        b bVar = this.f4050c;
        I = bVar.I(30000L);
        if (!I) {
            l6 l6Var = l6.SERVICE_CONNECTION_NOT_READY;
            d dVar = n0.f4017j;
            bVar.j0(l6Var, 9, dVar);
            this.f4048a.a(dVar, com.google.android.gms.internal.play_billing.j0.n());
            return null;
        }
        String str = this.f4049b;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Please provide a valid product type.");
            l6 l6Var2 = l6.EMPTY_PRODUCT_TYPE;
            d dVar2 = n0.f4012e;
            bVar.j0(l6Var2, 9, dVar2);
            this.f4048a.a(dVar2, com.google.android.gms.internal.play_billing.j0.n());
            return null;
        }
        i02 = bVar.i0(str, false, 9);
        if (i02.b() != null) {
            this.f4048a.a(i02.a(), i02.b());
            return null;
        }
        this.f4048a.a(i02.a(), com.google.android.gms.internal.play_billing.j0.n());
        return null;
    }
}
