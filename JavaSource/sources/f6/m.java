package f6;

import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class m {
    public static List a(Object obj) {
        List singletonList = Collections.singletonList(obj);
        q6.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final Object[] b(int i7, Object[] objArr) {
        q6.i.e(objArr, "array");
        if (i7 < objArr.length) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
