package p3;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class r0 extends o4.a implements t0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p3.t0
    public final boolean I3(k3.g0 g0Var, w3.a aVar) {
        Parcel O = O();
        o4.e.c(O, g0Var);
        o4.e.d(O, aVar);
        Parcel a8 = a(5, O);
        boolean e8 = o4.e.e(a8);
        a8.recycle();
        return e8;
    }

    @Override // p3.t0
    public final k3.e0 e1(k3.c0 c0Var) {
        Parcel O = O();
        o4.e.c(O, c0Var);
        Parcel a8 = a(8, O);
        k3.e0 e0Var = (k3.e0) o4.e.a(a8, k3.e0.CREATOR);
        a8.recycle();
        return e0Var;
    }

    @Override // p3.t0
    public final boolean j() {
        Parcel a8 = a(7, O());
        boolean e8 = o4.e.e(a8);
        a8.recycle();
        return e8;
    }

    @Override // p3.t0
    public final k3.e0 n2(k3.c0 c0Var) {
        Parcel O = O();
        o4.e.c(O, c0Var);
        Parcel a8 = a(6, O);
        k3.e0 e0Var = (k3.e0) o4.e.a(a8, k3.e0.CREATOR);
        a8.recycle();
        return e0Var;
    }
}
