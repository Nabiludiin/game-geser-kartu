package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class v52 implements f42 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y52 f17393a;

    v52(y52 y52Var) {
        Objects.requireNonNull(y52Var);
        this.f17393a = y52Var;
    }

    @Override // com.google.android.gms.internal.ads.f42
    public final void a() {
        if (((Boolean) s2.b0.c().d(uy.Te)).booleanValue()) {
            qx1 a8 = this.f17393a.d().a();
            a8.c("action", "ptard");
            a8.c("ptard", "r");
            a8.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.f42
    public final void b(RemoteException remoteException) {
        this.f17393a.c();
        if (((Boolean) s2.b0.c().d(uy.Ue)).booleanValue()) {
            r2.t.l().i(remoteException, "Preconnect Remote");
        }
    }
}
