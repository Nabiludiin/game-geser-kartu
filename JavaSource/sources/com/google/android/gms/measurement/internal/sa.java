package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class sa implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ae f22624q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22625r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ vb f22626s;

    sa(vb vbVar, ae aeVar, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22624q = aeVar;
        this.f22625r = y1Var;
        Objects.requireNonNull(vbVar);
        this.f22626s = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.y1 y1Var;
        yd C;
        vb vbVar;
        w6 w6Var;
        String str = null;
        try {
            try {
                vbVar = this.f22626s;
                w6Var = vbVar.f22928a;
            } catch (RemoteException e8) {
                this.f22626s.f22928a.a().o().b("Failed to get app instance id", e8);
            }
            if (w6Var.x().w().o(t4.v.ANALYTICS_STORAGE)) {
                t4.d N = vbVar.N();
                if (N != null) {
                    ae aeVar = this.f22624q;
                    p3.o.m(aeVar);
                    str = N.o7(aeVar);
                    if (str != null) {
                        vbVar.f22928a.B().E(str);
                        w6Var.x().f22028h.b(str);
                    }
                    vbVar.J();
                    vb vbVar2 = this.f22626s;
                    y1Var = this.f22625r;
                    C = vbVar2.f22928a.C();
                    C.a0(y1Var, str);
                }
                w6Var.a().o().a("Failed to get app instance id");
            } else {
                w6Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                vbVar.f22928a.B().E(null);
                w6Var.x().f22028h.b(null);
            }
            C = w6Var.C();
            y1Var = this.f22625r;
            C.a0(y1Var, str);
        } catch (Throwable th) {
            vb vbVar3 = this.f22626s;
            vbVar3.f22928a.C().a0(this.f22625r, null);
            throw th;
        }
    }
}
