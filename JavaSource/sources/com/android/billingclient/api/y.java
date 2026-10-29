package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.a8;
import com.google.android.gms.internal.play_billing.b6;
import com.google.android.gms.internal.play_billing.b8;
import com.google.android.gms.internal.play_billing.d6;
import com.google.android.gms.internal.play_billing.d8;
import com.google.android.gms.internal.play_billing.f6;
import com.google.android.gms.internal.play_billing.i6;
import com.google.android.gms.internal.play_billing.j6;
import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.n6;
import com.google.android.gms.internal.play_billing.q6;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.w7;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class y implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final p1.d f4077a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.y f4078b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.y f4079c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4080d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b f4081e;

    /* synthetic */ y(b bVar, p1.d dVar, int i7, p1.o oVar) {
        com.google.android.gms.internal.play_billing.b0 b0Var;
        com.google.android.gms.internal.play_billing.b0 b0Var2;
        Objects.requireNonNull(bVar);
        this.f4081e = bVar;
        b0Var = bVar.J;
        this.f4078b = com.google.android.gms.internal.play_billing.y.c(b0Var);
        b0Var2 = bVar.J;
        this.f4079c = com.google.android.gms.internal.play_billing.y.c(b0Var2);
        this.f4077a = dVar;
        this.f4080d = i7;
    }

    public static /* synthetic */ Object a(y yVar) {
        Object obj;
        int i7;
        int i8;
        Bundle bundle;
        Object obj2;
        com.google.android.gms.internal.play_billing.d dVar;
        Context context;
        int i9;
        int i10;
        m0 m0Var;
        int i11;
        String str;
        String str2;
        Long l7;
        b bVar = yVar.f4081e;
        obj = bVar.f3848a;
        synchronized (obj) {
            try {
                i7 = bVar.f3849b;
                if (i7 != 3) {
                    i8 = bVar.f3849b;
                    boolean z7 = i8 == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        str = bVar.f3850c;
                        str2 = bVar.f3851d;
                        l7 = bVar.I;
                        com.google.android.gms.internal.play_billing.q0.c(bundle, str, str2, l7.longValue());
                    }
                    l6 l6Var = l6.REASON_UNSPECIFIED;
                    obj2 = bVar.f3848a;
                    synchronized (obj2) {
                        dVar = bVar.f3856i;
                    }
                    if (dVar == null) {
                        b bVar2 = yVar.f4081e;
                        bVar2.D(0);
                        int i12 = yVar.f4080d;
                        l6 l6Var2 = l6.SERVICE_RESET_TO_NULL;
                        d dVar2 = n0.f4017j;
                        bVar2.C(l6Var2, dVar2, i12);
                        yVar.g(dVar2);
                    } else {
                        b bVar3 = yVar.f4081e;
                        context = bVar3.f3854g;
                        String packageName = context.getPackageName();
                        int i13 = 25;
                        int i14 = 3;
                        int i15 = 25;
                        while (true) {
                            if (i15 < 3) {
                                i15 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    i14 = dVar.W7(i15, packageName, "subs");
                                } catch (Exception e8) {
                                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception while checking if billing is supported; try to reconnect", e8);
                                    l6 l6Var3 = e8 instanceof DeadObjectException ? l6.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e8 instanceof RemoteException ? l6.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e8 instanceof SecurityException ? l6.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : l6.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                    String a8 = l6Var3.equals(l6.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? l0.a(e8) : null;
                                    yVar.f4081e.D(0);
                                    yVar.f(b.y0(e8), l6Var3, a8, z7);
                                    yVar.g(b.y0(e8));
                                }
                            } else {
                                i14 = dVar.U6(i15, packageName, "subs", bundle);
                            }
                            if (i14 == 0) {
                                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "highestLevelSupportedForSubs: " + i15);
                                break;
                            }
                            i15--;
                        }
                        bVar3.f3859l = i15 >= 5;
                        bVar3.f3858k = i15 >= 3;
                        if (i15 < 3) {
                            l6Var = l6.SUBSCRIPTIONS_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.q0.k("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (true) {
                            if (i13 < 3) {
                                break;
                            }
                            i14 = bundle == null ? dVar.W7(i13, packageName, "inapp") : dVar.U6(i13, packageName, "inapp", bundle);
                            if (i14 == 0) {
                                bVar3.f3860m = i13;
                                i11 = bVar3.f3860m;
                                com.google.android.gms.internal.play_billing.q0.k("BillingClient", "mHighestLevelSupportedForInApp: " + i11);
                                break;
                            }
                            i13--;
                        }
                        i9 = bVar3.f3860m;
                        b.N(bVar3, i9);
                        i10 = bVar3.f3860m;
                        if (i10 < 3) {
                            l6Var = l6.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.q0.l("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        b.P(bVar3, i14);
                        if (i14 != 0) {
                            d dVar3 = n0.f4009b;
                            yVar.f(dVar3, l6Var, null, z7);
                            yVar.g(dVar3);
                        } else {
                            try {
                                Long e9 = yVar.e(z7);
                                if (z7) {
                                    f6 G = i6.G();
                                    G.s(6);
                                    b8 F = d8.F();
                                    int i16 = yVar.f4080d;
                                    F.p(i16 > 0);
                                    F.q(i16);
                                    if (e9 != null) {
                                        F.r(e9.longValue());
                                    }
                                    b bVar4 = yVar.f4081e;
                                    G.r(F);
                                    bVar4.B((i6) G.l());
                                } else {
                                    u7 D = w7.D();
                                    j6 G2 = n6.G();
                                    G2.v(0);
                                    D.p(G2);
                                    if (e9 != null) {
                                        D.q(e9.longValue());
                                    }
                                    m0Var = yVar.f4081e.f3855h;
                                    m0Var.e((w7) D.l());
                                }
                            } catch (Throwable th) {
                                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
                            }
                            yVar.g(n0.f4016i);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public static /* synthetic */ void b(y yVar) {
        b bVar = yVar.f4081e;
        bVar.D(0);
        l6 l6Var = l6.EXECUTE_ASYNC_TIMEOUT;
        d dVar = n0.f4018k;
        bVar.C(l6Var, dVar, yVar.f4080d);
        yVar.g(dVar);
    }

    private final Long e(boolean z7) {
        if (z7) {
            com.google.android.gms.internal.play_billing.y yVar = this.f4078b;
            if (!yVar.g()) {
                return null;
            }
            yVar.f();
            return Long.valueOf(yVar.a(TimeUnit.MILLISECONDS));
        }
        com.google.android.gms.internal.play_billing.y yVar2 = this.f4079c;
        if (!yVar2.g()) {
            return null;
        }
        yVar2.f();
        return Long.valueOf(yVar2.a(TimeUnit.MILLISECONDS));
    }

    private final void f(d dVar, l6 l6Var, String str, boolean z7) {
        m0 m0Var;
        try {
            j6 G = n6.G();
            G.v(dVar.c());
            G.q(dVar.a());
            G.s(l6Var);
            if (str != null) {
                G.p(str);
            }
            Long e8 = e(z7);
            if (!z7) {
                u7 D = w7.D();
                D.p(G);
                if (e8 != null) {
                    D.q(e8.longValue());
                }
                m0Var = this.f4081e.f3855h;
                m0Var.e((w7) D.l());
                return;
            }
            b8 F = d8.F();
            int i7 = this.f4080d;
            F.p(i7 > 0);
            F.q(i7);
            if (e8 != null) {
                F.r(e8.longValue());
            }
            b bVar = this.f4081e;
            b6 I = d6.I();
            I.q(G);
            I.v(6);
            I.s(F);
            bVar.z((d6) I.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
    }

    private final void g(d dVar) {
        Object obj;
        int i7;
        b bVar = this.f4081e;
        obj = bVar.f3848a;
        synchronized (obj) {
            try {
                i7 = bVar.f3849b;
                if (i7 == 3) {
                    return;
                }
                try {
                    this.f4077a.a(dVar);
                } catch (Throwable th) {
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        com.google.android.gms.internal.play_billing.y yVar = this.f4078b;
        yVar.d();
        yVar.e();
    }

    final boolean d() {
        return this.f4080d > 0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Object obj;
        int i7;
        int i8;
        m0 m0Var;
        m0 m0Var2;
        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Billing service died.");
        try {
            b bVar = this.f4081e;
            if (b.T(bVar)) {
                m0Var2 = bVar.f3855h;
                b6 I = d6.I();
                I.v(6);
                j6 G = n6.G();
                G.s(l6.BINDING_DIED);
                I.q(G);
                b8 F = d8.F();
                int i9 = this.f4080d;
                F.p(i9 > 0);
                F.q(i9);
                I.s(F);
                m0Var2.b((d6) I.l());
            } else {
                m0Var = bVar.f3855h;
                m0Var.c(q6.C());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
        b bVar2 = this.f4081e;
        obj = bVar2.f3848a;
        synchronized (obj) {
            i7 = bVar2.f3849b;
            if (i7 != 3) {
                i8 = bVar2.f3849b;
                if (i8 != 0) {
                    bVar2.D(0);
                    bVar2.G();
                    try {
                        this.f4077a.b();
                    } catch (Throwable th2) {
                        com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                    }
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        int i7;
        Handler Y;
        d b02;
        com.google.android.gms.internal.play_billing.q0.k("BillingClient", "Billing service connected.");
        b bVar = this.f4081e;
        obj = bVar.f3848a;
        synchronized (obj) {
            try {
                i7 = bVar.f3849b;
                if (i7 == 3) {
                    return;
                }
                bVar.f3856i = com.google.android.gms.internal.play_billing.c.O(iBinder);
                Callable callable = new Callable() { // from class: com.android.billingclient.api.w
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        y.a(y.this);
                        return null;
                    }
                };
                Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.b(y.this);
                    }
                };
                Y = bVar.Y();
                if (b.k(callable, 30000L, runnable, Y, bVar.j()) == null) {
                    int i8 = this.f4080d;
                    b02 = bVar.b0();
                    bVar.C(l6.MISSING_RESULT_FROM_EXECUTE_ASYNC, b02, i8);
                    g(b02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        int i7;
        m0 m0Var;
        m0 m0Var2;
        com.google.android.gms.internal.play_billing.q0.l("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.f4081e;
            if (b.T(bVar)) {
                m0Var2 = bVar.f3855h;
                b6 I = d6.I();
                I.v(6);
                j6 G = n6.G();
                G.s(l6.SERVICE_DISCONNECTED);
                I.q(G);
                b8 F = d8.F();
                int i8 = this.f4080d;
                F.p(i8 > 0);
                F.q(i8);
                I.s(F);
                m0Var2.b((d6) I.l());
            } else {
                m0Var = bVar.f3855h;
                m0Var.i(a8.C());
            }
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to log.", th);
        }
        com.google.android.gms.internal.play_billing.y yVar = this.f4079c;
        yVar.d();
        yVar.e();
        b bVar2 = this.f4081e;
        obj = bVar2.f3848a;
        synchronized (obj) {
            try {
                i7 = bVar2.f3849b;
                if (i7 == 3) {
                    return;
                }
                bVar2.D(0);
                try {
                    this.f4077a.b();
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } finally {
            }
        }
    }
}
