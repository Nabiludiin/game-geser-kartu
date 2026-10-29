package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class g extends n4.a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void C1(int i7) {
        Parcel a8 = a();
        a8.writeInt(i7);
        O(7, a8);
    }

    public final void D2(p3.j jVar, int i7, boolean z7) {
        Parcel a8 = a();
        n4.c.d(a8, jVar);
        a8.writeInt(i7);
        a8.writeInt(z7 ? 1 : 0);
        O(9, a8);
    }

    public final void H2(j jVar, f fVar) {
        Parcel a8 = a();
        n4.c.c(a8, jVar);
        n4.c.d(a8, fVar);
        O(12, a8);
    }
}
