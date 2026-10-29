package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class sh0 extends yq implements th0 {
    public sh0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            yh0 yh0Var = (yh0) zq.b(parcel, yh0.CREATOR);
            zq.h(parcel);
            F2(yh0Var);
            parcel2.writeNoException();
        } else if (i7 != 2) {
            xh0 xh0Var = null;
            rh0 rh0Var = null;
            if (i7 == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    xh0Var = queryLocalInterface instanceof xh0 ? (xh0) queryLocalInterface : new uh0(readStrongBinder);
                }
                zq.h(parcel);
                F1(xh0Var);
                parcel2.writeNoException();
            } else if (i7 != 34) {
                switch (i7) {
                    case 5:
                        boolean c8 = c();
                        parcel2.writeNoException();
                        int i9 = zq.f20279b;
                        parcel2.writeInt(c8 ? 1 : 0);
                        break;
                    case 6:
                        e();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        f();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        g();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                        zq.h(parcel);
                        Z0(O);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                        zq.h(parcel);
                        t0(O2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                        zq.h(parcel);
                        B0(O3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String k7 = k();
                        parcel2.writeNoException();
                        parcel2.writeString(k7);
                        break;
                    case 13:
                        String readString = parcel.readString();
                        zq.h(parcel);
                        n0(readString);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        s2.a1 j8 = s2.z0.j8(parcel.readStrongBinder());
                        zq.h(parcel);
                        R2(j8);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle q7 = q();
                        parcel2.writeNoException();
                        zq.d(parcel2, q7);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            rh0Var = queryLocalInterface2 instanceof rh0 ? (rh0) queryLocalInterface2 : new rh0(readStrongBinder2);
                        }
                        zq.h(parcel);
                        k2(rh0Var);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zq.h(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                        zq.h(parcel);
                        M0(O4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String readString2 = parcel.readString();
                        zq.h(parcel);
                        X0(readString2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean p7 = p();
                        parcel2.writeNoException();
                        int i10 = zq.f20279b;
                        parcel2.writeInt(p7 ? 1 : 0);
                        break;
                    case 21:
                        s2.y2 r7 = r();
                        parcel2.writeNoException();
                        zq.e(parcel2, r7);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                R0(a8);
                parcel2.writeNoException();
            }
        } else {
            d();
            parcel2.writeNoException();
        }
        return true;
    }
}
