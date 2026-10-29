package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: MyApplication */
public final class dj0 {
    public static final ki0 a(Context context, String str, kb0 kb0Var) {
        try {
            IBinder D2 = ((oi0) w2.t.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", vi0.f17617a)).D2(w3.b.C1(context), str, kb0Var, ModuleDescriptor.MODULE_VERSION);
            if (D2 == null) {
                return null;
            }
            IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof ki0 ? (ki0) queryLocalInterface : new ii0(D2);
        } catch (RemoteException e8) {
            e = e8;
            w2.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (w2.s e9) {
            e = e9;
            w2.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
