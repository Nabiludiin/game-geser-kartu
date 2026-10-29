package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class r2 extends xq implements t2 {
    r2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // s2.t2
    public final void G1(String str, w3.a aVar, w3.a aVar2) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.e(a8, aVar);
        zq.e(a8, aVar2);
        r0(1, a8);
    }
}
