package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: MyApplication */
public final class yf5 implements ji5 {

    /* renamed from: h, reason: collision with root package name */
    public static final jy3 f19554h = wf5.f18241q;

    /* renamed from: i, reason: collision with root package name */
    private static final Random f19555i = new Random();

    /* renamed from: d, reason: collision with root package name */
    private hi5 f19559d;

    /* renamed from: f, reason: collision with root package name */
    private String f19561f;

    /* renamed from: a, reason: collision with root package name */
    private final yx f19556a = new yx();

    /* renamed from: b, reason: collision with root package name */
    private final ot f19557b = new ot();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f19558c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private az f19560e = az.f5406a;

    /* renamed from: g, reason: collision with root package name */
    private long f19562g = -1;

    public yf5(jy3 jy3Var) {
    }

    private final void l(nd5 nd5Var) {
        if (nd5Var.f12710b.g()) {
            String str = this.f19561f;
            if (str != null) {
                xf5 xf5Var = (xf5) this.f19558c.get(str);
                xf5Var.getClass();
                m(xf5Var);
                return;
            }
            return;
        }
        xf5 xf5Var2 = (xf5) this.f19558c.get(this.f19561f);
        int i7 = nd5Var.f12711c;
        xp5 xp5Var = nd5Var.f12712d;
        this.f19561f = o(i7, xp5Var).e();
        g(nd5Var);
        if (xp5Var == null || !xp5Var.b()) {
            return;
        }
        if (xf5Var2 != null) {
            if (xf5Var2.g() == xp5Var.f18927d && xf5Var2.h() != null) {
                xp5 h8 = xf5Var2.h();
                if (h8.f18925b == xp5Var.f18925b) {
                    xp5 h9 = xf5Var2.h();
                    if (h9.f18926c == xp5Var.f18926c) {
                        return;
                    }
                }
            }
        }
        o(i7, new xp5(xp5Var.f18924a, xp5Var.f18927d));
    }

    private final void m(xf5 xf5Var) {
        if (xf5Var.g() != -1) {
            this.f19562g = xf5Var.g();
        }
        this.f19561f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final long i() {
        xf5 xf5Var = (xf5) this.f19558c.get(this.f19561f);
        return (xf5Var == null || xf5Var.g() == -1) ? this.f19562g + 1 : xf5Var.g();
    }

    private final xf5 o(int i7, xp5 xp5Var) {
        HashMap hashMap = this.f19558c;
        long j7 = Long.MAX_VALUE;
        xf5 xf5Var = null;
        for (xf5 xf5Var2 : hashMap.values()) {
            xf5Var2.c(i7, xp5Var);
            if (xf5Var2.b(i7, xp5Var)) {
                long g8 = xf5Var2.g();
                if (g8 == -1 || g8 < j7) {
                    xf5Var = xf5Var2;
                    j7 = g8;
                } else if (g8 == j7) {
                    String str = hi2.f9535a;
                    if (xf5Var.h() != null && xf5Var2.h() != null) {
                        xf5Var = xf5Var2;
                    }
                }
            }
        }
        if (xf5Var != null) {
            return xf5Var;
        }
        String p7 = p();
        xf5 xf5Var3 = new xf5(this, p7, i7, xp5Var);
        hashMap.put(p7, xf5Var3);
        return xf5Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p() {
        byte[] bArr = new byte[12];
        f19555i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final synchronized void a(nd5 nd5Var, int i7) {
        try {
            if (this.f19559d == null) {
                throw null;
            }
            Iterator it = this.f19558c.values().iterator();
            while (it.hasNext()) {
                xf5 xf5Var = (xf5) it.next();
                if (xf5Var.d(nd5Var)) {
                    it.remove();
                    if (xf5Var.i()) {
                        boolean equals = xf5Var.e().equals(this.f19561f);
                        boolean z7 = false;
                        if (i7 == 0 && equals && xf5Var.k()) {
                            z7 = true;
                        }
                        if (equals) {
                            m(xf5Var);
                        }
                        this.f19559d.i(nd5Var, xf5Var.e(), z7);
                    }
                }
            }
            l(nd5Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final synchronized void b(nd5 nd5Var) {
        hi5 hi5Var;
        try {
            String str = this.f19561f;
            if (str != null) {
                xf5 xf5Var = (xf5) this.f19558c.get(str);
                if (xf5Var == null) {
                    throw null;
                }
                m(xf5Var);
            }
            Iterator it = this.f19558c.values().iterator();
            while (it.hasNext()) {
                xf5 xf5Var2 = (xf5) it.next();
                it.remove();
                if (xf5Var2.i() && (hi5Var = this.f19559d) != null) {
                    hi5Var.i(nd5Var, xf5Var2.e(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final void c(hi5 hi5Var) {
        this.f19559d = hi5Var;
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final synchronized String d(az azVar, xp5 xp5Var) {
        return o(azVar.o(xp5Var.f18924a, this.f19557b).f13477c, xp5Var).e();
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final synchronized String e() {
        return this.f19561f;
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final synchronized void f(nd5 nd5Var) {
        try {
            if (this.f19559d == null) {
                throw null;
            }
            az azVar = this.f19560e;
            this.f19560e = nd5Var.f12710b;
            Iterator it = this.f19558c.values().iterator();
            while (it.hasNext()) {
                xf5 xf5Var = (xf5) it.next();
                if (xf5Var.a(azVar, this.f19560e) && !xf5Var.d(nd5Var)) {
                }
                it.remove();
                if (xf5Var.i()) {
                    if (xf5Var.e().equals(this.f19561f)) {
                        m(xf5Var);
                    }
                    this.f19559d.i(nd5Var, xf5Var.e(), false);
                }
            }
            l(nd5Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ji5
    public final synchronized void g(nd5 nd5Var) {
        try {
            if (this.f19559d == null) {
                throw null;
            }
            az azVar = nd5Var.f12710b;
            if (!azVar.g()) {
                xp5 xp5Var = nd5Var.f12712d;
                if (xp5Var != null) {
                    if (xp5Var.f18927d >= i()) {
                        xf5 xf5Var = (xf5) this.f19558c.get(this.f19561f);
                        if (xf5Var != null) {
                            if (xf5Var.g() == -1) {
                                if (xf5Var.f() == nd5Var.f12711c) {
                                }
                            }
                        }
                    }
                }
                int i7 = nd5Var.f12711c;
                xf5 o7 = o(i7, xp5Var);
                if (this.f19561f == null) {
                    this.f19561f = o7.e();
                }
                if (xp5Var != null && xp5Var.b()) {
                    Object obj = xp5Var.f18924a;
                    long j7 = xp5Var.f18927d;
                    int i8 = xp5Var.f18925b;
                    xf5 o8 = o(i7, new xp5(obj, j7, i8));
                    if (!o8.i()) {
                        o8.j(true);
                        ot otVar = this.f19557b;
                        azVar.o(obj, otVar);
                        otVar.c(i8);
                        Math.max(0L, hi2.M(0L) + hi2.M(0L));
                    }
                }
                if (!o7.i()) {
                    o7.j(true);
                }
                if (o7.e().equals(this.f19561f) && !o7.k()) {
                    o7.l(true);
                    this.f19559d.d(nd5Var, o7.e());
                }
            }
        } finally {
        }
    }

    final /* synthetic */ yx j() {
        return this.f19556a;
    }

    final /* synthetic */ ot k() {
        return this.f19557b;
    }
}
