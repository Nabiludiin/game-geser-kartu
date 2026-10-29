package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;

/* compiled from: MyApplication */
public final class e2 extends xq implements g2 {
    e2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // s2.g2
    public final String c() {
        Parcel O = O(1, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // s2.g2
    public final String e() {
        Parcel O = O(2, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }
}
