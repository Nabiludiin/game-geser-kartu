package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: MyApplication */
final class gc5 {

    /* renamed from: u, reason: collision with root package name */
    private static final xp5 f8792u = new xp5(new Object(), -1);

    /* renamed from: a, reason: collision with root package name */
    public final az f8793a;

    /* renamed from: b, reason: collision with root package name */
    public final xp5 f8794b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8795c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8796d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8797e;

    /* renamed from: f, reason: collision with root package name */
    public final b45 f8798f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8799g;

    /* renamed from: h, reason: collision with root package name */
    public final as5 f8800h;

    /* renamed from: i, reason: collision with root package name */
    public final hu5 f8801i;

    /* renamed from: j, reason: collision with root package name */
    public final List f8802j;

    /* renamed from: k, reason: collision with root package name */
    public final xp5 f8803k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8804l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8805m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8806n;

    /* renamed from: o, reason: collision with root package name */
    public final yk f8807o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8808p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f8809q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f8810r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f8811s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f8812t;

    public gc5(az azVar, xp5 xp5Var, long j7, long j8, int i7, b45 b45Var, boolean z7, as5 as5Var, hu5 hu5Var, List list, xp5 xp5Var2, boolean z8, int i8, int i9, yk ykVar, long j9, long j10, long j11, long j12, boolean z9) {
        this.f8793a = azVar;
        this.f8794b = xp5Var;
        this.f8795c = j7;
        this.f8796d = j8;
        this.f8797e = i7;
        this.f8798f = b45Var;
        this.f8799g = z7;
        this.f8800h = as5Var;
        this.f8801i = hu5Var;
        this.f8802j = list;
        this.f8803k = xp5Var2;
        this.f8804l = z8;
        this.f8805m = i8;
        this.f8806n = i9;
        this.f8807o = ykVar;
        this.f8809q = j9;
        this.f8810r = j10;
        this.f8811s = j11;
        this.f8812t = j12;
    }

    public static gc5 a(hu5 hu5Var) {
        az azVar = az.f5406a;
        xp5 xp5Var = f8792u;
        return new gc5(azVar, xp5Var, -9223372036854775807L, 0L, 1, null, false, as5.f5277d, hu5Var, w04.m(), xp5Var, false, 1, 0, yk.f19629d, 0L, 0L, 0L, 0L, false);
    }

    public static xp5 b() {
        return f8792u;
    }

    public final gc5 c(xp5 xp5Var, long j7, long j8, long j9, long j10, as5 as5Var, hu5 hu5Var, List list) {
        xp5 xp5Var2 = this.f8803k;
        boolean z7 = this.f8804l;
        int i7 = this.f8805m;
        int i8 = this.f8806n;
        yk ykVar = this.f8807o;
        long j11 = this.f8809q;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new gc5(this.f8793a, xp5Var, j8, j9, this.f8797e, this.f8798f, this.f8799g, as5Var, hu5Var, list, xp5Var2, z7, i7, i8, ykVar, j11, j10, j7, elapsedRealtime, false);
    }

    public final gc5 d(az azVar) {
        return new gc5(azVar, this.f8794b, this.f8795c, this.f8796d, this.f8797e, this.f8798f, this.f8799g, this.f8800h, this.f8801i, this.f8802j, this.f8803k, this.f8804l, this.f8805m, this.f8806n, this.f8807o, this.f8809q, this.f8810r, this.f8811s, this.f8812t, false);
    }

    public final gc5 e(int i7) {
        return new gc5(this.f8793a, this.f8794b, this.f8795c, this.f8796d, i7, this.f8798f, this.f8799g, this.f8800h, this.f8801i, this.f8802j, this.f8803k, this.f8804l, this.f8805m, this.f8806n, this.f8807o, this.f8809q, this.f8810r, this.f8811s, this.f8812t, false);
    }

    public final gc5 f(b45 b45Var) {
        return new gc5(this.f8793a, this.f8794b, this.f8795c, this.f8796d, this.f8797e, b45Var, this.f8799g, this.f8800h, this.f8801i, this.f8802j, this.f8803k, this.f8804l, this.f8805m, this.f8806n, this.f8807o, this.f8809q, this.f8810r, this.f8811s, this.f8812t, false);
    }

    public final gc5 g(boolean z7) {
        return new gc5(this.f8793a, this.f8794b, this.f8795c, this.f8796d, this.f8797e, this.f8798f, z7, this.f8800h, this.f8801i, this.f8802j, this.f8803k, this.f8804l, this.f8805m, this.f8806n, this.f8807o, this.f8809q, this.f8810r, this.f8811s, this.f8812t, false);
    }

    public final gc5 h(xp5 xp5Var) {
        return new gc5(this.f8793a, this.f8794b, this.f8795c, this.f8796d, this.f8797e, this.f8798f, this.f8799g, this.f8800h, this.f8801i, this.f8802j, xp5Var, this.f8804l, this.f8805m, this.f8806n, this.f8807o, this.f8809q, this.f8810r, this.f8811s, this.f8812t, false);
    }

    public final gc5 i(boolean z7, int i7, int i8) {
        return new gc5(this.f8793a, this.f8794b, this.f8795c, this.f8796d, this.f8797e, this.f8798f, this.f8799g, this.f8800h, this.f8801i, this.f8802j, this.f8803k, z7, i7, i8, this.f8807o, this.f8809q, this.f8810r, this.f8811s, this.f8812t, false);
    }

    public final boolean j() {
        return this.f8797e == 3 && this.f8804l && this.f8806n == 0;
    }
}
