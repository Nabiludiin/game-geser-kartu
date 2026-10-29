package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class xh4 {

    /* renamed from: a, reason: collision with root package name */
    public static final hw4 f18842a = hw4.a(new byte[0]);

    public static final hw4 a(int i7) {
        return hw4.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i7).array());
    }

    public static final hw4 b(int i7) {
        return hw4.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i7).array());
    }
}
