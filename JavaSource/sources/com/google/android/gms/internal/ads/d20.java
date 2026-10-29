package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public abstract class d20 extends yq implements e20 {
    public d20() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static e20 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof e20 ? (e20) queryLocalInterface : new b20(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            String b8 = b();
            parcel2.writeNoException();
            parcel2.writeString(b8);
            return true;
        }
        if (i7 != 3) {
            return false;
        }
        List d8 = d();
        parcel2.writeNoException();
        parcel2.writeList(d8);
        return true;
    }
}
