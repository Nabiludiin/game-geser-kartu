package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: MyApplication */
final class gd5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8815a;

    /* renamed from: b, reason: collision with root package name */
    private Object f8816b;

    /* renamed from: c, reason: collision with root package name */
    private int f8817c;

    /* renamed from: d, reason: collision with root package name */
    private int f8818d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8819e;

    /* renamed from: f, reason: collision with root package name */
    private long f8820f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ id5 f8821g;

    public gd5(id5 id5Var, int i7) {
        Objects.requireNonNull(id5Var);
        this.f8821g = id5Var;
        this.f8815a = i7;
    }

    public final void a() {
        long r7;
        id5 id5Var = this.f8821g;
        az m7 = id5Var.p().m();
        Object f8 = m7.g() ? null : m7.f(id5Var.p().w());
        mr p7 = id5Var.p();
        mr p8 = id5Var.p();
        mr p9 = id5Var.p();
        int E = p7.E();
        int x7 = p8.x();
        long t7 = p9.t();
        if (f8 == null || E != -1) {
            r7 = E != -1 ? id5Var.p().r() : -9223372036854775807L;
        } else {
            m7.o(f8, id5Var.Q());
            t7 -= hi2.M(0L);
            r7 = hi2.M(id5Var.Q().f13478d);
            E = -1;
        }
        boolean a8 = id5Var.p().a();
        if (!a8 || r7 == -9223372036854775807L || t7 < r7) {
            id5Var.V().P(3);
            if (a8 && r7 != -9223372036854775807L) {
                id5Var.V().d(3, (int) Math.ceil((r7 - t7) / id5Var.p().o().f19630a));
            }
            this.f8819e = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8819e && Objects.equals(f8, this.f8816b) && E == this.f8817c && x7 == this.f8818d) {
            long j7 = elapsedRealtime - this.f8820f;
            int i7 = this.f8815a;
            if (j7 >= i7) {
                id5Var.D().a(new jd5(3, i7));
                return;
            }
            return;
        }
        this.f8819e = true;
        this.f8820f = elapsedRealtime;
        this.f8816b = f8;
        this.f8817c = E;
        this.f8818d = x7;
        id5Var.V().P(3);
        id5Var.V().d(3, this.f8815a);
    }
}
