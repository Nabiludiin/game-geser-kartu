package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: MyApplication */
final class v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4061a;

    /* renamed from: b, reason: collision with root package name */
    private final p1.i f4062b;

    /* renamed from: c, reason: collision with root package name */
    private final m0 f4063c;

    /* renamed from: d, reason: collision with root package name */
    private final u0 f4064d = new u0(this, true);

    /* renamed from: e, reason: collision with root package name */
    private final u0 f4065e = new u0(this, false);

    /* renamed from: f, reason: collision with root package name */
    private boolean f4066f;

    v0(Context context, p1.i iVar, p1.w wVar, p1.n nVar, p1.k kVar, m0 m0Var) {
        this.f4061a = context;
        this.f4062b = iVar;
        this.f4063c = m0Var;
    }

    static /* bridge */ /* synthetic */ p1.n a(v0 v0Var) {
        v0Var.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ p1.k e(v0 v0Var) {
        v0Var.getClass();
        return null;
    }

    final p1.i d() {
        return this.f4062b;
    }

    final void f() {
        u0 u0Var = this.f4064d;
        Context context = this.f4061a;
        u0Var.c(context);
        this.f4065e.c(context);
    }

    final void g(boolean z7) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f4066f = z7;
        u0 u0Var = this.f4065e;
        Context context = this.f4061a;
        u0Var.a(context, intentFilter2);
        if (this.f4066f) {
            this.f4064d.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f4064d.a(context, intentFilter);
        }
    }
}
