package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jb0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class t1 extends xq implements v1 {
    t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // s2.v1
    public final kb0 getAdapterCreator() {
        Parcel O = O(2, a());
        kb0 j8 = jb0.j8(O.readStrongBinder());
        O.recycle();
        return j8;
    }

    @Override // s2.v1
    public final y3 getLiteSdkVersion() {
        Parcel O = O(1, a());
        y3 y3Var = (y3) zq.b(O, y3.CREATOR);
        O.recycle();
        return y3Var;
    }
}
