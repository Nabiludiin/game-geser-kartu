package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: MyApplication */
public final class sg1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f15602a;

    public sg1(pd1 pd1Var) {
    }

    public final synchronized boolean a() {
        if (this.f15602a) {
            return false;
        }
        this.f15602a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z7;
        z7 = this.f15602a;
        this.f15602a = false;
        return z7;
    }

    public final synchronized void c() {
        while (!this.f15602a) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z7 = false;
        while (!this.f15602a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e(long j7) {
        if (j7 > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j8 = j7 + elapsedRealtime;
                if (j8 < elapsedRealtime) {
                    d();
                } else {
                    boolean z7 = false;
                    while (!this.f15602a && elapsedRealtime < j8) {
                        try {
                            wait(j8 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z7 = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15602a;
    }

    public final synchronized boolean f() {
        return this.f15602a;
    }
}
