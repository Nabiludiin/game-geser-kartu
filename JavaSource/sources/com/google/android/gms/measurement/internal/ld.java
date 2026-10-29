package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class ld {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.measurement.u6 f22339a;

    /* renamed from: b, reason: collision with root package name */
    List f22340b;

    /* renamed from: c, reason: collision with root package name */
    List f22341c;

    /* renamed from: d, reason: collision with root package name */
    long f22342d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ pd f22343e;

    /* synthetic */ ld(pd pdVar, byte[] bArr) {
        Objects.requireNonNull(pdVar);
        this.f22343e = pdVar;
    }

    private static final long b(com.google.android.gms.internal.measurement.i6 i6Var) {
        return ((i6Var.K() / 1000) / 60) / 60;
    }

    public final boolean a(long j7, com.google.android.gms.internal.measurement.i6 i6Var) {
        p3.o.m(i6Var);
        if (this.f22341c == null) {
            this.f22341c = new ArrayList();
        }
        if (this.f22340b == null) {
            this.f22340b = new ArrayList();
        }
        if (!this.f22341c.isEmpty() && b((com.google.android.gms.internal.measurement.i6) this.f22341c.get(0)) != b(i6Var)) {
            return false;
        }
        long a8 = this.f22342d + i6Var.a();
        pd pdVar = this.f22343e;
        if (!pdVar.B0().H(null, c5.f21947e1)) {
            pdVar.B0();
            if (a8 >= m.o()) {
                return false;
            }
        } else if (!this.f22341c.isEmpty()) {
            pdVar.B0();
            if (a8 >= m.o()) {
                return false;
            }
        }
        this.f22342d = a8;
        this.f22341c.add(i6Var);
        this.f22340b.add(Long.valueOf(j7));
        int size = this.f22341c.size();
        pdVar.B0();
        return size < Math.max(1, ((Integer) c5.f21963k.b(null)).intValue());
    }
}
