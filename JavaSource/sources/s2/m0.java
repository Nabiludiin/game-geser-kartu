package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class m0 extends xq implements o0 {
    m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // s2.o0
    public final void U0(b5 b5Var) {
        Parcel a8 = a();
        zq.c(a8, b5Var);
        r0(1, a8);
    }
}
