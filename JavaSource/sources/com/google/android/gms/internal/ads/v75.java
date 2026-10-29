package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class v75 extends t75 implements rg {

    /* renamed from: y, reason: collision with root package name */
    private int f17417y;

    protected v75(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.f16023r) {
            d();
        }
        return this.f17417y;
    }

    protected final long g(ByteBuffer byteBuffer) {
        this.f17417y = qg.c(byteBuffer.get());
        qg.b(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
