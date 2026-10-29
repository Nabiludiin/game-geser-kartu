package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MyApplication */
public abstract class or0 implements nq0 {

    /* renamed from: b, reason: collision with root package name */
    protected jn0 f13450b;

    /* renamed from: c, reason: collision with root package name */
    protected jn0 f13451c;

    /* renamed from: d, reason: collision with root package name */
    private jn0 f13452d;

    /* renamed from: e, reason: collision with root package name */
    private jn0 f13453e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f13454f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f13455g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13456h;

    public or0() {
        ByteBuffer byteBuffer = nq0.f12841a;
        this.f13454f = byteBuffer;
        this.f13455g = byteBuffer;
        jn0 jn0Var = jn0.f10652e;
        this.f13452d = jn0Var;
        this.f13453e = jn0Var;
        this.f13450b = jn0Var;
        this.f13451c = jn0Var;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public /* synthetic */ long K(long j7) {
        return mq0.a(this, j7);
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void b(ko0 ko0Var) {
        this.f13455g = nq0.f12841a;
        this.f13456h = false;
        this.f13450b = this.f13452d;
        this.f13451c = this.f13453e;
        m();
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void c() {
        this.f13456h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public boolean d() {
        return this.f13453e != jn0.f10652e;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f13455g;
        this.f13455g = nq0.f12841a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public boolean f() {
        return this.f13456h && this.f13455g == nq0.f12841a;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final jn0 g(jn0 jn0Var) {
        this.f13452d = jn0Var;
        this.f13453e = k(jn0Var);
        return d() ? this.f13453e : jn0.f10652e;
    }

    protected final ByteBuffer h(int i7) {
        if (this.f13454f.capacity() < i7) {
            this.f13454f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f13454f.clear();
        }
        ByteBuffer byteBuffer = this.f13454f;
        this.f13455g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final void i() {
        ByteBuffer byteBuffer = nq0.f12841a;
        this.f13455g = byteBuffer;
        this.f13456h = false;
        this.f13454f = byteBuffer;
        jn0 jn0Var = jn0.f10652e;
        this.f13452d = jn0Var;
        this.f13453e = jn0Var;
        this.f13450b = jn0Var;
        this.f13451c = jn0Var;
        n();
    }

    protected final boolean j() {
        return this.f13455g.hasRemaining();
    }

    protected abstract jn0 k(jn0 jn0Var);

    protected void l() {
    }

    protected void m() {
    }

    protected void n() {
    }
}
