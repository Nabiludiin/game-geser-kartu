package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: MyApplication */
public final class j83 extends e93 {
    public j83(ClientApi clientApi, Context context, int i7, t13 t13Var, s2.m4 m4Var, s2.c1 c1Var, ScheduledExecutorService scheduledExecutorService, h83 h83Var, com.google.android.gms.common.util.e eVar) {
        super(clientApi, context, i7, t13Var, m4Var, c1Var, scheduledExecutorService, h83Var, eVar);
    }

    @Override // com.google.android.gms.internal.ads.e93
    protected final a5.d r(Context context) {
        kb0 d8 = this.f7478d.d();
        if (d8 == null) {
            return p64.c(new z73(1, "Failed to create an interstitial ad manager."));
        }
        s2.v0 X6 = this.f7475a.X6(w3.b.C1(context), new s2.g5(), this.f7479e.f26189q, d8, this.f7477c);
        if (X6 == null) {
            return p64.c(new z73(1, "Failed to create an interstitial ad manager."));
        }
        j74 C = j74.C();
        try {
            J(this.f7479e.f26191s);
            X6.p3(this.f7479e.f26191s, new i83(this, C, X6));
            return C;
        } catch (RemoteException e8) {
            w2.p.g("Failed to load interstitial ad.", e8);
            return p64.c(new z73(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.e93
    protected final /* bridge */ /* synthetic */ s2.y2 s(Object obj) {
        try {
            return ((s2.v0) obj).r();
        } catch (RemoteException e8) {
            int i7 = v2.n1.f26802b;
            w2.p.b("Failed to get response info for  the interstitial ad.", e8);
            return null;
        }
    }

    public j83(String str, ClientApi clientApi, Context context, int i7, t13 t13Var, s2.m4 m4Var, s2.e1 e1Var, ScheduledExecutorService scheduledExecutorService, h83 h83Var, com.google.android.gms.common.util.e eVar) {
        super(str, clientApi, context, i7, t13Var, m4Var, e1Var, scheduledExecutorService, h83Var, eVar);
    }
}
