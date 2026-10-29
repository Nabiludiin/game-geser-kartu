package com.google.android.gms.internal.ads;

import android.os.Parcel;
import w3.a;

/* compiled from: MyApplication */
public abstract class uc0 extends yq implements vc0 {
    public uc0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            Y(O);
        } else if (i7 == 2) {
            String readString = parcel.readString();
            zq.h(parcel);
            u(readString);
        } else if (i7 == 3) {
            s2.x2 x2Var = (s2.x2) zq.b(parcel, s2.x2.CREATOR);
            zq.h(parcel);
            A(x2Var);
        } else {
            if (i7 != 4) {
                return false;
            }
            tb0 j8 = sb0.j8(parcel.readStrongBinder());
            zq.h(parcel);
            K1(j8);
        }
        parcel2.writeNoException();
        return true;
    }
}
