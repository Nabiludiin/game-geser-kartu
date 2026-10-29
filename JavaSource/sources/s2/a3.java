package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;

/* compiled from: MyApplication */
public abstract class a3 extends yq implements b3 {
    public a3() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static b3 j8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof b3 ? (b3) queryLocalInterface : new z2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        e3 c3Var;
        switch (i7) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                e();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                v0(a8);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g8 = g();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(g8 ? 1 : 0);
                return true;
            case 5:
                int j7 = j();
                parcel2.writeNoException();
                parcel2.writeInt(j7);
                return true;
            case 6:
                float i10 = i();
                parcel2.writeNoException();
                parcel2.writeFloat(i10);
                return true;
            case 7:
                float l7 = l();
                parcel2.writeNoException();
                parcel2.writeFloat(l7);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c3Var = queryLocalInterface instanceof e3 ? (e3) queryLocalInterface : new c3(readStrongBinder);
                }
                zq.h(parcel);
                r5(c3Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float n7 = n();
                parcel2.writeNoException();
                parcel2.writeFloat(n7);
                return true;
            case 10:
                boolean o7 = o();
                parcel2.writeNoException();
                int i11 = zq.f20279b;
                parcel2.writeInt(o7 ? 1 : 0);
                return true;
            case 11:
                e3 q7 = q();
                parcel2.writeNoException();
                zq.e(parcel2, q7);
                return true;
            case 12:
                boolean s7 = s();
                parcel2.writeNoException();
                int i12 = zq.f20279b;
                parcel2.writeInt(s7 ? 1 : 0);
                return true;
            case 13:
                m();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
