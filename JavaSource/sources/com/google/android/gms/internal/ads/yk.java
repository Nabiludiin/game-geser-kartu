package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: MyApplication */
public final class yk {

    /* renamed from: d, reason: collision with root package name */
    public static final yk f19629d = new yk(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f19630a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19631b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19632c;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public yk(float f8, float f9) {
        rx3.a(f8 > 0.0f);
        rx3.a(f9 > 0.0f);
        this.f19630a = f8;
        this.f19631b = f9;
        this.f19632c = Math.round(f8 * 1000.0f);
    }

    public final long a(long j7) {
        return j7 * this.f19632c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yk.class == obj.getClass()) {
            yk ykVar = (yk) obj;
            if (this.f19630a == ykVar.f19630a && this.f19631b == ykVar.f19631b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f19630a) + 527) * 31) + Float.floatToRawIntBits(this.f19631b);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f19630a), Float.valueOf(this.f19631b)};
        String str = hi2.f9535a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
