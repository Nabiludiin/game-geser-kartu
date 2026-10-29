package f6;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class o extends n {
    public static int h(Iterable iterable, int i7) {
        q6.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
