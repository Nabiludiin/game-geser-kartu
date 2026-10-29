package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class w1 extends xq implements z1 {
    w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // s2.z1
    public final void L5(a80 a80Var) {
        Parcel a8 = a();
        zq.e(a8, a80Var);
        r0(12, a8);
    }

    @Override // s2.z1
    public final void b5(String str, w3.a aVar) {
        Parcel a8 = a();
        a8.writeString(null);
        zq.e(a8, aVar);
        r0(6, a8);
    }

    @Override // s2.z1
    public final void c() {
        r0(1, a());
    }

    @Override // s2.z1
    public final void i0(String str) {
        Parcel a8 = a();
        a8.writeString(str);
        r0(18, a8);
    }

    @Override // s2.z1
    public final List m() {
        Parcel O = O(13, a());
        ArrayList createTypedArrayList = O.createTypedArrayList(t70.CREATOR);
        O.recycle();
        return createTypedArrayList;
    }

    @Override // s2.z1
    public final void m7(o4 o4Var) {
        Parcel a8 = a();
        zq.c(a8, o4Var);
        r0(14, a8);
    }

    @Override // s2.z1
    public final void r2(kb0 kb0Var) {
        Parcel a8 = a();
        zq.e(a8, kb0Var);
        r0(11, a8);
    }
}
