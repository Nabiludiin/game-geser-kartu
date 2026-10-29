package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* compiled from: MyApplication */
public abstract class d40 extends yq implements e40 {
    public d40() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        a40 z30Var;
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
                String q7 = q();
                parcel2.writeNoException();
                parcel2.writeString(q7);
                return true;
            case 13:
                s();
                parcel2.writeNoException();
                return true;
            case 14:
                e20 m7 = m();
                parcel2.writeNoException();
                zq.e(parcel2, m7);
                return true;
            case 15:
                Bundle bundle = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                D6(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                boolean A5 = A5(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(A5 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                D4(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                w3.a t7 = t();
                parcel2.writeNoException();
                zq.e(parcel2, t7);
                return true;
            case 19:
                w3.a z7 = z();
                parcel2.writeNoException();
                zq.e(parcel2, z7);
                return true;
            case 20:
                Bundle G = G();
                parcel2.writeNoException();
                zq.d(parcel2, G);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    z30Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    z30Var = queryLocalInterface instanceof a40 ? (a40) queryLocalInterface : new z30(readStrongBinder);
                }
                zq.h(parcel);
                A4(z30Var);
                parcel2.writeNoException();
                return true;
            case 22:
                E();
                parcel2.writeNoException();
                return true;
            case 23:
                List x7 = x();
                parcel2.writeNoException();
                parcel2.writeList(x7);
                return true;
            case 24:
                boolean C = C();
                parcel2.writeNoException();
                int i10 = zq.f20279b;
                parcel2.writeInt(C ? 1 : 0);
                return true;
            case 25:
                s2.g2 j8 = s2.f2.j8(parcel.readStrongBinder());
                zq.h(parcel);
                z3(j8);
                parcel2.writeNoException();
                return true;
            case 26:
                s2.d2 j82 = s2.c2.j8(parcel.readStrongBinder());
                zq.h(parcel);
                q1(j82);
                parcel2.writeNoException();
                return true;
            case 27:
                Q();
                parcel2.writeNoException();
                return true;
            case 28:
                Z();
                parcel2.writeNoException();
                return true;
            case 29:
                i20 D = D();
                parcel2.writeNoException();
                zq.e(parcel2, D);
                return true;
            case 30:
                boolean g02 = g0();
                parcel2.writeNoException();
                int i11 = zq.f20279b;
                parcel2.writeInt(g02 ? 1 : 0);
                return true;
            case 31:
                s2.y2 M = M();
                parcel2.writeNoException();
                zq.e(parcel2, M);
                return true;
            case 32:
                s2.q2 j83 = s2.p2.j8(parcel.readStrongBinder());
                zq.h(parcel);
                B3(j83);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zq.b(parcel, Bundle.CREATOR);
                zq.h(parcel);
                f5(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long S = S();
                parcel2.writeNoException();
                parcel2.writeLong(S);
                return true;
            case 35:
                long readLong = parcel.readLong();
                zq.h(parcel);
                J2(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
