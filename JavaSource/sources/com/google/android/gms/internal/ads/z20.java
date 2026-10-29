package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public abstract class z20 extends yq implements a30 {
    public z20() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String g8 = g();
                parcel2.writeNoException();
                parcel2.writeString(g8);
                return true;
            case 9:
                Bundle j7 = j();
                parcel2.writeNoException();
                zq.d(parcel2, j7);
                return true;
            case 10:
                i();
                parcel2.writeNoException();
                return true;
            case 11:
                s2.b3 l7 = l();
                parcel2.writeNoException();
                zq.e(parcel2, l7);
                return true;
            case 12:
                Bundle bundle = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                c5(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                boolean w42 = w4(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(w42 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                I0(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                e20 q7 = q();
                parcel2.writeNoException();
                zq.e(parcel2, q7);
                return true;
            case 16:
                w3.a s7 = s();
                parcel2.writeNoException();
                zq.e(parcel2, s7);
                return true;
            case 17:
                String m7 = m();
                parcel2.writeNoException();
                parcel2.writeString(m7);
                return true;
            default:
                return false;
        }
    }
}
