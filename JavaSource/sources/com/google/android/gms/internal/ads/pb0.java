package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class pb0 extends yq implements qb0 {
    public pb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static qb0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof qb0 ? (qb0) queryLocalInterface : new ob0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                c();
                break;
            case 2:
                e();
                break;
            case 3:
                int readInt = parcel.readInt();
                zq.h(parcel);
                b0(readInt);
                break;
            case 4:
                g();
                break;
            case 5:
                j();
                break;
            case 6:
                i();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zq.h(parcel);
                break;
            case 8:
                l();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zq.h(parcel);
                N6(readString, readString2);
                break;
            case 10:
                d30.j8(parcel.readStrongBinder());
                parcel.readString();
                zq.h(parcel);
                break;
            case 11:
                o();
                break;
            case 12:
                parcel.readString();
                zq.h(parcel);
                break;
            case 13:
                q();
                break;
            case 14:
                di0 di0Var = (di0) zq.b(parcel, di0.CREATOR);
                zq.h(parcel);
                h8(di0Var);
                break;
            case 15:
                m();
                break;
            case 16:
                hi0 j8 = gi0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                i2(j8);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                zq.h(parcel);
                N(readInt2);
                break;
            case 18:
                r();
                break;
            case 19:
                zq.h(parcel);
                break;
            case 20:
                t();
                break;
            case 21:
                String readString3 = parcel.readString();
                zq.h(parcel);
                i0(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                zq.h(parcel);
                a8(readInt3, readString4);
                break;
            case 23:
                s2.x2 x2Var = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
                zq.h(parcel);
                i1(x2Var);
                break;
            case 24:
                s2.x2 x2Var2 = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
                zq.h(parcel);
                X3(x2Var2);
                break;
            case 25:
                x();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
