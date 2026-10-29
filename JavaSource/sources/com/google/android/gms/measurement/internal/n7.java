package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.qf;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final class n7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g0 f22401a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22402b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y7 f22403c;

    n7(y7 y7Var, g0 g0Var, String str) {
        this.f22401a = g0Var;
        this.f22402b = str;
        Objects.requireNonNull(y7Var);
        this.f22403c = y7Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ba baVar;
        byte[] bArr;
        pd pdVar;
        wd wdVar;
        pd pdVar2;
        v5 v5Var;
        w6 w6Var;
        com.google.android.gms.internal.measurement.t6 t6Var;
        Bundle bundle;
        String str;
        boolean z7;
        Object obj;
        com.google.android.gms.internal.measurement.p6 p6Var;
        c0 a8;
        long j7;
        byte[] bArr2;
        y7 y7Var = this.f22403c;
        y7Var.u4().E();
        ba J0 = y7Var.u4().J0();
        J0.h();
        w6 w6Var2 = J0.f22928a;
        w6.q();
        g0 g0Var = this.f22401a;
        p3.o.m(g0Var);
        String str2 = this.f22402b;
        p3.o.g(str2);
        String str3 = g0Var.f22160q;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            J0.f22928a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        pd pdVar3 = J0.f22755b;
        com.google.android.gms.internal.measurement.p6 M = com.google.android.gms.internal.measurement.s6.M();
        pdVar3.F0().r0();
        try {
            v5 J02 = pdVar3.F0().J0(str2);
            if (J02 == null) {
                J0.f22928a.a().v().b("Log and bundle not available. package_name", str2);
                bArr2 = new byte[0];
            } else {
                if (J02.d()) {
                    com.google.android.gms.internal.measurement.t6 k02 = com.google.android.gms.internal.measurement.u6.k0();
                    k02.X(1);
                    k02.z("android");
                    if (!TextUtils.isEmpty(J02.o0())) {
                        k02.I(J02.o0());
                    }
                    if (!TextUtils.isEmpty(J02.H0())) {
                        k02.G((String) p3.o.m(J02.H0()));
                    }
                    if (!TextUtils.isEmpty(J02.D0())) {
                        k02.J((String) p3.o.m(J02.D0()));
                    }
                    if (J02.F0() != -2147483648L) {
                        k02.y0((int) J02.F0());
                    }
                    k02.K(J02.J0());
                    k02.G0(J02.b());
                    String r02 = J02.r0();
                    if (!TextUtils.isEmpty(r02)) {
                        k02.s0(r02);
                    }
                    k02.N0(J02.X());
                    d8 g8 = J0.f22755b.g(str2);
                    k02.V(J02.L0());
                    if (w6Var2.g() && J0.f22928a.w().k(k02.H()) && g8.o(t4.v.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        k02.B0(null);
                    }
                    k02.I0(g8.k());
                    if (g8.o(t4.v.AD_STORAGE) && J02.P()) {
                        Pair m7 = pdVar3.L0().m(J02.o0(), g8);
                        if (J02.P() && !TextUtils.isEmpty((CharSequence) m7.first)) {
                            try {
                                k02.N(ba.m((String) m7.first, Long.toString(g0Var.f22163t)));
                                Object obj2 = m7.second;
                                if (obj2 != null) {
                                    k02.Q(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e8) {
                                J0.f22928a.a().v().b("Resettable device id encryption failed", e8.getMessage());
                                bArr = new byte[0];
                                pdVar = J0.f22755b;
                                pdVar.F0().t0();
                                return bArr;
                            }
                        }
                    }
                    w6 w6Var3 = J0.f22928a;
                    w6Var3.K().l();
                    k02.C(Build.MODEL);
                    w6Var3.K().l();
                    k02.B(Build.VERSION.RELEASE);
                    k02.F((int) w6Var3.K().o());
                    k02.E(w6Var3.K().p());
                    try {
                        if (g8.o(t4.v.ANALYTICS_STORAGE) && J02.p0() != null) {
                            k02.T(ba.m((String) p3.o.m(J02.p0()), Long.toString(g0Var.f22163t)));
                        }
                        if (!TextUtils.isEmpty(J02.x0())) {
                            k02.w0((String) p3.o.m(J02.x0()));
                        }
                        String o02 = J02.o0();
                        pd pdVar4 = J0.f22755b;
                        List C0 = pdVar4.F0().C0(o02);
                        Iterator it = C0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                wdVar = null;
                                break;
                            }
                            wdVar = (wd) it.next();
                            if ("_lte".equals(wdVar.f22832c)) {
                                break;
                            }
                        }
                        if (wdVar == null || wdVar.f22834e == null) {
                            wd wdVar2 = new wd(o02, "auto", "_lte", J0.f22928a.f().a(), 0L);
                            C0.add(wdVar2);
                            pdVar4.F0().A0(wdVar2);
                        }
                        com.google.android.gms.internal.measurement.l7[] l7VarArr = new com.google.android.gms.internal.measurement.l7[C0.size()];
                        for (int i7 = 0; i7 < C0.size(); i7++) {
                            com.google.android.gms.internal.measurement.k7 Q = com.google.android.gms.internal.measurement.l7.Q();
                            Q.y(((wd) C0.get(i7)).f22832c);
                            Q.x(((wd) C0.get(i7)).f22833d);
                            pdVar4.K0().G(Q, ((wd) C0.get(i7)).f22834e);
                            l7VarArr[i7] = (com.google.android.gms.internal.measurement.l7) Q.s();
                        }
                        k02.e1(Arrays.asList(l7VarArr));
                        pd pdVar5 = J0.f22755b;
                        pdVar5.n(J02, k02);
                        pdVar5.o(J02, k02);
                        q5 a9 = q5.a(g0Var);
                        w6 w6Var4 = J0.f22928a;
                        yd C = w6Var4.C();
                        Bundle bundle2 = a9.f22528d;
                        C.w(bundle2, pdVar4.F0().G(str2));
                        w6Var4.C().u(a9, w6Var4.w().w(str2));
                        bundle2.putLong("_c", 1L);
                        w6Var4.a().v().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = g0Var.f22162s;
                        bundle2.putString("_o", str4);
                        if (w6Var4.C().P(k02.H(), J02.l0())) {
                            w6Var4.C().A(bundle2, "_dbg", 1L);
                            w6Var4.C().A(bundle2, "_r", 1L);
                        }
                        u F0 = pdVar4.F0();
                        String str5 = g0Var.f22160q;
                        c0 v02 = F0.v0(str2, str5);
                        if (v02 == null) {
                            v5Var = J02;
                            w6Var = w6Var4;
                            t6Var = k02;
                            pdVar2 = pdVar5;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            a8 = new c0(str2, str5, 0L, 0L, 0L, g0Var.f22163t, 0L, null, null, null, null);
                            z7 = true;
                            j7 = 0;
                            p6Var = M;
                        } else {
                            pdVar2 = pdVar5;
                            v5Var = J02;
                            w6Var = w6Var4;
                            t6Var = k02;
                            bundle = bundle2;
                            str = str4;
                            z7 = true;
                            obj = null;
                            p6Var = M;
                            long j8 = v02.f21923f;
                            a8 = v02.a(g0Var.f22163t);
                            j7 = j8;
                        }
                        c0 c0Var = a8;
                        pdVar4.F0().w0(c0Var);
                        w6 w6Var5 = J0.f22928a;
                        long j9 = g0Var.f22163t;
                        boolean z8 = z7;
                        v5 v5Var2 = v5Var;
                        com.google.android.gms.internal.measurement.t6 t6Var2 = t6Var;
                        pd pdVar6 = pdVar2;
                        try {
                            b0 b0Var = new b0(w6Var5, str, str2, str5, j9, j7, bundle);
                            com.google.android.gms.internal.measurement.h6 P = com.google.android.gms.internal.measurement.i6.P();
                            P.L(b0Var.f21876d);
                            P.I(b0Var.f21874b);
                            P.N(b0Var.f21877e);
                            e0 e0Var = b0Var.f21878f;
                            d0 d0Var = new d0(e0Var);
                            while (d0Var.hasNext()) {
                                String next = d0Var.next();
                                com.google.android.gms.internal.measurement.l6 R = com.google.android.gms.internal.measurement.m6.R();
                                R.y(next);
                                Object M0 = e0Var.M0(next);
                                if (M0 != null) {
                                    pdVar4.K0().H(R, M0);
                                    P.D(R);
                                }
                            }
                            t6Var2.U0(P);
                            com.google.android.gms.internal.measurement.v6 F = com.google.android.gms.internal.measurement.x6.F();
                            com.google.android.gms.internal.measurement.j6 F2 = com.google.android.gms.internal.measurement.k6.F();
                            F2.y(c0Var.f21920c);
                            F2.x(str5);
                            F.x(F2);
                            t6Var2.E0(F);
                            t6Var2.u0(pdVar4.I0().m(v5Var2.o0(), Collections.EMPTY_LIST, t6Var2.Y0(), Long.valueOf(P.K()), Long.valueOf(P.K()), false));
                            if (P.J()) {
                                t6Var2.j1(P.K());
                                t6Var2.l1(P.K());
                            }
                            long B0 = v5Var2.B0();
                            if (B0 != 0) {
                                t6Var2.x(B0);
                            }
                            long z02 = v5Var2.z0();
                            if (z02 != 0) {
                                t6Var2.m1(z02);
                            } else if (B0 != 0) {
                                t6Var2.m1(B0);
                            }
                            String t02 = v5Var2.t0();
                            qf.a();
                            if (w6Var.w().H(str2, c5.N0) && t02 != null) {
                                t6Var2.J0(t02);
                            }
                            v5Var2.l();
                            t6Var2.W((int) v5Var2.g());
                            w6Var.w().A();
                            t6Var2.L(133005L);
                            t6Var2.g1(w6Var.f().a());
                            t6Var2.t0(z8);
                            pdVar6.x(t6Var2.H(), t6Var2);
                            p6Var.B(t6Var2);
                            v5Var2.A0(t6Var2.i1());
                            v5Var2.C0(t6Var2.k1());
                            pdVar4.F0().K0(v5Var2, false, false);
                            pdVar4.F0().s0();
                            pdVar4.F0().t0();
                            try {
                                return pdVar4.K0().V(((com.google.android.gms.internal.measurement.s6) p6Var.s()).c());
                            } catch (IOException e9) {
                                J0.f22928a.a().o().c("Data loss. Failed to bundle and serialize. appId", p5.x(str2), e9);
                                return obj;
                            }
                        } catch (Throwable th) {
                            th = th;
                            baVar = J0;
                            baVar.f22755b.F0().t0();
                            throw th;
                        }
                    } catch (SecurityException e10) {
                        baVar = J0;
                        try {
                            baVar.f22928a.a().v().b("app instance id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            pdVar = baVar.f22755b;
                            pdVar.F0().t0();
                            return bArr;
                        } catch (Throwable th2) {
                            th = th2;
                            baVar.f22755b.F0().t0();
                            throw th;
                        }
                    }
                }
                J0.f22928a.a().v().b("Log and bundle disabled. package_name", str2);
                bArr2 = new byte[0];
            }
            pdVar3.F0().t0();
            return bArr2;
        } catch (Throwable th3) {
            th = th3;
            baVar = J0;
            baVar.f22755b.F0().t0();
            throw th;
        }
    }
}
