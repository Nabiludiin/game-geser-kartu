package s2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class v2 extends xq implements y2 {
    v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // s2.y2
    public final String c() {
        Parcel O = O(1, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // s2.y2
    public final String e() {
        Parcel O = O(2, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // s2.y2
    public final List f() {
        Parcel O = O(3, a());
        ArrayList createTypedArrayList = O.createTypedArrayList(k5.CREATOR);
        O.recycle();
        return createTypedArrayList;
    }

    @Override // s2.y2
    public final k5 g() {
        Parcel O = O(4, a());
        k5 k5Var = (k5) zq.b(O, k5.CREATOR);
        O.recycle();
        return k5Var;
    }

    @Override // s2.y2
    public final String i() {
        Parcel O = O(6, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // s2.y2
    public final Bundle j() {
        Parcel O = O(5, a());
        Bundle bundle = (Bundle) zq.b(O, Bundle.CREATOR);
        O.recycle();
        return bundle;
    }
}
