package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class mi0 extends yq implements ni0 {
    public mi0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        hi0 fi0Var;
        switch (i7) {
            case 1:
                c();
                break;
            case 2:
                e();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    fi0Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    fi0Var = queryLocalInterface instanceof hi0 ? (hi0) queryLocalInterface : new fi0(readStrongBinder);
                }
                zq.h(parcel);
                V3(fi0Var);
                break;
            case 4:
                int readInt = parcel.readInt();
                zq.h(parcel);
                F(readInt);
                break;
            case 5:
                s2.x2 x2Var = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
                zq.h(parcel);
                q3(x2Var);
                break;
            case 6:
                i();
                break;
            case 7:
                l();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
