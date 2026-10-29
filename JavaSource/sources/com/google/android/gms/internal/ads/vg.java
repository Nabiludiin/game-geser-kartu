package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class vg extends t75 {
    public vg(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.t75
    public final void c(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
