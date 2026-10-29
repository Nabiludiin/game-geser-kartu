package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public abstract class qg {
    public static long a(ByteBuffer byteBuffer) {
        long j7 = byteBuffer.getInt();
        return j7 < 0 ? j7 + 4294967296L : j7;
    }

    public static int b(ByteBuffer byteBuffer) {
        return (c(byteBuffer.get()) << 8) + c(byteBuffer.get());
    }

    public static int c(byte b8) {
        return b8 < 0 ? b8 + 256 : b8;
    }

    public static long d(ByteBuffer byteBuffer) {
        long a8 = a(byteBuffer) << 32;
        if (a8 >= 0) {
            return a8 + a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double e(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 65536.0d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & (-16777216)) | ((r0[1] << 16) & 16711680)) | (65280 & (r0[2] << 8))) | (r0[3] & 255)) / 1.073741824E9d;
    }
}
