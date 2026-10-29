package y5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f27742a;

    /* compiled from: MyApplication */
    class a implements y5.h {
        a() {
        }

        @Override // y5.h
        public Object a() {
            return new LinkedHashMap();
        }
    }

    /* compiled from: MyApplication */
    class b implements y5.h {
        b() {
        }

        @Override // y5.h
        public Object a() {
            return new y5.g();
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: y5.c$c, reason: collision with other inner class name */
    class C0157c implements y5.h {

        /* renamed from: a, reason: collision with root package name */
        private final k f27745a = k.a();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f27746b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f27747c;

        C0157c(Class cls, Type type) {
            this.f27746b = cls;
            this.f27747c = type;
        }

        @Override // y5.h
        public Object a() {
            try {
                return this.f27745a.b(this.f27746b);
            } catch (Exception e8) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f27747c + ". Register an InstanceCreator with Gson for this type may fix this problem.", e8);
            }
        }
    }

    /* compiled from: MyApplication */
    class d implements y5.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f27749a;

        d(Constructor constructor) {
            this.f27749a = constructor;
        }

        @Override // y5.h
        public Object a() {
            try {
                return this.f27749a.newInstance(null);
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Failed to invoke " + this.f27749a + " with no args", e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke " + this.f27749a + " with no args", e10.getTargetException());
            }
        }
    }

    /* compiled from: MyApplication */
    class e implements y5.h {
        e() {
        }

        @Override // y5.h
        public Object a() {
            return new TreeSet();
        }
    }

    /* compiled from: MyApplication */
    class f implements y5.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f27752a;

        f(Type type) {
            this.f27752a = type;
        }

        @Override // y5.h
        public Object a() {
            Type type = this.f27752a;
            if (!(type instanceof ParameterizedType)) {
                throw new w5.h("Invalid EnumSet type: " + this.f27752a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new w5.h("Invalid EnumSet type: " + this.f27752a.toString());
        }
    }

    /* compiled from: MyApplication */
    class g implements y5.h {
        g() {
        }

        @Override // y5.h
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* compiled from: MyApplication */
    class h implements y5.h {
        h() {
        }

        @Override // y5.h
        public Object a() {
            return new LinkedList();
        }
    }

    /* compiled from: MyApplication */
    class i implements y5.h {
        i() {
        }

        @Override // y5.h
        public Object a() {
            return new ArrayList();
        }
    }

    /* compiled from: MyApplication */
    class j implements y5.h {
        j() {
        }

        @Override // y5.h
        public Object a() {
            return new TreeMap();
        }
    }

    public c(Map map) {
        this.f27742a = map;
    }

    private y5.h b(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new d(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private y5.h c(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new e() : EnumSet.class.isAssignableFrom(cls) ? new f(type) : Set.class.isAssignableFrom(cls) ? new g() : Queue.class.isAssignableFrom(cls) ? new h() : new i();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return SortedMap.class.isAssignableFrom(cls) ? new j() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(a6.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new b() : new a();
        }
        return null;
    }

    private y5.h d(Type type, Class cls) {
        return new C0157c(cls, type);
    }

    public y5.h a(a6.a aVar) {
        Type d8 = aVar.d();
        Class c8 = aVar.c();
        android.support.v4.media.session.b.a(this.f27742a.get(d8));
        android.support.v4.media.session.b.a(this.f27742a.get(c8));
        y5.h b8 = b(c8);
        if (b8 != null) {
            return b8;
        }
        y5.h c9 = c(d8, c8);
        return c9 != null ? c9 : d(d8, c8);
    }

    public String toString() {
        return this.f27742a.toString();
    }
}
