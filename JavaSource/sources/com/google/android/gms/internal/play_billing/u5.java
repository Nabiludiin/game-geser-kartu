package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class u5 extends v5 {
    u5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final double a(Object obj, long j7) {
        return Double.longBitsToDouble(this.f21761a.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final float b(Object obj, long j7) {
        return Float.intBitsToFloat(this.f21761a.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final void c(Object obj, long j7, boolean z7) {
        if (w5.f21775h) {
            w5.d(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            w5.e(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final void d(Object obj, long j7, byte b8) {
        if (w5.f21775h) {
            w5.d(obj, j7, b8);
        } else {
            w5.e(obj, j7, b8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final void e(Object obj, long j7, double d8) {
        this.f21761a.putLong(obj, j7, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final void f(Object obj, long j7, float f8) {
        this.f21761a.putInt(obj, j7, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final boolean g(Object obj, long j7) {
        return w5.f21775h ? w5.y(obj, j7) : w5.z(obj, j7);
    }
}
