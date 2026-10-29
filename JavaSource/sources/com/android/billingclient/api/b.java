package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.a;
import com.android.billingclient.api.c;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.b6;
import com.google.android.gms.internal.play_billing.b8;
import com.google.android.gms.internal.play_billing.d6;
import com.google.android.gms.internal.play_billing.d8;
import com.google.android.gms.internal.play_billing.f6;
import com.google.android.gms.internal.play_billing.i6;
import com.google.android.gms.internal.play_billing.i8;
import com.google.android.gms.internal.play_billing.k8;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.n8;
import com.google.android.gms.internal.play_billing.q0;
import com.google.android.gms.internal.play_billing.s6;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.x6;
import com.google.android.gms.internal.play_billing.z6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
class b extends a {
    private boolean A;
    private boolean B;
    private boolean C;
    private e D;
    private boolean E;
    private boolean F;
    private volatile p1.d G;
    private ExecutorService H;
    private final Long I;
    private com.google.android.gms.internal.play_billing.b0 J;

    /* renamed from: a, reason: collision with root package name */
    private final Object f3848a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f3849b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3850c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3851d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f3852e;

    /* renamed from: f, reason: collision with root package name */
    private volatile v0 f3853f;

    /* renamed from: g, reason: collision with root package name */
    private Context f3854g;

    /* renamed from: h, reason: collision with root package name */
    private m0 f3855h;

    /* renamed from: i, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.d f3856i;

    /* renamed from: j, reason: collision with root package name */
    private volatile y f3857j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3858k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3859l;

    /* renamed from: m, reason: collision with root package name */
    private int f3860m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f3861n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3862o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3863p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3864q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f3865r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3866s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3867t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3868u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3869v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3870w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f3871x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3872y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f3873z;

