package p3;

import android.os.IBinder;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public final class s1 extends o4.a implements o0 {
    s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // p3.o0
    public final int d() {
        Parcel a8 = a(2, O());
        int readInt = a8.readInt();
        a8.recycle();
        return readInt;
    }

    @Override // p3.o0
    public final w3.a h() {
        Parcel a8 = a(1, O());
        w3.a O = a.AbstractBinderC0140a.O(a8.readStrongBinder());
        a8.recycle();
        return O;
    }
}
