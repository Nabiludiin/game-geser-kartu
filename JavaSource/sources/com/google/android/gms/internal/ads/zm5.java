package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
final class zm5 extends wj4 {

    /* renamed from: i, reason: collision with root package name */
    private long f20228i;

    /* renamed from: j, reason: collision with root package name */
    private int f20229j;

    /* renamed from: k, reason: collision with root package name */
    private int f20230k;

    public zm5() {
        super(2, 0);
        this.f20230k = 32;
    }

    @Override // com.google.android.gms.internal.ads.wj4, com.google.android.gms.internal.ads.oe4
    public final void a() {
        super.a();
        this.f20229j = 0;
    }

    public final void n(int i7) {
        this.f20230k = i7;
    }

    public final long o() {
        return this.f20228i;
    }

    public final int p() {
        return this.f20229j;
    }

    public final boolean q() {
        return this.f20229j > 0;
    }

    public final boolean r(wj4 wj4Var) {
        ByteBuffer byteBuffer;
        rx3.a(!wj4Var.i(1073741824));
        rx3.a(!wj4Var.i(268435456));
        rx3.a(!wj4Var.i(4));
        if (q()) {
            if (this.f20229j >= this.f20230k) {
                return false;
            }
            ByteBuffer byteBuffer2 = wj4Var.f18271d;
            if (byteBuffer2 != null && (byteBuffer = this.f18271d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i7 = this.f20229j;
        this.f20229j = i7 + 1;
        if (i7 == 0) {
            this.f18273f = wj4Var.f18273f;
            if (wj4Var.i(1)) {
                g(1);
            }
        }
        ByteBuffer byteBuffer3 = wj4Var.f18271d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f18271d.put(byteBuffer3);
        }
        this.f20228i = wj4Var.f18273f;
        return true;
    }
}
