package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p3.c;

/* compiled from: MyApplication */
final class rc3 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final od3 f14843a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14844b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14845c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f14846d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f14847e;

    public rc3(Context context, String str, String str2) {
        this.f14844b = str;
        this.f14845c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f14847e = handlerThread;
        handlerThread.start();
        od3 od3Var = new od3(context, handlerThread.getLooper(), this, this, 9200000);
        this.f14843a = od3Var;
        this.f14846d = new LinkedBlockingQueue();
        od3Var.v();
    }

    static xk d() {
        ak g12 = xk.g1();
        g12.z0(32768L);
        return (xk) g12.A();
    }

    @Override // p3.c.a
    public final void O(int i7) {
        try {
            this.f14846d.put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
        try {
            this.f14846d.put(d());
        } catch (InterruptedException unused) {
        }
    }

    public final xk b(int i7) {
        xk xkVar;
        try {
            xkVar = (xk) this.f14846d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            xkVar = null;
        }
        return xkVar == null ? d() : xkVar;
    }

    public final void c() {
        od3 od3Var = this.f14843a;
        if (od3Var != null) {
            if (od3Var.a() || od3Var.f()) {
                od3Var.h();
            }
        }
    }

    protected final td3 e() {
        try {
            return this.f14843a.o0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        td3 e8 = e();
        if (e8 != null) {
            try {
                try {
                    this.f14846d.put(e8.D2(new pd3(this.f14844b, this.f14845c)).M0());
                } catch (Throwable unused) {
                    this.f14846d.put(d());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                c();
                this.f14847e.quit();
                throw th;
            }
            c();
            this.f14847e.quit();
        }
    }
}
