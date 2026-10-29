package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p3.c;

/* compiled from: MyApplication */
final class uc3 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final od3 f16695a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16696b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16697c;

    /* renamed from: d, reason: collision with root package name */
    private final mq f16698d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedBlockingQueue f16699e;

    /* renamed from: f, reason: collision with root package name */
    private final HandlerThread f16700f;

    /* renamed from: g, reason: collision with root package name */
    private final lc3 f16701g;

    /* renamed from: h, reason: collision with root package name */
    private final long f16702h;

    public uc3(Context context, int i7, mq mqVar, String str, String str2, String str3, lc3 lc3Var) {
        this.f16696b = str;
        this.f16698d = mqVar;
        this.f16697c = str2;
        this.f16701g = lc3Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f16700f = handlerThread;
        handlerThread.start();
        this.f16702h = System.currentTimeMillis();
        od3 od3Var = new od3(context, handlerThread.getLooper(), this, this, 19621000);
        this.f16695a = od3Var;
        this.f16699e = new LinkedBlockingQueue();
        od3Var.v();
    }

    private final void e(int i7, long j7, Exception exc) {
        lc3 lc3Var = this.f16701g;
        if (lc3Var != null) {
            lc3Var.c(i7, System.currentTimeMillis() - j7, exc);
        }
    }

    @Override // p3.c.a
    public final void O(int i7) {
        try {
            e(4011, this.f16702h, null);
            this.f16699e.put(new be3(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
        try {
            e(4012, this.f16702h, null);
            this.f16699e.put(new be3(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final be3 b(int i7) {
        be3 be3Var;
        try {
            be3Var = (be3) this.f16699e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            e(2009, this.f16702h, e8);
            be3Var = null;
        }
        e(3004, this.f16702h, null);
        if (be3Var != null) {
            if (be3Var.f5736s == 7) {
                lc3.g(3);
            } else {
                lc3.g(2);
            }
        }
        return be3Var == null ? new be3(null, 1) : be3Var;
    }

    public final void c() {
        od3 od3Var = this.f16695a;
        if (od3Var != null) {
            if (od3Var.a() || od3Var.f()) {
                od3Var.h();
            }
        }
    }

    protected final td3 d() {
        try {
            return this.f16695a.o0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        td3 d8 = d();
        if (d8 != null) {
            try {
                be3 v32 = d8.v3(new zd3(1, this.f16698d, this.f16696b, this.f16697c));
                e(5011, this.f16702h, null);
                this.f16699e.put(v32);
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
