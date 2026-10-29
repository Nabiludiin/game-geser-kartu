package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private final j f2369a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f2370b;

    /* renamed from: d, reason: collision with root package name */
    int f2372d;

    /* renamed from: e, reason: collision with root package name */
    int f2373e;

    /* renamed from: f, reason: collision with root package name */
    int f2374f;

    /* renamed from: g, reason: collision with root package name */
    int f2375g;

    /* renamed from: h, reason: collision with root package name */
    int f2376h;

    /* renamed from: i, reason: collision with root package name */
    boolean f2377i;

    /* renamed from: k, reason: collision with root package name */
    String f2379k;

    /* renamed from: l, reason: collision with root package name */
    int f2380l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f2381m;

    /* renamed from: n, reason: collision with root package name */
    int f2382n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f2383o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f2384p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f2385q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f2387s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f2371c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f2378j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f2386r = false;

    /* compiled from: MyApplication */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f2388a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f2389b;

        /* renamed from: c, reason: collision with root package name */
        int f2390c;

        /* renamed from: d, reason: collision with root package name */
        int f2391d;

        /* renamed from: e, reason: collision with root package name */
        int f2392e;

        /* renamed from: f, reason: collision with root package name */
        int f2393f;

        /* renamed from: g, reason: collision with root package name */
        g.c f2394g;

        /* renamed from: h, reason: collision with root package name */
        g.c f2395h;

        a() {
        }

        a(int i7, Fragment fragment) {
            this.f2388a = i7;
            this.f2389b = fragment;
            g.c cVar = g.c.RESUMED;
            this.f2394g = cVar;
            this.f2395h = cVar;
        }
    }

    v(j jVar, ClassLoader classLoader) {
        this.f2369a = jVar;
        this.f2370b = classLoader;
    }

    public v b(int i7, Fragment fragment, String str) {
        j(i7, fragment, str, 1);
        return this;
    }

    v c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.W = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public v d(Fragment fragment, String str) {
        j(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f2371c.add(aVar);
        aVar.f2390c = this.f2372d;
        aVar.f2391d = this.f2373e;
        aVar.f2392e = this.f2374f;
        aVar.f2393f = this.f2375g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public v i() {
        if (this.f2377i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f2378j = false;
        return this;
    }

    void j(int i7, Fragment fragment, String str, int i8) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.O;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.O + " now " + str);
            }
            fragment.O = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i9 = fragment.M;
            if (i9 != 0 && i9 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.M + " now " + i7);
            }
            fragment.M = i7;
            fragment.N = i7;
        }
        e(new a(i8, fragment));
    }

    public v k(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public v l(boolean z7) {
        this.f2386r = z7;
        return this;
    }
}
