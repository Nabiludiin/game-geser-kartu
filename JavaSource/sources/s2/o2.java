package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class o2 extends xq implements q2 {
    o2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // s2.q2
    public final boolean e() {
        Parcel O = O(2, a());
        boolean a8 = zq.a(O);
        O.recycle();
        return a8;
    }

    @Override // s2.q2
    public final void f8(i5 i5Var) {
        Parcel a8 = a();
        zq.c(a8, i5Var);
        r0(1, a8);
    }
}
