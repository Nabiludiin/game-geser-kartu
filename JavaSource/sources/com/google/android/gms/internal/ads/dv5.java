package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* compiled from: MyApplication */
public final class dv5 {

    /* renamed from: d, reason: collision with root package name */
    public static final xu5 f7330d = new xu5(2, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final xu5 f7331e = new xu5(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    private final kv5 f7332a = jv5.a(hi2.C("ExoPlayer:Loader:ProgressiveMediaPeriod"), wu5.f18437a);

    /* renamed from: b, reason: collision with root package name */
    private yu5 f7333b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f7334c;

    public dv5(String str) {
    }

    public static xu5 a(boolean z7, long j7) {
        return new xu5(z7 ? 1 : 0, j7, null);
    }

    public final boolean b() {
        return this.f7334c != null;
    }

    public final void c() {
        this.f7334c = null;
    }

    public final long d(zu5 zu5Var, vu5 vu5Var, int i7) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.f7334c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new yu5(this, myLooper, zu5Var, vu5Var, i7, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }

    public final boolean e() {
        return this.f7333b != null;
    }

    public final void f() {
        yu5 yu5Var = this.f7333b;
        yu5Var.getClass();
        yu5Var.c(false);
    }

    public final void g(av5 av5Var) {
        yu5 yu5Var = this.f7333b;
        if (yu5Var != null) {
            yu5Var.c(true);
        }
        kv5 kv5Var = this.f7332a;
        kv5Var.execute(new bv5(av5Var));
        kv5Var.a();
    }

    public final void h(int i7) {
        IOException iOException = this.f7334c;
        if (iOException != null) {
            throw iOException;
        }
        yu5 yu5Var = this.f7333b;
        if (yu5Var != null) {
            yu5Var.a(i7);
        }
    }

    final /* synthetic */ kv5 i() {
        return this.f7332a;
    }

    final /* synthetic */ yu5 j() {
        return this.f7333b;
    }

    final /* synthetic */ void k(yu5 yu5Var) {
        this.f7333b = yu5Var;
    }

    final /* synthetic */ void l(IOException iOException) {
        this.f7334c = iOException;
    }
}
