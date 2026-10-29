package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class h0 implements Parcelable.Creator {
    static void a(g0 g0Var, Parcel parcel, int i7) {
        String str = g0Var.f22160q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.q(parcel, 3, g0Var.f22161r, i7, false);
        q3.c.r(parcel, 4, g0Var.f22162s, false);
        q3.c.o(parcel, 5, g0Var.f22163t);
        q3.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        long j7 = 0;
        String str = null;
        e0 e0Var = null;
        String str2 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            int m7 = q3.b.m(s7);
            if (m7 == 2) {
                str = q3.b.g(parcel, s7);
            } else if (m7 == 3) {
                e0Var = (e0) q3.b.f(parcel, s7, e0.CREATOR);
            } else if (m7 == 4) {
                str2 = q3.b.g(parcel, s7);
            } else if (m7 != 5) {
                q3.b.y(parcel, s7);
            } else {
                j7 = q3.b.v(parcel, s7);
            }
        }
        q3.b.l(parcel, z7);
        return new g0(str, e0Var, str2, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new g0[i7];
    }
}
