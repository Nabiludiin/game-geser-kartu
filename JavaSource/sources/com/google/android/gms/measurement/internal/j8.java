package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* compiled from: MyApplication */
final class j8 implements a5.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rc f22268a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w9 f22269b;

    j8(w9 w9Var, rc rcVar) {
        this.f22268a = rcVar;
        Objects.requireNonNull(w9Var);
        this.f22269b = w9Var;
    }

    private final void c() {
        w6 w6Var = this.f22269b.f22928a;
        SparseArray r7 = w6Var.x().r();
        rc rcVar = this.f22268a;
        r7.put(rcVar.f22582s, Long.valueOf(rcVar.f22581r));
        d6 x7 = w6Var.x();
        int[] iArr = new int[r7.size()];
        long[] jArr = new long[r7.size()];
        for (int i7 = 0; i7 < r7.size(); i7++) {
            iArr[i7] = r7.keyAt(i7);
            jArr[i7] = ((Long) r7.valueAt(i7)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        x7.f22035o.b(bundle);
    }

    @Override // a5.a
    public final void a(Object obj) {
        w9 w9Var = this.f22269b;
        w9Var.h();
        c();
        w9Var.Z(false);
        w9Var.b0(1);
        w9Var.f22928a.a().v().b("Successfully registered trigger URI", this.f22268a.f22580q);
        w9Var.x0();
    }

    @Override // a5.a
    public final void b(Throwable th) {
        w9 w9Var = this.f22269b;
        w9Var.h();
        w9Var.Z(false);
        w6 w6Var = w9Var.f22928a;
        int d02 = (w6Var.w().H(null, c5.U0) ? w9Var.d0(th) : 2) - 1;
        if (d02 == 0) {
            w6Var.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", p5.x(w9Var.f22928a.L().q()), p5.x(th.toString()));
            w9Var.b0(1);
            w9Var.w0().add(this.f22268a);
            return;
        }
        if (d02 != 1) {
            w6Var.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", p5.x(w9Var.f22928a.L().q()), th);
            c();
            w9Var.b0(1);
            w9Var.x0();
            return;
        }
        w9Var.w0().add(this.f22268a);
        if (w9Var.a0() > ((Integer) c5.f21992x0.b(null)).intValue()) {
            w9Var.b0(1);
            w6Var.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", p5.x(w9Var.f22928a.L().q()), p5.x(th.toString()));
        } else {
            w6Var.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", p5.x(w9Var.f22928a.L().q()), p5.x(String.valueOf(w9Var.a0())), p5.x(th.toString()));
            w9Var.V(w9Var.a0());
            int a02 = w9Var.a0();
            w9Var.b0(a02 + a02);
        }
    }
}
