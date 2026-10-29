package s2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.bt;
import com.google.android.gms.internal.ads.jb0;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class g1 extends yq implements h1 {
    public g1() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        c1 c1Var = null;
        e1 e1Var = null;
        switch (i7) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(m4.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    c1Var = queryLocalInterface instanceof c1 ? (c1) queryLocalInterface : new b1(readStrongBinder);
                }
                zq.h(parcel);
                V1(createTypedArrayList, c1Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zq.h(parcel);
                boolean u7 = u(readString);
                parcel2.writeNoException();
                parcel2.writeInt(u7 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zq.h(parcel);
                ki0 a02 = a0(readString2);
                parcel2.writeNoException();
                zq.e(parcel2, a02);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zq.h(parcel);
                boolean p02 = p0(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(p02 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zq.h(parcel);
                bt c02 = c0(readString4);
                parcel2.writeNoException();
                zq.e(parcel2, c02);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zq.h(parcel);
                boolean V0 = V0(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(V0 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zq.h(parcel);
                v0 h02 = h0(readString6);
                parcel2.writeNoException();
                zq.e(parcel2, h02);
                return true;
            case 8:
                jb0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString7 = parcel.readString();
                m4 m4Var = (m4) zq.b(parcel, m4.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    e1Var = queryLocalInterface2 instanceof e1 ? (e1) queryLocalInterface2 : new d1(readStrongBinder2);
                }
                zq.h(parcel);
                boolean f22 = f2(readString7, m4Var, e1Var);
                parcel2.writeNoException();
                parcel2.writeInt(f22 ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                String readString8 = parcel.readString();
                zq.h(parcel);
                boolean z7 = z7(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(z7 ? 1 : 0);
                return true;
            case 11:
                String readString9 = parcel.readString();
                zq.h(parcel);
                v0 O0 = O0(readString9);
                parcel2.writeNoException();
                zq.e(parcel2, O0);
                return true;
            case 12:
                String readString10 = parcel.readString();
                zq.h(parcel);
                bt K0 = K0(readString10);
                parcel2.writeNoException();
                zq.e(parcel2, K0);
                return true;
            case 13:
                String readString11 = parcel.readString();
                zq.h(parcel);
                ki0 X0 = X0(readString11);
                parcel2.writeNoException();
                zq.e(parcel2, X0);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                String readString12 = parcel.readString();
                zq.h(parcel);
                m4 H1 = H1(readInt2, readString12);
                parcel2.writeNoException();
                zq.d(parcel2, H1);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                zq.h(parcel);
                Bundle N = N(readInt3);
                parcel2.writeNoException();
                zq.d(parcel2, N);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                String readString13 = parcel.readString();
                zq.h(parcel);
                int H3 = H3(readInt4, readString13);
                parcel2.writeNoException();
                parcel2.writeInt(H3);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                String readString14 = parcel.readString();
                zq.h(parcel);
                boolean f62 = f6(readInt5, readString14);
                parcel2.writeNoException();
                parcel2.writeInt(f62 ? 1 : 0);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                zq.h(parcel);
                w0(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
