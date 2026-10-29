package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class xc extends zc {
    xc(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void a(Object obj, long j7, byte b8) {
        if (ad.f20823h) {
            ad.d(obj, j7, b8);
        } else {
            ad.e(obj, j7, b8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final boolean b(Object obj, long j7) {
        return ad.f20823h ? ad.z(obj, j7) : ad.A(obj, j7);
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void c(Object obj, long j7, boolean z7) {
        if (ad.f20823h) {
            ad.d(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            ad.e(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final float d(Object obj, long j7) {
        return Float.intBitsToFloat(this.f21465a.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void e(Object obj, long j7, float f8) {
        this.f21465a.putInt(obj, j7, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final double f(Object obj, long j7) {
        return Double.longBitsToDouble(this.f21465a.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.measurement.zc
    public final void g(Object obj, long j7, double d8) {
        this.f21465a.putLong(obj, j7, Double.doubleToLongBits(d8));
    }
}
