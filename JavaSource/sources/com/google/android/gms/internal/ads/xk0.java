package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: MyApplication */
public final class xk0 extends xq implements zk0 {
    xk0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zk0
    public final wk0 Q0(w3.a aVar, kb0 kb0Var, int i7) {
        wk0 uk0Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(2, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            uk0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            uk0Var = queryLocalInterface instanceof wk0 ? (wk0) queryLocalInterface : new uk0(readStrongBinder);
        }
        O.recycle();
        return uk0Var;
    }
}
