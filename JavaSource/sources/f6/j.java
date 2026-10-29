package f6;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class j extends i {
    public static final int f(Object[] objArr) {
        q6.i.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object g(Object[] objArr, int i7) {
        q6.i.e(objArr, "<this>");
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    public static char h(char[] cArr) {
        q6.i.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object i(Object[] objArr) {
        q6.i.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }
}
