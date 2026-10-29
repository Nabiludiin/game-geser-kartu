package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: MyApplication */
final class c62 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ og0 f6275a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xg0 f6276b;

    c62(w62 w62Var, xg0 xg0Var, og0 og0Var) {
        this.f6276b = xg0Var;
        this.f6275a = og0Var;
        Objects.requireNonNull(w62Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        try {
            this.f6276b.R6(v2.c0.M0(th));
        } catch (RemoteException e8) {
            v2.n1.l("Service can't call client", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f6276b.D2((String) obj, this.f6275a);
        } catch (RemoteException e8) {
            v2.n1.l("Service can't call client", e8);
        }
    }
}
