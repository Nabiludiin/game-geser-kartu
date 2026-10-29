package v2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class o0 extends xq implements q0 {
    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // v2.q0
    public final boolean zze(w3.a aVar, String str, String str2) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        a8.writeString(str);
        a8.writeString(str2);
        Parcel O = O(1, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }

    @Override // v2.q0
    public final void zzf(w3.a aVar) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        r0(2, a8);
    }

    @Override // v2.q0
    public final boolean zzg(w3.a aVar, t2.a aVar2) {
        Parcel a8 = a();
        zq.e(a8, aVar);
        zq.c(a8, aVar2);
        Parcel O = O(3, a8);
        boolean a9 = zq.a(O);
        O.recycle();
        return a9;
    }
}
