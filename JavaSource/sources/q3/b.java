package q3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class b {

    /* compiled from: MyApplication */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private static void A(Parcel parcel, int i7, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + i8 + " (0x" + Integer.toHexString(i8) + ")", parcel);
    }

    private static void B(Parcel parcel, int i7, int i8) {
        int x7 = x(parcel, i7);
        if (x7 == i8) {
            return;
        }
        throw new a("Expected size " + i8 + " got " + x7 + " (0x" + Integer.toHexString(x7) + ")", parcel);
    }

    public static boolean[] a(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + x7);
        return createBooleanArray;
    }

    public static Bundle b(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x7);
        return readBundle;
    }

    public static byte[] c(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x7);
        return createByteArray;
    }

    public static int[] d(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x7);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + x7);
        return arrayList;
    }

    public static Parcelable f(Parcel parcel, int i7, Parcelable.Creator creator) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x7);
        return parcelable;
    }

    public static String g(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x7);
        return readString;
    }

    public static String[] h(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x7);
        return createStringArray;
    }

    public static ArrayList i(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x7);
        return createStringArrayList;
    }

    public static Object[] j(Parcel parcel, int i7, Parcelable.Creator creator) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x7);
        return createTypedArray;
    }

    public static ArrayList k(Parcel parcel, int i7, Parcelable.Creator creator) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x7);
        return createTypedArrayList;
    }

    public static void l(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new a("Overread allowed size end=" + i7, parcel);
    }

    public static int m(int i7) {
        return (char) i7;
    }

    public static boolean n(Parcel parcel, int i7) {
        B(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean o(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        if (x7 == 0) {
            return null;
        }
        A(parcel, i7, x7, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double p(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        if (x7 == 0) {
            return null;
        }
        A(parcel, i7, x7, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float q(Parcel parcel, int i7) {
        B(parcel, i7, 4);
        return parcel.readFloat();
    }

    public static Float r(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        if (x7 == 0) {
            return null;
        }
        A(parcel, i7, x7, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int s(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder t(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x7 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x7);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i7) {
        B(parcel, i7, 4);
        return parcel.readInt();
    }

    public static long v(Parcel parcel, int i7) {
        B(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long w(Parcel parcel, int i7) {
        int x7 = x(parcel, i7);
        if (x7 == 0) {
            return null;
        }
        A(parcel, i7, x7, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int x(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void y(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i7));
    }

    public static int z(Parcel parcel) {
        int s7 = s(parcel);
        int x7 = x(parcel, s7);
        int m7 = m(s7);
        int dataPosition = parcel.dataPosition();
        if (m7 != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(s7))), parcel);
        }
        int i7 = x7 + dataPosition;
        if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i7, parcel);
    }
}
