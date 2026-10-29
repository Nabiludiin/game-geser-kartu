package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class c2 extends p0 implements e2 {
    c2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int e() {
        Parcel a8 = a(2, O());
        int readInt = a8.readInt();
        a8.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void n1(String str, String str2, Bundle bundle, long j7) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        r0.c(O, bundle);
        O.writeLong(j7);
        r0(1, O);
    }
}
