package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class gt extends yq implements ht {
    public gt() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            d();
        } else if (i7 == 2) {
            h();
        } else if (i7 == 3) {
            s2.x2 x2Var = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
            zq.h(parcel);
            T0(x2Var);
        } else if (i7 == 4) {
            e();
        } else {
            if (i7 != 5) {
                return false;
            }
            f();
        }
        parcel2.writeNoException();
        return true;
    }
}
