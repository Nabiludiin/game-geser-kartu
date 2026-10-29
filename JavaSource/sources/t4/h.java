package t4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.measurement.internal.yc;

/* compiled from: MyApplication */
public final class h extends com.google.android.gms.internal.measurement.p0 implements j {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // t4.j
    public final void s6(yc ycVar) {
        Parcel O = O();
        r0.c(O, ycVar);
        C1(2, O);
    }
}
