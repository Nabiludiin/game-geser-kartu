package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class g extends a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void r0(h3.d dVar, f fVar) {
        Parcel a8 = a();
        c.b(a8, dVar);
        c.c(a8, fVar);
        O(1, a8);
    }
}
