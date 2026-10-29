package z4;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: MyApplication */
abstract class s {
    static Object[] a(Object[] objArr, int i7, int i8, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i7, i8, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i7) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
    }
}
