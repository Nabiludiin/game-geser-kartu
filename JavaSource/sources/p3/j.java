package p3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public interface j extends IInterface {

    /* compiled from: MyApplication */
    public static abstract class a extends o4.d implements j {
        public static j O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof j ? (j) queryLocalInterface : new r1(iBinder);
        }
    }

    Account b();
}
