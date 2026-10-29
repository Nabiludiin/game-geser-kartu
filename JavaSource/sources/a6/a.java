package a6;

import java.lang.reflect.Type;
import y5.b;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final Class f14a;

    /* renamed from: b, reason: collision with root package name */
    final Type f15b;

    /* renamed from: c, reason: collision with root package name */
    final int f16c;

    a(Type type) {
        Type d8 = b.d((Type) y5.a.b(type));
        this.f15b = d8;
        this.f14a = b.m(d8);
        this.f16c = d8.hashCode();
    }

    public static a a(Class cls) {
        return new a(cls);
    }

    public static a b(Type type) {
        return new a(type);
    }

    public final Class c() {
        return this.f14a;
    }

    public final Type d() {
        return this.f15b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.h(this.f15b, ((a) obj).f15b);
    }

    public final int hashCode() {
        return this.f16c;
    }

    public final String toString() {
        return b.v(this.f15b);
    }
}
