package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class ma implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f22367q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22368r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ ae f22369s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f22370t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.y1 f22371u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ vb f22372v;

    ma(vb vbVar, String str, String str2, ae aeVar, boolean z7, com.google.android.gms.internal.measurement.y1 y1Var) {
        this.f22367q = str;
        this.f22368r = str2;
        this.f22369s = aeVar;
        this.f22370t = z7;
        this.f22371u = y1Var;
        Objects.requireNonNull(vbVar);
        this.f22372v = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e8;
        Bundle bundle2 = new Bundle();
        try {
            vb vbVar = this.f22372v;
            t4.d N = vbVar.N();
            if (N == null) {
                w6 w6Var = vbVar.f22928a;
                w6Var.a().o().c("Failed to get user properties; not connected to service", this.f22367q, this.f22368r);
                w6Var.C().f0(this.f22371u, bundle2);
                return;
            }
            ae aeVar = this.f22369s;
            p3.o.m(aeVar);
            List<ud> V6 = N.V6(this.f22367q, this.f22368r, this.f22370t, aeVar);
            int i7 = yd.f22907k;
            bundle = new Bundle();
            if (V6 != null) {
                for (ud udVar : V6) {
                    String str = udVar.f22704u;
                    if (str != null) {
                        bundle.putString(udVar.f22701r, str);
                    } else {
                        Long l7 = udVar.f22703t;
                        if (l7 != null) {
                            bundle.putLong(udVar.f22701r, l7.longValue());
                        } else {
                            Double d8 = udVar.f22706w;
                            if (d8 != null) {
                                bundle.putDouble(udVar.f22701r, d8.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    vbVar.J();
                    w6 w6Var2 = vbVar.f22928a;
                    w6Var2.C().f0(this.f22371u, bundle);
                } catch (RemoteException e9) {
                    e8 = e9;
                    this.f22372v.f22928a.a().o().c("Failed to get user properties; remote exception", this.f22367q, e8);
                    vb vbVar2 = this.f22372v;
                    vbVar2.f22928a.C().f0(this.f22371u, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                vb vbVar3 = this.f22372v;
                vbVar3.f22928a.C().f0(this.f22371u, bundle2);
                throw th;
            }
        } catch (RemoteException e10) {
            bundle = bundle2;
            e8 = e10;
        } catch (Throwable th2) {
            th = th2;
            vb vbVar32 = this.f22372v;
            vbVar32.f22928a.C().f0(this.f22371u, bundle2);
            throw th;
        }
    }
}
