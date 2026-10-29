package p3;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public abstract class s0 extends o4.d implements t0 {
    public static t0 O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new r0(iBinder);
    }
}
