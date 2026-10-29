package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class i2 extends xq implements k2 {
    i2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // s2.k2
    public final void T0(x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(1, a8);
    }
}
