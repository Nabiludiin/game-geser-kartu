package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public final class z2 extends xq implements b3 {
    z2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // s2.b3
    public final float i() {
        throw null;
    }

    @Override // s2.b3
    public final float l() {
        throw null;
    }

    @Override // s2.b3
    public final float n() {
        throw null;
    }

    @Override // s2.b3
    public final e3 q() {
        e3 c3Var;
        Parcel O = O(11, a());
        IBinder readStrongBinder = O.readStrongBinder();
        if (readStrongBinder == null) {
            c3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new c3(readStrongBinder);
        }
        O.recycle();
        return c3Var;
    }

    @Override // s2.b3
    public final void r5(e3 e3Var) {
        Parcel a8 = a();
        zq.e(a8, e3Var);
        r0(8, a8);
    }
}
