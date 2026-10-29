package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static Map f2526a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map f2527b = new HashMap();

    private static f a(Constructor constructor, Object obj) {
        try {
            android.support.v4.media.session.b.a(constructor.newInstance(obj));
            return null;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c8 = c(canonicalName);
            if (!name.isEmpty()) {
                c8 = name + "." + c8;
            }
            Constructor declaredConstructor = Class.forName(c8).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    private static int d(Class cls) {
        Integer num = (Integer) f2526a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g8 = g(cls);
        f2526a.put(cls, Integer.valueOf(g8));
        return g8;
    }

    private static boolean e(Class cls) {
        return cls != null && j.class.isAssignableFrom(cls);
    }

    static i f(Object obj) {
        boolean z7 = obj instanceof i;
        boolean z8 = obj instanceof e;
        if (z7 && z8) {
            return new FullLifecycleObserverAdapter((e) obj, (i) obj);
        }
        if (z8) {
            return new FullLifecycleObserverAdapter((e) obj, null);
        }
        if (z7) {
            return (i) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f2527b.get(cls);
        if (list.size() == 1) {
            a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        f[] fVarArr = new f[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            a((Constructor) list.get(i7), obj);
            fVarArr[i7] = null;
        }
        return new CompositeGeneratedAdaptersObserver(fVarArr);
    }

    private static int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b8 = b(cls);
        if (b8 != null) {
            f2527b.put(cls, Collections.singletonList(b8));
            return 2;
        }
        if (a.f2498c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (!e(superclass)) {
            arrayList = null;
        } else {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) f2527b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) f2527b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f2527b.put(cls, arrayList);
        return 2;
    }
}
