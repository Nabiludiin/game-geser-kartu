package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public abstract class x20 extends yq implements y20 {
    public x20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                w3.a b8 = b();
                parcel2.writeNoException();
                zq.e(parcel2, b8);
                return true;
            case 3:
                String d8 = d();
                parcel2.writeNoException();
                parcel2.writeString(d8);
                return true;
            case 4:
                List h8 = h();
                parcel2.writeNoException();
                parcel2.writeList(h8);
                return true;
            case 5:
                String c8 = c();
                parcel2.writeNoException();
                parcel2.writeString(c8);
                return true;
            case 6:
                l20 e8 = e();
                parcel2.writeNoException();
                zq.e(parcel2, e8);
                return true;
            case 7:
                String f8 = f();
                parcel2.writeNoException();
                parcel2.writeString(f8);
                return true;
            case 8:
                double g8 = g();
                parcel2.writeNoException();
                parcel2.writeDouble(g8);
                return true;
            case 9:
                String j7 = j();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 10:
                String i9 = i();
                parcel2.writeNoException();
                parcel2.writeString(i9);
                return true;
            case 11:
                Bundle l7 = l();
                parcel2.writeNoException();
                zq.d(parcel2, l7);
                return true;
            case 12:
                k();
                parcel2.writeNoException();
                return true;
            case 13:
                s2.b3 n7 = n();
                parcel2.writeNoException();
                zq.e(parcel2, n7);
                return true;
            case 14:
                Bundle bundle = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                I0(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                boolean X = X(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(X ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                T1(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                e20 m7 = m();
                parcel2.writeNoException();
                zq.e(parcel2, m7);
                return true;
            case 18:
                w3.a w7 = w();
                parcel2.writeNoException();
                zq.e(parcel2, w7);
                return true;
            case 19:
                String p7 = p();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            default:
                return false;
        }
    }
}
