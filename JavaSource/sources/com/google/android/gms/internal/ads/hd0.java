package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import w3.a;

/* compiled from: MyApplication */
public abstract class hd0 extends yq implements id0 {
    public hd0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static id0 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof id0 ? (id0) queryLocalInterface : new gd0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        ld0 ld0Var = null;
        sc0 sc0Var = null;
        cd0 cd0Var = null;
        vc0 tc0Var = null;
        fd0 fd0Var = null;
        cd0 cd0Var2 = null;
        fd0 fd0Var2 = null;
        yc0 yc0Var = null;
        vc0 tc0Var2 = null;
        if (i7 == 1) {
            w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zq.b(parcel, creator);
            Bundle bundle2 = (Bundle) zq.b(parcel, creator);
            s2.g5 g5Var = (s2.g5) zq.b(parcel, s2.g5.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                ld0Var = queryLocalInterface instanceof ld0 ? (ld0) queryLocalInterface : new jd0(readStrongBinder);
            }
            zq.h(parcel);
            G7(O, readString, bundle, bundle2, g5Var, ld0Var);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            wd0 e8 = e();
            parcel2.writeNoException();
            zq.d(parcel2, e8);
        } else if (i7 == 3) {
            wd0 f8 = f();
            parcel2.writeNoException();
            zq.d(parcel2, f8);
        } else if (i7 == 5) {
            s2.b3 g8 = g();
            parcel2.writeNoException();
            zq.e(parcel2, g8);
        } else if (i7 == 10) {
            a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            parcel2.writeNoException();
        } else if (i7 != 11) {
            switch (i7) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    s2.b5 b5Var = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        tc0Var2 = queryLocalInterface2 instanceof vc0 ? (vc0) queryLocalInterface2 : new tc0(readStrongBinder2);
                    }
                    vc0 vc0Var = tc0Var2;
                    qb0 j8 = pb0.j8(parcel.readStrongBinder());
                    s2.g5 g5Var2 = (s2.g5) zq.b(parcel, s2.g5.CREATOR);
                    zq.h(parcel);
                    F4(readString2, readString3, b5Var, O2, vc0Var, j8, g5Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    s2.b5 b5Var2 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        yc0Var = queryLocalInterface3 instanceof yc0 ? (yc0) queryLocalInterface3 : new wc0(readStrongBinder3);
                    }
                    qb0 j82 = pb0.j8(parcel.readStrongBinder());
                    zq.h(parcel);
                    S6(readString4, readString5, b5Var2, O3, yc0Var, j82);
                    parcel2.writeNoException();
                    break;
                case 15:
                    w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    zq.h(parcel);
                    boolean B0 = B0(O4);
                    parcel2.writeNoException();
                    parcel2.writeInt(B0 ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    s2.b5 b5Var3 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        fd0Var2 = queryLocalInterface4 instanceof fd0 ? (fd0) queryLocalInterface4 : new dd0(readStrongBinder4);
                    }
                    qb0 j83 = pb0.j8(parcel.readStrongBinder());
                    zq.h(parcel);
                    E1(readString6, readString7, b5Var3, O5, fd0Var2, j83);
                    parcel2.writeNoException();
                    break;
                case 17:
                    w3.a O6 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    zq.h(parcel);
                    boolean g42 = g4(O6);
                    parcel2.writeNoException();
                    parcel2.writeInt(g42 ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    s2.b5 b5Var4 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O7 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        cd0Var2 = queryLocalInterface5 instanceof cd0 ? (cd0) queryLocalInterface5 : new ad0(readStrongBinder5);
                    }
                    qb0 j84 = pb0.j8(parcel.readStrongBinder());
                    zq.h(parcel);
                    I5(readString8, readString9, b5Var4, O7, cd0Var2, j84);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zq.h(parcel);
                    O0(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    s2.b5 b5Var5 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O8 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        fd0Var = queryLocalInterface6 instanceof fd0 ? (fd0) queryLocalInterface6 : new dd0(readStrongBinder6);
                    }
                    qb0 j85 = pb0.j8(parcel.readStrongBinder());
                    zq.h(parcel);
                    Q4(readString11, readString12, b5Var5, O8, fd0Var, j85);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    s2.b5 b5Var6 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O9 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        tc0Var = queryLocalInterface7 instanceof vc0 ? (vc0) queryLocalInterface7 : new tc0(readStrongBinder7);
                    }
                    vc0 vc0Var2 = tc0Var;
                    qb0 j86 = pb0.j8(parcel.readStrongBinder());
                    s2.g5 g5Var3 = (s2.g5) zq.b(parcel, s2.g5.CREATOR);
                    zq.h(parcel);
                    g5(readString13, readString14, b5Var6, O9, vc0Var2, j86, g5Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    s2.b5 b5Var7 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O10 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        cd0Var = queryLocalInterface8 instanceof cd0 ? (cd0) queryLocalInterface8 : new ad0(readStrongBinder8);
                    }
                    qb0 j87 = pb0.j8(parcel.readStrongBinder());
                    z10 z10Var = (z10) zq.b(parcel, z10.CREATOR);
                    zq.h(parcel);
                    t3(readString15, readString16, b5Var7, O10, cd0Var, j87, z10Var);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    s2.b5 b5Var8 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                    w3.a O11 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        sc0Var = queryLocalInterface9 instanceof sc0 ? (sc0) queryLocalInterface9 : new qc0(readStrongBinder9);
                    }
                    qb0 j88 = pb0.j8(parcel.readStrongBinder());
                    zq.h(parcel);
                    D1(readString17, readString18, b5Var8, O11, sc0Var, j88);
                    parcel2.writeNoException();
                    break;
                case 24:
                    w3.a O12 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                    zq.h(parcel);
                    boolean y02 = y0(O12);
                    parcel2.writeNoException();
                    parcel2.writeInt(y02 ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zq.h(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
