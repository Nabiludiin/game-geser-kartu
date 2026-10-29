package f6;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class n extends m {
    public static List c() {
        return x.f23805q;
    }

    public static int d(List list) {
        q6.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List e(Object... objArr) {
        q6.i.e(objArr, "elements");
        return objArr.length > 0 ? i.b(objArr) : c();
    }

    public static final List f(List list) {
        q6.i.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : m.a(list.get(0)) : c();
    }

    public static void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
