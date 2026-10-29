package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public class wj4 extends oe4 {

    /* renamed from: b, reason: collision with root package name */
    public eq5 f18269b;

    /* renamed from: c, reason: collision with root package name */
    public final tg4 f18270c = new tg4();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f18271d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18272e;

    /* renamed from: f, reason: collision with root package name */
    public long f18273f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f18274g;

    /* renamed from: h, reason: collision with root package name */
    private final int f18275h;

    static {
        ka.b("media3.decoder");
    }

    public wj4(int i7, int i8) {
        this.f18275h = i7;
    }

    private final ByteBuffer m(int i7) {
        int i8 = this.f18275h;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f18271d;
        throw new vi4(byteBuffer == null ? 0 : byteBuffer.capacity(), i7);
    }

    @Override // com.google.android.gms.internal.ads.oe4
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f18271d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18274g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18272e = false;
    }

    public final void j(int i7) {
        ByteBuffer byteBuffer = this.f18271d;
        if (byteBuffer == null) {
            this.f18271d = m(i7);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i8 = i7 + position;
        if (capacity >= i8) {
            this.f18271d = byteBuffer;
            return;
        }
        ByteBuffer m7 = m(i8);
        m7.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m7.put(byteBuffer);
        }
        this.f18271d = m7;
    }

    public final boolean k() {
        return i(1073741824);
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f18271d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18274g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
