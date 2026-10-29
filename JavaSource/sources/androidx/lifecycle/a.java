package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
final class a {

    /* renamed from: c, reason: collision with root package name */
    static a f2498c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f2499a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f2500b = new HashMap();

    /* compiled from: MyApplication */
    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0040a {

        /* renamed from: a, reason: collision with root package name */
        final Map f2501a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f2502b;

        C0040a(Map map) {
            this.f2502b = map;
            for (Map.Entry entry : map.entrySet()) {
                g.b bVar = (g.b) entry.getValue();
                List list = (List) this.f2501a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2501a.put(bVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        private static void b(List list, k kVar, g.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(kVar, bVar, obj);
                }
            }
        }

        void a(k kVar, g.b bVar, Object obj) {
            b((List) this.f2501a.get(bVar), kVar, bVar, obj);
            b((List) this.f2501a.get(g.b.ON_ANY), kVar, bVar, obj);
        }
    }

    /* compiled from: MyApplication */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f2503a;

        /* renamed from: b, reason: collision with root package name */
        final Method f2504b;

        b(int i7, Method method) {
            this.f2503a = i7;
            this.f2504b = method;
            method.setAccessible(true);
        }

        void a(k kVar, g.b bVar, Object obj) {
            try {
                int i7 = this.f2503a;
                if (i7 == 0) {
                    this.f2504b.invoke(obj, null);
                } else if (i7 == 1) {
                    this.f2504b.invoke(obj, kVar);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f2504b.invoke(obj, kVar, bVar);
                }
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException("Failed to call observer method", e9.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2503a == bVar.f2503a && this.f2504b.getName().equals(bVar.f2504b.getName());
        }

        public int hashCode() {
            return (this.f2503a * 31) + this.f2504b.getName().hashCode();
        }
    }

    a() {
    }

    private C0040a a(Class cls, Method[] methodArr) {
        int i7;
        C0040a c8;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c8 = c(superclass)) != null) {
            hashMap.putAll(c8.f2502b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f2502b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (g.b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            r rVar = (r) method.getAnnotation(r.class);
            if (rVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(k.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                g.b value = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != g.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i7, method), value, cls);
                z7 = true;
            }
        }
        C0040a c0040a = new C0040a(hashMap);
        this.f2499a.put(cls, c0040a);
        this.f2500b.put(cls, Boolean.valueOf(z7));
        return c0040a;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e8) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
        }
    }

    private void e(Map map, b bVar, g.b bVar2, Class cls) {
        g.b bVar3 = (g.b) map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2504b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    C0040a c(Class cls) {
        C0040a c0040a = (C0040a) this.f2499a.get(cls);
        return c0040a != null ? c0040a : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f2500b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b8 = b(cls);
        for (Method method : b8) {
            if (((r) method.getAnnotation(r.class)) != null) {
                a(cls, b8);
                return true;
            }
        }
        this.f2500b.put(cls, Boolean.FALSE);
        return false;
    }
}
