package l4;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: MyApplication */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // l4.f
    public final boolean A0(boolean z7) {
        Parcel a8 = a();
        c.a(a8, true);
        Parcel O = O(2, a8);
        boolean b8 = c.b(O);
        O.recycle();
        return b8;
    }

    @Override // l4.f
    public final String d() {
        Parcel O = O(1, a());
        String readString = O.readString();
        O.recycle();
        return readString;
    }

    @Override // l4.f
    public final boolean h() {
        Parcel O = O(6, a());
        boolean b8 = c.b(O);
        O.recycle();
        return b8;
    }
}
