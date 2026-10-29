package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l3.a;

/* compiled from: MyApplication */
public abstract class a extends BasePendingResult implements m3.d {

    /* renamed from: o, reason: collision with root package name */
    private final a.c f4439o;

    /* renamed from: p, reason: collision with root package name */
    private final l3.a f4440p;

    protected a(a.c cVar, l3.f fVar) {
        super((l3.f) p3.o.n(fVar, "GoogleApiClient must not be null"));
        this.f4439o = (a.c) p3.o.m(cVar);
        this.f4440p = null;
    }

    private void w(RemoteException remoteException) {
        a(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    @Override // m3.d
    public final void a(Status status) {
        p3.o.b(!status.Q0(), "Failed result must not be success");
        l3.j f8 = f(status);
        j(f8);
        u(f8);
    }

    @Override // m3.d
    public /* bridge */ /* synthetic */ void b(Object obj) {
        super.j((l3.j) obj);
    }

    protected abstract void r(a.b bVar);

    public final l3.a s() {
        return this.f4440p;
    }

    public final a.c t() {
        return this.f4439o;
    }

    public final void v(a.b bVar) {
        try {
            r(bVar);
        } catch (DeadObjectException e8) {
            w(e8);
            throw e8;
        } catch (RemoteException e9) {
            w(e9);
        }
    }

    protected void u(l3.j jVar) {
    }
}
