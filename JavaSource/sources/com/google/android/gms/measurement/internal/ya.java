package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class ya implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ g0 f22898q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22899r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22900s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ vb f22901t;

    ya(vb vbVar, g0 g0Var, String str, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22898q = g0Var;
        this.f22899r = str;
        this.f22900s = y1Var;
        Objects.requireNonNull(vbVar);
        this.f22901t = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.y1 y1Var;
        yd C;
        vb vbVar;
        t4.d N;
        byte[] bArr = null;
        try {
            try {
                vbVar = this.f22901t;
                N = vbVar.N();
            } catch (RemoteException e8) {
                this.f22901t.f22928a.a().o().b("Failed to send event to the service to bundle", e8);
            }
            if (N == null) {
                w6 w6Var = vbVar.f22928a;
                w6Var.a().o().a("Discarding data. Failed to send event to service to bundle");
                C = w6Var.C();
                y1Var = this.f22900s;
                C.d0(y1Var, bArr);
            }
            bArr = N.I4(this.f22898q, this.f22899r);
            vbVar.J();
            vb vbVar2 = this.f22901t;
            y1Var = this.f22900s;
            C = vbVar2.f22928a.C();
            C.d0(y1Var, bArr);
        } catch (Throwable th) {
            vb vbVar3 = this.f22901t;
            vbVar3.f22928a.C().d0(this.f22900s, null);
            throw th;
        }
    }
}
