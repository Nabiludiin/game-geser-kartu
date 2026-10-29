package i6;

import java.lang.reflect.Method;

/* compiled from: MyApplication */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f24183a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f24184b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f24185c;

    /* compiled from: MyApplication */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f24186a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f24187b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f24188c;

        public a(Method method, Method method2, Method method3) {
            this.f24186a = method;
            this.f24187b = method2;
            this.f24188c = method3;
        }
    }

    private i() {
    }

    private final a a(i6.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f24185c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f24184b;
            f24185c = aVar3;
            return aVar3;
        }
    }

    public final String b(i6.a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        q6.i.e(aVar, "continuation");
        a aVar2 = f24185c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 != f24184b && (method = aVar2.f24186a) != null && (invoke = method.invoke(aVar.getClass(), null)) != null && (method2 = aVar2.f24187b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = aVar2.f24188c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                return (String) invoke3;
            }
        }
        return null;
    }
}
