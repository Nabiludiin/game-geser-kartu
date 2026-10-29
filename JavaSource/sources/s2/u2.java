package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class u2 extends xq implements IInterface {
    u2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final t2 D2(w3.a aVar, kb0 kb0Var, int i7) {
        t2 r2Var;
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.e(a8, kb0Var);
        a8.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel O = O(1, a8);
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            r2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            r2Var = queryLocalInterface instanceof t2 ? (t2) queryLocalInterface : new r2(readStrongBinder);
        }
        O.recycle();
        return r2Var;
    }
}
