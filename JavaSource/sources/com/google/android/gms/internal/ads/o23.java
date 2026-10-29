package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
final class o23 implements n23 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f13168a;

    /* renamed from: b, reason: collision with root package name */
    private final u23 f13169b;

    /* renamed from: c, reason: collision with root package name */
    private final q23 f13170c = new q23();

    public o23(u23 u23Var) {
        this.f13168a = new ConcurrentHashMap(u23Var.f16556v);
        this.f13169b = u23Var;
    }

    private final void f() {
        Parcelable.Creator<u23> creator = u23.CREATOR;
        if (((Boolean) s2.b0.c().d(uy.R6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            u23 u23Var = this.f13169b;
            sb.append(u23Var.f16554t);
            sb.append(" PoolCollection");
            sb.append(this.f13170c.g());
            int i7 = 0;
            for (Map.Entry entry : this.f13168a.entrySet()) {
                i7++;
                sb.append(i7);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((x23) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i8 = 0; i8 < ((m23) entry.getValue()).c(); i8++) {
                    sb.append("[O]");
                }
                for (int c8 = ((m23) entry.getValue()).c(); c8 < u23Var.f16556v; c8++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((m23) entry.getValue()).g());
                sb.append("\n");
            }
            while (i7 < u23Var.f16555u) {
                i7++;
                sb.append(i7);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i9 = v2.n1.f26802b;
            w2.p.a(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.n23
    public final synchronized boolean a(x23 x23Var) {
        m23 m23Var = (m23) this.f13168a.get(x23Var);
        if (m23Var == null) {
            return true;
        }
        return m23Var.c() < this.f13169b.f16556v;
    }

    @Override // com.google.android.gms.internal.ads.n23
    public final synchronized boolean b(x23 x23Var, w23 w23Var) {
        boolean a8;
        try {
            ConcurrentHashMap concurrentHashMap = this.f13168a;
            m23 m23Var = (m23) concurrentHashMap.get(x23Var);
            w23Var.f17995d = r2.t.o().a();
            if (m23Var == null) {
                u23 u23Var = this.f13169b;
                m23 m23Var2 = new m23(u23Var.f16556v, u23Var.f16557w * 1000);
                if (concurrentHashMap.size() == u23Var.f16555u) {
                    int i7 = u23Var.C;
                    int i8 = i7 - 1;
                    x23 x23Var2 = null;
                    if (i7 == 0) {
                        throw null;
                    }
                    long j7 = Long.MAX_VALUE;
                    if (i8 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((m23) entry.getValue()).d() < j7) {
                                j7 = ((m23) entry.getValue()).d();
                                x23Var2 = (x23) entry.getKey();
                            }
                        }
                        if (x23Var2 != null) {
                            concurrentHashMap.remove(x23Var2);
                        }
                    } else if (i8 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((m23) entry2.getValue()).e() < j7) {
                                j7 = ((m23) entry2.getValue()).e();
                                x23Var2 = (x23) entry2.getKey();
                            }
                        }
                        if (x23Var2 != null) {
                            concurrentHashMap.remove(x23Var2);
                        }
                    } else if (i8 == 2) {
                        int i9 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((m23) entry3.getValue()).f() < i9) {
                                i9 = ((m23) entry3.getValue()).f();
                                x23Var2 = (x23) entry3.getKey();
                            }
                        }
                        if (x23Var2 != null) {
                            concurrentHashMap.remove(x23Var2);
                        }
                    }
                    this.f13170c.d();
                }
                concurrentHashMap.put(x23Var, m23Var2);
                this.f13170c.c();
                m23Var = m23Var2;
            }
            a8 = m23Var.a(w23Var);
            q23 q23Var = this.f13170c;
            q23Var.e();
            p23 f8 = q23Var.f();
            k33 h8 = m23Var.h();
            ew g02 = lw.g0();
            cw i02 = dw.i0();
            i02.E(fw.IN_MEMORY);
            jw i03 = kw.i0();
            i03.E(f8.f13641q);
            i03.F(f8.f13642r);
            i03.G(h8.f10878r);
            i02.H(i03);
            g02.E(i02);
            w23Var.f17992a.a().d().K((lw) g02.A());
            f();
        } catch (Throwable th) {
            throw th;
        }
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.n23
    public final u23 c() {
        return this.f13169b;
    }

    @Override // com.google.android.gms.internal.ads.n23
    public final synchronized w23 d(x23 x23Var) {
        w23 w23Var;
        try {
            m23 m23Var = (m23) this.f13168a.get(x23Var);
            if (m23Var != null) {
                w23Var = m23Var.b();
                if (w23Var == null) {
                    this.f13170c.b();
                }
                k33 h8 = m23Var.h();
                if (w23Var != null) {
                    ew g02 = lw.g0();
                    cw i02 = dw.i0();
                    i02.E(fw.IN_MEMORY);
                    hw e02 = iw.e0();
                    e02.E(h8.f10877q);
                    e02.F(h8.f10878r);
                    i02.G(e02);
                    g02.E(i02);
                    w23Var.f17992a.a().d().C((lw) g02.A());
                }
                f();
            } else {
                this.f13170c.a();
                f();
                w23Var = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return w23Var;
    }

    @Override // com.google.android.gms.internal.ads.n23
    public final x23 e(s2.b5 b5Var, String str, s2.m5 m5Var) {
        u23 u23Var = this.f13169b;
        return new y23(b5Var, str, new hh0(u23Var.f16552r).a().f10044j, u23Var.f16558x, m5Var);
    }
}
