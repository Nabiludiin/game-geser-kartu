package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: MyApplication */
final class ed5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7570a;

    /* renamed from: b, reason: collision with root package name */
    private Object f7571b;

    /* renamed from: c, reason: collision with root package name */
    private int f7572c;

    /* renamed from: d, reason: collision with root package name */
    private int f7573d;

    /* renamed from: e, reason: collision with root package name */
    private long f7574e;

    /* renamed from: f, reason: collision with root package name */
    private long f7575f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7576g;

    /* renamed from: h, reason: collision with root package name */
    private long f7577h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ id5 f7578i;

    public ed5(id5 id5Var, int i7) {
        Objects.requireNonNull(id5Var);
        this.f7578i = id5Var;
        this.f7570a = i7;
    }

    public final void a() {
        id5 id5Var = this.f7578i;
        if (id5Var.p().g() != 2 || !id5Var.p().l() || id5Var.p().j() != 0) {
            if (this.f7576g) {
                id5Var.V().P(1);
            }
            this.f7576g = false;
            return;
        }
        az m7 = id5Var.p().m();
        Object f8 = m7.g() ? null : m7.f(id5Var.p().w());
        mr p7 = id5Var.p();
        mr p8 = id5Var.p();
        mr p9 = id5Var.p();
        mr p10 = id5Var.p();
        int E = p7.E();
        int x7 = p8.x();
        long z7 = p9.z();
        long max = Math.max(0L, id5Var.p().G() - Math.max(0L, z7 - p10.t()));
        if (f8 != null && E == -1) {
            m7.o(f8, id5Var.Q());
            z7 -= hi2.M(0L);
            E = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f7576g && Objects.equals(f8, this.f7571b) && E == this.f7572c && x7 == this.f7573d && z7 == this.f7574e && max == this.f7575f) {
            long j7 = elapsedRealtime - this.f7577h;
            int i7 = this.f7570a;
            if (j7 >= i7) {
                id5Var.D().a(new jd5(1, i7));
                return;
            }
            return;
        }
        this.f7576g = true;
        this.f7577h = elapsedRealtime;
        this.f7571b = f8;
        this.f7572c = E;
        this.f7573d = x7;
        this.f7574e = z7;
        this.f7575f = max;
        id5Var.V().P(1);
        id5Var.V().d(1, this.f7570a);
    }
}
