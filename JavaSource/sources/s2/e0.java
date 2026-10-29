package s2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.yq;

/* compiled from: MyApplication */
public abstract class e0 extends yq implements f0 {
    public e0() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.yq
    protected final boolean i8(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        b();
        parcel2.writeNoException();
        return true;
    }
}
