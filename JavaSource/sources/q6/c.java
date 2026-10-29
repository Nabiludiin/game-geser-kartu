package q6;

import f6.b0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p6.t;
import p6.u;
import p6.v;
import p6.w;

/* compiled from: MyApplication */
public final class c implements u6.b, b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f25695b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map f25696c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap f25697d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f25698e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap f25699f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f25700g;

    /* renamed from: a, reason: collision with root package name */
    private final Class f25701a;

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final String a(Class cls) {
            String str;
            i.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (!cls.isLocalClass()) {
                if (!cls.isArray()) {
                    String str3 = (String) c.f25700g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) c.f25700g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                i.b(simpleName);
                String F = w6.e.F(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (F != null) {
                    return F;
                }
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                i.b(simpleName);
                return w6.e.E(simpleName, '$', null, 2, null);
            }
            i.b(simpleName);
            return w6.e.F(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        private a() {
        }
    }

    static {
        int i7 = 0;
        List e8 = f6.l.e(p6.a.class, p6.l.class, p6.p.class, p6.q.class, p6.r.class, p6.s.class, t.class, u.class, v.class, w.class, p6.b.class, p6.c.class, p6.d.class, p6.e.class, p6.f.class, p6.g.class, p6.h.class, p6.i.class, p6.j.class, p6.k.class, p6.m.class, p6.n.class, p6.o.class);
        ArrayList arrayList = new ArrayList(f6.l.h(e8, 10));
        for (Object obj : e8) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                f6.l.g();
            }
            arrayList.add(e6.p.a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f25696c = b0.g(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f25697d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f25698e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.b(str);
            sb.append(w6.e.H(str, '.', null, 2, null));
            sb.append("CompanionObject");
            e6.l a8 = e6.p.a(sb.toString(), str + ".Companion");
            hashMap3.put(a8.c(), a8.d());
        }
        for (Map.Entry entry : f25696c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f25699f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(b0.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, w6.e.H(str2, '.', null, 2, null));
        }
        f25700g = linkedHashMap;
    }

    public c(Class cls) {
        i.e(cls, "jClass");
        this.f25701a = cls;
    }

    @Override // u6.b
    public String a() {
        return f25695b.a(b());
    }

    @Override // q6.b
    public Class b() {
        return this.f25701a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && i.a(o6.a.a(this), o6.a.a((u6.b) obj));
    }

    public int hashCode() {
        return o6.a.a(this).hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
