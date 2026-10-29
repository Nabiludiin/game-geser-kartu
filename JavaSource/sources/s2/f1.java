package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class f1 extends xq implements h1 {
    f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // s2.h1
    public final void Y4(kb0 kb0Var) {
        Parcel a8 = a();
        zq.e(a8, kb0Var);
        r0(8, a8);
    }
}
