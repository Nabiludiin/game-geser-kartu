package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class vd implements Parcelable.Creator {
    static void a(ud udVar, Parcel parcel, int i7) {
        int i8 = udVar.f22700q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.r(parcel, 2, udVar.f22701r, false);
        q3.c.o(parcel, 3, udVar.f22702s);
        q3.c.p(parcel, 4, udVar.f22703t, false);
        q3.c.j(parcel, 5, null, false);
        q3.c.r(parcel, 6, udVar.f22704u, false);
        q3.c.r(parcel, 7, udVar.f22705v, false);
        q3.c.h(parcel, 8, udVar.f22706w, false);
        q3.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        String str = null;
        Long l7 = null;
        Float f8 = null;
        String str2 = null;
        String str3 = null;
        Double d8 = null;
        long j7 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 1:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 2:
                    str = q3.b.g(parcel, s7);
                    break;
                case 3:
                    j7 = q3.b.v(parcel, s7);
                    break;
                case 4:
                    l7 = q3.b.w(parcel, s7);
                    break;
                case 5:
                    f8 = q3.b.r(parcel, s7);
                    break;
                case 6:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 7:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 8:
                    d8 = q3.b.p(parcel, s7);
                    break;
                default:
                    q3.b.y(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new ud(i7, str, j7, l7, f8, str2, str3, d8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new ud[i7];
    }
}