    b(String str, Context context, m0 m0Var, ExecutorService executorService, a.C0071a c0071a) {
        this.f3848a = new Object();
        this.f3849b = 0;
        this.f3852e = new Handler(Looper.getMainLooper());
        this.f3860m = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.I = valueOf;
        this.J = com.google.android.gms.internal.play_billing.o.a();
        this.f3850c = "8.0.0";
        String f02 = f0();
        this.f3851d = f02;
        this.f3854g = context.getApplicationContext();
        x6 L = z6.L();
        L.z("8.0.0");
        if (f02 != null) {
            L.A(f02);
        }
        L.x(this.f3854g.getPackageName());
        L.s(valueOf.longValue());
        L.y(c0071a.f3846f);
        L.p(Build.VERSION.SDK_INT);
        L.w(772604006L);
        try {
            L.q(this.f3854g.getPackageManager().getPackageInfo(this.f3854g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error getting app version code.", th);
        }
        this.f3855h = new o0(this.f3854g, (z6) L.l());
        this.f3854g.getPackageName();
        this.E = c0071a.f3846f;
    }

    private final void A(d6 d6Var, long j7, boolean z7) {
        try {
            this.f3855h.a(d6Var, this.f3860m, j7, z7);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(i6 i6Var) {
        try {
            this.f3855h.d(i6Var, this.f3860m);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(l6 l6Var, d dVar, int i7) {
        try {
            int i8 = l0.f4000a;
            b6 b6Var = (b6) l0.b(l6Var, 6, dVar, null, s6.BROADCAST_ACTION_UNSPECIFIED).o();
            b8 F = d8.F();
            F.p(i7 > 0);
            F.q(i7);
            b6Var.s(F);
            z((d6) b6Var.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(int i7) {
        synchronized (this.f3848a) {
            try {
                if (this.f3849b == 3) {
                    return;
                }
                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Setting clientState from " + K(this.f3849b) + " to " + K(i7));
                this.f3849b = i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object D0(b bVar, int i7, i8 i8Var) {
        bVar.F(new v(bVar, i8Var), i7);
        return "reconnectIfNeeded";
    }

    private final synchronized void E() {
        ExecutorService executorService = this.H;
        if (executorService != null) {
            executorService.shutdownNow();
            this.H = null;
        }
    }

    public static /* synthetic */ Object E0(b bVar, p1.f fVar, p1.e eVar) {
        if (bVar.I(30000L)) {
            bVar.w(eVar, fVar);
            return null;
        }
        l6 l6Var = l6.SERVICE_CONNECTION_NOT_READY;
        d dVar = n0.f4017j;
        bVar.j0(l6Var, 4, dVar);
        fVar.a(dVar, eVar.a());
        return null;
    }

    private final void F(p1.d dVar, int i7) {
        l6 l6Var;
        d dVar2;
        d dVar3;
        synchronized (this.f3848a) {
            try {
                if (J()) {
                    dVar2 = a0(i7);
                } else {
                    if (this.f3849b == 1) {
                        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Client is already in the process of connecting to billing service.");
                        l6 l6Var2 = l6.BILLING_CLIENT_CONNECTING;
                        dVar3 = n0.f4011d;
                        C(l6Var2, dVar3, i7);
                    } else if (this.f3849b == 3) {
                        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        l6 l6Var3 = l6.BILLING_CLIENT_CLOSED;
                        dVar3 = n0.f4017j;
                        C(l6Var3, dVar3, i7);
                    } else {
                        D(1);
                        if (i7 == 0) {
                            this.G = dVar;
                            i7 = 0;
                        }
                        G();
                        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Starting in-app billing setup.");
                        this.f3857j = new y(this, dVar, i7, null);
                        this.f3857j.c();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.f3854g.getPackageManager().queryIntentServices(intent, 0);
                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                            l6Var = l6.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    l6Var = l6.INVALID_PHONESKY_PACKAGE;
                                    com.google.android.gms.internal.play_billing.q0.l("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f3850c);
                                    synchronized (this.f3848a) {
                                        try {
                                            if (this.f3849b == 2) {
                                                dVar2 = a0(i7);
                                            } else if (this.f3849b != 1) {
                                                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                l6 l6Var4 = l6.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                dVar3 = n0.f4017j;
                                                C(l6Var4, dVar3, i7);
                                            } else {
                                                y yVar = this.f3857j;
                                                if ((i7 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f3854g.bindService(intent2, yVar, 1) : this.f3854g.bindService(intent2, 1, j(), yVar)) {
                                                    com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Service was bonded successfully.");
                                                    dVar2 = null;
                                                } else {
                                                    l6Var = l6.BILLING_SERVICE_BLOCKED;
                                                    com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                l6Var = l6.INVALID_PHONESKY_PACKAGE;
                                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        D(0);
                        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Billing service unavailable on device.");
                        d dVar4 = n0.f4009b;
                        C(l6Var, dVar4, i7);
                        dVar2 = dVar4;
                    }
                    dVar2 = dVar3;
                }
            } finally {
            }
        }
        if (dVar2 != null) {
            dVar.a(dVar2);
        }
    }

    public static /* synthetic */ Object F0(b bVar, p1.g gVar, g gVar2) {
        if (!bVar.I(30000L)) {
            l6 l6Var = l6.SERVICE_CONNECTION_NOT_READY;
            d dVar = n0.f4017j;
            bVar.j0(l6Var, 7, dVar);
            gVar.a(dVar, new h(com.google.android.gms.internal.play_billing.j0.n(), com.google.android.gms.internal.play_billing.j0.n()));
            return null;
        }
        if (bVar.f3868u) {
            z t02 = bVar.t0(gVar2);
            gVar.a(n0.a(t02.a(), t02.b()), new h(t02.c(), t02.d()));
            return null;
        }
        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Querying product details is not supported.");
        l6 l6Var2 = l6.PRODUCT_DETAILS_NOT_SUPPORTED;
        d dVar2 = n0.f4025r;
        bVar.j0(l6Var2, 7, dVar2);
        gVar.a(dVar2, new h(com.google.android.gms.internal.play_billing.j0.n(), com.google.android.gms.internal.play_billing.j0.n()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void G() {
        synchronized (this.f3848a) {
            if (this.f3857j != null) {
                try {
                    this.f3854g.unbindService(this.f3857j);
                } catch (Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.q0.m("BillingClient", "There was an exception while unbinding service!", th);
                        this.f3856i = null;
                        this.f3857j = null;
                    } finally {
                        this.f3856i = null;
                        this.f3857j = null;
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object G0(b bVar, p1.b bVar2, p1.a aVar) {
        bVar.d0(bVar2, aVar);
        return null;
    }

    private final boolean H(long j7) {
        try {
            d dVar = (d) c0(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (dVar.c() == 0) {
                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Reconnection succeeded with result: " + dVar.c());
            } else {
                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Reconnection failed with result: " + dVar.c());
            }
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error during reconnection attempt: ", e8);
        }
        return J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I(long j7) {
        long max;
        com.google.android.gms.internal.play_billing.y b8 = com.google.android.gms.internal.play_billing.y.b(this.J);
        long j8 = 30000;
        for (int i7 = 1; i7 <= 3; i7++) {
            try {
                max = Math.max(0L, j8);
            } catch (Exception e8) {
                if (e8 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error during reconnection attempt: ", e8);
            }
            if (max <= 0) {
                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "No time remaining for reconnection attempt.");
                return J();
            }
            d dVar = (d) c0(i7).get(max, TimeUnit.MILLISECONDS);
            if (dVar.c() == 0) {
                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Reconnection succeeded with result: " + dVar.c());
                return J();
            }
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Reconnection failed with result: " + dVar.c());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j8 = 30000 - b8.a(timeUnit);
            long pow = ((long) Math.pow(2.0d, i7 - 1)) * 1000;
            if (j8 < pow) {
                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Reconnection failed due to timeout limit reached.");
                return J();
            }
            if (i7 < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j8 = 30000 - b8.a(timeUnit);
                } catch (InterruptedException e9) {
                    Thread.currentThread().interrupt();
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error sleeping during reconnection attempt: ", e9);
                }
            }
        }
        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Max retries reached.");
        return J();
    }

    private final boolean J() {
        boolean z7;
        synchronized (this.f3848a) {
            try {
                z7 = false;
                if (this.f3849b == 2 && this.f3856i != null && this.f3857j != null) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    private static final String K(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    static /* bridge */ /* synthetic */ void N(b bVar, int i7) {
        bVar.f3860m = i7;
        bVar.C = i7 >= 26;
        bVar.B = i7 >= 24;
        bVar.A = i7 >= 23;
        bVar.f3873z = i7 >= 22;
        bVar.f3872y = i7 >= 21;
        bVar.f3871x = i7 >= 20;
        bVar.f3870w = i7 >= 19;
        bVar.f3869v = i7 >= 18;
        bVar.f3868u = i7 >= 17;
        bVar.f3867t = i7 >= 16;
        bVar.f3866s = i7 >= 15;
        bVar.f3865r = i7 >= 14;
        bVar.f3864q = i7 >= 12;
        bVar.f3863p = i7 >= 9;
        bVar.f3862o = i7 >= 8;
        bVar.f3861n = i7 >= 6;
    }

    static /* bridge */ /* synthetic */ void P(b bVar, int i7) {
        if (i7 != 0) {
            bVar.D(0);
            return;
        }
        synchronized (bVar.f3848a) {
            try {
                if (bVar.f3849b == 3) {
                    return;
                }
                bVar.D(2);
                v0 v0Var = bVar.f3853f != null ? bVar.f3853f : null;
                if (v0Var != null) {
                    v0Var.g(bVar.f3872y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean T(b bVar) {
        boolean z7;
        synchronized (bVar.f3848a) {
            z7 = true;
            if (bVar.f3849b != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle W(int i7, String str, String str2, c cVar, Bundle bundle) {
        com.google.android.gms.internal.play_billing.d dVar;
        try {
            synchronized (this.f3848a) {
                dVar = this.f3856i;
            }
            return dVar == null ? com.google.android.gms.internal.play_billing.q0.d(n0.f4017j, l6.SERVICE_RESET_TO_NULL) : dVar.C5(i7, this.f3854g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e8) {
            return com.google.android.gms.internal.play_billing.q0.e(n0.f4017j, l6.LAUNCH_BILLING_FLOW_EXCEPTION, l0.a(e8));
        } catch (Exception e9) {
            return com.google.android.gms.internal.play_billing.q0.e(n0.f4015h, l6.LAUNCH_BILLING_FLOW_EXCEPTION, l0.a(e9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle X(String str, String str2) {
        com.google.android.gms.internal.play_billing.d dVar;
        try {
            synchronized (this.f3848a) {
                dVar = this.f3856i;
            }
            return dVar == null ? com.google.android.gms.internal.play_billing.q0.d(n0.f4017j, l6.SERVICE_RESET_TO_NULL) : dVar.P3(3, this.f3854g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e8) {
            return com.google.android.gms.internal.play_billing.q0.e(n0.f4017j, l6.LAUNCH_BILLING_FLOW_EXCEPTION, l0.a(e8));
        } catch (Exception e9) {
            return com.google.android.gms.internal.play_billing.q0.e(n0.f4015h, l6.LAUNCH_BILLING_FLOW_EXCEPTION, l0.a(e9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler Y() {
        return Looper.myLooper() == null ? this.f3852e : new Handler(Looper.myLooper());
    }

    private final z Z(d dVar, l6 l6Var, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.q0.m("BillingClient", str, exc);
        l0(l6Var, 7, dVar, l0.a(exc));
        return new z(dVar.c(), dVar.a(), new ArrayList(), new ArrayList());
    }

    private final d a0(int i7) {
        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Service connection is valid. No need to re-initialize.");
        f6 G = i6.G();
        G.s(6);
        b8 F = d8.F();
        F.s(true);
        F.p(i7 > 0);
        F.q(i7);
        G.r(F);
        B((i6) G.l());
        return n0.f4016i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d b0() {
        int[] iArr = {0, 3};
        synchronized (this.f3848a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f3849b == iArr[i7]) {
                    return n0.f4017j;
                }
            }
            return n0.f4015h;
        }
    }

    private final a2 c0(final int i7) {
        if (this.E && !J()) {
            return n8.a(new k8() { // from class: com.android.billingclient.api.w0
                @Override // com.google.android.gms.internal.play_billing.k8
                public final Object a(i8 i8Var) {
                    return b.D0(b.this, i7, i8Var);
                }
            });
        }
        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Already connected or not opted into auto reconnection.");
        return v1.a(n0.f4016i);
    }

    private final /* synthetic */ Object d0(p1.b bVar, p1.a aVar) {
        com.google.android.gms.internal.play_billing.d dVar;
        try {
            if (!I(30000L)) {
                l6 l6Var = l6.SERVICE_CONNECTION_NOT_READY;
                d dVar2 = n0.f4017j;
                j0(l6Var, 3, dVar2);
                bVar.a(dVar2);
            } else if (TextUtils.isEmpty(aVar.a())) {
                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Please provide a valid purchase token.");
                l6 l6Var2 = l6.EMPTY_PURCHASE_TOKEN;
                d dVar3 = n0.f4014g;
                j0(l6Var2, 3, dVar3);
                bVar.a(dVar3);
            } else if (this.f3863p) {
                synchronized (this.f3848a) {
                    dVar = this.f3856i;
                }
                if (dVar != null) {
                    String packageName = this.f3854g.getPackageName();
                    String a8 = aVar.a();
                    String str = this.f3850c;
                    String str2 = this.f3851d;
                    long longValue = this.I.longValue();
                    int i7 = com.google.android.gms.internal.play_billing.q0.f21711a;
                    Bundle bundle = new Bundle();
                    com.google.android.gms.internal.play_billing.q0.c(bundle, str, str2, longValue);
                    Bundle T7 = dVar.T7(9, packageName, a8, bundle);
                    bVar.a(n0.a(com.google.android.gms.internal.play_billing.q0.b(T7, "BillingClient"), com.google.android.gms.internal.play_billing.q0.h(T7, "BillingClient")));
                    return null;
                }
                x(bVar, n0.f4017j, l6.SERVICE_RESET_TO_NULL, null);
            } else {
                l6 l6Var3 = l6.API_VERSION_NOT_V9;
                d dVar4 = n0.f4008a;
                j0(l6Var3, 3, dVar4);
                bVar.a(dVar4);
            }
            return null;
        } catch (DeadObjectException e8) {
            x(bVar, n0.f4017j, l6.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e8);
            return null;
        } catch (Exception e9) {
            x(bVar, n0.f4015h, l6.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e9);
            return null;
        }
    }

    private final String e0(g gVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f3854g.getPackageName();
        }
        return null;
    }

    private static String f0() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private final p1.y h0(int i7, d dVar, l6 l6Var, String str, Exception exc) {
        l0(l6Var, 9, dVar, l0.a(exc));
        com.google.android.gms.internal.play_billing.q0.m("BillingClient", str, exc);
        return new p1.y(dVar, null);
    }

    private void i(Context context, p1.i iVar, e eVar, p1.n nVar, String str, m0 m0Var, a.C0071a c0071a) {
        this.f3854g = context.getApplicationContext();
        x6 L = z6.L();
        L.z(str);
        String str2 = this.f3851d;
        if (str2 != null) {
            L.A(str2);
        }
        L.x(this.f3854g.getPackageName());
        L.s(this.I.longValue());
        L.y(c0071a.f3846f);
        L.p(Build.VERSION.SDK_INT);
        L.w(772604006L);
        try {
            L.q(this.f3854g.getPackageManager().getPackageInfo(this.f3854g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error getting app version code.", th);
        }
        if (m0Var != null) {
            this.f3855h = m0Var;
        } else {
            this.f3855h = new o0(this.f3854g, (z6) L.l());
        }
        if (iVar == null) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3853f = new v0(this.f3854g, iVar, null, nVar, null, this.f3855h);
        this.D = eVar;
        this.F = nVar != null;
        this.f3854g.getPackageName();
        this.E = c0071a.f3846f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p1.y i0(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.i0(java.lang.String, boolean, int):p1.y");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(l6 l6Var, int i7, d dVar) {
        try {
            int i8 = l0.f4000a;
            z(l0.b(l6Var, i7, dVar, null, s6.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    static Future k(Callable callable, long j7, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: p1.m
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    q0.l("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j7 * 0.95d));
            return submit;
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Async task throws exception!", e8);
            return null;
        }
    }

    private final void k0(l6 l6Var, int i7, d dVar, long j7) {
        try {
            int i8 = l0.f4000a;
            try {
                this.f3855h.j(l0.b(l6Var, 2, dVar, null, s6.BROADCAST_ACTION_UNSPECIFIED), this.f3860m, j7);
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th2);
        }
    }

    public static /* synthetic */ void l(b bVar, p1.f fVar, p1.e eVar) {
        l6 l6Var = l6.EXECUTE_ASYNC_TIMEOUT;
        d dVar = n0.f4018k;
        bVar.j0(l6Var, 4, dVar);
        fVar.a(dVar, eVar.a());
    }

    private final void l0(l6 l6Var, int i7, d dVar, String str) {
        try {
            int i8 = l0.f4000a;
            z(l0.b(l6Var, i7, dVar, str, s6.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    public static /* synthetic */ void m(b bVar, p1.h hVar) {
        l6 l6Var = l6.EXECUTE_ASYNC_TIMEOUT;
        d dVar = n0.f4018k;
        bVar.j0(l6Var, 9, dVar);
        hVar.a(dVar, com.google.android.gms.internal.play_billing.j0.n());
    }

    private final void m0(l6 l6Var, int i7, d dVar, long j7, boolean z7) {
        try {
            int i8 = l0.f4000a;
            A(l0.b(l6Var, 2, dVar, null, s6.BROADCAST_ACTION_UNSPECIFIED), j7, z7);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    public static /* synthetic */ void n(b bVar, p1.b bVar2) {
        l6 l6Var = l6.EXECUTE_ASYNC_TIMEOUT;
        d dVar = n0.f4018k;
        bVar.j0(l6Var, 3, dVar);
        bVar2.a(dVar);
    }

    private final void n0(l6 l6Var, int i7, d dVar, String str, long j7, boolean z7) {
        try {
            int i8 = l0.f4000a;
            A(l0.b(l6Var, 2, dVar, str, s6.BROADCAST_ACTION_UNSPECIFIED), j7, z7);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    public static /* synthetic */ void o(b bVar, p1.g gVar) {
        l6 l6Var = l6.EXECUTE_ASYNC_TIMEOUT;
        d dVar = n0.f4018k;
        bVar.j0(l6Var, 7, dVar);
        gVar.a(dVar, new h(com.google.android.gms.internal.play_billing.j0.n(), com.google.android.gms.internal.play_billing.j0.n()));
    }

    private void o0(int i7) {
        try {
            int i8 = l0.f4000a;
            B(l0.c(i7, s6.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    public static /* synthetic */ void p(b bVar, d dVar) {
        if (bVar.f3853f.d() != null) {
            bVar.f3853f.d().a(dVar, null);
        } else {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* JADX WARN: Finally extract failed */
    private final void w(p1.e eVar, p1.f fVar) {
        com.google.android.gms.internal.play_billing.d dVar;
        int M1;
        String str;
        String a8 = eVar.a();
        try {
            com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Consuming purchase with token: " + a8);
            synchronized (this.f3848a) {
                try {
                    try {
                        dVar = this.f3856i;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (DeadObjectException e8) {
                    e = e8;
                    y(fVar, a8, n0.f4017j, l6.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e9) {
                    e = e9;
                    y(fVar, a8, n0.f4015h, l6.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (dVar == null) {
                try {
                    y(fVar, a8, n0.f4017j, l6.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                    return;
                } catch (DeadObjectException e10) {
                    e = e10;
                    y(fVar, a8, n0.f4017j, l6.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    y(fVar, a8, n0.f4015h, l6.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e);
                    return;
                }
            }
            if (this.f3863p) {
                String packageName = this.f3854g.getPackageName();
                boolean z7 = this.f3863p;
                String str2 = this.f3850c;
                String str3 = this.f3851d;
                long longValue = this.I.longValue();
                Bundle bundle = new Bundle();
                if (z7) {
                    com.google.android.gms.internal.play_billing.q0.c(bundle, str2, str3, longValue);
                }
                Bundle Z1 = dVar.Z1(9, packageName, a8, bundle);
                M1 = Z1.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.q0.h(Z1, "BillingClient");
            } else {
                M1 = dVar.M1(3, this.f3854g.getPackageName(), a8);
                str = "";
            }
            d a9 = n0.a(M1, str);
            if (M1 == 0) {
                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Successfully consumed purchase.");
                fVar.a(a9, a8);
                return;
            }
            y(fVar, a8, a9, l6.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + M1, null);
        } catch (DeadObjectException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }

    private final void x(p1.b bVar, d dVar, l6 l6Var, Exception exc) {
        com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error in acknowledge purchase!", exc);
        l0(l6Var, 3, dVar, l0.a(exc));
        bVar.a(dVar);
    }

    private final void y(p1.f fVar, String str, d dVar, l6 l6Var, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.q0.m("BillingClient", str2, exc);
        l0(l6Var, 4, dVar, l0.a(exc));
        fVar.a(dVar, str);
    }

    static /* bridge */ /* synthetic */ d y0(Exception exc) {
        return exc instanceof DeadObjectException ? n0.f4017j : n0.f4015h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(d6 d6Var) {
        try {
            this.f3855h.k(d6Var, this.f3860m);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    public final void R(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f3852e.post(runnable);
        }
    }

    @Override // com.android.billingclient.api.a
    public void a(final p1.a aVar, final p1.b bVar) {
        if (k(new Callable() { // from class: com.android.billingclient.api.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.G0(b.this, bVar, aVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k
            @Override // java.lang.Runnable
            public final void run() {
                b.n(b.this, bVar);
            }
        }, Y(), j()) == null) {
            d b02 = b0();
            j0(l6.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, b02);
            bVar.a(b02);
        }
    }

    @Override // com.android.billingclient.api.a
    public void b(final p1.e eVar, final p1.f fVar) {
        if (k(new Callable() { // from class: com.android.billingclient.api.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.E0(b.this, fVar, eVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.o
            @Override // java.lang.Runnable
            public final void run() {
                b.l(b.this, fVar, eVar);
            }
        }, Y(), j()) == null) {
            d b02 = b0();
            j0(l6.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, b02);
            fVar.a(b02, eVar.a());
        }
    }

    @Override // com.android.billingclient.api.a
    public void c() {
        o0(12);
        synchronized (this.f3848a) {
            try {
                if (this.f3853f != null) {
                    this.f3853f.f();
                }
            } finally {
                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Unbinding from service.");
                G();
                E();
            }
            try {
                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Unbinding from service.");
                G();
            } catch (Throwable th) {
                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
            try {
                E();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.billingclient.api.a
    public d d(Activity activity, c cVar) {
        boolean d8;
        long j7;
        Future k7;
        long j8;
        long j9;
        long j10;
        l6 l6Var;
        String str;
        boolean z7;
        c.b bVar;
        boolean z8;
        long nextLong = new Random().nextLong();
        if (this.f3853f == null || this.f3853f.d() == null) {
            l6 l6Var2 = l6.MISSING_LISTENER;
            d dVar = n0.E;
            k0(l6Var2, 2, dVar, nextLong);
            return dVar;
        }
        if (!H(3000L)) {
            l6 l6Var3 = l6.SERVICE_CONNECTION_NOT_READY;
            d dVar2 = n0.f4017j;
            k0(l6Var3, 2, dVar2, nextLong);
            z0(dVar2);
            return dVar2;
        }
        synchronized (this.f3848a) {
            try {
                d8 = this.f3857j != null ? this.f3857j.d() : false;
            } finally {
            }
        }
        ArrayList k8 = cVar.k();
        List l7 = cVar.l();
        String str2 = null;
        android.support.v4.media.session.b.a(com.google.android.gms.internal.play_billing.o0.a(k8, null));
        c.b bVar2 = (c.b) com.google.android.gms.internal.play_billing.o0.a(l7, null);
        final String c8 = bVar2.b().c();
        final String d9 = bVar2.b().d();
        if (d9.equals("subs") && !this.f3858k) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Current client doesn't support subscriptions.");
            l6 l6Var4 = l6.SUBSCRIPTIONS_NOT_SUPPORTED;
            d dVar3 = n0.f4019l;
            m0(l6Var4, 2, dVar3, nextLong, d8);
            z0(dVar3);
            return dVar3;
        }
        if (cVar.u() && !this.f3861n) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Current client doesn't support extra params for buy intent.");
            l6 l6Var5 = l6.EXTRA_PARAMS_NOT_SUPPORTED;
            d dVar4 = n0.f4013f;
            m0(l6Var5, 2, dVar4, nextLong, d8);
            z0(dVar4);
            return dVar4;
        }
        if (k8.size() > 1 && !this.f3867t) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Current client doesn't support multi-item purchases.");
            l6 l6Var6 = l6.MULTI_ITEM_NOT_SUPPORTED;
            d dVar5 = n0.f4023p;
            m0(l6Var6, 2, dVar5, nextLong, d8);
            z0(dVar5);
            return dVar5;
        }
        if (!l7.isEmpty() && !this.f3868u) {
            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            l6 l6Var7 = l6.PRODUCT_DETAILS_NOT_SUPPORTED;
            d dVar6 = n0.f4025r;
            m0(l6Var7, 2, dVar6, nextLong, d8);
            z0(dVar6);
            return dVar6;
        }
        d e8 = cVar.e();
        if (e8 != n0.f4016i) {
            m0(l6.INVALID_BILLING_FLOW_PARAMS, 2, e8, nextLong, d8);
            z0(e8);
            return e8;
        }
        if (this.f3861n) {
            boolean z9 = this.f3863p;
            boolean z10 = this.f3870w;
            boolean a8 = this.D.a();
            boolean b8 = this.D.b();
            boolean z11 = this.F;
            String str3 = this.f3850c;
            String str4 = this.f3851d;
            boolean z12 = d8;
            long longValue = this.I.longValue();
            this.f3854g.getPackageName();
            int i7 = com.google.android.gms.internal.play_billing.q0.f21711a;
            final Bundle bundle = new Bundle();
            com.google.android.gms.internal.play_billing.q0.c(bundle, str3, str4, longValue);
            bundle.putLong("billingClientTransactionId", nextLong);
            if (cVar.c() != 0) {
                bundle.putInt("prorationMode", cVar.c());
            }
            if (!TextUtils.isEmpty(cVar.f())) {
                bundle.putString("accountId", cVar.f());
            }
            if (!TextUtils.isEmpty(cVar.g())) {
                bundle.putString("obfuscatedProfileId", cVar.g());
            }
            if (cVar.t()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(cVar.i())) {
                bundle.putString("oldSkuPurchaseToken", cVar.i());
            }
            cVar.h();
            if (TextUtils.isEmpty(null)) {
                str = null;
            } else {
                cVar.h();
                str = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(cVar.j())) {
                bundle.putString("originalExternalTransactionId", cVar.j());
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("paymentsPurchaseParams", str);
            }
            if (z9 && a8) {
                z7 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z7 = true;
            }
            if (z10 && b8) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z7);
            }
            if (z11) {
                bundle.putBoolean("enableAlternativeBilling", z7);
            }
            cVar.d();
            cVar.b();
            ArrayList arrayList = new ArrayList();
            for (c.b bVar3 : cVar.l()) {
            }
            if (!arrayList.isEmpty()) {
                l2 B = m2.B();
                B.p(arrayList);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((m2) B.l()).b());
            }
            if (k8.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(l7.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(l7.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                j7 = nextLong;
                for (int i8 = 0; i8 < l7.size(); i8++) {
                    c.b bVar4 = (c.b) l7.get(i8);
                    f b9 = bVar4.b();
                    if (b9.g().isEmpty()) {
                        bVar = bVar4;
                    } else {
                        bVar = bVar4;
                        arrayList4.add(b9.g());
                    }
                    arrayList5.add(bVar.c());
                    String h8 = b9.h();
                    if (b9.i() != null && !b9.i().isEmpty()) {
                        Iterator it = b9.i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            f.b bVar5 = (f.b) it.next();
                            if (!TextUtils.isEmpty(bVar5.c())) {
                                h8 = bVar5.c();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(h8)) {
                        arrayList6.add(h8);
                    }
                    if (i8 > 0) {
                        arrayList2.add(((c.b) l7.get(i8)).b().c());
                        arrayList3.add(((c.b) l7.get(i8)).b().d());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList8 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = k8.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
                if (!arrayList8.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (k8.size() > 1) {
                    ArrayList<String> arrayList9 = new ArrayList<>(k8.size() - 1);
                    ArrayList<String> arrayList10 = new ArrayList<>(k8.size() - 1);
                    if (1 < k8.size()) {
                        android.support.v4.media.session.b.a(k8.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList9);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList10);
                }
                j7 = nextLong;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f3865r) {
                l6 l6Var8 = l6.OFFER_ID_TOKEN_NOT_SUPPORTED;
                d dVar7 = n0.f4024q;
                m0(l6Var8, 2, dVar7, j7, z12);
                z0(dVar7);
                return dVar7;
            }
            d8 = z12;
            if (bVar2 == null || TextUtils.isEmpty(bVar2.b().f())) {
                str2 = null;
                z8 = false;
            } else {
                bundle.putString("skuPackageName", bVar2.b().f());
                str2 = null;
                z8 = true;
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("accountName", str2);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.f3854g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i9 = (!this.f3868u || l7.isEmpty()) ? (this.f3866s && z8) ? 15 : this.f3863p ? 9 : 6 : 17;
            final c cVar2 = cVar;
            k7 = k(new Callable() { // from class: com.android.billingclient.api.x0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle W;
                    W = b.this.W(i9, c8, d9, cVar2, bundle);
                    return W;
                }
            }, 5000L, null, this.f3852e, j());
            j8 = cVar2;
        } else {
            j7 = nextLong;
            k7 = k(new Callable() { // from class: com.android.billingclient.api.y0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle X;
                    X = b.this.X(c8, d9);
                    return X;
                }
            }, 5000L, null, this.f3852e, j());
            j8 = nextLong;
        }
        try {
            if (k7 != null) {
                long j11 = j7;
                Bundle bundle2 = (Bundle) k7.get(5000L, TimeUnit.MILLISECONDS);
                int b10 = com.google.android.gms.internal.play_billing.q0.b(bundle2, "BillingClient");
                String h9 = com.google.android.gms.internal.play_billing.q0.h(bundle2, "BillingClient");
                if (b10 == 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                    intent2.putExtra("billingClientTransactionId", j11);
                    intent2.putExtra("wasServiceAutoReconnected", d8);
                    activity.startActivity(intent2);
                    return n0.f4016i;
                }
                com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Unable to buy item, Error response code: " + b10);
                d a9 = n0.a(b10, h9);
                try {
                    if (bundle2 == null) {
                        l6Var = l6.REASON_UNSPECIFIED;
                    } else {
                        Object obj = bundle2.get("LOG_REASON");
                        if (obj == null) {
                            l6Var = l6.REASON_UNSPECIFIED;
                        } else if (obj instanceof Integer) {
                            l6Var = l6.c(((Integer) obj).intValue());
                        } else {
                            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            l6Var = l6.REASON_UNSPECIFIED;
                        }
                    }
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                    l6Var = l6.REASON_UNSPECIFIED;
                }
                if (l6Var == l6.REASON_UNSPECIFIED) {
                    l6Var = l6.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                }
                l6 l6Var9 = l6Var;
                if (bundle2 != null) {
                    try {
                        str2 = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                    }
                }
                try {
                    n0(l6Var9, 2, a9, str2, j11, d8);
                    z0(a9);
                    return a9;
                } catch (CancellationException e9) {
                    e = e9;
                    j10 = j11;
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    l6 l6Var10 = l6.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar8 = n0.f4018k;
                    n0(l6Var10, 2, dVar8, l0.a(e), j10, d8);
                    z0(dVar8);
                    return dVar8;
                } catch (TimeoutException e10) {
                    e = e10;
                    j10 = j11;
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    l6 l6Var102 = l6.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar82 = n0.f4018k;
                    n0(l6Var102, 2, dVar82, l0.a(e), j10, d8);
                    z0(dVar82);
                    return dVar82;
                } catch (Exception e11) {
                    e = e11;
                    j9 = j11;
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    l6 l6Var11 = l6.LAUNCH_BILLING_FLOW_EXCEPTION;
                    d dVar9 = n0.f4017j;
                    n0(l6Var11, 2, dVar9, l0.a(e), j9, d8);
                    z0(dVar9);
                    return dVar9;
                }
            }
            try {
                l6 l6Var12 = l6.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                d dVar10 = n0.f4010c;
                boolean z13 = d8;
                long j12 = j7;
                try {
                    m0(l6Var12, 2, dVar10, j12, z13);
                    z0(dVar10);
                    return dVar10;
                } catch (CancellationException e12) {
                    e = e12;
                    d8 = z13;
                    j10 = j12;
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    l6 l6Var1022 = l6.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar822 = n0.f4018k;
                    n0(l6Var1022, 2, dVar822, l0.a(e), j10, d8);
                    z0(dVar822);
                    return dVar822;
                } catch (TimeoutException e13) {
                    e = e13;
                    d8 = z13;
                    j10 = j12;
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    l6 l6Var10222 = l6.LAUNCH_BILLING_FLOW_TIMEOUT;
                    d dVar8222 = n0.f4018k;
                    n0(l6Var10222, 2, dVar8222, l0.a(e), j10, d8);
                    z0(dVar8222);
                    return dVar8222;
                } catch (Exception e14) {
                    e = e14;
                    d8 = z13;
                    j9 = j12;
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    l6 l6Var112 = l6.LAUNCH_BILLING_FLOW_EXCEPTION;
                    d dVar92 = n0.f4017j;
                    n0(l6Var112, 2, dVar92, l0.a(e), j9, d8);
                    z0(dVar92);
                    return dVar92;
                }
            } catch (CancellationException e15) {
                e = e15;
                j10 = j7;
                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                l6 l6Var102222 = l6.LAUNCH_BILLING_FLOW_TIMEOUT;
                d dVar82222 = n0.f4018k;
                n0(l6Var102222, 2, dVar82222, l0.a(e), j10, d8);
                z0(dVar82222);
                return dVar82222;
            } catch (TimeoutException e16) {
                e = e16;
                j10 = j7;
                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                l6 l6Var1022222 = l6.LAUNCH_BILLING_FLOW_TIMEOUT;
                d dVar822222 = n0.f4018k;
                n0(l6Var1022222, 2, dVar822222, l0.a(e), j10, d8);
                z0(dVar822222);
                return dVar822222;
            } catch (Exception e17) {
                e = e17;
                j9 = j7;
            }
        } catch (CancellationException e18) {
            e = e18;
        } catch (TimeoutException e19) {
            e = e19;
            j10 = j8;
        } catch (Exception e20) {
            e = e20;
        }
    }

    @Override // com.android.billingclient.api.a
    public void f(final g gVar, final p1.g gVar2) {
        if (k(new Callable() { // from class: com.android.billingclient.api.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.F0(b.this, gVar2, gVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.p
            @Override // java.lang.Runnable
            public final void run() {
                b.o(b.this, gVar2);
            }
        }, Y(), j()) == null) {
            d b02 = b0();
            j0(l6.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, b02);
            gVar2.a(b02, new h(com.google.android.gms.internal.play_billing.j0.n(), com.google.android.gms.internal.play_billing.j0.n()));
        }
    }

    @Override // com.android.billingclient.api.a
    public final void g(p1.j jVar, final p1.h hVar) {
        if (k(new s(this, hVar, jVar.b(), false), 30000L, new Runnable() { // from class: com.android.billingclient.api.q
            @Override // java.lang.Runnable
            public final void run() {
                b.m(b.this, hVar);
            }
        }, Y(), j()) == null) {
            d b02 = b0();
            j0(l6.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, b02);
            hVar.a(b02, com.google.android.gms.internal.play_billing.j0.n());
        }
    }

    @Override // com.android.billingclient.api.a
    public void h(p1.d dVar) {
        F(dVar, 0);
    }

    final synchronized ExecutorService j() {
        try {
            if (this.H == null) {
                this.H = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.q0.f21711a, new r(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.H;
    }

    final z t0(g gVar) {
        com.google.android.gms.internal.play_billing.d dVar;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String c8 = gVar.c();
        com.google.android.gms.internal.play_billing.j0 b8 = gVar.b();
        int size = b8.size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 20;
            ArrayList arrayList3 = new ArrayList(b8.subList(i9, i10 > size ? size : i10));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList4.add(((g.b) arrayList3.get(i11)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f3850c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f3848a) {
                    dVar = this.f3856i;
                }
                if (dVar == null) {
                    return Z(n0.f4017j, l6.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z7 = this.f3870w && this.D.b();
                e0(gVar);
                e0(gVar);
                e0(gVar);
                e0(gVar);
                Bundle e72 = dVar.e7(true != this.f3871x ? 17 : 20, this.f3854g.getPackageName(), c8, bundle, com.google.android.gms.internal.play_billing.q0.f(str, this.f3851d, arrayList3, null, null, com.google.android.gms.internal.play_billing.a.a(z7, true, false, true, false, true), this.I.longValue()));
                if (e72 == null) {
                    return Z(n0.B, l6.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!e72.containsKey("DETAILS_LIST")) {
                    int b9 = com.google.android.gms.internal.play_billing.q0.b(e72, "BillingClient");
                    String h8 = com.google.android.gms.internal.play_billing.q0.h(e72, "BillingClient");
                    if (b9 == 0) {
                        return Z(n0.a(6, h8), l6.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return Z(n0.a(b9, h8), l6.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + b9, null);
                }
                ArrayList<String> stringArrayList = e72.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return Z(n0.B, l6.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    try {
                        f fVar = new f(stringArrayList.get(i12));
                        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Got product details: ".concat(fVar.toString()));
                        arrayList5.add(fVar);
                    } catch (JSONException e8) {
                        return Z(n0.a(6, "Error trying to decode SkuDetails."), l6.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e8);
                    }
                }
                ArrayList<String> stringArrayList2 = e72.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            String str2 = stringArrayList2.get(i13);
                            i13++;
                            i iVar = new i(str2);
                            com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Got unfetchedProduct: ".concat(iVar.toString()));
                            arrayList6.add(iVar);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            Object obj = arrayList3.get(i14);
                            int i15 = i14 + 1;
                            g.b bVar = (g.b) obj;
                            int size6 = arrayList5.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= size6) {
                                    i7 = size5;
                                    i8 = i15;
                                    arrayList6.add(new i(new JSONObject().put("productId", bVar.b()).put("type", bVar.c()).put("statusCode", 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i16);
                                i16++;
                                f fVar2 = (f) obj2;
                                i7 = size5;
                                i8 = i15;
                                if (!bVar.b().equals(fVar2.c()) || !bVar.c().equals(fVar2.d())) {
                                    size5 = i7;
                                    i15 = i8;
                                }
                            }
                            size5 = i7;
                            i14 = i8;
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i9 = i10;
                } catch (JSONException e9) {
                    return Z(n0.a(6, "Error trying to decode SkuDetails."), l6.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e9);
                }
            } catch (DeadObjectException e10) {
                return Z(n0.f4017j, l6.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e10);
            } catch (Exception e11) {
                return Z(n0.f4015h, l6.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e11);
            }
        }
        return new z(0, "", arrayList, arrayList2);
    }

    final m0 w0() {
        return this.f3855h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d z0(final d dVar) {
        if (Thread.interrupted()) {
            return dVar;
        }
        this.f3852e.post(new Runnable() { // from class: com.android.billingclient.api.l
            @Override // java.lang.Runnable
            public final void run() {
                b.p(b.this, dVar);
            }
        });
        return dVar;
    }

    b(String str, e eVar, Context context, p1.w wVar, m0 m0Var, ExecutorService executorService, a.C0071a c0071a) {
        this.f3848a = new Object();
        this.f3849b = 0;
        this.f3852e = new Handler(Looper.getMainLooper());
        this.f3860m = 0;
        Long valueOf = Long.valueOf(new Random().nextLong());
        this.I = valueOf;
        this.J = com.google.android.gms.internal.play_billing.o.a();
        this.f3850c = "8.0.0";
        String f02 = f0();
        this.f3851d = f02;
        this.f3854g = context.getApplicationContext();
        x6 L = z6.L();
        L.z("8.0.0");
        if (f02 != null) {
            L.A(f02);
        }
        L.x(this.f3854g.getPackageName());
        L.s(valueOf.longValue());
        L.y(c0071a.f3846f);
        L.p(Build.VERSION.SDK_INT);
        L.w(772604006L);
        try {
            L.q(this.f3854g.getPackageManager().getPackageInfo(this.f3854g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Error getting app version code.", th);
        }
        this.f3855h = new o0(this.f3854g, (z6) L.l());
        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f3853f = new v0(this.f3854g, null, null, null, null, this.f3855h);
        this.D = eVar;
        this.f3854g.getPackageName();
        this.E = c0071a.f3846f;
    }

    b(String str, e eVar, Context context, p1.i iVar, p1.n nVar, m0 m0Var, ExecutorService executorService, a.C0071a c0071a) {
        this.f3848a = new Object();
        this.f3849b = 0;
        this.f3852e = new Handler(Looper.getMainLooper());
        this.f3860m = 0;
        this.I = Long.valueOf(new Random().nextLong());
        this.J = com.google.android.gms.internal.play_billing.o.a();
        this.f3850c = "8.0.0";
        this.f3851d = f0();
        i(context, iVar, eVar, null, "8.0.0", null, c0071a);
    }
}
