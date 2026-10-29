package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: MyApplication */
final class hd5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9452a;

    /* renamed from: b, reason: collision with root package name */
    private int f9453b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9454c;

    /* renamed from: d, reason: collision with root package name */
    private long f9455d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ id5 f9456e;

    public hd5(id5 id5Var, int i7) {
        Objects.requireNonNull(id5Var);
        this.f9456e = id5Var;
        this.f9452a = i7;
    }

    public final void a() {
        id5 id5Var = this.f9456e;
        int j7 = id5Var.p().j();
        if (!id5Var.p().l() || id5Var.p().g() == 1 || id5Var.p().g() == 4 || j7 == 0 || j7 == 1) {
            if (this.f9454c) {
                id5Var.V().P(4);
            }
            this.f9454c = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f9454c && this.f9453b == j7) {
            long j8 = elapsedRealtime - this.f9455d;
            int i7 = this.f9452a;
            if (j8 >= i7) {
                id5Var.D().a(new jd5(4, i7));
                return;
            }
            return;
        }
        this.f9454c = true;
        this.f9455d = elapsedRealtime;
        this.f9453b = j7;
        id5Var.V().P(4);
        id5Var.V().d(4, this.f9452a);
    }
}
