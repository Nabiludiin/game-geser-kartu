package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
public final class pb implements ServiceConnection, c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f22483a;

    /* renamed from: b, reason: collision with root package name */
    private volatile j5 f22484b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vb f22485c;

    protected pb(vb vbVar) {
        Objects.requireNonNull(vbVar);
        this.f22485c = vbVar;
    }

    @Override // p3.c.a
    public final void O(int i7) {
        w6 w6Var = this.f22485c.f22928a;
        w6Var.b().o();
        w6Var.a().v().a("Service connection suspended");
        w6Var.b().t(new lb(this));
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
        vb vbVar = this.f22485c;
        vbVar.f22928a.b().o();
        p5 y7 = vbVar.f22928a.y();
        if (y7 != null) {
            y7.w().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f22483a = false;
            this.f22484b = null;
        }
        this.f22485c.f22928a.b().t(new ob(this, bVar));
    }

    public final void b(Intent intent) {
        vb vbVar = this.f22485c;
        vbVar.h();
        Context e8 = vbVar.f22928a.e();
        s3.a b8 = s3.a.b();
        synchronized (this) {
            try {
                if (this.f22483a) {
                    this.f22485c.f22928a.a().w().a("Connection attempt already in progress");
                    return;
                }
                vb vbVar2 = this.f22485c;
                vbVar2.f22928a.a().w().a("Using local app measurement service");
                this.f22483a = true;
                b8.a(e8, intent, vbVar2.M(), 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f22484b != null && (this.f22484b.a() || this.f22484b.f())) {
            this.f22484b.h();
        }
        this.f22484b = null;
    }

    public final void d() {
        vb vbVar = this.f22485c;
        vbVar.h();
        Context e8 = vbVar.f22928a.e();
        synchronized (this) {
            try {
                if (this.f22483a) {
                    this.f22485c.f22928a.a().w().a("Connection attempt already in progress");
                    return;
                }
                if (this.f22484b != null && (this.f22484b.f() || this.f22484b.a())) {
                    this.f22485c.f22928a.a().w().a("Already awaiting connection attempt");
                    return;
                }
                this.f22484b = new j5(e8, Looper.getMainLooper(), this, this);
                this.f22485c.f22928a.a().w().a("Connecting to remote service");
                this.f22483a = true;
                p3.o.m(this.f22484b);
                this.f22484b.v();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void e(boolean z7) {
        this.f22483a = false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22485c.f22928a.b().o();
        synchronized (this) {
            if (iBinder == null) {
                this.f22483a = false;
                this.f22485c.f22928a.a().o().a("Service connected with null binder");
                return;
            }
            t4.d dVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    dVar = queryLocalInterface instanceof t4.d ? (t4.d) queryLocalInterface : new d5(iBinder);
                    this.f22485c.f22928a.a().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f22485c.f22928a.a().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f22485c.f22928a.a().o().a("Service connect failed to get IMeasurementService");
            }
            if (dVar == null) {
                this.f22483a = false;
                try {
                    s3.a b8 = s3.a.b();
                    vb vbVar = this.f22485c;
                    b8.c(vbVar.f22928a.e(), vbVar.M());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f22485c.f22928a.b().t(new hb(this, dVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        w6 w6Var = this.f22485c.f22928a;
        w6Var.b().o();
        w6Var.a().v().a("Service disconnected");
        w6Var.b().t(new ib(this, componentName));
    }

    @Override // p3.c.a
    public final void r0(Bundle bundle) {
        this.f22485c.f22928a.b().o();
        synchronized (this) {
            try {
                p3.o.m(this.f22484b);
                this.f22485c.f22928a.b().t(new kb(this, (t4.d) this.f22484b.I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f22484b = null;
                this.f22483a = false;
            }
        }
    }
}
