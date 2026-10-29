package k6;

import f6.f;
import java.lang.reflect.Method;
import q6.i;

/* compiled from: MyApplication */
public abstract class a {

    /* compiled from: MyApplication */
    /* renamed from: k6.a$a, reason: collision with other inner class name */
    private static final class C0103a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0103a f24548a = new C0103a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f24549b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f24550c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            i.b(methods);
            int length = methods.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                method = null;
                if (i8 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i8];
                if (i.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    i.d(parameterTypes, "getParameterTypes(...)");
                    if (i.a(f.i(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i8++;
            }
            f24549b = method2;
            int length2 = methods.length;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                Method method3 = methods[i7];
                if (i.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i7++;
            }
            f24550c = method;
        }

        private C0103a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        Method method = C0103a.f24549b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public r6.c b() {
        return new r6.b();
    }
}
