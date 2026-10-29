package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class ji0 extends yq implements ki0 {
    public ji0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static ki0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof ki0 ? (ki0) queryLocalInterface : new ii0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ri0 ri0Var = null;
        ri0 ri0Var2 = null;
        si0 si0Var = null;
        ni0 ni0Var = null;
        switch (i7) {
            case 1:
                s2.b5 b5Var = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    ri0Var = queryLocalInterface instanceof ri0 ? (ri0) queryLocalInterface : new pi0(readStrongBinder);
                }
                zq.h(parcel);
                I7(b5Var, ri0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    ni0Var = queryLocalInterface2 instanceof ni0 ? (ni0) queryLocalInterface2 : new li0(readStrongBinder2);
                }
                zq.h(parcel);
                B1(ni0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean j7 = j();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(j7 ? 1 : 0);
                return true;
            case 4:
                String i10 = i();
                parcel2.writeNoException();
                parcel2.writeString(i10);
                return true;
            case 5:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                C0(O);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    si0Var = queryLocalInterface3 instanceof si0 ? (si0) queryLocalInterface3 : new si0(readStrongBinder3);
                }
                zq.h(parcel);
                b7(si0Var);
                parcel2.writeNoException();
                return true;
            case 7:
                fj0 fj0Var = (fj0) zq.b(parcel, fj0.CREATOR);
                zq.h(parcel);
                c7(fj0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                s2.n2 j8 = s2.m2.j8(parcel.readStrongBinder());
                zq.h(parcel);
                O5(j8);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle f8 = f();
                parcel2.writeNoException();
                zq.d(parcel2, f8);
                return true;
            case 10:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                O7(O2, a8);
                parcel2.writeNoException();
                return true;
            case 11:
                hi0 k7 = k();
                parcel2.writeNoException();
                zq.e(parcel2, k7);
                return true;
            case 12:
                s2.y2 n7 = n();
                parcel2.writeNoException();
                zq.e(parcel2, n7);
                return true;
            case 13:
                s2.q2 j82 = s2.p2.j8(parcel.readStrongBinder());
                zq.h(parcel);
                G6(j82);
                parcel2.writeNoException();
                return true;
            case 14:
                s2.b5 b5Var2 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    ri0Var2 = queryLocalInterface4 instanceof ri0 ? (ri0) queryLocalInterface4 : new pi0(readStrongBinder4);
                }
                zq.h(parcel);
                L7(b5Var2, ri0Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean a9 = zq.a(parcel);
                zq.h(parcel);
                d8(a9);
                parcel2.writeNoException();
                return true;
            case 16:
                String o7 = o();
                parcel2.writeNoException();
                parcel2.writeString(o7);
                return true;
            case 17:
                long m7 = m();
                parcel2.writeNoException();
                parcel2.writeLong(m7);
                return true;
            case 18:
                long readLong = parcel.readLong();
                zq.h(parcel);
                y5(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
