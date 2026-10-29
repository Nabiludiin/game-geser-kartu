package f5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f23719a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f23720b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23721c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23722d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23723e;

    /* renamed from: f, reason: collision with root package name */
    private final h f23724f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f23725g;

    public static b c(e0 e0Var) {
        return new b(e0Var, new e0[0]);
    }

    public static b d(e0 e0Var, e0... e0VarArr) {
        return new b(e0Var, e0VarArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static c l(final Object obj, Class cls) {
        return m(cls).e(new h() { // from class: f5.a
            @Override // f5.h
            public final Object a(e eVar) {
                return c.b(obj, eVar);
            }
        }).c();
    }

    public static b m(Class cls) {
        return e(cls).f();
    }

    public static c q(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).e(new h() { // from class: f5.b
            @Override // f5.h
            public final Object a(e eVar) {
                return c.a(obj, eVar);
            }
        }).c();
    }

    public Set g() {
        return this.f23721c;
    }

    public h h() {
        return this.f23724f;
    }

    public String i() {
        return this.f23719a;
    }

    public Set j() {
        return this.f23720b;
    }

    public Set k() {
        return this.f23725g;
    }

    public boolean n() {
        return this.f23722d == 1;
    }

    public boolean o() {
        return this.f23722d == 2;
    }

    public boolean p() {
        return this.f23723e == 0;
    }

    public c r(h hVar) {
        return new c(this.f23719a, this.f23720b, this.f23721c, this.f23722d, this.f23723e, hVar, this.f23725g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f23720b.toArray()) + ">{" + this.f23722d + ", type=" + this.f23723e + ", deps=" + Arrays.toString(this.f23721c.toArray()) + "}";
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f23726a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f23727b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f23728c;

        /* renamed from: d, reason: collision with root package name */
        private int f23729d;

        /* renamed from: e, reason: collision with root package name */
        private int f23730e;

        /* renamed from: f, reason: collision with root package name */
        private h f23731f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f23732g;

        /* JADX INFO: Access modifiers changed from: private */
        public b f() {
            this.f23730e = 1;
            return this;
        }

        private b g(int i7) {
            d0.d(this.f23729d == 0, "Instantiation type has already been set.");
            this.f23729d = i7;
            return this;
        }

        private void h(e0 e0Var) {
            d0.a(!this.f23727b.contains(e0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            d0.c(rVar, "Null dependency");
            h(rVar.b());
            this.f23728c.add(rVar);
            return this;
        }

        public c c() {
            d0.d(this.f23731f != null, "Missing required property: factory.");
            return new c(this.f23726a, new HashSet(this.f23727b), new HashSet(this.f23728c), this.f23729d, this.f23730e, this.f23731f, this.f23732g);
        }

        public b d() {
            return g(2);
        }

        public b e(h hVar) {
            this.f23731f = (h) d0.c(hVar, "Null factory");
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f23726a = null;
            HashSet hashSet = new HashSet();
            this.f23727b = hashSet;
            this.f23728c = new HashSet();
            this.f23729d = 0;
            this.f23730e = 0;
            this.f23732g = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(e0.b(cls));
            for (Class cls2 : clsArr) {
                d0.c(cls2, "Null interface");
                this.f23727b.add(e0.b(cls2));
            }
        }

        private b(e0 e0Var, e0... e0VarArr) {
            this.f23726a = null;
            HashSet hashSet = new HashSet();
            this.f23727b = hashSet;
            this.f23728c = new HashSet();
            this.f23729d = 0;
            this.f23730e = 0;
            this.f23732g = new HashSet();
            d0.c(e0Var, "Null interface");
            hashSet.add(e0Var);
            for (e0 e0Var2 : e0VarArr) {
                d0.c(e0Var2, "Null interface");
            }
            Collections.addAll(this.f23727b, e0VarArr);
        }
    }

    private c(String str, Set set, Set set2, int i7, int i8, h hVar, Set set3) {
        this.f23719a = str;
        this.f23720b = Collections.unmodifiableSet(set);
        this.f23721c = Collections.unmodifiableSet(set2);
        this.f23722d = i7;
        this.f23723e = i8;
        this.f23724f = hVar;
        this.f23725g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object obj, e eVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, e eVar) {
        return obj;
    }
}
