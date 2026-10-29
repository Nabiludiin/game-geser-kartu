package t4;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.measurement.internal.yc;

/* compiled from: MyApplication */
public abstract class i extends q0 implements j {
    public i() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.q0
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        yc ycVar = (yc) r0.b(parcel, yc.CREATOR);
        r0.f(parcel);
        s6(ycVar);
        return true;
    }
}
