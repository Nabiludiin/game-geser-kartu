package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public abstract class d30 extends yq implements e30 {
    public d30() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static e30 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof e30 ? (e30) queryLocalInterface : new c30(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                String readString = parcel.readString();
                zq.h(parcel);
                String y7 = y(readString);
                parcel2.writeNoException();
                parcel2.writeString(y7);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zq.h(parcel);
                l20 u7 = u(readString2);
                parcel2.writeNoException();
                zq.e(parcel2, u7);
                return true;
            case 3:
                List<String> f8 = f();
                parcel2.writeNoException();
                parcel2.writeStringList(f8);
                return true;
            case 4:
                String g8 = g();
                parcel2.writeNoException();
                parcel2.writeString(g8);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zq.h(parcel);
                c0(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                i();
                parcel2.writeNoException();
                return true;
            case 7:
                s2.b3 l7 = l();
                parcel2.writeNoException();
                zq.e(parcel2, l7);
                return true;
            case 8:
                k();
                parcel2.writeNoException();
                return true;
            case 9:
                w3.a n7 = n();
                parcel2.writeNoException();
                zq.e(parcel2, n7);
                return true;
            case 10:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                boolean j02 = j0(O);
                parcel2.writeNoException();
                parcel2.writeInt(j02 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 12:
                boolean q7 = q();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(q7 ? 1 : 0);
                return true;
            case 13:
                boolean s7 = s();
                parcel2.writeNoException();
                int i10 = zq.f20279b;
                parcel2.writeInt(s7 ? 1 : 0);
                return true;
            case 14:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                b8(O2);
                parcel2.writeNoException();
                return true;
            case 15:
                w();
                parcel2.writeNoException();
                return true;
            case 16:
                i20 p7 = p();
                parcel2.writeNoException();
                zq.e(parcel2, p7);
                return true;
            case 17:
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                boolean y02 = y0(O3);
                parcel2.writeNoException();
                parcel2.writeInt(y02 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
