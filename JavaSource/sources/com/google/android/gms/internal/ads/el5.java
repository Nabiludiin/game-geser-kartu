package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: MyApplication */
final class el5 {

    /* renamed from: a, reason: collision with root package name */
    private Exception f7697a;

    /* renamed from: b, reason: collision with root package name */
    private long f7698b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    private long f7699c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f7697a == null) {
            this.f7697a = exc;
        }
        if (this.f7698b == -9223372036854775807L && !sl5.B()) {
            this.f7698b = 200 + elapsedRealtime;
        }
        long j7 = this.f7698b;
        if (j7 == -9223372036854775807L || elapsedRealtime < j7) {
            this.f7699c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f7697a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f7697a;
        c();
        throw exc3;
    }

    public final boolean b() {
        if (this.f7697a == null) {
            return false;
        }
        return sl5.B() || SystemClock.elapsedRealtime() < this.f7699c;
    }

    public final void c() {
        this.f7697a = null;
        this.f7698b = -9223372036854775807L;
        this.f7699c = -9223372036854775807L;
    }
}
