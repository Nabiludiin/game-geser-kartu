package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* compiled from: MyApplication */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final r.h f2272a = new r.h();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        r.h hVar = f2272a;
        r.h hVar2 = (r.h) hVar.get(classLoader);
        if (hVar2 == null) {
            hVar2 = new r.h();
            hVar.put(classLoader, hVar2);
        }
        Class cls = (Class) hVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        hVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e8) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e8);
        } catch (ClassNotFoundException e9) {
            throw new Fragment.f("Unable to instantiate fragment " + str + ": make sure class name exists", e9);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
