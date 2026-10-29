package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public interface b extends IInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3136c = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* compiled from: MyApplication */
    public static abstract class a extends Binder implements b {

        /* compiled from: MyApplication */
        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C0059a implements b {

            /* renamed from: q, reason: collision with root package name */
            private IBinder f3137q;

            C0059a(IBinder iBinder) {
                this.f3137q = iBinder;
            }

            @Override // b.b
            public boolean H4(b.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3136c);
                    obtain.writeStrongInterface(aVar);
                    C0060b.b(obtain, uri, 0);
                    this.f3137q.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean L1(b.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3136c);
                    obtain.writeStrongInterface(aVar);
                    C0060b.b(obtain, uri, 0);
                    C0060b.b(obtain, bundle, 0);
                    this.f3137q.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean P5(b.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3136c);
                    obtain.writeStrongInterface(aVar);
                    C0060b.b(obtain, bundle, 0);
                    this.f3137q.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean W3(long j7) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3136c);
                    obtain.writeLong(j7);
                    this.f3137q.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3137q;
            }

            @Override // b.b
            public int d2(b.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3136c);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    C0060b.b(obtain, bundle, 0);
                    this.f3137q.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.b
            public boolean o4(b.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f3136c);
                    obtain.writeStrongInterface(aVar);
                    this.f3137q.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f3136c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0059a(iBinder) : (b) queryLocalInterface;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0060b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    boolean H4(b.a aVar, Uri uri);

    boolean L1(b.a aVar, Uri uri, Bundle bundle);

    boolean P5(b.a aVar, Bundle bundle);

    boolean W3(long j7);

    int d2(b.a aVar, String str, Bundle bundle);

    boolean o4(b.a aVar);
}
