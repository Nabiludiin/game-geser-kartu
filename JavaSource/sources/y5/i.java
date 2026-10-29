package y5;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f27797a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f27798b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        a(hashMap, hashMap2, Character.TYPE, Character.class);
        a(hashMap, hashMap2, Double.TYPE, Double.class);
        a(hashMap, hashMap2, Float.TYPE, Float.class);
        a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        a(hashMap, hashMap2, Long.TYPE, Long.class);
        a(hashMap, hashMap2, Short.TYPE, Short.class);
        a(hashMap, hashMap2, Void.TYPE, Void.class);
        f27797a = Collections.unmodifiableMap(hashMap);
        f27798b = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    public static boolean b(Type type) {
        return f27797a.containsKey(type);
    }

    public static Class c(Class cls) {
        Class cls2 = (Class) f27797a.get(a.b(cls));
        return cls2 == null ? cls : cls2;
    }
}
