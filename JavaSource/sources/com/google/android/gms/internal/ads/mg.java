package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
final class mg extends ThreadLocal {
    mg(ng ngVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
