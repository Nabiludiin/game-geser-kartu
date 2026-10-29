package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class b1 extends xq implements c1 {
    b1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // s2.c1
    public final void h2(m4 m4Var) {
        Parcel a8 = a();
        zq.c(a8, m4Var);
        r0(1, a8);
    }

    @Override // s2.c1
    public final void s1(m4 m4Var) {
        Parcel a8 = a();
        zq.c(a8, m4Var);
        r0(2, a8);
    }
}
