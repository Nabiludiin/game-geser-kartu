package l4;

import android.os.Parcel;

/* compiled from: MyApplication */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f24631a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z7) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
