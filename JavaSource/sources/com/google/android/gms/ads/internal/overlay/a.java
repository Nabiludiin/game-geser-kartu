package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import r2.l;
import u2.m;

/* compiled from: MyApplication */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z7 = q3.b.z(parcel);
        long j7 = 0;
        boolean z8 = false;
        int i7 = 0;
        int i8 = 0;
        boolean z9 = false;
        m mVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        w2.a aVar = null;
        String str4 = null;
        l lVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < z7) {
            int s7 = q3.b.s(parcel);
            switch (q3.b.m(s7)) {
                case 2:
                    mVar = (m) q3.b.f(parcel, s7, m.CREATOR);
                    break;
                case 3:
                    iBinder = q3.b.t(parcel, s7);
                    break;
                case 4:
                    iBinder2 = q3.b.t(parcel, s7);
                    break;
                case 5:
                    iBinder3 = q3.b.t(parcel, s7);
                    break;
                case 6:
                    iBinder4 = q3.b.t(parcel, s7);
                    break;
                case 7:
                    str = q3.b.g(parcel, s7);
                    break;
                case 8:
                    z8 = q3.b.n(parcel, s7);
                    break;
                case 9:
                    str2 = q3.b.g(parcel, s7);
                    break;
                case 10:
                    iBinder5 = q3.b.t(parcel, s7);
                    break;
                case 11:
                    i7 = q3.b.u(parcel, s7);
                    break;
                case 12:
                    i8 = q3.b.u(parcel, s7);
                    break;
                case 13:
                    str3 = q3.b.g(parcel, s7);
                    break;
                case 14:
                    aVar = (w2.a) q3.b.f(parcel, s7, w2.a.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    q3.b.y(parcel, s7);
                    break;
                case 16:
                    str4 = q3.b.g(parcel, s7);
                    break;
                case 17:
                    lVar = (l) q3.b.f(parcel, s7, l.CREATOR);
                    break;
                case 18:
                    iBinder6 = q3.b.t(parcel, s7);
                    break;
                case 19:
                    str5 = q3.b.g(parcel, s7);
                    break;
                case 24:
                    str6 = q3.b.g(parcel, s7);
                    break;
                case 25:
                    str7 = q3.b.g(parcel, s7);
                    break;
                case 26:
                    iBinder7 = q3.b.t(parcel, s7);
                    break;
                case 27:
                    iBinder8 = q3.b.t(parcel, s7);
                    break;
                case 28:
                    iBinder9 = q3.b.t(parcel, s7);
                    break;
                case 29:
                    z9 = q3.b.n(parcel, s7);
                    break;
                case 30:
                    j7 = q3.b.v(parcel, s7);
                    break;
            }
        }
        q3.b.l(parcel, z7);
        return new AdOverlayInfoParcel(mVar, iBinder, iBinder2, iBinder3, iBinder4, str, z8, str2, iBinder5, i7, i8, str3, aVar, str4, lVar, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z9, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AdOverlayInfoParcel[i7];
    }
}
