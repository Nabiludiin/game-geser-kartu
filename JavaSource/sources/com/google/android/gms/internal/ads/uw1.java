package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class uw1 implements hf1, s2.a, ra1, aa1, yc1 {

    /* renamed from: q, reason: collision with root package name */
    private final Context f17015q;

    /* renamed from: r, reason: collision with root package name */
    private final q13 f17016r;

    /* renamed from: s, reason: collision with root package name */
    private final rx1 f17017s;

    /* renamed from: t, reason: collision with root package name */
    private final o03 f17018t;

    /* renamed from: u, reason: collision with root package name */
    private final c03 f17019u;

    /* renamed from: v, reason: collision with root package name */
    private final v82 f17020v;

    /* renamed from: w, reason: collision with root package name */
    private final String f17021w;

    /* renamed from: y, reason: collision with root package name */
    private Boolean f17023y;

    /* renamed from: x, reason: collision with root package name */
    private long f17022x = -1;
    final AtomicBoolean A = new AtomicBoolean(false);
    final AtomicBoolean B = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    private final boolean f17024z = ((Boolean) s2.b0.c().d(uy.p7)).booleanValue();

    public uw1(Context context, q13 q13Var, rx1 rx1Var, o03 o03Var, c03 c03Var, v82 v82Var, String str) {
        this.f17015q = context;
        this.f17016r = q13Var;
        this.f17017s = rx1Var;
        this.f17018t = o03Var;
        this.f17019u = c03Var;
        this.f17020v = v82Var;
        this.f17021w = str;
    }

    private final boolean a() {
        String str;
        if (this.f17023y == null) {
            synchronized (this) {
                if (this.f17023y == null) {
                    String str2 = (String) s2.b0.c().d(uy.K1);
                    r2.t.g();
                    try {
                        str = v2.f2.f0(this.f17015q);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z7 = false;
                    if (str2 != null && str != null) {
                        try {
                            z7 = Pattern.matches(str2, str);
                        } catch (RuntimeException e8) {
                            r2.t.l().i(e8, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f17023y = Boolean.valueOf(z7);
                }
            }
        }
        return this.f17023y.booleanValue();
    }

    private final qx1 b(String str) {
        o03 o03Var = this.f17018t;
        n03 n03Var = o03Var.f13137b;
        qx1 a8 = this.f17017s.a();
        a8.a(n03Var.f12530b);
        c03 c03Var = this.f17019u;
        a8.b(c03Var);
        a8.c("action", str);
        a8.c("ad_format", this.f17021w.toUpperCase(Locale.ROOT));
        List list = c03Var.f6188t;
        if (!list.isEmpty()) {
            a8.c("ancn", (String) list.get(0));
        }
        if (c03Var.b()) {
            a8.c("device_connectivity", true != r2.t.l().u(this.f17015q) ? "offline" : "online");
            a8.c("event_timestamp", String.valueOf(r2.t.o().a()));
            a8.c("offline_ad", "1");
        }
        if (((Boolean) s2.b0.c().d(uy.w7)).booleanValue()) {
            boolean a9 = b3.c.a(o03Var);
            a8.c("scar", String.valueOf(a9));
            if (a9) {
                s2.b5 b5Var = o03Var.f13136a.f11326a.f17958d;
                a8.c("ragent", b5Var.F);
                a8.c("rtype", b3.c.b(b3.c.c(b5Var)));
            }
        }
        return a8;
    }

    private final void e(qx1 qx1Var) {
        if (!this.f17019u.b()) {
            qx1Var.d();
            return;
        }
        this.f17020v.h(new z82(r2.t.o().a(), this.f17018t.f13137b.f12530b.f7926b, qx1Var.g(), 2));
    }

    private final boolean f() {
        int i7 = this.f17019u.f6152b;
        return i7 == 2 || i7 == 5 || i7 == 6 || i7 == 7;
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final void E() {
        if (a() || this.f17019u.b()) {
            qx1 b8 = b("impression");
            b8.c("imp_type", String.valueOf(this.f17019u.f6158e));
            if (this.f17022x > 0) {
                b8.c("p_imp_l", String.valueOf(r2.t.o().a() - this.f17022x));
            }
            if (((Boolean) s2.b0.c().d(uy.we)).booleanValue() && f()) {
                r2.t.g();
                b8.c("foreground", true != v2.f2.k(this.f17015q) ? "1" : "0");
                b8.c("fg_show", true == this.A.get() ? "1" : "0");
            }
            e(b8);
        }
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void b1(s2.x2 x2Var) {
        s2.x2 x2Var2;
        if (this.f17024z) {
            qx1 b8 = b("ifts");
            b8.c("reason", "adapter");
            int i7 = x2Var.f26259q;
            String str = x2Var.f26260r;
            if (x2Var.f26261s.equals("com.google.android.gms.ads") && (x2Var2 = x2Var.f26262t) != null && !x2Var2.f26261s.equals("com.google.android.gms.ads")) {
                s2.x2 x2Var3 = x2Var.f26262t;
                i7 = x2Var3.f26259q;
                str = x2Var3.f26260r;
            }
            if (i7 >= 0) {
                b8.c("arec", String.valueOf(i7));
            }
            String a8 = this.f17016r.a(str);
            if (a8 != null) {
                b8.c("areec", a8);
            }
            b8.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void c() {
        if (this.f17024z) {
            qx1 b8 = b("ifts");
            b8.c("reason", "blocked");
            b8.d();
        }
    }

    @Override // s2.a
    public final void c0() {
        if (this.f17019u.b()) {
            e(b("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void c1(hl1 hl1Var) {
        if (this.f17024z) {
            qx1 b8 = b("ifts");
            b8.c("reason", "exception");
            if (!TextUtils.isEmpty(hl1Var.getMessage())) {
                b8.c("msg", hl1Var.getMessage());
            }
            b8.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void d() {
        if (a()) {
            qx1 b8 = b("adapter_impression");
            b8.c("imp_type", String.valueOf(this.f17019u.f6158e));
            if (this.B.get()) {
                b8.c("po", "1");
                b8.c("pil", String.valueOf(r2.t.o().a() - this.f17022x));
            } else {
                b8.c("po", "0");
            }
            if (((Boolean) s2.b0.c().d(uy.we)).booleanValue() && f()) {
                r2.t.g();
                b8.c("foreground", true != v2.f2.k(this.f17015q) ? "1" : "0");
                b8.c("fg_show", true != this.A.get() ? "0" : "1");
            }
            if (((Boolean) s2.b0.c().d(uy.xe)).booleanValue() && f()) {
                b8.c("fg_al", true == r2.t.k().f() ? "1" : "0");
            }
            b8.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void h() {
        if (a()) {
            b("adapter_shown").d();
        }
    }

    @Override // com.google.android.gms.internal.ads.yc1
    public final void l() {
        if (a()) {
            this.B.set(true);
            this.f17022x = r2.t.o().a();
            qx1 b8 = b("presentation");
            if (((Boolean) s2.b0.c().d(uy.we)).booleanValue() && f()) {
                AtomicBoolean atomicBoolean = this.A;
                r2.t.g();
                atomicBoolean.set(!v2.f2.k(this.f17015q));
                b8.c("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) s2.b0.c().d(uy.xe)).booleanValue() && f()) {
                b8.c("fg_al", true != r2.t.k().f() ? "0" : "1");
            }
            b8.d();
        }
    }
}
