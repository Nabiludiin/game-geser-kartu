package com.google.android.gms.internal.ads;

import android.util.Range;

/* compiled from: MyApplication */
final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private long f9268a;

    /* renamed from: b, reason: collision with root package name */
    private long f9269b;

    /* renamed from: c, reason: collision with root package name */
    private double f9270c;

    /* renamed from: d, reason: collision with root package name */
    private Range f9271d;

    public h0(float f8) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.f9271d = range;
        this.f9270c = ((Double) range.getUpper()).doubleValue();
        this.f9268a = -9223372036854775807L;
        this.f9269b = -9223372036854775807L;
    }

    public final void a(long j7, long j8) {
        double doubleValue;
        rx3.a(j7 != -9223372036854775807L);
        rx3.a(j8 != -9223372036854775807L);
        long j9 = this.f9268a;
        if (j9 != -9223372036854775807L) {
            if (this.f9269b != -9223372036854775807L && j7 != j9) {
                doubleValue = (j8 - r4) / (j7 - j9);
                this.f9270c = (this.f9270c * 0.800000011920929d) + (((Double) this.f9271d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
                this.f9268a = j7;
                this.f9269b = j8;
            }
        }
        doubleValue = ((Double) this.f9271d.getUpper()).doubleValue();
        this.f9270c = (this.f9270c * 0.800000011920929d) + (((Double) this.f9271d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d);
        this.f9268a = j7;
        this.f9269b = j8;
    }

    public final long b(long j7) {
        if (this.f9268a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f9269b + ((j7 - r0) * this.f9270c));
    }

    public final void c(float f8) {
        rx3.a(f8 > 0.0f);
        this.f9271d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f8));
        d();
    }

    public final void d() {
        this.f9270c = ((Double) this.f9271d.getUpper()).doubleValue();
        this.f9268a = -9223372036854775807L;
        this.f9269b = -9223372036854775807L;
    }
}
