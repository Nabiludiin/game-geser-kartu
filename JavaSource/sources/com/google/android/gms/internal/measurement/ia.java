package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class ia implements gd {

    /* renamed from: a, reason: collision with root package name */
    private final ha f21040a;

    private ia(ha haVar) {
        byte[] bArr = eb.f20914b;
        this.f21040a = haVar;
        haVar.f21006a = this;
    }

    public static ia K(ha haVar) {
        ia iaVar = haVar.f21006a;
        return iaVar != null ? iaVar : new ia(haVar);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void A(int i7, int i8) {
        this.f21040a.k(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void B(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof ya)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.y(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z7) {
            while (i8 < yaVar.size()) {
                this.f21040a.l(i7, yaVar.g(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < yaVar.size(); i12++) {
            yaVar.g(i12);
            i11 += 4;
        }
        haVar2.x(i11);
        while (i8 < yaVar.size()) {
            haVar2.y(yaVar.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void C(int i7, boolean z7) {
        this.f21040a.o(i7, z7);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void D(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof ya)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.j(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += ha.a(((Integer) list.get(i10)).intValue());
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z7) {
            while (i8 < yaVar.size()) {
                this.f21040a.j(i7, yaVar.g(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < yaVar.size(); i12++) {
            i11 += ha.a(yaVar.g(i12));
        }
        haVar2.x(i11);
        while (i8 < yaVar.size()) {
            haVar2.w(yaVar.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void E(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof ya)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.j(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += ha.a(((Integer) list.get(i10)).intValue());
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.w(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z7) {
            while (i8 < yaVar.size()) {
                this.f21040a.j(i7, yaVar.g(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < yaVar.size(); i12++) {
            i11 += ha.a(yaVar.g(i12));
        }
        haVar2.x(i11);
        while (i8 < yaVar.size()) {
            haVar2.w(yaVar.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void F(int i7, float f8) {
        this.f21040a.l(i7, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void G(int i7, ca caVar) {
        this.f21040a.q(i7, caVar);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void H(int i7, pb pbVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            haVar.x(qb.c(pbVar, entry.getKey(), entry.getValue()));
            qb.b(haVar, pbVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void I(int i7, Object obj, ic icVar) {
        this.f21040a.t(i7, (xb) obj, icVar);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void J(int i7, Object obj, ic icVar) {
        ha haVar = this.f21040a;
        haVar.i(i7, 3);
        icVar.d((xb) obj, haVar.f21006a);
        haVar.i(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void a(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof lb)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.m(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += ha.a(((Long) list.get(i10)).longValue());
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.z(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z7) {
            while (i8 < lbVar.size()) {
                this.f21040a.m(i7, lbVar.R(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < lbVar.size(); i12++) {
            i11 += ha.a(lbVar.R(i12));
        }
        haVar2.x(i11);
        while (i8 < lbVar.size()) {
            haVar2.z(lbVar.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void b(int i7, int i8) {
        this.f21040a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void b0(int i7, long j7) {
        this.f21040a.n(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void c(int i7, long j7) {
        this.f21040a.n(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void d(int i7, int i8) {
        this.f21040a.j(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void e(int i7, long j7) {
        this.f21040a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void f(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof lb)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.n(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.A(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z7) {
            while (i8 < lbVar.size()) {
                this.f21040a.n(i7, lbVar.R(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < lbVar.size(); i12++) {
            lbVar.R(i12);
            i11 += 8;
        }
        haVar2.x(i11);
        while (i8 < lbVar.size()) {
            haVar2.A(lbVar.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void g(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof lb)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.n(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.A(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z7) {
            while (i8 < lbVar.size()) {
                this.f21040a.n(i7, lbVar.R(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < lbVar.size(); i12++) {
            lbVar.R(i12);
            i11 += 8;
        }
        haVar2.x(i11);
        while (i8 < lbVar.size()) {
            haVar2.A(lbVar.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void h(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21040a.n(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        ha haVar = this.f21040a;
        haVar.i(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        haVar.x(i9);
        while (i8 < list.size()) {
            haVar.A(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void i(int i7, double d8) {
        this.f21040a.n(i7, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void j(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof lb)) {
            if (!z7) {
                while (i8 < list.size()) {
                    ha haVar = this.f21040a;
                    long longValue = ((Long) list.get(i8)).longValue();
                    haVar.m(i7, (longValue >> 63) ^ (longValue + longValue));
                    i8++;
                }
                return;
            }
            ha haVar2 = this.f21040a;
            haVar2.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += ha.a((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            haVar2.x(i9);
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                haVar2.z((longValue3 >> 63) ^ (longValue3 + longValue3));
                i8++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z7) {
            while (i8 < lbVar.size()) {
                ha haVar3 = this.f21040a;
                long R = lbVar.R(i8);
                haVar3.m(i7, (R >> 63) ^ (R + R));
                i8++;
            }
            return;
        }
        ha haVar4 = this.f21040a;
        haVar4.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < lbVar.size(); i12++) {
            long R2 = lbVar.R(i12);
            i11 += ha.a((R2 >> 63) ^ (R2 + R2));
        }
        haVar4.x(i11);
        while (i8 < lbVar.size()) {
            long R3 = lbVar.R(i8);
            haVar4.z((R3 >> 63) ^ (R3 + R3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void k(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21040a.o(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        ha haVar = this.f21040a;
        haVar.i(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        haVar.x(i9);
        while (i8 < list.size()) {
            haVar.v(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void l(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof lb)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.m(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += ha.a(((Long) list.get(i10)).longValue());
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.z(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z7) {
            while (i8 < lbVar.size()) {
                this.f21040a.m(i7, lbVar.R(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < lbVar.size(); i12++) {
            i11 += ha.a(lbVar.R(i12));
        }
        haVar2.x(i11);
        while (i8 < lbVar.size()) {
            haVar2.z(lbVar.R(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void m(int i7, int i8) {
        this.f21040a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void n(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof ya)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.y(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z7) {
            while (i8 < yaVar.size()) {
                this.f21040a.l(i7, yaVar.g(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < yaVar.size(); i12++) {
            yaVar.g(i12);
            i11 += 4;
        }
        haVar2.x(i11);
        while (i8 < yaVar.size()) {
            haVar2.y(yaVar.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void o(int i7, long j7) {
        this.f21040a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void p(int i7, long j7) {
        this.f21040a.m(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void q(int i7) {
        this.f21040a.i(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void r(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof ya)) {
            if (!z7) {
                while (i8 < list.size()) {
                    this.f21040a.k(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            ha haVar = this.f21040a;
            haVar.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += ha.E(((Integer) list.get(i10)).intValue());
            }
            haVar.x(i9);
            while (i8 < list.size()) {
                haVar.x(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z7) {
            while (i8 < yaVar.size()) {
                this.f21040a.k(i7, yaVar.g(i8));
                i8++;
            }
            return;
        }
        ha haVar2 = this.f21040a;
        haVar2.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < yaVar.size(); i12++) {
            i11 += ha.E(yaVar.g(i12));
        }
        haVar2.x(i11);
        while (i8 < yaVar.size()) {
            haVar2.x(yaVar.g(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void s(int i7) {
        this.f21040a.i(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void t(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f21040a.q(i7, (ca) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void u(int i7, String str) {
        this.f21040a.p(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void v(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!z7) {
            while (i8 < list.size()) {
                this.f21040a.l(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        ha haVar = this.f21040a;
        haVar.i(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        haVar.x(i9);
        while (i8 < list.size()) {
            haVar.y(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void w(int i7, int i8) {
        this.f21040a.k(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void x(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f21040a.p(i7, (String) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void y(int i7, List list, boolean z7) {
        int i8 = 0;
        if (!(list instanceof ya)) {
            if (!z7) {
                while (i8 < list.size()) {
                    ha haVar = this.f21040a;
                    int intValue = ((Integer) list.get(i8)).intValue();
                    haVar.k(i7, (intValue >> 31) ^ (intValue + intValue));
                    i8++;
                }
                return;
            }
            ha haVar2 = this.f21040a;
            haVar2.i(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += ha.E((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            haVar2.x(i9);
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                haVar2.x((intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z7) {
            while (i8 < yaVar.size()) {
                ha haVar3 = this.f21040a;
                int g8 = yaVar.g(i8);
                haVar3.k(i7, (g8 >> 31) ^ (g8 + g8));
                i8++;
            }
            return;
        }
        ha haVar4 = this.f21040a;
        haVar4.i(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < yaVar.size(); i12++) {
            int g9 = yaVar.g(i12);
            i11 += ha.E((g9 >> 31) ^ (g9 + g9));
        }
        haVar4.x(i11);
        while (i8 < yaVar.size()) {
            int g10 = yaVar.g(i8);
            haVar4.x((g10 >> 31) ^ (g10 + g10));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.gd
    public final void z(int i7, int i8) {
        this.f21040a.j(i7, i8);
    }
}
