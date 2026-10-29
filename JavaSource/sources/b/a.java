package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public interface a extends IInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String f3135b = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* compiled from: MyApplication */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    void D7(int i7, Uri uri, boolean z7, Bundle bundle);

    void F5(String str, Bundle bundle);

    void M4(int i7, int i8, Bundle bundle);

    void W5(Bundle bundle);

    void f4(Bundle bundle);

    void k7(String str, Bundle bundle);

    void q2(int i7, int i8, int i9, int i10, int i11, Bundle bundle);

    void q6(int i7, Bundle bundle);

    Bundle r3(String str, Bundle bundle);

    void r4(Bundle bundle);

    void v7(Bundle bundle);

    /* compiled from: MyApplication */
    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0058a extends Binder implements a {
        public AbstractBinderC0058a() {
            attachInterface(this, a.f3135b);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String str = a.f3135b;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i7) {
                case 2:
                    q6(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    F5(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    v7((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    k7(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    D7(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle r32 = r3(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, r32, 1);
                    return true;
                case 8:
                    M4(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    W5((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    q2(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    f4((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    r4((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
