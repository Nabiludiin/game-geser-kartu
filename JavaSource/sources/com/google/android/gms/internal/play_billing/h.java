package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class h extends e implements j {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.j
    public final void W6(String str, String str2, l lVar) {
        Parcel a8 = a();
        a8.writeString(str);
        a8.writeString(str2);
        int i7 = g.f21530a;
        a8.writeStrongBinder(lVar);
        r0(1, a8);
    }
}
