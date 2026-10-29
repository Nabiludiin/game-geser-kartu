package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class a2 extends xq implements IInterface {
    a2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder D2(w3.a aVar, int i7) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        O.recycle();
        return readStrongBinder;
    }
}
