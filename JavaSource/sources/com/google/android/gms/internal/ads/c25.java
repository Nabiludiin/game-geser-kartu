package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class c25 extends e25 {
    c25(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final void a(Object obj, long j7, byte b8) {
        if (f25.f7997i) {
            f25.g(obj, j7, b8);
        } else {
            f25.h(obj, j7, b8);
        }
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final boolean b(Object obj, long j7) {
        return f25.f7997i ? f25.F(obj, j7) : f25.G(obj, j7);
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final void c(Object obj, long j7, boolean z7) {
        if (f25.f7997i) {
            f25.g(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            f25.h(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final float d(Object obj, long j7) {
        return Float.intBitsToFloat(this.f7405a.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final void e(Object obj, long j7, float f8) {
        this.f7405a.putInt(obj, j7, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final double f(Object obj, long j7) {
        return Double.longBitsToDouble(this.f7405a.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final void g(Object obj, long j7, double d8) {
        this.f7405a.putLong(obj, j7, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final byte h(long j7) {
        return Memory.peekByte((int) j7);
    }

    @Override // com.google.android.gms.internal.ads.e25
    public final void i(long j7, byte[] bArr, long j8, long j9) {
        Memory.peekByteArray((int) j7, bArr, (int) j8, (int) j9);
    }
}
