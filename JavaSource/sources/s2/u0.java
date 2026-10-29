package s2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.dt;
import com.google.android.gms.internal.ads.et;
import com.google.android.gms.internal.ads.kf0;
import com.google.android.gms.internal.ads.lf0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.pz;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.xh0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import w3.a;

/* compiled from: MyApplication */
public abstract class u0 extends yq implements v0 {
    public u0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        i0 i0Var = null;
        s1 s1Var = null;
        l0 l0Var = null;
        q2 q2Var = null;
        a1 a1Var = null;
        p1 p1Var = null;
        f0 f0Var = null;
        l1 l1Var = null;
        switch (i7) {
            case 1:
                w3.a b8 = b();
                parcel2.writeNoException();
                zq.e(parcel2, b8);
                return true;
            case 2:
                d();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean h8 = h();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(h8 ? 1 : 0);
                return true;
            case 4:
                b5 b5Var = (b5) zq.b(parcel, b5.CREATOR);
                zq.h(parcel);
                boolean U0 = U0(b5Var);
                parcel2.writeNoException();
                parcel2.writeInt(U0 ? 1 : 0);
                return true;
            case 5:
                e();
                parcel2.writeNoException();
                return true;
            case 6:
                f();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    i0Var = queryLocalInterface instanceof i0 ? (i0) queryLocalInterface : new g0(readStrongBinder);
                }
                zq.h(parcel);
                L4(i0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    l1Var = queryLocalInterface2 instanceof l1 ? (l1) queryLocalInterface2 : new j1(readStrongBinder2);
                }
                zq.h(parcel);
                v2(l1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                k();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                n();
                parcel2.writeNoException();
                return true;
            case 12:
                g5 o7 = o();
                parcel2.writeNoException();
                zq.d(parcel2, o7);
                return true;
            case 13:
                g5 g5Var = (g5) zq.b(parcel, g5.CREATOR);
                zq.h(parcel);
                X4(g5Var);
                parcel2.writeNoException();
                return true;
            case 14:
                lf0 j8 = kf0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                Y5(j8);
                parcel2.writeNoException();
                return true;
            case 15:
                of0 j82 = nf0.j8(parcel.readStrongBinder());
                String readString = parcel.readString();
                zq.h(parcel);
                v4(j82, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String w7 = w();
                parcel2.writeNoException();
                parcel2.writeString(w7);
                return true;
            case 19:
                qz j83 = pz.j8(parcel.readStrongBinder());
                zq.h(parcel);
                N2(j83);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    f0Var = queryLocalInterface3 instanceof f0 ? (f0) queryLocalInterface3 : new d0(readStrongBinder3);
                }
                zq.h(parcel);
                g3(f0Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    p1Var = queryLocalInterface4 instanceof p1 ? (p1) queryLocalInterface4 : new p1(readStrongBinder4);
                }
                zq.h(parcel);
                Z5(p1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                x5(a8);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean J = J();
                parcel2.writeNoException();
                int i10 = zq.f20279b;
                parcel2.writeInt(J ? 1 : 0);
                return true;
            case 24:
                xh0 j84 = wh0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                Q7(j84);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                zq.h(parcel);
                R5(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                b3 D = D();
                parcel2.writeNoException();
                zq.e(parcel2, D);
                return true;
            case 29:
                u4 u4Var = (u4) zq.b(parcel, u4.CREATOR);
                zq.h(parcel);
                A6(u4Var);
                parcel2.writeNoException();
                return true;
            case 30:
                f3 f3Var = (f3) zq.b(parcel, f3.CREATOR);
                zq.h(parcel);
                x6(f3Var);
                parcel2.writeNoException();
                return true;
            case 31:
                String t7 = t();
                parcel2.writeNoException();
                parcel2.writeString(t7);
                return true;
            case 32:
                l1 z7 = z();
                parcel2.writeNoException();
                zq.e(parcel2, z7);
                return true;
            case 33:
                i0 G = G();
                parcel2.writeNoException();
                zq.e(parcel2, G);
                return true;
            case 34:
                boolean a9 = zq.a(parcel);
                zq.h(parcel);
                z0(a9);
                parcel2.writeNoException();
                return true;
            case 35:
                String p7 = p();
                parcel2.writeNoException();
                parcel2.writeString(p7);
                return true;
            case androidx.constraintlayout.widget.h.f1530y1 /* 36 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    a1Var = queryLocalInterface5 instanceof a1 ? (a1) queryLocalInterface5 : new x0(readStrongBinder5);
                }
                zq.h(parcel);
                a6(a1Var);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle l7 = l();
                parcel2.writeNoException();
                zq.d(parcel2, l7);
                return true;
            case androidx.constraintlayout.widget.h.f1478r5 /* 38 */:
                String readString3 = parcel.readString();
                zq.h(parcel);
                U4(readString3);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1486s5 /* 39 */:
                m5 m5Var = (m5) zq.b(parcel, m5.CREATOR);
                zq.h(parcel);
                I6(m5Var);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1494t5 /* 40 */:
                et j85 = dt.j8(parcel.readStrongBinder());
                zq.h(parcel);
                j3(j85);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1502u5 /* 41 */:
                y2 r7 = r();
                parcel2.writeNoException();
                zq.e(parcel2, r7);
                return true;
            case androidx.constraintlayout.widget.h.f1510v5 /* 42 */:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    q2Var = queryLocalInterface6 instanceof q2 ? (q2) queryLocalInterface6 : new o2(readStrongBinder6);
                }
                zq.h(parcel);
                N3(q2Var);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1518w5 /* 43 */:
                b5 b5Var2 = (b5) zq.b(parcel, b5.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    l0Var = queryLocalInterface7 instanceof l0 ? (l0) queryLocalInterface7 : new j0(readStrongBinder7);
                }
                zq.h(parcel);
                p3(b5Var2, l0Var);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1526x5 /* 44 */:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                W1(O);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1534y5 /* 45 */:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    s1Var = queryLocalInterface8 instanceof s1 ? (s1) queryLocalInterface8 : new q1(readStrongBinder8);
                }
                zq.h(parcel);
                O1(s1Var);
                parcel2.writeNoException();
                return true;
            case androidx.constraintlayout.widget.h.f1542z5 /* 46 */:
                boolean C = C();
                parcel2.writeNoException();
                int i11 = zq.f20279b;
                parcel2.writeInt(C ? 1 : 0);
                return true;
            case androidx.constraintlayout.widget.h.A5 /* 47 */:
                long k02 = k0();
                parcel2.writeNoException();
                parcel2.writeLong(k02);
                return true;
            case androidx.constraintlayout.widget.h.B5 /* 48 */:
                long readLong = parcel.readLong();
                zq.h(parcel);
                m2(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
