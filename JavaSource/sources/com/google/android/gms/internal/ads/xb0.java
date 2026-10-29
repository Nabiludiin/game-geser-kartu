package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public abstract class xb0 extends yq implements yb0 {
    public xb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static yb0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof yb0 ? (yb0) queryLocalInterface : new wb0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                String c8 = c();
                parcel2.writeNoException();
                parcel2.writeString(c8);
                return true;
            case 3:
                List e8 = e();
                parcel2.writeNoException();
                parcel2.writeList(e8);
                return true;
            case 4:
                String f8 = f();
                parcel2.writeNoException();
                parcel2.writeString(f8);
                return true;
            case 5:
                l20 g8 = g();
                parcel2.writeNoException();
                zq.e(parcel2, g8);
                return true;
            case 6:
                String j7 = j();
                parcel2.writeNoException();
                parcel2.writeString(j7);
                return true;
            case 7:
                String i9 = i();
                parcel2.writeNoException();
                parcel2.writeString(i9);
                return true;
            case 8:
                double l7 = l();
                parcel2.writeNoException();
                parcel2.writeDouble(l7);
                return true;
            case 9:
                String k7 = k();
                parcel2.writeNoException();
                parcel2.writeString(k7);
                return true;
            case 10:
                String n7 = n();
                parcel2.writeNoException();
                parcel2.writeString(n7);
                return true;
            case 11:
                s2.b3 o7 = o();
                parcel2.writeNoException();
                zq.e(parcel2, o7);
                return true;
            case 12:
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 13:
                w3.a s7 = s();
                parcel2.writeNoException();
                zq.e(parcel2, s7);
                return true;
            case 14:
                w3.a m7 = m();
                parcel2.writeNoException();
                zq.e(parcel2, m7);
                return true;
            case 15:
                w3.a w7 = w();
                parcel2.writeNoException();
                zq.e(parcel2, w7);
                return true;
            case 16:
                Bundle p7 = p();
                parcel2.writeNoException();
                zq.d(parcel2, p7);
                return true;
            case 17:
                boolean r7 = r();
                parcel2.writeNoException();
                int i10 = zq.f20279b;
                parcel2.writeInt(r7 ? 1 : 0);
                return true;
            case 18:
                boolean t7 = t();
                parcel2.writeNoException();
                int i11 = zq.f20279b;
                parcel2.writeInt(t7 ? 1 : 0);
                return true;
            case 19:
                z();
                parcel2.writeNoException();
                return true;
            case 20:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                E0(O);
                parcel2.writeNoException();
                return true;
            case 21:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                D3(O2, O3, O4);
                parcel2.writeNoException();
                return true;
            case 22:
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                R4(O5);
                parcel2.writeNoException();
                return true;
            case 23:
                float x7 = x();
                parcel2.writeNoException();
                parcel2.writeFloat(x7);
                return true;
            case 24:
                float C = C();
                parcel2.writeNoException();
                parcel2.writeFloat(C);
                return true;
            case 25:
                float J = J();
                parcel2.writeNoException();
                parcel2.writeFloat(J);
                return true;
            case 26:
                T();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
