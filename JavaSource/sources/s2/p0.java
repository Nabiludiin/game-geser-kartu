package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.r30;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.y30;
import com.google.android.gms.internal.ads.z10;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class p0 extends xq implements r0 {
    p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // s2.r0
    public final void J5(i0 i0Var) {
        Parcel a8 = a();
        zq.e(a8, i0Var);
        r0(2, a8);
    }

    @Override // s2.r0
    public final void Y1(y30 y30Var) {
        Parcel a8 = a();
        zq.e(a8, y30Var);
        r0(10, a8);
    }

    @Override // s2.r0
    public final void Z3(String str, r30 r30Var, o30 o30Var) {
        Parcel a8 = a();
        a8.writeString(str);
        zq.e(a8, r30Var);
        zq.e(a8, o30Var);
        r0(5, a8);
    }

    @Override // s2.r0
    public final o0 c() {
        o0 m0Var;
        Parcel O = O(1, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            m0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            m0Var = queryLocalInterface instanceof o0 ? (o0) queryLocalInterface : new m0(readStrongBinder);
        }
        O.recycle();
        return m0Var;
    }

    @Override // s2.r0
    public final void k5(z10 z10Var) {
        Parcel a8 = a();
        zq.c(a8, z10Var);
        r0(6, a8);
    }
}
