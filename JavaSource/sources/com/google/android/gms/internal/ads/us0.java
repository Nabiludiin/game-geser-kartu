package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class us0 extends s2.a3 {
    private float A;
    private boolean B;
    private boolean C;
    private s30 D;

    /* renamed from: q, reason: collision with root package name */
    private final bo0 f16948q;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f16950s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f16951t;

    /* renamed from: u, reason: collision with root package name */
    private int f16952u;

    /* renamed from: v, reason: collision with root package name */
    private s2.e3 f16953v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16954w;

    /* renamed from: y, reason: collision with root package name */
    private float f16956y;

    /* renamed from: z, reason: collision with root package name */
    private float f16957z;

    /* renamed from: r, reason: collision with root package name */
    private final Object f16949r = new Object();

    /* renamed from: x, reason: collision with root package name */
    private boolean f16955x = true;

    public us0(bo0 bo0Var, float f8, boolean z7, boolean z8) {
        this.f16948q = bo0Var;
        this.f16956y = f8;
        this.f16950s = z7;
        this.f16951t = z8;
    }

    private final void q8(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ts0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                us0.this.n8(hashMap);
            }
        });
    }

    private final void r8(final int i7, final int i8, final boolean z7, final boolean z8) {
        cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ss0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                us0.this.o8(i7, i8, z7, z8);
            }
        });
    }

    @Override // s2.b3
    public final void c() {
        q8("play", null);
    }

    @Override // s2.b3
    public final void e() {
        q8("pause", null);
    }

    @Override // s2.b3
    public final boolean g() {
        boolean z7;
        synchronized (this.f16949r) {
            z7 = this.f16955x;
        }
        return z7;
    }

    @Override // s2.b3
    public final float i() {
        float f8;
        synchronized (this.f16949r) {
            f8 = this.f16956y;
        }
        return f8;
    }

    @Override // s2.b3
    public final int j() {
        int i7;
        synchronized (this.f16949r) {
            i7 = this.f16952u;
        }
        return i7;
    }

    public final void k8(s2.u4 u4Var) {
        Object obj = this.f16949r;
        boolean z7 = u4Var.f26239r;
        boolean z8 = u4Var.f26240s;
        synchronized (obj) {
            this.B = z7;
            this.C = z8;
        }
        boolean z9 = u4Var.f26238q;
        q8("initialState", com.google.android.gms.common.util.f.c("muteStart", true != z9 ? "0" : "1", "customControlsRequested", true != z7 ? "0" : "1", "clickToExpandRequested", true != z8 ? "0" : "1"));
    }

    @Override // s2.b3
    public final float l() {
        float f8;
        synchronized (this.f16949r) {
            f8 = this.f16957z;
        }
        return f8;
    }

    public final void l8(float f8) {
        synchronized (this.f16949r) {
            this.f16957z = f8;
        }
    }

    @Override // s2.b3
    public final void m() {
        q8("stop", null);
    }

    public final void m8(float f8, float f9, int i7, boolean z7, float f10) {
        boolean z8;
        boolean z9;
        int i8;
        synchronized (this.f16949r) {
            try {
                z8 = true;
                if (f9 == this.f16956y && f10 == this.A) {
                    z8 = false;
                }
                this.f16956y = f9;
                if (!((Boolean) s2.b0.c().d(uy.Pd)).booleanValue()) {
                    this.f16957z = f8;
                }
                z9 = this.f16955x;
                this.f16955x = z7;
                i8 = this.f16952u;
                this.f16952u = i7;
                float f11 = this.A;
                this.A = f10;
                if (Math.abs(f10 - f11) > 1.0E-4f) {
                    this.f16948q.Z().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            try {
                s30 s30Var = this.D;
                if (s30Var != null) {
                    s30Var.c();
                }
            } catch (RemoteException e8) {
                w2.p.i("#007 Could not call remote method.", e8);
            }
        }
        r8(i8, i7, z9, z7);
    }

    @Override // s2.b3
    public final float n() {
        float f8;
        synchronized (this.f16949r) {
            f8 = this.A;
        }
        return f8;
    }

    final /* synthetic */ void n8(Map map) {
        this.f16948q.B("pubVideoCmd", map);
    }

    @Override // s2.b3
    public final boolean o() {
        boolean z7;
        synchronized (this.f16949r) {
            try {
                z7 = false;
                if (this.f16950s && this.B) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    final /* synthetic */ void o8(int i7, int i8, boolean z7, boolean z8) {
        int i9;
        boolean z9;
        boolean z10;
        s2.e3 e3Var;
        s2.e3 e3Var2;
        s2.e3 e3Var3;
        synchronized (this.f16949r) {
            try {
                boolean z11 = this.f16954w;
                if (z11 || i8 != 1) {
                    i9 = i8;
                    z9 = false;
                } else {
                    i8 = 1;
                    i9 = 1;
                    z9 = true;
                }
                boolean z12 = i7 != i8;
                if (z12 && i9 == 1) {
                    z10 = true;
                    i9 = 1;
                } else {
                    z10 = false;
                }
                boolean z13 = z12 && i9 == 2;
                boolean z14 = z12 && i9 == 3;
                this.f16954w = z11 || z9;
                if (z9) {
                    try {
                        s2.e3 e3Var4 = this.f16953v;
                        if (e3Var4 != null) {
                            e3Var4.c();
                        }
                    } catch (RemoteException e8) {
                        w2.p.i("#007 Could not call remote method.", e8);
                    }
                }
                if (z10 && (e3Var3 = this.f16953v) != null) {
                    e3Var3.e();
                }
                if (z13 && (e3Var2 = this.f16953v) != null) {
                    e3Var2.f();
                }
                if (z14) {
                    s2.e3 e3Var5 = this.f16953v;
                    if (e3Var5 != null) {
                        e3Var5.g();
                    }
                    this.f16948q.x();
                }
                if (z7 != z8 && (e3Var = this.f16953v) != null) {
                    e3Var.z5(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p8(s30 s30Var) {
        synchronized (this.f16949r) {
            this.D = s30Var;
        }
    }

    @Override // s2.b3
    public final s2.e3 q() {
        s2.e3 e3Var;
        synchronized (this.f16949r) {
            e3Var = this.f16953v;
        }
        return e3Var;
    }

    @Override // s2.b3
    public final void r5(s2.e3 e3Var) {
        synchronized (this.f16949r) {
            this.f16953v = e3Var;
        }
    }

    @Override // s2.b3
    public final boolean s() {
        boolean z7;
        Object obj = this.f16949r;
        boolean o7 = o();
        synchronized (obj) {
            z7 = false;
            if (!o7) {
                try {
                    if (this.C && this.f16951t) {
                        z7 = true;
                    }
                } finally {
                }
            }
        }
        return z7;
    }

    @Override // s2.b3
    public final void v0(boolean z7) {
        q8(true != z7 ? "unmute" : "mute", null);
    }

    public final void w() {
        boolean z7;
        int i7;
        synchronized (this.f16949r) {
            z7 = this.f16955x;
            i7 = this.f16952u;
            this.f16952u = 3;
        }
        r8(i7, 3, z7, z7);
    }
}
