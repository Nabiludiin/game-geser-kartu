package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.d6;
import com.google.android.gms.internal.play_billing.i6;
import com.google.android.gms.internal.play_billing.i8;
import com.google.android.gms.internal.play_billing.k8;
import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.n8;
import com.google.android.gms.internal.play_billing.s6;
import com.google.android.gms.internal.play_billing.v1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MyApplication */
final class k0 extends b {
    private final Context K;
    private volatile int L;
    private volatile com.google.android.gms.internal.play_billing.j M;
    private volatile j0 N;
    private volatile ScheduledExecutorService O;

    k0(String str, Context context, m0 m0Var, ExecutorService executorService, a.C0071a c0071a) {
        super(null, context, null, null, c0071a);
        this.L = 0;
        this.K = context;
    }

    private final synchronized void K0() {
        Q0(27);
        try {
            try {
                p1.r rVar = null;
                if (this.N != null && this.M != null) {
                    com.google.android.gms.internal.play_billing.q0.k("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.K.unbindService(this.N);
                    this.N = new j0(this, rVar);
                }
                this.M = null;
                if (this.O != null) {
                    this.O.shutdownNow();
                    this.O = null;
                }
            } catch (RuntimeException e8) {
                com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e8);
            }
            this.L = 3;
        } catch (Throwable th) {
            this.L = 3;
            throw th;
        }
    }

    private final synchronized void L0() {
        if (a1()) {
            com.google.android.gms.internal.play_billing.q0.k("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            Q0(26);
            return;
        }
        if (this.L == 1) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.L == 3) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            P0(l6.BILLING_CLIENT_CLOSED, 26, n0.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.L = 1;
        com.google.android.gms.internal.play_billing.q0.k("BillingClientTesting", "Starting Billing Override Service setup.");
        this.N = new j0(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.K;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        l6 l6Var = l6.REASON_UNSPECIFIED;
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            l6Var = l6.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    l6Var = l6.BILLING_SERVICE_BLOCKED;
                    com.google.android.gms.internal.play_billing.q0.l("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.N, 1)) {
                        com.google.android.gms.internal.play_billing.q0.k("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        l6Var = l6.BILLING_SERVICE_BLOCKED;
                        com.google.android.gms.internal.play_billing.q0.l("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.L = 0;
        com.google.android.gms.internal.play_billing.q0.k("BillingClientTesting", "Billing Override Service unavailable on device.");
        P0(l6Var, 26, n0.a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M0(int i7) {
        return i7 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d N0(int i7, int i8) {
        d a8 = n0.a(i8, "Billing override value was set by a license tester.");
        P0(l6.LICENSE_TESTER_BILLING_OVERRIDE, i7, a8);
        return a8;
    }

    private final a2 O0(final int i7) {
        if (a1()) {
            return n8.a(new k8() { // from class: com.android.billingclient.api.d0
                @Override // com.google.android.gms.internal.play_billing.k8
                public final Object a(i8 i8Var) {
                    return k0.c1(k0.this, i7, i8Var);
                }
            });
        }
        com.google.android.gms.internal.play_billing.q0.l("BillingClientTesting", "Billing Override Service is not ready.");
        P0(l6.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, n0.a(-1, "Billing Override Service connection is disconnected."));
        return v1.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(l6 l6Var, int i7, d dVar) {
        int i8 = l0.f4000a;
        d6 b8 = l0.b(l6Var, i7, dVar, null, s6.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(b8, "ApiFailure should not be null");
        w0().b(b8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(int i7) {
        int i8 = l0.f4000a;
        i6 c8 = l0.c(i7, s6.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(c8, "ApiSuccess should not be null");
        w0().h(c8);
    }

    private final void R0(int i7, androidx.core.util.a aVar, Runnable runnable) {
        v1.c(v1.b(O0(i7), 28500L, TimeUnit.MILLISECONDS, g1()), new h0(this, i7, aVar, runnable), j());
    }

    public static /* synthetic */ Object c1(k0 k0Var, int i7, i8 i8Var) {
        try {
            if (k0Var.M == null) {
                throw null;
            }
            k0Var.M.W6(k0Var.K.getPackageName(), i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new i0(i8Var));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e8) {
            k0Var.P0(l6.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, n0.F);
            com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "An error occurred while retrieving billing override.", e8);
            i8Var.b(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    private final int f1(a2 a2Var) {
        try {
            return ((Integer) a2Var.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e8) {
            P0(l6.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, n0.F);
            com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e8);
            return 0;
        } catch (Exception e9) {
            if (e9 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            P0(l6.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, n0.F);
            com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "An error occurred while retrieving billing override.", e9);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService g1() {
        try {
            if (this.O == null) {
                this.O = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.O;
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void a(final p1.a aVar, final p1.b bVar) {
        Objects.requireNonNull(bVar);
        R0(3, new androidx.core.util.a() { // from class: p1.q
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                b.this.a((com.android.billingclient.api.d) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.e0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.a(aVar, bVar);
            }
        });
    }

    public final synchronized boolean a1() {
        if (this.L == 2 && this.M != null) {
            if (this.N != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void b(final p1.e eVar, final p1.f fVar) {
        R0(4, new androidx.core.util.a() { // from class: p1.p
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                f.this.a((com.android.billingclient.api.d) obj, eVar.a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.c0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.b(eVar, fVar);
            }
        });
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void c() {
        K0();
        super.c();
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final d d(final Activity activity, final c cVar) {
        androidx.core.util.a aVar = new androidx.core.util.a() { // from class: com.android.billingclient.api.f0
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.b*/.z0((d) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d d8;
                d8 = super/*com.android.billingclient.api.b*/.d(activity, cVar);
                return d8;
            }
        };
        int f12 = f1(O0(2));
        if (M0(f12)) {
            d N0 = N0(2, f12);
            aVar.accept(N0);
            return N0;
        }
        try {
            return (d) callable.call();
        } catch (Exception e8) {
            l6 l6Var = l6.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            d dVar = n0.f4015h;
            P0(l6Var, 2, dVar);
            com.google.android.gms.internal.play_billing.q0.m("BillingClientTesting", "An internal error occurred.", e8);
            return dVar;
        }
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void f(final g gVar, final p1.g gVar2) {
        R0(7, new androidx.core.util.a() { // from class: com.android.billingclient.api.a0
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                h hVar = new h(new ArrayList(), new ArrayList());
                p1.g.this.a((d) obj, hVar);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.b0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.f(gVar, gVar2);
            }
        });
    }

    @Override // com.android.billingclient.api.b, com.android.billingclient.api.a
    public final void h(p1.d dVar) {
        L0();
        super.h(dVar);
    }

    k0(String str, e eVar, Context context, p1.w wVar, m0 m0Var, ExecutorService executorService, a.C0071a c0071a) {
        super(null, eVar, context, null, null, null, c0071a);
        this.L = 0;
        this.K = context;
    }

    k0(String str, e eVar, Context context, p1.i iVar, p1.n nVar, m0 m0Var, ExecutorService executorService, a.C0071a c0071a) {
        super(null, eVar, context, iVar, null, null, null, c0071a);
        this.L = 0;
        this.K = context;
    }
}
