package m4;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: MyApplication */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // m4.b
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        z2((Status) c.a(parcel, Status.CREATOR), (h3.f) c.a(parcel, h3.f.CREATOR));
        return true;
    }
}
