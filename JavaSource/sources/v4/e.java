package v4;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class e extends n4.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // n4.b
    protected final boolean C1(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                n4.c.b(parcel);
                break;
            case 4:
                n4.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                n4.c.b(parcel);
                break;
            case 7:
                n4.c.b(parcel);
                break;
            case 8:
                l lVar = (l) n4.c.a(parcel, l.CREATOR);
                n4.c.b(parcel);
                x2(lVar);
                break;
            case 9:
                n4.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
