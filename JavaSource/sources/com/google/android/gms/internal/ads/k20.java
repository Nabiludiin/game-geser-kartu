package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class k20 extends yq implements l20 {
    public k20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static l20 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof l20 ? (l20) queryLocalInterface : new j20(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                w3.a b8 = b();
                parcel2.writeNoException();
                zq.e(parcel2, b8);
                return true;
            case 2:
                Uri d8 = d();
                parcel2.writeNoException();
                zq.d(parcel2, d8);
                return true;
            case 3:
                double h8 = h();
                parcel2.writeNoException();
                parcel2.writeDouble(h8);
                return true;
            case 4:
                int c8 = c();
                parcel2.writeNoException();
                parcel2.writeInt(c8);
                return true;
            case 5:
                int e8 = e();
                parcel2.writeNoException();
                parcel2.writeInt(e8);
                return true;
            case 6:
                Map f8 = f();
                parcel2.writeNoException();
                parcel2.writeMap(f8);
                return true;
            default:
                return false;
        }
    }
}
