package i5;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f24175a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f24176b;

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f24177a;

        /* renamed from: b, reason: collision with root package name */
        private Map f24178b = null;

        b(String str) {
            this.f24177a = str;
        }

        public c a() {
            return new c(this.f24177a, this.f24178b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f24178b)));
        }

        public b b(Annotation annotation) {
            if (this.f24178b == null) {
                this.f24178b = new HashMap();
            }
            this.f24178b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f24175a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f24176b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24175a.equals(cVar.f24175a) && this.f24176b.equals(cVar.f24176b);
    }

    public int hashCode() {
        return (this.f24175a.hashCode() * 31) + this.f24176b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f24175a + ", properties=" + this.f24176b.values() + "}";
    }

    private c(String str, Map map) {
        this.f24175a = str;
        this.f24176b = map;
    }
}
