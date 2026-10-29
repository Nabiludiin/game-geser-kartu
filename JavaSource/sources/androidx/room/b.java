package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: MyApplication */
public interface b extends IInterface {
    void u2(String[] strArr);

    /* compiled from: MyApplication */
    public static abstract class a extends Binder implements b {

        /* compiled from: MyApplication */
        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C0046a implements b {

            /* renamed from: q, reason: collision with root package name */
            private IBinder f2716q;

            C0046a(IBinder iBinder) {
                this.f2716q = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2716q;
            }

            @Override // androidx.room.b
            public void u2(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f2716q.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0046a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                u2(parcel.createStringArray());
                return true;
            }
            if (i7 != 1598968902) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
