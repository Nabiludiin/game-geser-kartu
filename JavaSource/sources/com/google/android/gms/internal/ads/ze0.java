package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import w3.c;

/* compiled from: MyApplication */
public final class ze0 extends w3.c {
    public ze0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // w3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ff0 ? (ff0) queryLocalInterface : new df0(iBinder);
    }

    public final cf0 c(Activity activity) {
        try {
            IBinder Y = ((ff0) b(activity)).Y(w3.b.C1(activity));
            if (Y == null) {
                return null;
            }
            IInterface queryLocalInterface = Y.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof cf0 ? (cf0) queryLocalInterface : new af0(Y);
        } catch (RemoteException e8) {
            w2.p.g("Could not create remote AdOverlay.", e8);
            return null;
        } catch (c.a e9) {
            w2.p.g("Could not create remote AdOverlay.", e9);
            return null;
        }
    }
}
