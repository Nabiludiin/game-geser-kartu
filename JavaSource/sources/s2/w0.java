package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class w0 extends xq implements IInterface {
    w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder D2(w3.a aVar, g5 g5Var, String str, kb0 kb0Var, int i7, int i8) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, g5Var);
        a8.writeString(str);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        a8.writeInt(i8);
        Parcel O = O(2, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        O.recycle();
        return readStrongBinder;
    }
}
