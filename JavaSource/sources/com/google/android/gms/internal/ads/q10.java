package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: MyApplication */
public final class q10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14207a;

    public q10(Context context) {
        this.f14207a = context;
    }

    public final void a(gg0 gg0Var) {
        try {
            ((r10) w2.t.a(this.f14207a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", p10.f13629a)).D2(gg0Var);
        } catch (RemoteException e8) {
            w2.p.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
        } catch (w2.s e9) {
            w2.p.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e9.getMessage())));
        }
    }
}
