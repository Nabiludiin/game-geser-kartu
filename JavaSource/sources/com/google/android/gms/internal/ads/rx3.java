package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class rx3 {
    public static void a(boolean z7) {
        if (!z7) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void c(boolean z7, String str, char c8) {
        if (!z7) {
            throw new IllegalArgumentException(iy3.d(str, Character.valueOf(c8)));
        }
    }

    public static void d(boolean z7, String str, int i7) {
        if (!z7) {
            throw new IllegalArgumentException(iy3.d(str, Integer.valueOf(i7)));
        }
    }

    public static void e(boolean z7, String str, long j7) {
        if (!z7) {
            throw new IllegalArgumentException(iy3.d(str, Long.valueOf(j7)));
        }
    }

    public static void f(boolean z7, String str, Object obj) {
        if (!z7) {
            throw new IllegalArgumentException(iy3.d(str, obj));
        }
    }

    public static void g(boolean z7, String str, int i7, int i8) {
        if (!z7) {
            throw new IllegalArgumentException(iy3.d(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    public static void h(boolean z7) {
        if (!z7) {
            throw new IllegalStateException();
        }
    }

    public static void i(boolean z7, Object obj) {
        if (!z7) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void j(boolean z7, String str, Object obj, Object obj2) {
        if (!z7) {
            throw new IllegalStateException(iy3.d(str, obj, obj2));
        }
    }

    public static Object k(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object l(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(iy3.d(str, obj2));
    }

    public static int m(int i7, int i8, String str) {
        String d8;
        if (i7 >= 0 && i7 < i8) {
            return i7;
        }
        if (i7 < 0) {
            d8 = iy3.d("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i8 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15);
                sb.append("negative size: ");
                sb.append(i8);
                throw new IllegalArgumentException(sb.toString());
            }
            d8 = iy3.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException(d8);
    }

    public static int n(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(p(i7, i8, "index"));
        }
        return i7;
    }

    public static void o(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i9) ? p(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? p(i8, i9, "end index") : iy3.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7)));
        }
    }

    private static String p(int i7, int i8, String str) {
        if (i7 < 0) {
            return iy3.d("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return iy3.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }
}
