package c4;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class h extends q4.a implements i {
    public h() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // q4.a
    protected final boolean a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1001) {
            return false;
        }
        m x02 = x0();
        parcel2.writeNoException();
        q4.t.e(parcel2, x02);
        return true;
    }
}
