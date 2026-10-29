package com.google.android.gms.common.util;

/* compiled from: MyApplication */
public abstract class b {
    public static boolean a(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if (!p3.n.a(objArr[i7], obj)) {
                i7++;
            } else if (i7 >= 0) {
                return true;
            }
        }
        return false;
    }
}
