package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class d1 extends xq implements e1 {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // s2.e1
    public final void O2(String str, x2 x2Var) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.c(a8, x2Var);
        r0(3, a8);
    }

    @Override // s2.e1
    public final void Q6(String str, y2 y2Var) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.e(a8, y2Var);
        r0(1, a8);
    }

    @Override // s2.e1
    public final void u(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(2, a8);
    }
}
