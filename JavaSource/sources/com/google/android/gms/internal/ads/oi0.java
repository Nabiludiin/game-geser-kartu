package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: MyApplication */
public final class oi0 extends xq implements IInterface {
    oi0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder D2(w3.a aVar, String str, kb0 kb0Var, int i7) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        O.recycle();
        return readStrongBinder;
    }
}
