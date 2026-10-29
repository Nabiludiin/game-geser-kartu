package s2;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.wr;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MyApplication */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    private final gb0 f26169a;

    /* renamed from: b, reason: collision with root package name */
    private final f5 f26170b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f26171c;

    /* renamed from: d, reason: collision with root package name */
    private final k2.w f26172d;

    /* renamed from: e, reason: collision with root package name */
    final a0 f26173e;

    /* renamed from: f, reason: collision with root package name */
    private a f26174f;

    /* renamed from: g, reason: collision with root package name */
    private k2.d f26175g;

    /* renamed from: h, reason: collision with root package name */
    private k2.h[] f26176h;

    /* renamed from: i, reason: collision with root package name */
    private l2.d f26177i;

    /* renamed from: j, reason: collision with root package name */
    private v0 f26178j;

    /* renamed from: k, reason: collision with root package name */
    private k2.x f26179k;

    /* renamed from: l, reason: collision with root package name */
    private String f26180l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewGroup f26181m;

    /* renamed from: n, reason: collision with root package name */
    private int f26182n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f26183o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f26184p;

    public l3(ViewGroup viewGroup, int i7) {
        this(viewGroup, null, false, f5.f26092a, null, i7);
    }

    private static g5 e(Context context, k2.h[] hVarArr, int i7) {
        for (k2.h hVar : hVarArr) {
            if (hVar.equals(k2.h.f24408q)) {
                return new g5("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        g5 g5Var = new g5(context, hVarArr);
        g5Var.f26104z = f(i7);
        return g5Var;
    }

    private static boolean f(int i7) {
        return i7 == 1;
    }

    public final k2.o A() {
        return null;
    }

    public final k2.w B() {
        return this.f26172d;
    }

    public final b3 C() {
        v0 v0Var = this.f26178j;
        if (v0Var != null) {
            try {
                return v0Var.D();
            } catch (RemoteException e8) {
                w2.p.i("#007 Could not call remote method.", e8);
            }
        }
        return null;
    }

    public final void a(k2.x xVar) {
        this.f26179k = xVar;
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.A6(xVar == null ? null : new u4(xVar));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final k2.x b() {
        return this.f26179k;
    }

    final /* synthetic */ void c(w3.a aVar) {
        this.f26181m.addView((View) w3.b.r0(aVar));
    }

    final /* synthetic */ k2.w d() {
        return this.f26172d;
    }

    public final void g() {
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.d();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final k2.d h() {
        return this.f26175g;
    }

    public final k2.h i() {
        g5 o7;
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null && (o7 = v0Var.o()) != null) {
                return k2.a0.a(o7.f26099u, o7.f26096r, o7.f26095q);
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        k2.h[] hVarArr = this.f26176h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public final k2.h[] j() {
        return this.f26176h;
    }

    public final String k() {
        v0 v0Var;
        if (this.f26180l == null && (v0Var = this.f26178j) != null) {
            try {
                this.f26180l = v0Var.t();
            } catch (RemoteException e8) {
                w2.p.i("#007 Could not call remote method.", e8);
            }
        }
        return this.f26180l;
    }

    public final l2.d l() {
        return this.f26177i;
    }

    public final void m(i3 i3Var) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f26178j == null) {
                if (this.f26176h == null || this.f26180l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup = this.f26181m;
                Context context = viewGroup.getContext();
                g5 e8 = e(context, this.f26176h, this.f26182n);
                v0 v0Var = "search_v2".equals(e8.f26095q) ? (v0) new m(z.b(), context, e8, this.f26180l).d(context, false) : (v0) new k(z.b(), context, e8, this.f26180l, this.f26169a).d(context, false);
                this.f26178j = v0Var;
                v0Var.L4(new t4(this.f26173e));
                a aVar = this.f26174f;
                if (aVar != null) {
                    this.f26178j.g3(new x(aVar));
                }
                l2.d dVar = this.f26177i;
                if (dVar != null) {
                    this.f26178j.v2(new wr(dVar));
                }
                if (this.f26179k != null) {
                    this.f26178j.A6(new u4(this.f26179k));
                }
                this.f26178j.N3(new l4(null));
                this.f26178j.x5(this.f26183o);
                v0 v0Var2 = this.f26178j;
                if (v0Var2 != null) {
                    try {
                        final w3.a b8 = v0Var2.b();
                        if (b8 != null) {
                            if (((Boolean) u00.f16529f.e()).booleanValue()) {
                                if (((Boolean) b0.c().d(uy.jc)).booleanValue()) {
                                    w2.g.f27064b.post(new Runnable() { // from class: s2.k3
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            l3.this.c(b8);
                                        }
                                    });
                                }
                            }
                            viewGroup.addView((View) w3.b.r0(b8));
                        }
                    } catch (RemoteException e9) {
                        w2.p.i("#007 Could not call remote method.", e9);
                    }
                }
            }
            i3Var.o(currentTimeMillis);
            if (i3Var.q() != 0) {
                this.f26184p.set(i3Var.q());
            }
            v0 v0Var3 = this.f26178j;
            if (v0Var3 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f26184p;
            if (atomicLong.get() != 0) {
                v0Var3.m2(atomicLong.get());
            }
            v0Var3.U0(this.f26170b.a(this.f26181m.getContext(), i3Var));
        } catch (RemoteException e10) {
            w2.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void n() {
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.e();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void o() {
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.f();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void p(k2.d dVar) {
        this.f26175g = dVar;
        this.f26173e.o(dVar);
    }

    public final void q(a aVar) {
        try {
            this.f26174f = aVar;
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.g3(aVar != null ? new x(aVar) : null);
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void r(k2.h... hVarArr) {
        if (this.f26176h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        s(hVarArr);
    }

    public final void s(k2.h... hVarArr) {
        this.f26176h = hVarArr;
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.X4(e(this.f26181m.getContext(), this.f26176h, this.f26182n));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        this.f26181m.requestLayout();
    }

    public final void t(String str) {
        if (this.f26180l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f26180l = str;
    }

    public final void u(l2.d dVar) {
        try {
            this.f26177i = dVar;
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.v2(dVar != null ? new wr(dVar) : null);
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final void v(boolean z7) {
        this.f26183o = z7;
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.x5(z7);
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final k2.u w() {
        y2 y2Var = null;
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                y2Var = v0Var.r();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        return k2.u.e(y2Var);
    }

    public final void x(k2.o oVar) {
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.N3(new l4(oVar));
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final long y() {
        AtomicLong atomicLong = this.f26184p;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                atomicLong.set(v0Var.k0());
                return atomicLong.get();
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
        return 0L;
    }

    public final void z(long j7) {
        this.f26184p.set(j7);
        try {
            v0 v0Var = this.f26178j;
            if (v0Var != null) {
                v0Var.m2(j7);
            }
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    l3(ViewGroup viewGroup, AttributeSet attributeSet, boolean z7, f5 f5Var, v0 v0Var, int i7) {
        g5 g5Var;
        this.f26169a = new gb0();
        this.f26172d = new k2.w();
        this.f26173e = new j3(this);
        this.f26184p = new AtomicLong();
        this.f26181m = viewGroup;
        this.f26170b = f5Var;
        this.f26178j = null;
        this.f26171c = new AtomicBoolean(false);
        this.f26182n = i7;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                o5 o5Var = new o5(context, attributeSet);
                this.f26176h = o5Var.a(z7);
                this.f26180l = o5Var.b();
                if (viewGroup.isInEditMode()) {
                    w2.g a8 = z.a();
                    k2.h hVar = this.f26176h[0];
                    int i8 = this.f26182n;
                    if (hVar.equals(k2.h.f24408q)) {
                        g5Var = new g5("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        g5Var = new g5(context, hVar);
                        g5Var.f26104z = f(i8);
                    }
                    a8.l(viewGroup, g5Var, "Ads by Google");
                }
            } catch (IllegalArgumentException e8) {
                z.a().k(viewGroup, new g5(context, k2.h.f24400i), e8.getMessage(), e8.getMessage());
            }
        }
    }
}
