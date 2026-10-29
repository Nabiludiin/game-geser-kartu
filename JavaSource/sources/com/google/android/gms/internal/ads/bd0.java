package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class bd0 extends yq implements cd0 {
    public bd0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            yb0 j8 = xb0.j8(parcel.readStrongBinder());
            zq.h(parcel);
            w6(j8);
        } else if (i7 == 2) {
            String readString = parcel.readString();
            zq.h(parcel);
            u(readString);
        } else {
            if (i7 != 3) {
                return false;
            }
            s2.x2 x2Var = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
            zq.h(parcel);
            A(x2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
