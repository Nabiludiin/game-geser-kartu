package s2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.yq;

/* compiled from: MyApplication */
public abstract class z0 extends yq implements a1 {
    public static a1 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof a1 ? (a1) queryLocalInterface : new x0(iBinder);
    }
}
