package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: MyApplication */
public final class st0 implements nq0 {

    /* renamed from: b, reason: collision with root package name */
    private int f15799b;

    /* renamed from: c, reason: collision with root package name */
    private float f15800c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f15801d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private jn0 f15802e;

    /* renamed from: f, reason: collision with root package name */
    private jn0 f15803f;

    /* renamed from: g, reason: collision with root package name */
    private jn0 f15804g;

    /* renamed from: h, reason: collision with root package name */
    private jn0 f15805h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15806i;

    /* renamed from: j, reason: collision with root package name */
    private ps0 f15807j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f15808k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f15809l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f15810m;

    /* renamed from: n, reason: collision with root package name */
    private long f15811n;

    /* renamed from: o, reason: collision with root package name */
    private long f15812o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15813p;

    public st0() {
        jn0 jn0Var = jn0.f10652e;
        this.f15802e = jn0Var;
        this.f15803f = jn0Var;
        this.f15804g = jn0Var;
        this.f15805h = jn0Var;
        ByteBuffer byteBuffer = nq0.f12841a;
        this.f15808k = byteBuffer;
        this.f15809l = byteBuffer.asShortBuffer();
        this.f15810m = byteBuffer;
        this.f15799b = -1;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final long K(long j7) {
        long j8 = this.f15812o;
        if (j8 < 1024) {
            return (long) (j7 / this.f15800c);
        }
        long j9 = this.f15811n;
        this.f15807j.getClass();
        long a8 = j9 - r4.a();
        int i7 = this.f15805h.f10653a;
        int i8 = this.f15804g.f10653a;
        return i7 == i8 ? hi2.Q(j7, j8, a8, RoundingMode.DOWN) : hi2.Q(j7, j8 * i8, a8 * i7, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ps0 ps0Var = this.f15807j;
            ps0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f15811n += remaining;
            ps0Var.b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void b(ko0 ko0Var) {
        if (d()) {
            jn0 jn0Var = this.f15802e;
            this.f15804g = jn0Var;
            jn0 jn0Var2 = this.f15803f;
            this.f15805h = jn0Var2;
            if (this.f15806i) {
                this.f15807j = new ps0(jn0Var.f10653a, jn0Var.f10654b, this.f15800c, this.f15801d, jn0Var2.f10653a);
            } else {
                ps0 ps0Var = this.f15807j;
                if (ps0Var != null) {
                    ps0Var.e();
                }
            }
        }
        this.f15810m = nq0.f12841a;
        this.f15811n = 0L;
        this.f15812o = 0L;
        this.f15813p = false;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void c() {
        ps0 ps0Var = this.f15807j;
        if (ps0Var != null) {
            ps0Var.d();
        }
        this.f15813p = true;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final boolean d() {
        if (this.f15803f.f10653a != -1) {
            return Math.abs(this.f15800c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f15801d + (-1.0f)) >= 1.0E-4f || this.f15803f.f10653a != this.f15802e.f10653a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final ByteBuffer e() {
        int f8;
        ps0 ps0Var = this.f15807j;
        if (ps0Var != null && (f8 = ps0Var.f()) > 0) {
            if (this.f15808k.capacity() < f8) {
                ByteBuffer order = ByteBuffer.allocateDirect(f8).order(ByteOrder.nativeOrder());
                this.f15808k = order;
                this.f15809l = order.asShortBuffer();
            } else {
                this.f15808k.clear();
                this.f15809l.clear();
            }
            ps0Var.c(this.f15809l);
            this.f15812o += f8;
            this.f15808k.limit(f8);
            this.f15810m = this.f15808k;
        }
        ByteBuffer byteBuffer = this.f15810m;
        this.f15810m = nq0.f12841a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final boolean f() {
        if (!this.f15813p) {
            return false;
        }
        ps0 ps0Var = this.f15807j;
        return ps0Var == null || ps0Var.f() == 0;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final jn0 g(jn0 jn0Var) {
        if (jn0Var.f10655c != 2) {
            throw new lp0("Unhandled input format:", jn0Var);
        }
        int i7 = this.f15799b;
        if (i7 == -1) {
            i7 = jn0Var.f10653a;
        }
        this.f15802e = jn0Var;
        jn0 jn0Var2 = new jn0(i7, jn0Var.f10654b, 2);
        this.f15803f = jn0Var2;
        this.f15806i = true;
        return jn0Var2;
    }

    public final void h(float f8) {
        rx3.a(f8 > 0.0f);
        if (this.f15800c != f8) {
            this.f15800c = f8;
            this.f15806i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void i() {
        this.f15800c = 1.0f;
        this.f15801d = 1.0f;
        jn0 jn0Var = jn0.f10652e;
        this.f15802e = jn0Var;
        this.f15803f = jn0Var;
        this.f15804g = jn0Var;
        this.f15805h = jn0Var;
        ByteBuffer byteBuffer = nq0.f12841a;
        this.f15808k = byteBuffer;
        this.f15809l = byteBuffer.asShortBuffer();
        this.f15810m = byteBuffer;
        this.f15799b = -1;
        this.f15806i = false;
        this.f15807j = null;
        this.f15811n = 0L;
        this.f15812o = 0L;
        this.f15813p = false;
    }

    public final void j(float f8) {
        rx3.a(f8 > 0.0f);
        if (this.f15801d != f8) {
            this.f15801d = f8;
            this.f15806i = true;
        }
    }

    public final long k(long j7) {
        long j8 = this.f15812o;
        if (j8 < 1024) {
            return (long) (this.f15800c * j7);
        }
        long j9 = this.f15811n;
        this.f15807j.getClass();
        long a8 = j9 - r2.a();
        int i7 = this.f15805h.f10653a;
        int i8 = this.f15804g.f10653a;
        return i7 == i8 ? hi2.Q(j7, a8, j8, RoundingMode.DOWN) : hi2.Q(j7, a8 * i7, j8 * i8, RoundingMode.DOWN);
    }
}
