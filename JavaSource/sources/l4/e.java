package l4;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public abstract class e extends b implements f {
    public static f a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder);
    }
}
