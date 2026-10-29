package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private long f7364a;

    /* renamed from: b, reason: collision with root package name */
    private long f7365b;

    /* renamed from: c, reason: collision with root package name */
    private long f7366c;

    /* renamed from: d, reason: collision with root package name */
    private long f7367d;

    /* renamed from: e, reason: collision with root package name */
    private long f7368e;

    /* renamed from: f, reason: collision with root package name */
    private long f7369f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f7370g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f7371h;

    public final void a() {
        this.f7367d = 0L;
        this.f7368e = 0L;
        this.f7369f = 0L;
        this.f7371h = 0;
        Arrays.fill(this.f7370g, false);
    }

    public final boolean b() {
        return this.f7367d > 15 && this.f7371h == 0;
    }

    public final boolean c() {
        long j7 = this.f7367d;
        if (j7 == 0) {
            return false;
        }
        return this.f7370g[(int) ((j7 - 1) % 15)];
    }

    public final long d() {
        return this.f7369f;
    }

    public final long e() {
        long j7 = this.f7368e;
        if (j7 == 0) {
            return 0L;
        }
        return this.f7369f / j7;
    }

    public final void f(long j7) {
        long j8 = this.f7367d;
        if (j8 == 0) {
            this.f7364a = j7;
        } else if (j8 == 1) {
            long j9 = j7 - this.f7364a;
            this.f7365b = j9;
            this.f7369f = j9;
            this.f7368e = 1L;
        } else {
            long j10 = j7 - this.f7366c;
            int i7 = (int) (j8 % 15);
            if (Math.abs(j10 - this.f7365b) <= 1000000) {
                this.f7368e++;
                this.f7369f += j10;
                boolean[] zArr = this.f7370g;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f7371h--;
                }
            } else {
                boolean[] zArr2 = this.f7370g;
                if (!zArr2[i7]) {
                    zArr2[i7] = true;
                    this.f7371h++;
                }
            }
        }
        this.f7367d++;
        this.f7366c = j7;
    }
}
