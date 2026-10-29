package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class e63 implements Runnable {
    public static final Object A = new Object();
    private static final Object B = new Object();
    private static final Object C = new Object();
    public static Boolean D;

    /* renamed from: q, reason: collision with root package name */
    private final Context f7438q;

    /* renamed from: r, reason: collision with root package name */
    private final w2.a f7439r;

    /* renamed from: u, reason: collision with root package name */
    private int f7442u;

    /* renamed from: v, reason: collision with root package name */
    private final bv1 f7443v;

    /* renamed from: w, reason: collision with root package name */
    private final List f7444w;

    /* renamed from: x, reason: collision with root package name */
    private final du0 f7445x;

    /* renamed from: z, reason: collision with root package name */
    private final mh0 f7447z;

    /* renamed from: s, reason: collision with root package name */
    private final i63 f7440s = l63.e0();

    /* renamed from: t, reason: collision with root package name */
    private String f7441t = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f7446y = false;

    public e63(Context context, w2.a aVar, bv1 bv1Var, b72 b72Var, mh0 mh0Var, du0 du0Var) {
        this.f7438q = context;
        this.f7439r = aVar;
        this.f7443v = bv1Var;
        this.f7447z = mh0Var;
        this.f7445x = du0Var;
        if (((Boolean) s2.b0.c().d(uy.K9)).booleanValue()) {
            this.f7444w = v2.f2.W();
        } else {
            this.f7444w = w04.m();
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (A) {
            try {
                if (D == null) {
                    if (((Boolean) p00.f13595b.e()).booleanValue()) {
                        D = Boolean.valueOf(Math.random() < ((Double) p00.f13594a.e()).doubleValue());
                    } else {
                        D = Boolean.FALSE;
                    }
                }
                booleanValue = D.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(final u53 u53Var) {
        cm0.f6500a.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.d63
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                e63.this.c(u53Var);
            }
        });
    }

    final /* synthetic */ void c(u53 u53Var) {
        synchronized (C) {
            try {
                if (!this.f7446y) {
                    this.f7446y = true;
                    if (a()) {
                        try {
                            r2.t.g();
                            this.f7441t = v2.f2.f0(this.f7438q);
                        } catch (RemoteException | RuntimeException e8) {
                            r2.t.l().i(e8, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f7442u = k3.h.h().b(this.f7438q);
                        int intValue = ((Integer) s2.b0.c().d(uy.F9)).intValue();
                        if (((Boolean) s2.b0.c().d(uy.Tc)).booleanValue()) {
                            long j7 = intValue;
                            cm0.f6503d.scheduleWithFixedDelay(this, j7, j7, TimeUnit.MILLISECONDS);
                        } else {
                            long j8 = intValue;
                            cm0.f6503d.scheduleAtFixedRate(this, j8, j8, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) s2.b0.c().d(uy.L9)).booleanValue()) {
                            this.f7445x.a();
                        }
                    }
                }
            } finally {
            }
        }
        if (a() && u53Var != null) {
            synchronized (B) {
                try {
                    i63 i63Var = this.f7440s;
                    if (i63Var.E() >= ((Integer) s2.b0.c().d(uy.G9)).intValue()) {
                        return;
                    }
                    f63 f02 = h63.f0();
                    f02.Z(u53Var.m());
                    f02.E(u53Var.b());
                    f02.F(u53Var.a());
                    f02.a0(3);
                    f02.H(this.f7439r.f27051q);
                    f02.I(this.f7441t);
                    f02.J(Build.VERSION.RELEASE);
                    f02.K(Build.VERSION.SDK_INT);
                    f02.b0(u53Var.o());
                    f02.M(u53Var.c());
                    f02.N(this.f7442u);
                    f02.c0(u53Var.n());
                    f02.O(u53Var.d());
                    f02.P(u53Var.e());
                    f02.Q(u53Var.f());
                    f02.R(this.f7443v.d(u53Var.f()));
                    f02.S(u53Var.g());
                    f02.W(u53Var.h());
                    f02.V(u53Var.k());
                    f02.T(u53Var.i());
                    f02.U(u53Var.j());
                    f02.G(u53Var.l());
                    if (((Boolean) s2.b0.c().d(uy.K9)).booleanValue()) {
                        f02.L(this.f7444w);
                    }
                    if (((Boolean) s2.b0.c().d(uy.L9)).booleanValue()) {
                        du0 du0Var = this.f7445x;
                        h35 d8 = du0Var.d();
                        String c8 = du0Var.c();
                        if (d8 != null) {
                            f02.X(d8);
                        }
                        if (c8 != null) {
                            f02.Y(c8);
                        }
                    }
                    j63 d02 = k63.d0();
                    d02.E(f02);
                    i63Var.F(d02);
                } finally {
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] e8;
        if (a()) {
            Object obj = B;
            synchronized (obj) {
                try {
                    if (this.f7440s.E() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            i63 i63Var = this.f7440s;
                            e8 = ((l63) i63Var.A()).e();
                            i63Var.G();
                        }
                        new a72(this.f7438q, this.f7439r.f27051q, this.f7447z, Binder.getCallingUid(), null).d(new y62((String) s2.b0.c().d(uy.E9), 60000, new HashMap(), e8, "application/x-protobuf", false));
                    } catch (Exception e9) {
                        if ((e9 instanceof j22) && ((j22) e9).a() == 3) {
                            return;
                        }
                        r2.t.l().j(e9, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
