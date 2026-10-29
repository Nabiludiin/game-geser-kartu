package y5;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f27735a = new Type[0];

    /* compiled from: MyApplication */
    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: q, reason: collision with root package name */
        private final Type f27736q;

        public a(Type type) {
            this.f27736q = b.d(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.h(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f27736q;
        }

        public int hashCode() {
            return this.f27736q.hashCode();
        }

        public String toString() {
            return b.v(this.f27736q) + "[]";
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: y5.b$b, reason: collision with other inner class name */
    private static final class C0156b implements ParameterizedType, Serializable {

        /* renamed from: q, reason: collision with root package name */
        private final Type f27737q;

        /* renamed from: r, reason: collision with root package name */
        private final Type f27738r;

        /* renamed from: s, reason: collision with root package name */
        private final Type[] f27739s;

        public C0156b(Type type, Type type2, Type... typeArr) {
            int i7 = 0;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z7 = true;
                boolean z8 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z8) {
                    z7 = false;
                }
                y5.a.a(z7);
            }
            this.f27737q = type == null ? null : b.d(type);
            this.f27738r = b.d(type2);
            this.f27739s = (Type[]) typeArr.clone();
            while (true) {
                Type[] typeArr2 = this.f27739s;
                if (i7 >= typeArr2.length) {
                    return;
                }
                y5.a.b(typeArr2[i7]);
                b.e(this.f27739s[i7]);
                Type[] typeArr3 = this.f27739s;
                typeArr3[i7] = b.d(typeArr3[i7]);
                i7++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.h(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f27739s.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f27737q;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f27738r;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f27739s) ^ this.f27738r.hashCode()) ^ b.o(this.f27737q);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f27739s.length + 1) * 30);
            sb.append(b.v(this.f27738r));
            if (this.f27739s.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(b.v(this.f27739s[0]));
            for (int i7 = 1; i7 < this.f27739s.length; i7++) {
                sb.append(", ");
                sb.append(b.v(this.f27739s[i7]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: MyApplication */
    private static final class c implements WildcardType, Serializable {

        /* renamed from: q, reason: collision with root package name */
        private final Type f27740q;

        /* renamed from: r, reason: collision with root package name */
        private final Type f27741r;

        public c(Type[] typeArr, Type[] typeArr2) {
            y5.a.a(typeArr2.length <= 1);
            y5.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                y5.a.b(typeArr[0]);
                b.e(typeArr[0]);
                this.f27741r = null;
                this.f27740q = b.d(typeArr[0]);
                return;
            }
            y5.a.b(typeArr2[0]);
            b.e(typeArr2[0]);
            y5.a.a(typeArr[0] == Object.class);
            this.f27741r = b.d(typeArr2[0]);
            this.f27740q = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.h(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f27741r;
            return type != null ? new Type[]{type} : b.f27735a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f27740q};
        }

        public int hashCode() {
            Type type = this.f27741r;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f27740q.hashCode() + 31);
        }

        public String toString() {
            if (this.f27741r != null) {
                return "? super " + b.v(this.f27741r);
            }
            if (this.f27740q == Object.class) {
                return "?";
            }
            return "? extends " + b.v(this.f27740q);
        }
    }

    public static GenericArrayType c(Type type) {
        return new a(type);
    }

    public static Type d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(d(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0156b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Type type) {
        y5.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Class f(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean h(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return g(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return h(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type i(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type j(Type type, Class cls) {
        Type n7 = n(type, cls, Collection.class);
        if (n7 instanceof WildcardType) {
            n7 = ((WildcardType) n7).getUpperBounds()[0];
        }
        return n7 instanceof ParameterizedType ? ((ParameterizedType) n7).getActualTypeArguments()[0] : Object.class;
    }

    static Type k(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return k(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return k(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] l(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type n7 = n(type, cls, Map.class);
        return n7 instanceof ParameterizedType ? ((ParameterizedType) n7).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class m(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            y5.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) m(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static Type n(Type type, Class cls, Class cls2) {
        y5.a.a(cls2.isAssignableFrom(cls));
        return r(type, cls, k(type, cls, cls2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int p(Object[] objArr, Object obj) {
        for (int i7 = 0; i7 < objArr.length; i7++) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType q(Type type, Type type2, Type... typeArr) {
        return new C0156b(type, type2, typeArr);
    }

    public static Type r(Type type, Class cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type s7 = s(type, cls, typeVariable);
            if (s7 == typeVariable) {
                return s7;
            }
            type3 = s7;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type r7 = r(type, cls, componentType);
                return componentType == r7 ? cls2 : c(r7);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type r8 = r(type, cls, genericComponentType);
            return genericComponentType == r8 ? genericArrayType : c(r8);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type r9 = r(type, cls, ownerType);
            boolean z7 = r9 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i7 = 0; i7 < length; i7++) {
                Type r10 = r(type, cls, actualTypeArguments[i7]);
                if (r10 != actualTypeArguments[i7]) {
                    if (!z7) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z7 = true;
                    }
                    actualTypeArguments[i7] = r10;
                }
            }
            return z7 ? q(r9, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z8 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z8) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type r11 = r(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (r11 != lowerBounds[0]) {
                    return u(r11);
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type r12 = r(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (r12 != upperBounds[0]) {
                        return t(r12);
                    }
                }
            }
        }
        return type4;
    }

    static Type s(Type type, Class cls, TypeVariable typeVariable) {
        Class f8 = f(typeVariable);
        if (f8 != null) {
            Type k7 = k(type, cls, f8);
            if (k7 instanceof ParameterizedType) {
                return ((ParameterizedType) k7).getActualTypeArguments()[p(f8.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static WildcardType t(Type type) {
        return new c(new Type[]{type}, f27735a);
    }

    public static WildcardType u(Type type) {
        return new c(new Type[]{Object.class}, new Type[]{type});
    }

    public static String v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
