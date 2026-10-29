package y5;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class k {

    /* compiled from: MyApplication */
    static class a extends k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f27802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f27803b;

        a(Method method, Object obj) {
            this.f27802a = method;
            this.f27803b = obj;
        }

        @Override // y5.k
        public Object b(Class cls) {
            return this.f27802a.invoke(this.f27803b, cls);
        }
    }

    /* compiled from: MyApplication */
    static class b extends k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f27804a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f27805b;

        b(Method method, int i7) {
            this.f27804a = method;
            this.f27805b = i7;
        }

        @Override // y5.k
        public Object b(Class cls) {
            return this.f27804a.invoke(null, cls, Integer.valueOf(this.f27805b));
        }
    }

    /* compiled from: MyApplication */
    static class c extends k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f27806a;

        c(Method method) {
            this.f27806a = method;
        }

        @Override // y5.k
        public Object b(Class cls) {
            return this.f27806a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: MyApplication */
    static class d extends k {
        d() {
        }

        @Override // y5.k
        public Object b(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static k a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract Object b(Class cls);
}
