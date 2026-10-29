package f6;

import java.lang.reflect.Array;

/* compiled from: MyApplication */
abstract class g {
    public static final Object[] a(Object[] objArr, int i7) {
        q6.i.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
        q6.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
