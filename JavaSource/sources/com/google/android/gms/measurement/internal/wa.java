package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class wa implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ da f22818q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ vb f22819r;

    wa(vb vbVar, da daVar) {
        this.f22818q = daVar;
        Objects.requireNonNull(vbVar);
        this.f22819r = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb vbVar = this.f22819r;
        t4.d N = vbVar.N();
        if (N == null) {
            vbVar.f22928a.a().o().a("Failed to send current screen to service");
            return;
        }
        try {
            da daVar = this.f22818q;
            if (daVar == null) {
                N.B2(0L, null, null, vbVar.f22928a.e().getPackageName());
            } else {
                N.B2(daVar.f22058c, daVar.f22056a, daVar.f22057b, vbVar.f22928a.e().getPackageName());
            }
            vbVar.J();
        } catch (RemoteException e8) {
            this.f22819r.f22928a.a().o().b("Failed to send current screen to the service", e8);
        }
    }
}
