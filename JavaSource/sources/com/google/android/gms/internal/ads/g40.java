package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import w3.c;

/* compiled from: MyApplication */
public final class g40 extends w3.c {
    public g40() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // w3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof s20 ? (s20) queryLocalInterface : new q20(iBinder);
    }

    public final p20 c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder P6 = ((s20) b(context)).P6(w3.b.C1(context), w3.b.C1(frameLayout), w3.b.C1(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (P6 == null) {
                return null;
            }
            IInterface queryLocalInterface = P6.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof p20 ? (p20) queryLocalInterface : new n20(P6);
        } catch (RemoteException e8) {
            e = e8;
            w2.p.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            w2.p.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
