package w3;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
public interface a extends IInterface {

    /* compiled from: MyApplication */
    /* renamed from: w3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0140a extends o4.d implements a {
        public AbstractBinderC0140a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder);
        }
    }
}
