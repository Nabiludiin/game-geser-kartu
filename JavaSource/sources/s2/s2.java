package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import w3.a;

/* compiled from: MyApplication */
public abstract class s2 extends yq implements t2 {
    public s2() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        String readString = parcel.readString();
        w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
        w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
        zq.h(parcel);
        G1(readString, O, O2);
        parcel2.writeNoException();
        return true;
    }
}
