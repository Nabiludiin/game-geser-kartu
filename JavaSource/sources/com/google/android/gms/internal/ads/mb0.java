package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import w3.a;

/* compiled from: MyApplication */
public abstract class mb0 extends yq implements nb0 {
    public mb0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        qb0 ob0Var;
        qb0 ob0Var2;
        qb0 ob0Var3;
        qb0 ob0Var4;
        qb0 ob0Var5;
        qb0 ob0Var6;
        qb0 ob0Var7;
        qb0 ob0Var8;
        qb0 qb0Var = null;
        switch (i7) {
            case 1:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.g5 g5Var = (s2.g5) zq.b(parcel, s2.g5.CREATOR);
                s2.b5 b5Var = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ob0Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var = queryLocalInterface instanceof qb0 ? (qb0) queryLocalInterface : new ob0(readStrongBinder);
                }
                zq.h(parcel);
                U1(O, g5Var, b5Var, readString, ob0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                w3.a e8 = e();
                parcel2.writeNoException();
                zq.e(parcel2, e8);
                return true;
            case 3:
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var2 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    ob0Var2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var2 = queryLocalInterface2 instanceof qb0 ? (qb0) queryLocalInterface2 : new ob0(readStrongBinder2);
                }
                zq.h(parcel);
                k4(O2, b5Var2, readString2, ob0Var2);
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                j();
                parcel2.writeNoException();
                return true;
            case 6:
                w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.g5 g5Var2 = (s2.g5) zq.b(parcel, s2.g5.CREATOR);
                s2.b5 b5Var3 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    ob0Var3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var3 = queryLocalInterface3 instanceof qb0 ? (qb0) queryLocalInterface3 : new ob0(readStrongBinder3);
                }
                zq.h(parcel);
                w3(O3, g5Var2, b5Var3, readString3, readString4, ob0Var3);
                parcel2.writeNoException();
                return true;
            case 7:
                w3.a O4 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var4 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    ob0Var4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var4 = queryLocalInterface4 instanceof qb0 ? (qb0) queryLocalInterface4 : new ob0(readStrongBinder4);
                }
                zq.h(parcel);
                p1(O4, b5Var4, readString5, readString6, ob0Var4);
                parcel2.writeNoException();
                return true;
            case 8:
                k();
                parcel2.writeNoException();
                return true;
            case 9:
                n();
                parcel2.writeNoException();
                return true;
            case 10:
                w3.a O5 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var5 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString7 = parcel.readString();
                ci0 j8 = bi0.j8(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zq.h(parcel);
                t6(O5, b5Var5, readString7, j8, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                s2.b5 b5Var6 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString9 = parcel.readString();
                zq.h(parcel);
                T3(b5Var6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                s();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean m7 = m();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(m7 ? 1 : 0);
                return true;
            case 14:
                w3.a O6 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var7 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    ob0Var5 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var5 = queryLocalInterface5 instanceof qb0 ? (qb0) queryLocalInterface5 : new ob0(readStrongBinder5);
                }
                z10 z10Var = (z10) zq.b(parcel, z10.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                zq.h(parcel);
                g2(O6, b5Var7, readString10, readString11, ob0Var5, z10Var, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zq.e(parcel2, null);
                return true;
            case 17:
                Bundle p7 = p();
                parcel2.writeNoException();
                zq.d(parcel2, p7);
                return true;
            case 18:
                Bundle r7 = r();
                parcel2.writeNoException();
                zq.d(parcel2, r7);
                return true;
            case 19:
                Bundle t7 = t();
                parcel2.writeNoException();
                zq.d(parcel2, t7);
                return true;
            case 20:
                s2.b5 b5Var8 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zq.h(parcel);
                b6(b5Var8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                w3.a O7 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                E0(O7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i10 = zq.f20279b;
                parcel2.writeInt(0);
                return true;
            case 23:
                w3.a O8 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                ci0 j82 = bi0.j8(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                zq.h(parcel);
                z6(O8, j82, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                e30 x7 = x();
                parcel2.writeNoException();
                zq.e(parcel2, x7);
                return true;
            case 25:
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                c4(a8);
                parcel2.writeNoException();
                return true;
            case 26:
                s2.b3 J = J();
                parcel2.writeNoException();
                zq.e(parcel2, J);
                return true;
            case 27:
                yb0 T = T();
                parcel2.writeNoException();
                zq.e(parcel2, T);
                return true;
            case 28:
                w3.a O9 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var9 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    ob0Var6 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var6 = queryLocalInterface6 instanceof qb0 ? (qb0) queryLocalInterface6 : new ob0(readStrongBinder6);
                }
                zq.h(parcel);
                i3(O9, b5Var9, readString14, ob0Var6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                w3.a O10 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                D5(O10);
                parcel2.writeNoException();
                return true;
            case 31:
                w3.a O11 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                x70 j83 = w70.j8(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(d80.CREATOR);
                zq.h(parcel);
                p7(O11, j83, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                w3.a O12 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var10 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    ob0Var7 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var7 = queryLocalInterface7 instanceof qb0 ? (qb0) queryLocalInterface7 : new ob0(readStrongBinder7);
                }
                zq.h(parcel);
                X5(O12, b5Var10, readString15, ob0Var7);
                parcel2.writeNoException();
                return true;
            case 33:
                wd0 M = M();
                parcel2.writeNoException();
                zq.d(parcel2, M);
                return true;
            case 34:
                wd0 U = U();
                parcel2.writeNoException();
                zq.d(parcel2, U);
                return true;
            case 35:
                w3.a O13 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.g5 g5Var3 = (s2.g5) zq.b(parcel, s2.g5.CREATOR);
                s2.b5 b5Var11 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    ob0Var8 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ob0Var8 = queryLocalInterface8 instanceof qb0 ? (qb0) queryLocalInterface8 : new ob0(readStrongBinder8);
                }
                zq.h(parcel);
                e5(O13, g5Var3, b5Var11, readString16, readString17, ob0Var8);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                tb0 S = S();
                parcel2.writeNoException();
                zq.e(parcel2, S);
                return true;
            case 37:
                w3.a O14 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                G3(O14);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                w3.a O15 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                s2.b5 b5Var12 = (s2.b5) zq.b(parcel, s2.b5.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    qb0Var = queryLocalInterface9 instanceof qb0 ? (qb0) queryLocalInterface9 : new ob0(readStrongBinder9);
                }
                zq.h(parcel);
                e3(O15, b5Var12, readString18, qb0Var);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                w3.a O16 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                d5(O16);
                parcel2.writeNoException();
                return true;
        }
    }
}
