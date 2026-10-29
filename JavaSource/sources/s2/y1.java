package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.jb0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.z70;
import com.google.android.gms.internal.ads.zq;
import java.util.List;
import w3.a;

/* compiled from: MyApplication */
public abstract class y1 extends yq implements z1 {
    public y1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        k2 i2Var;
        switch (i7) {
            case 1:
                c();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zq.h(parcel);
                S2(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zq.h(parcel);
                a0(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean a8 = zq.a(parcel);
                zq.h(parcel);
                o0(a8);
                parcel2.writeNoException();
                return true;
            case 5:
                w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zq.h(parcel);
                g1(O, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
                zq.h(parcel);
                b5(readString3, O2);
                parcel2.writeNoException();
                return true;
            case 7:
                float l7 = l();
                parcel2.writeNoException();
                parcel2.writeFloat(l7);
                return true;
            case 8:
                boolean k7 = k();
                parcel2.writeNoException();
                int i9 = zq.f20279b;
                parcel2.writeInt(k7 ? 1 : 0);
                return true;
            case 9:
                String n7 = n();
                parcel2.writeNoException();
                parcel2.writeString(n7);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zq.h(parcel);
                H0(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                kb0 j8 = jb0.j8(parcel.readStrongBinder());
                zq.h(parcel);
                r2(j8);
                parcel2.writeNoException();
                return true;
            case 12:
                a80 j82 = z70.j8(parcel.readStrongBinder());
                zq.h(parcel);
                L5(j82);
                parcel2.writeNoException();
                return true;
            case 13:
                List m7 = m();
                parcel2.writeNoException();
                parcel2.writeTypedList(m7);
                return true;
            case 14:
                o4 o4Var = (o4) zq.b(parcel, o4.CREATOR);
                zq.h(parcel);
                m7(o4Var);
                parcel2.writeNoException();
                return true;
            case 15:
                p();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    i2Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    i2Var = queryLocalInterface instanceof k2 ? (k2) queryLocalInterface : new i2(readStrongBinder);
                }
                zq.h(parcel);
                c8(i2Var);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean a9 = zq.a(parcel);
                zq.h(parcel);
                o1(a9);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zq.h(parcel);
                i0(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
