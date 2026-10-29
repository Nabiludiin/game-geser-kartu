package f6;

import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
abstract class i extends h {
    public static final List b(Object[] objArr) {
        q6.i.e(objArr, "<this>");
        List a8 = k.a(objArr);
        q6.i.d(a8, "asList(...)");
        return a8;
    }

    public static final Object[] c(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        q6.i.e(objArr, "<this>");
        q6.i.e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
        return objArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return c(objArr, objArr2, i7, i8, i9);
    }

    public static final void e(Object[] objArr, Object obj, int i7, int i8) {
        q6.i.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, obj);
    }
}
