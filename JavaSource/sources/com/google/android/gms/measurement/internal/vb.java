package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class vb extends e5 {

    /* renamed from: c, reason: collision with root package name */
    private final pb f22747c;

    /* renamed from: d, reason: collision with root package name */
    private t4.d f22748d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f22749e;

    /* renamed from: f, reason: collision with root package name */
    private final x f22750f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f22751g;

    /* renamed from: h, reason: collision with root package name */
    private final qc f22752h;

    /* renamed from: i, reason: collision with root package name */
    private final List f22753i;

    /* renamed from: j, reason: collision with root package name */
    private final x f22754j;

    protected vb(w6 w6Var) {
        super(w6Var);
        this.f22753i = new ArrayList();
        this.f22752h = new qc(w6Var.f());
        this.f22747c = new pb(this);
        this.f22750f = new va(this, w6Var);
        this.f22754j = new za(this, w6Var);
    }

    private final boolean R() {
        this.f22928a.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f22752h.a();
        this.f22928a.w();
        this.f22750f.b(((Long) c5.Z.b(null)).longValue());
    }

    private final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f22753i;
        long size = list.size();
        w6 w6Var = this.f22928a;
        w6Var.w();
        if (size >= 1000) {
            w6Var.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f22754j.b(60000L);
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        n5 w7 = this.f22928a.a().w();
        List list = this.f22753i;
        w7.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e8) {
                this.f22928a.a().o().b("Task exception while flushing queue", e8);
            }
        }
        this.f22753i.clear();
        this.f22754j.d();
    }

    private final ae V(boolean z7) {
        Pair b8;
        w6 w6Var = this.f22928a;
        w6Var.c();
        f5 L = this.f22928a.L();
        String str = null;
        if (z7) {
            w6 w6Var2 = w6Var.a().f22928a;
            if (w6Var2.x().f22025e != null && (b8 = w6Var2.x().f22025e.b()) != null && b8 != d6.A) {
                String valueOf = String.valueOf(b8.second);
                String str2 = (String) b8.first;
                StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return L.o(str);
    }

    public final void A() {
        h();
        j();
        pb pbVar = this.f22747c;
        pbVar.c();
        try {
            s3.a.b().c(this.f22928a.e(), pbVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f22748d = null;
    }

    public final void B(com.google.android.gms.internal.measurement.y1 y1Var, g0 g0Var, String str) {
        h();
        j();
        w6 w6Var = this.f22928a;
        if (w6Var.C().X(k3.k.f24503a) == 0) {
            T(new ya(this, g0Var, str, y1Var));
        } else {
            w6Var.a().r().a("Not bundling data. Service unavailable or out of date");
            w6Var.C().d0(y1Var, new byte[0]);
        }
    }

    final boolean C() {
        h();
        j();
        return !y() || this.f22928a.C().W() >= ((Integer) c5.K0.b(null)).intValue();
    }

    final boolean D() {
        h();
        j();
        return !y() || this.f22928a.C().W() >= 241200;
    }

    final /* synthetic */ void E() {
        t4.d dVar = this.f22748d;
        if (dVar == null) {
            this.f22928a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            ae V = V(false);
            p3.o.m(V);
            dVar.M3(V);
            J();
        } catch (RemoteException e8) {
            this.f22928a.a().o().b("Failed to send storage consent settings to the service", e8);
        }
    }

    final /* synthetic */ void F() {
        t4.d dVar = this.f22748d;
        if (dVar == null) {
            this.f22928a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            ae V = V(false);
            p3.o.m(V);
            dVar.x4(V);
            J();
        } catch (RemoteException e8) {
            this.f22928a.a().o().b("Failed to send Dma consent settings to the service", e8);
        }
    }

    final /* synthetic */ void G(AtomicReference atomicReference, ae aeVar, Bundle bundle) {
        t4.d dVar;
        synchronized (atomicReference) {
            try {
                dVar = this.f22748d;
            } catch (RemoteException e8) {
                this.f22928a.a().o().b("Failed to request trigger URIs; remote exception", e8);
                atomicReference.notifyAll();
            }
            if (dVar == null) {
                this.f22928a.a().o().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            p3.o.m(aeVar);
            dVar.w1(aeVar, bundle, new na(this, atomicReference));
            J();
        }
    }

    final /* synthetic */ void H(AtomicReference atomicReference, ae aeVar, t4.n0 n0Var) {
        t4.d dVar;
        synchronized (atomicReference) {
            try {
                dVar = this.f22748d;
            } catch (RemoteException e8) {
                this.f22928a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e8);
                atomicReference.notifyAll();
            }
            if (dVar == null) {
                this.f22928a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            p3.o.m(aeVar);
            dVar.y7(aeVar, n0Var, new oa(this, atomicReference));
            J();
        }
    }

    final /* synthetic */ void I(ae aeVar, g gVar) {
        t4.d dVar = this.f22748d;
        if (dVar == null) {
            this.f22928a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            dVar.G4(aeVar, gVar);
            J();
        } catch (RemoteException e8) {
            this.f22928a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(gVar.f22157q), e8);
        }
    }

    final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f22748d != null) {
            this.f22748d = null;
            this.f22928a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    final /* synthetic */ pb M() {
        return this.f22747c;
    }

    final /* synthetic */ t4.d N() {
        return this.f22748d;
    }

    final /* synthetic */ void O(t4.d dVar) {
        this.f22748d = null;
    }

    final /* synthetic */ ScheduledExecutorService P() {
        return this.f22751g;
    }

    final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f22751g = scheduledExecutorService;
    }

    public final boolean W() {
        h();
        j();
        return this.f22748d != null;
    }

    protected final void X() {
        h();
        j();
        T(new ab(this, V(true)));
    }

    protected final void Y(boolean z7) {
        h();
        j();
        if (C()) {
            T(new bb(this, V(false)));
        }
    }

    protected final void Z(boolean z7) {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.ub
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vb.this.E();
            }
        });
    }

    protected final void a0() {
        h();
        j();
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.qb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vb.this.F();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b0(t4.d r59, q3.a r60, com.google.android.gms.measurement.internal.ae r61) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.vb.b0(t4.d, q3.a, com.google.android.gms.measurement.internal.ae):void");
    }

    protected final void c0(g0 g0Var, String str) {
        p3.o.m(g0Var);
        h();
        j();
        R();
        T(new cb(this, true, V(true), this.f22928a.E().p(g0Var), g0Var, str));
    }

    protected final void d0(i iVar) {
        p3.o.m(iVar);
        h();
        j();
        this.f22928a.c();
        T(new db(this, true, V(true), this.f22928a.E().r(iVar), new i(iVar), iVar));
    }

    protected final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new eb(this, atomicReference, null, str2, str3, V(false)));
    }

    protected final void f0(com.google.android.gms.internal.measurement.y1 y1Var, String str, String str2) {
        h();
        j();
        T(new fb(this, str, str2, V(false), y1Var));
    }

    protected final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z7) {
        h();
        j();
        T(new gb(this, atomicReference, null, str2, str3, V(false), z7));
    }

    protected final void h0(com.google.android.gms.internal.measurement.y1 y1Var, String str, String str2, boolean z7) {
        h();
        j();
        T(new ma(this, str, str2, V(false), z7, y1Var));
    }

    protected final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final ae V = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.rb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vb.this.G(atomicReference, V, bundle);
            }
        });
    }

    protected final void j0(final AtomicReference atomicReference, final t4.n0 n0Var) {
        h();
        j();
        final ae V = V(false);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.sb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vb.this.H(atomicReference, V, n0Var);
            }
        });
    }

    protected final void k0(final g gVar) {
        h();
        j();
        final ae V = V(true);
        p3.o.m(V);
        T(new Runnable() { // from class: com.google.android.gms.measurement.internal.tb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                vb.this.I(V, gVar);
            }
        });
    }

    protected final t4.a l0() {
        h();
        j();
        t4.d dVar = this.f22748d;
        if (dVar == null) {
            w();
            this.f22928a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        ae V = V(false);
        p3.o.m(V);
        try {
            t4.a n52 = dVar.n5(V);
            J();
            return n52;
        } catch (RemoteException e8) {
            this.f22928a.a().o().b("Failed to get consents; remote exception", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.e5
    protected final boolean m() {
        return false;
    }

    protected final void o(ud udVar) {
        h();
        j();
        R();
        T(new pa(this, V(true), this.f22928a.E().q(udVar), udVar));
    }

    protected final void p() {
        h();
        j();
        ae V = V(false);
        R();
        this.f22928a.E().o();
        T(new qa(this, V));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new ra(this, atomicReference, V(false)));
    }

    public final void r(com.google.android.gms.internal.measurement.y1 y1Var) {
        h();
        j();
        T(new sa(this, V(false), y1Var));
    }

    protected final void s() {
        h();
        j();
        ae V = V(true);
        R();
        this.f22928a.w().H(null, c5.f21941c1);
        this.f22928a.E().u();
        T(new ta(this, V, true));
    }

    protected final void t() {
        h();
        j();
        T(new ua(this, V(true)));
    }

    protected final void u(da daVar) {
        h();
        j();
        T(new wa(this, daVar));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        e0 e0Var = new e0(bundle);
        R();
        T(new xa(this, true, V(false), this.f22928a.w().H(null, c5.f21941c1) && this.f22928a.E().s(e0Var), e0Var, bundle));
    }

    final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f22747c.d();
            return;
        }
        w6 w6Var = this.f22928a;
        if (w6Var.w().m()) {
            return;
        }
        w6Var.c();
        List<ResolveInfo> queryIntentServices = w6Var.e().getPackageManager().queryIntentServices(new Intent().setClassName(w6Var.e(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            w6Var.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context e8 = w6Var.e();
        w6Var.c();
        intent.setComponent(new ComponentName(e8, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f22747c.b(intent);
    }

    final Boolean x() {
        return this.f22749e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean y() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.vb.y():boolean");
    }

    protected final void z(t4.d dVar) {
        h();
        p3.o.m(dVar);
        this.f22748d = dVar;
        J();
        L();
    }
}
