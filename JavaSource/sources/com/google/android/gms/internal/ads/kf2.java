package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class kf2 implements ma2 {

    /* renamed from: a, reason: collision with root package name */
    private final pg2 f11002a;

    /* renamed from: b, reason: collision with root package name */
    private final ev1 f11003b;

    kf2(pg2 pg2Var, ev1 ev1Var) {
        this.f11002a = pg2Var;
        this.f11003b = ev1Var;
    }

    @Override // com.google.android.gms.internal.ads.ma2
    public final na2 a(String str, JSONObject jSONObject) {
        id0 id0Var;
        if (((Boolean) s2.b0.c().d(uy.V1)).booleanValue()) {
            try {
                id0Var = this.f11003b.b(str);
            } catch (RemoteException e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Coundn't create RTB adapter: ", e8);
                id0Var = null;
            }
        } else {
            id0Var = this.f11002a.b(str);
        }
        if (id0Var == null) {
            return null;
        }
        return new na2(id0Var, new ac2(), str);
    }
}
