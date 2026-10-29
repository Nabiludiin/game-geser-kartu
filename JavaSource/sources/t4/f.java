package t4;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.measurement.internal.rc;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class f extends q0 implements g {
    public f() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.q0
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(rc.CREATOR);
        r0.f(parcel);
        W0(createTypedArrayList);
        return true;
    }
}
