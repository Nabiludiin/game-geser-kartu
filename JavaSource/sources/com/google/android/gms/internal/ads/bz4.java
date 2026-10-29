package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class bz4 implements n25 {

    /* renamed from: a, reason: collision with root package name */
    private final az4 f6136a;

    private bz4(az4 az4Var) {
        c05.a(az4Var, "output");
        this.f6136a = az4Var;
        az4Var.f5415a = this;
    }

    public static bz4 K(az4 az4Var) {
        Object obj = az4Var.f5415a;
        return obj != null ? (bz4) obj : new bz4(az4Var);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void A(int i7, int i8) {
        this.f6136a.k(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof tz4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.y(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        tz4 tz4Var = (tz4) list;
        if (!z7) {
            while (i8 < tz4Var.size()) {
                this.f6136a.l(i7, tz4Var.g(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < tz4Var.size(); i12++) {
            tz4Var.g(i12);
            i11 += 4;
        }
        az4Var2.x(i11);
        while (i8 < tz4Var.size()) {
            az4Var2.y(tz4Var.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void C(int i7, boolean z7) {
        this.f6136a.p(i7, z7);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void D(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof tz4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.j(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += az4.c(((Integer) list.get(i10)).intValue());
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        tz4 tz4Var = (tz4) list;
        if (!z7) {
            while (i8 < tz4Var.size()) {
                this.f6136a.j(i7, tz4Var.g(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < tz4Var.size(); i12++) {
            i11 += az4.c(tz4Var.g(i12));
        }
        az4Var2.x(i11);
        while (i8 < tz4Var.size()) {
            az4Var2.w(tz4Var.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void E(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof tz4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.j(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += az4.c(((Integer) list.get(i10)).intValue());
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        tz4 tz4Var = (tz4) list;
        if (!z7) {
            while (i8 < tz4Var.size()) {
                this.f6136a.j(i7, tz4Var.g(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < tz4Var.size(); i12++) {
            i11 += az4.c(tz4Var.g(i12));
        }
        az4Var2.x(i11);
        while (i8 < tz4Var.size()) {
            az4Var2.w(tz4Var.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void F(int i7, float f8) {
        this.f6136a.l(i7, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void G(int i7, Object obj, n15 n15Var) {
        az4 az4Var = this.f6136a;
        ay4 ay4Var = (ay4) obj;
        az4Var.i(i7, 2);
        az4Var.x(ay4Var.h(n15Var));
        n15Var.k(ay4Var, this);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void H(int i7, qy4 qy4Var) {
        this.f6136a.r(i7, qy4Var);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void I(int i7, n05 n05Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            az4Var.x(o05.c(n05Var, entry.getKey(), entry.getValue()));
            o05.b(az4Var, n05Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void J(int i7, Object obj, n15 n15Var) {
        az4 az4Var = this.f6136a;
        az4Var.i(i7, 3);
        n15Var.k((ay4) obj, this);
        az4Var.i(i7, 4);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof j05)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.m(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += az4.c(((Long) list.get(i10)).longValue());
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.z(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        j05 j05Var = (j05) list;
        if (!z7) {
            while (i8 < j05Var.size()) {
                this.f6136a.m(i7, j05Var.R(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < j05Var.size(); i12++) {
            i11 += az4.c(j05Var.R(i12));
        }
        az4Var2.x(i11);
        while (i8 < j05Var.size()) {
            az4Var2.z(j05Var.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void b(int i7, int i8) {
        this.f6136a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void b0(int i7, long j7) {
        this.f6136a.o(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void c(int i7, long j7) {
        this.f6136a.o(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void d(int i7, int i8) {
        this.f6136a.j(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void e(int i7, long j7) {
        this.f6136a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void f(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof j05)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.o(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.A(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        j05 j05Var = (j05) list;
        if (!z7) {
            while (i8 < j05Var.size()) {
                this.f6136a.o(i7, j05Var.R(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < j05Var.size(); i12++) {
            j05Var.R(i12);
            i11 += 8;
        }
        az4Var2.x(i11);
        while (i8 < j05Var.size()) {
            az4Var2.A(j05Var.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void g(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof j05)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.o(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.A(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        j05 j05Var = (j05) list;
        if (!z7) {
            while (i8 < j05Var.size()) {
                this.f6136a.o(i7, j05Var.R(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < j05Var.size(); i12++) {
            j05Var.R(i12);
            i11 += 8;
        }
        az4Var2.x(i11);
        while (i8 < j05Var.size()) {
            az4Var2.A(j05Var.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void h(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f6136a.o(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        az4 az4Var = this.f6136a;
        az4Var.i(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        az4Var.x(i9);
        while (i8 < list.size()) {
            az4Var.A(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void i(int i7, double d8) {
        this.f6136a.o(i7, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void j(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof j05)) {
            if (!z7) {
                while (i8 < list.size()) {
                    az4 az4Var = this.f6136a;
                    long longValue = ((Long) list.get(i8)).longValue();
                    az4Var.m(i7, (longValue >> 63) ^ (longValue + longValue));
                    i8++;
                }
                return;
            }
            az4 az4Var2 = this.f6136a;
            az4Var2.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += az4.c((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            az4Var2.x(i9);
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                az4Var2.z((longValue3 >> 63) ^ (longValue3 + longValue3));
                i8++;
            }
            return;
        }
        j05 j05Var = (j05) list;
        if (!z7) {
            while (i8 < j05Var.size()) {
                az4 az4Var3 = this.f6136a;
                long R = j05Var.R(i8);
                az4Var3.m(i7, (R >> 63) ^ (R + R));
                i8++;
            }
            return;
        }
        az4 az4Var4 = this.f6136a;
        az4Var4.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < j05Var.size(); i12++) {
            long R2 = j05Var.R(i12);
            i11 += az4.c((R2 >> 63) ^ (R2 + R2));
        }
        az4Var4.x(i11);
        while (i8 < j05Var.size()) {
            long R3 = j05Var.R(i8);
            az4Var4.z((R3 >> 63) ^ (R3 + R3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void k(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f6136a.p(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        az4 az4Var = this.f6136a;
        az4Var.i(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        az4Var.x(i9);
        while (i8 < list.size()) {
            az4Var.v(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void l(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof j05)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.m(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += az4.c(((Long) list.get(i10)).longValue());
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.z(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        j05 j05Var = (j05) list;
        if (!z7) {
            while (i8 < j05Var.size()) {
                this.f6136a.m(i7, j05Var.R(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < j05Var.size(); i12++) {
            i11 += az4.c(j05Var.R(i12));
        }
        az4Var2.x(i11);
        while (i8 < j05Var.size()) {
            az4Var2.z(j05Var.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void m(int i7, int i8) {
        this.f6136a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void n(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof tz4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.y(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        tz4 tz4Var = (tz4) list;
        if (!z7) {
            while (i8 < tz4Var.size()) {
                this.f6136a.l(i7, tz4Var.g(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < tz4Var.size(); i12++) {
            tz4Var.g(i12);
            i11 += 4;
        }
        az4Var2.x(i11);
        while (i8 < tz4Var.size()) {
            az4Var2.y(tz4Var.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void o(int i7, long j7) {
        this.f6136a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void p(int i7, long j7) {
        this.f6136a.m(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void q(int i7) {
        this.f6136a.i(i7, 3);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void r(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof tz4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f6136a.k(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            az4 az4Var = this.f6136a;
            az4Var.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += az4.b(((Integer) list.get(i10)).intValue());
            }
            az4Var.x(i9);
            while (i8 < list.size()) {
                az4Var.x(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        tz4 tz4Var = (tz4) list;
        if (!z7) {
            while (i8 < tz4Var.size()) {
                this.f6136a.k(i7, tz4Var.g(i8));
                i8++;
            }
            return;
        }
        az4 az4Var2 = this.f6136a;
        az4Var2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < tz4Var.size(); i12++) {
            i11 += az4.b(tz4Var.g(i12));
        }
        az4Var2.x(i11);
        while (i8 < tz4Var.size()) {
            az4Var2.x(tz4Var.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void s(int i7) {
        this.f6136a.i(i7, 4);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void t(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f6136a.r(i7, (qy4) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void u(int i7, String str) {
        this.f6136a.q(i7, str);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void v(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f6136a.l(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        az4 az4Var = this.f6136a;
        az4Var.i(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        az4Var.x(i9);
        while (i8 < list.size()) {
            az4Var.y(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void w(int i7, int i8) {
        this.f6136a.k(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void x(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f6136a.q(i7, (String) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void y(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof tz4)) {
            if (!z7) {
                while (i8 < list.size()) {
                    az4 az4Var = this.f6136a;
                    int intValue = ((Integer) list.get(i8)).intValue();
                    az4Var.k(i7, (intValue >> 31) ^ (intValue + intValue));
                    i8++;
                }
                return;
            }
            az4 az4Var2 = this.f6136a;
            az4Var2.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += az4.b((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            az4Var2.x(i9);
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                az4Var2.x((intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
            return;
        }
        tz4 tz4Var = (tz4) list;
        if (!z7) {
            while (i8 < tz4Var.size()) {
                az4 az4Var3 = this.f6136a;
                int g8 = tz4Var.g(i8);
                az4Var3.k(i7, (g8 >> 31) ^ (g8 + g8));
                i8++;
            }
            return;
        }
        az4 az4Var4 = this.f6136a;
        az4Var4.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < tz4Var.size(); i12++) {
            int g9 = tz4Var.g(i12);
            i11 += az4.b((g9 >> 31) ^ (g9 + g9));
        }
        az4Var4.x(i11);
        while (i8 < tz4Var.size()) {
            int g10 = tz4Var.g(i8);
            az4Var4.x((g10 >> 31) ^ (g10 + g10));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n25
    public final void z(int i7, int i8) {
        this.f6136a.j(i7, i8);
    }
}
