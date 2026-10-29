package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: MyApplication */
final class fb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f22147q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22148r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ ae f22149s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22150t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ vb f22151u;

    fb(vb vbVar, String str, String str2, ae aeVar, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22147q = str;
        this.f22148r = str2;
        this.f22149s = aeVar;
        this.f22150t = y1Var;
        Objects.requireNonNull(vbVar);
        this.f22151u = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.y1 y1Var;
        yd C;
        vb vbVar;
        t4.d N;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                vbVar = this.f22151u;
                N = vbVar.N();
            } catch (RemoteException e8) {
                this.f22151u.f22928a.a().o().d("Failed to get conditional properties; remote exception", this.f22147q, this.f22148r, e8);
            }
            if (N == null) {
                w6 w6Var = vbVar.f22928a;
                w6Var.a().o().c("Failed to get conditional properties; not connected to service", this.f22147q, this.f22148r);
                C = w6Var.C();
                y1Var = this.f22150t;
                C.g0(y1Var, arrayList);
            }
            ae aeVar = this.f22149s;
            p3.o.m(aeVar);
            arrayList = yd.h0(N.q7(this.f22147q, this.f22148r, aeVar));
            vbVar.J();
            vb vbVar2 = this.f22151u;
            y1Var = this.f22150t;
            C = vbVar2.f22928a.C();
            C.g0(y1Var, arrayList);
        } catch (Throwable th) {
            vb vbVar3 = this.f22151u;
            vbVar3.f22928a.C().g0(this.f22150t, arrayList);
            throw th;
        }
    }
}
