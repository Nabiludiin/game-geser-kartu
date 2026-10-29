package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f21782a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21783b;

    /* renamed from: c, reason: collision with root package name */
    private long f21784c;

    /* renamed from: d, reason: collision with root package name */
    private long f21785d;

    y(b0 b0Var) {
        w.c(b0Var, "ticker");
        this.f21782a = b0Var;
    }

    public static y b(b0 b0Var) {
        y yVar = new y(b0Var);
        yVar.e();
        return yVar;
    }

    public static y c(b0 b0Var) {
        return new y(b0Var);
    }

    private final long h() {
        return this.f21783b ? (this.f21782a.a() - this.f21785d) + this.f21784c : this.f21784c;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final y d() {
        this.f21784c = 0L;
        this.f21783b = false;
        return this;
    }

    public final y e() {
        w.e(!this.f21783b, "This stopwatch is already running.");
        this.f21783b = true;
        this.f21785d = this.f21782a.a();
        return this;
    }

    public final y f() {
        long a8 = this.f21782a.a();
        w.e(this.f21783b, "This stopwatch is already stopped.");
        this.f21783b = false;
        this.f21784c += a8 - this.f21785d;
        return this;
    }

    public final boolean g() {
        return this.f21783b;
    }

    public final String toString() {
        String str;
        long h8 = h();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(h8, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(h8, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(h8, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(h8, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(h8, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(h8, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(h8 / timeUnit2.convert(1L, timeUnit)));
        switch (x.f21776a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return format + " " + str;
    }
}
