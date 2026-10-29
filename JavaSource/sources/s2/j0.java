package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class j0 extends xq implements l0 {
    j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // s2.l0
    public final void b() {
        r0(1, a());
    }

    @Override // s2.l0
    public final void b1(x2 x2Var) {
        Parcel a8 = a();
        zq.c(a8, x2Var);
        r0(2, a8);
    }
}
