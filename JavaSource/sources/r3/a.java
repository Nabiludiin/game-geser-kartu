package r3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p3.s;

/* compiled from: MyApplication */
public final class a extends n4.a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void C1(s sVar) {
        Parcel a8 = a();
        n4.c.c(a8, sVar);
        r0(1, a8);
    }
}
