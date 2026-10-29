package v2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import w3.a;

/* compiled from: MyApplication */
public abstract class p0 extends yq implements q0 {
    public p0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            w3.a O = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zq.h(parcel);
            boolean zze = zze(O, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zze ? 1 : 0);
        } else if (i7 == 2) {
            w3.a O2 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            zq.h(parcel);
            zzf(O2);
            parcel2.writeNoException();
        } else {
            if (i7 != 3) {
                return false;
            }
            w3.a O3 = a.AbstractBinderC0140a.O(parcel.readStrongBinder());
            t2.a aVar = (t2.a) zq.b(parcel, t2.a.CREATOR);
            zq.h(parcel);
            boolean zzg = zzg(O3, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}
