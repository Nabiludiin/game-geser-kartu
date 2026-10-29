package q3;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class e {
    public static byte[] a(d dVar) {
        Parcel obtain = Parcel.obtain();
        dVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
