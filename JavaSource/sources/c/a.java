package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public interface a extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3461d = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* compiled from: MyApplication */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void e8(int i7, Bundle bundle);

    /* compiled from: MyApplication */
    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0064a extends Binder implements a {

        /* compiled from: MyApplication */
        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C0065a implements a {

            /* renamed from: q, reason: collision with root package name */
            private IBinder f3462q;

            C0065a(IBinder iBinder) {
                this.f3462q = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3462q;
            }
        }

        public AbstractBinderC0064a() {
            attachInterface(this, a.f3461d);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f3461d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0065a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String str = a.f3461d;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            e8(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
