package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: MyApplication */
public final class we0 extends xq implements ye0 {
    we0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.ye0
    public final ve0 Q0(w3.a aVar, kb0 kb0Var, int i7) {
        ve0 se0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            se0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            se0Var = queryLocalInterface instanceof ve0 ? (ve0) queryLocalInterface : new se0(readStrongBinder);
        }
        O.recycle();
        return se0Var;
    }
}
