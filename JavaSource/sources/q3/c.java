package q3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: MyApplication */
public abstract class c {
    public static int a(Parcel parcel) {
        return w(parcel, 20293);
    }

    public static void b(Parcel parcel, int i7) {
        x(parcel, i7);
    }

    public static void c(Parcel parcel, int i7, boolean z7) {
        y(parcel, i7, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i7, boolean[] zArr, boolean z7) {
        if (zArr == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeBooleanArray(zArr);
            x(parcel, w7);
        }
    }

    public static void e(Parcel parcel, int i7, Boolean bool, boolean z7) {
        if (bool != null) {
            y(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z7) {
            y(parcel, i7, 0);
        }
    }

    public static void f(Parcel parcel, int i7, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeBundle(bundle);
            x(parcel, w7);
        }
    }

    public static void g(Parcel parcel, int i7, byte[] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeByteArray(bArr);
            x(parcel, w7);
        }
    }

    public static void h(Parcel parcel, int i7, Double d8, boolean z7) {
        if (d8 != null) {
            y(parcel, i7, 8);
            parcel.writeDouble(d8.doubleValue());
        } else if (z7) {
            y(parcel, i7, 0);
        }
    }

    public static void i(Parcel parcel, int i7, float f8) {
        y(parcel, i7, 4);
        parcel.writeFloat(f8);
    }

    public static void j(Parcel parcel, int i7, Float f8, boolean z7) {
        if (f8 != null) {
            y(parcel, i7, 4);
            parcel.writeFloat(f8.floatValue());
        } else if (z7) {
            y(parcel, i7, 0);
        }
    }

    public static void k(Parcel parcel, int i7, IBinder iBinder, boolean z7) {
        if (iBinder == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            x(parcel, w7);
        }
    }

    public static void l(Parcel parcel, int i7, int i8) {
        y(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    public static void m(Parcel parcel, int i7, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeIntArray(iArr);
            x(parcel, w7);
        }
    }

    public static void n(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                y(parcel, i7, 0);
                return;
            }
            return;
        }
        int w7 = w(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(((Integer) list.get(i8)).intValue());
        }
        x(parcel, w7);
    }

    public static void o(Parcel parcel, int i7, long j7) {
        y(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    public static void p(Parcel parcel, int i7, Long l7, boolean z7) {
        if (l7 != null) {
            y(parcel, i7, 8);
            parcel.writeLong(l7.longValue());
        } else if (z7) {
            y(parcel, i7, 0);
        }
    }

    public static void q(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            x(parcel, w7);
        }
    }

    public static void r(Parcel parcel, int i7, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeString(str);
            x(parcel, w7);
        }
    }

    public static void s(Parcel parcel, int i7, String[] strArr, boolean z7) {
        if (strArr == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeStringArray(strArr);
            x(parcel, w7);
        }
    }

    public static void t(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                y(parcel, i7, 0);
            }
        } else {
            int w7 = w(parcel, i7);
            parcel.writeStringList(list);
            x(parcel, w7);
        }
    }

    public static void u(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8, boolean z7) {
        if (parcelableArr == null) {
            if (z7) {
                y(parcel, i7, 0);
                return;
            }
            return;
        }
        int w7 = w(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                z(parcel, parcelable, i8);
            }
        }
        x(parcel, w7);
    }

    public static void v(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                y(parcel, i7, 0);
                return;
            }
            return;
        }
        int w7 = w(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                z(parcel, parcelable, 0);
            }
        }
        x(parcel, w7);
    }

    private static int w(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void x(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    private static void y(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    private static void z(Parcel parcel, Parcelable parcelable, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
