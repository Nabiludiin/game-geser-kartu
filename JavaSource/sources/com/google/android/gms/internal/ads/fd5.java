package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: MyApplication */
final class fd5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8203a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8204b;

    /* renamed from: c, reason: collision with root package name */
    private int f8205c;

    /* renamed from: d, reason: collision with root package name */
    private int f8206d;

    /* renamed from: e, reason: collision with root package name */
    private long f8207e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8208f;

    /* renamed from: g, reason: collision with root package name */
    private long f8209g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ id5 f8210h;

    public fd5(id5 id5Var, int i7) {
        Objects.requireNonNull(id5Var);
        this.f8210h = id5Var;
        this.f8203a = i7;
    }

    public final void a() {
        id5 id5Var = this.f8210h;
        if (!id5Var.p().a()) {
            if (this.f8208f) {
                id5Var.V().P(2);
            }
            this.f8208f = false;
            return;
        }
        az m7 = id5Var.p().m();
        Object f8 = m7.g() ? null : m7.f(id5Var.p().w());
        mr p7 = id5Var.p();
        mr p8 = id5Var.p();
        mr p9 = id5Var.p();
        int E = p7.E();
        int x7 = p8.x();
        long t7 = p9.t();
        if (f8 != null && E == -1) {
            m7.o(f8, id5Var.Q());
            t7 -= hi2.M(0L);
            E = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8208f && Objects.equals(f8, this.f8204b) && E == this.f8205c && x7 == this.f8206d && t7 == this.f8207e) {
            long j7 = elapsedRealtime - this.f8209g;
            int i7 = this.f8203a;
            if (j7 >= i7) {
                id5Var.D().a(new jd5(2, i7));
                return;
            }
            return;
        }
        this.f8208f = true;
        this.f8209g = elapsedRealtime;
        this.f8204b = f8;
        this.f8205c = E;
        this.f8206d = x7;
        this.f8207e = t7;
        id5Var.V().P(2);
        id5Var.V().d(2, this.f8203a);
    }
}
