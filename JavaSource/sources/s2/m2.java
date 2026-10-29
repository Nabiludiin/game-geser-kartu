package s2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.yq;

/* compiled from: MyApplication */
public abstract class m2 extends yq implements n2 {
    public static n2 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof n2 ? (n2) queryLocalInterface : new l2(iBinder);
    }
}
