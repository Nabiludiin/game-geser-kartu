package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class e62 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eh0 f7436a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wg0 f7437b;

    e62(w62 w62Var, eh0 eh0Var, wg0 wg0Var) {
        this.f7436a = eh0Var;
        this.f7437b = wg0Var;
        Objects.requireNonNull(w62Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        try {
            this.f7437b.R6(v2.c0.M0(th));
        } catch (RemoteException e8) {
            v2.n1.l("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue()) {
                this.f7437b.K5(parcelFileDescriptor);
                return;
            }
            if (((Boolean) s2.b0.c().d(uy.f17232w2)).booleanValue() && (bundle = this.f7436a.C) != null) {
                bundle.putLong(yw1.BINDER_CALL_START.c(), r2.t.o().a());
            }
            this.f7437b.Q2(parcelFileDescriptor, this.f7436a);
        } catch (RemoteException e8) {
            v2.n1.l("Service can't call client", e8);
        }
    }
}
