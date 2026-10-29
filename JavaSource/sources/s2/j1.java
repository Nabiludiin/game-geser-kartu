package s2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;

/* compiled from: MyApplication */
public final class j1 extends xq implements l1 {
    j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // s2.l1
    public final void Y0(String str, String str2) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        r0(1, a8);
    }
}
