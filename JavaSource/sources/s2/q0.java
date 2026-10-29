package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.f80;
import com.google.android.gms.internal.ads.h30;
import com.google.android.gms.internal.ads.i30;
import com.google.android.gms.internal.ads.k30;
import com.google.android.gms.internal.ads.l30;
import com.google.android.gms.internal.ads.n30;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.o80;
import com.google.android.gms.internal.ads.q30;
import com.google.android.gms.internal.ads.r30;
import com.google.android.gms.internal.ads.u30;
import com.google.android.gms.internal.ads.v30;
import com.google.android.gms.internal.ads.x30;
import com.google.android.gms.internal.ads.y30;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.z10;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class q0 extends yq implements r0 {
    public q0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        i0 i0Var = null;
        p1 p1Var = null;
        switch (i7) {
            case 1:
                o0 c8 = c();
                parcel2.writeNoException();
                zq.e(parcel2, c8);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    i0Var = queryLocalInterface instanceof i0 ? (i0) queryLocalInterface : new g0(readStrongBinder);
                }
                zq.h(parcel);
                J5(i0Var);
                parcel2.writeNoException();
                return true;
            case 3:
                i30 j8 = h30.j8(parcel.readStrongBinder());
                zq.h(parcel);
                h6(j8);
                parcel2.writeNoException();
                return true;
            case 4:
                l30 j82 = k30.j8(parcel.readStrongBinder());
                zq.h(parcel);
                W2(j82);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                r30 j83 = q30.j8(parcel.readStrongBinder());
                o30 j84 = n30.j8(parcel.readStrongBinder());
                zq.h(parcel);
                Z3(readString, j83, j84);
                parcel2.writeNoException();
                return true;
            case 6:
                z10 z10Var = (z10) zq.b(parcel, z10.CREATOR);
                zq.h(parcel);
                k5(z10Var);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    p1Var = queryLocalInterface2 instanceof p1 ? (p1) queryLocalInterface2 : new p1(readStrongBinder2);
                }
                zq.h(parcel);
                a3(p1Var);
                parcel2.writeNoException();
                return true;
            case 8:
                v30 j85 = u30.j8(parcel.readStrongBinder());
                g5 g5Var = (g5) zq.b(parcel, g5.CREATOR);
                zq.h(parcel);
                R3(j85, g5Var);
                parcel2.writeNoException();
                return true;
            case 9:
                n2.f fVar = (n2.f) zq.b(parcel, n2.f.CREATOR);
                zq.h(parcel);
                s5(fVar);
                parcel2.writeNoException();
                return true;
            case 10:
                y30 j86 = x30.j8(parcel.readStrongBinder());
                zq.h(parcel);
                Y1(j86);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                f80 f80Var = (f80) zq.b(parcel, f80.CREATOR);
                zq.h(parcel);
                l4(f80Var);
                parcel2.writeNoException();
                return true;
            case 14:
                o80 j87 = n80.j8(parcel.readStrongBinder());
                zq.h(parcel);
                A2(j87);
                parcel2.writeNoException();
                return true;
            case 15:
                n2.a aVar = (n2.a) zq.b(parcel, n2.a.CREATOR);
                zq.h(parcel);
                E2(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
