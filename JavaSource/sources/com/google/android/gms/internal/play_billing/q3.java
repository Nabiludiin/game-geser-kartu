package com.google.android.gms.internal.play_billing;

import java.util.List;

/* compiled from: MyApplication */
final class q3 implements a6 {

    /* renamed from: a, reason: collision with root package name */
    private final p3 f21714a;

    private q3(p3 p3Var) {
        byte[] bArr = j4.f21586b;
        this.f21714a = p3Var;
        p3Var.f21709a = this;
    }

    public static q3 K(p3 p3Var) {
        q3 q3Var = p3Var.f21709a;
        return q3Var != null ? q3Var : new q3(p3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void A(int i7, float f8) {
        this.f21714a.l(i7, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.x(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += p3.d(((Long) list.get(i10)).longValue());
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.y(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void C(int i7, int i8) {
        this.f21714a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void D(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.l(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.m(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void E(int i7, int i8) {
        this.f21714a.v(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void F(int i7) {
        this.f21714a.u(i7, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void G(int i7, long j7) {
        this.f21714a.n(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void H(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f21714a.t(i7, (String) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void I(int i7, long j7) {
        this.f21714a.x(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void J(int i7) {
        this.f21714a.u(i7, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof e4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21714a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            p3 p3Var = this.f21714a;
            p3Var.u(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            p3Var.w(i9);
            while (i8 < list.size()) {
                p3Var.m(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        e4 e4Var = (e4) list;
        if (!z7) {
            while (i8 < e4Var.size()) {
                this.f21714a.l(i7, e4Var.e(i8));
                i8++;
            }
            return;
        }
        p3 p3Var2 = this.f21714a;
        p3Var2.u(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < e4Var.size(); i12++) {
            e4Var.e(i12);
            i11 += 4;
        }
        p3Var2.w(i11);
        while (i8 < e4Var.size()) {
            p3Var2.m(e4Var.e(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void b(int i7, int i8) {
        this.f21714a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void c(int i7, Object obj, j5 j5Var) {
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 3);
        j5Var.a((z4) obj, p3Var.f21709a);
        p3Var.u(i7, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void d(int i7, int i8) {
        this.f21714a.p(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void e(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f21714a.k(i7, (i3) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void f(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof e4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21714a.v(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            p3 p3Var = this.f21714a;
            p3Var.u(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += p3.c(((Integer) list.get(i10)).intValue());
            }
            p3Var.w(i9);
            while (i8 < list.size()) {
                p3Var.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        e4 e4Var = (e4) list;
        if (!z7) {
            while (i8 < e4Var.size()) {
                this.f21714a.v(i7, e4Var.e(i8));
                i8++;
            }
            return;
        }
        p3 p3Var2 = this.f21714a;
        p3Var2.u(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < e4Var.size(); i12++) {
            i11 += p3.c(e4Var.e(i12));
        }
        p3Var2.w(i11);
        while (i8 < e4Var.size()) {
            p3Var2.w(e4Var.e(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void g(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.n(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            i9 += 8;
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.o(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void h(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof e4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    p3 p3Var = this.f21714a;
                    int intValue = ((Integer) list.get(i8)).intValue();
                    p3Var.v(i7, (intValue >> 31) ^ (intValue + intValue));
                    i8++;
                }
                return;
            }
            p3 p3Var2 = this.f21714a;
            p3Var2.u(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += p3.c((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            p3Var2.w(i9);
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                p3Var2.w((intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
            return;
        }
        e4 e4Var = (e4) list;
        if (!z7) {
            while (i8 < e4Var.size()) {
                p3 p3Var3 = this.f21714a;
                int e8 = e4Var.e(i8);
                p3Var3.v(i7, (e8 >> 31) ^ (e8 + e8));
                i8++;
            }
            return;
        }
        p3 p3Var4 = this.f21714a;
        p3Var4.u(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < e4Var.size(); i12++) {
            int e9 = e4Var.e(i12);
            i11 += p3.c((e9 >> 31) ^ (e9 + e9));
        }
        p3Var4.w(i11);
        while (i8 < e4Var.size()) {
            int e10 = e4Var.e(i8);
            p3Var4.w((e10 >> 31) ^ (e10 + e10));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void i(int i7, double d8) {
        this.f21714a.n(i7, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void j(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.x(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += p3.d(((Long) list.get(i10)).longValue());
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.y(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void k(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                p3 p3Var = this.f21714a;
                long longValue = ((Long) list.get(i8)).longValue();
                p3Var.x(i7, (longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
            return;
        }
        p3 p3Var2 = this.f21714a;
        p3Var2.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += p3.d((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        p3Var2.w(i9);
        while (i8 < list.size()) {
            long longValue3 = ((Long) list.get(i8)).longValue();
            p3Var2.y((longValue3 >> 63) ^ (longValue3 + longValue3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void l(int i7, boolean z7) {
        this.f21714a.j(i7, z7);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void m(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.j(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.i(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void n(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof e4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21714a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            p3 p3Var = this.f21714a;
            p3Var.u(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            p3Var.w(i9);
            while (i8 < list.size()) {
                p3Var.m(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        e4 e4Var = (e4) list;
        if (!z7) {
            while (i8 < e4Var.size()) {
                this.f21714a.l(i7, e4Var.e(i8));
                i8++;
            }
            return;
        }
        p3 p3Var2 = this.f21714a;
        p3Var2.u(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < e4Var.size(); i12++) {
            e4Var.e(i12);
            i11 += 4;
        }
        p3Var2.w(i11);
        while (i8 < e4Var.size()) {
            p3Var2.m(e4Var.e(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void o(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof e4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21714a.p(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            p3 p3Var = this.f21714a;
            p3Var.u(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += p3.d(((Integer) list.get(i10)).intValue());
            }
            p3Var.w(i9);
            while (i8 < list.size()) {
                p3Var.q(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        e4 e4Var = (e4) list;
        if (!z7) {
            while (i8 < e4Var.size()) {
                this.f21714a.p(i7, e4Var.e(i8));
                i8++;
            }
            return;
        }
        p3 p3Var2 = this.f21714a;
        p3Var2.u(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < e4Var.size(); i12++) {
            i11 += p3.d(e4Var.e(i12));
        }
        p3Var2.w(i11);
        while (i8 < e4Var.size()) {
            p3Var2.q(e4Var.e(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void p(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.n(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            i9 += 8;
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.o(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void q(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21714a.n(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        p3 p3Var = this.f21714a;
        p3Var.u(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        p3Var.w(i9);
        while (i8 < list.size()) {
            p3Var.o(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void r(int i7, String str) {
        this.f21714a.t(i7, str);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void s(int i7, int i8) {
        this.f21714a.v(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void t(int i7, i3 i3Var) {
        this.f21714a.k(i7, i3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void u(int i7, long j7) {
        this.f21714a.x(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void v(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof e4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21714a.p(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            p3 p3Var = this.f21714a;
            p3Var.u(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += p3.d(((Integer) list.get(i10)).intValue());
            }
            p3Var.w(i9);
            while (i8 < list.size()) {
                p3Var.q(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        e4 e4Var = (e4) list;
        if (!z7) {
            while (i8 < e4Var.size()) {
                this.f21714a.p(i7, e4Var.e(i8));
                i8++;
            }
            return;
        }
        p3 p3Var2 = this.f21714a;
        p3Var2.u(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < e4Var.size(); i12++) {
            i11 += p3.d(e4Var.e(i12));
        }
        p3Var2.w(i11);
        while (i8 < e4Var.size()) {
            p3Var2.q(e4Var.e(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void w(int i7, long j7) {
        this.f21714a.n(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void x(int i7, int i8) {
        this.f21714a.p(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void y(int i7, long j7) {
        this.f21714a.x(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.play_billing.a6
    public final void z(int i7, Object obj, j5 j5Var) {
        this.f21714a.s(i7, (z4) obj, j5Var);
    }
}
