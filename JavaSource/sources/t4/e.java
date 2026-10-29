package t4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public final class e extends com.google.android.gms.internal.measurement.p0 implements g {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // t4.g
    public final void W0(List list) {
        Parcel O = O();
        O.writeTypedList(list);
        C1(2, O);
    }
}
