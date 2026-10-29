package s2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.yq;

/* compiled from: MyApplication */
public abstract class c2 extends yq implements d2 {
    public static d2 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof d2 ? (d2) queryLocalInterface : new b2(iBinder);
    }
}
