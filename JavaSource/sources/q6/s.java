package q6;

/* compiled from: MyApplication */
public abstract class s {
    public static Object a(Object obj, int i7) {
        if (obj != null && !c(obj, i7)) {
            f(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).b();
        }
        if (obj instanceof p6.a) {
            return 0;
        }
        if (obj instanceof p6.l) {
            return 1;
        }
        if (obj instanceof p6.p) {
            return 2;
        }
        return obj instanceof p6.q ? 3 : -1;
    }

    public static boolean c(Object obj, int i7) {
        return (obj instanceof e6.c) && b(obj) == i7;
    }

    private static Throwable d(Throwable th) {
        return i.i(th, s.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
