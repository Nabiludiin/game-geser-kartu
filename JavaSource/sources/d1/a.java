package d1;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class a implements d1.h {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f23062c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f23063a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23064b;

    /* compiled from: MyApplication */
    /* renamed from: d1.a$a, reason: collision with other inner class name */
    private static class C0082a {

        /* renamed from: a, reason: collision with root package name */
        static final Set f23065a = new HashSet(Arrays.asList(t.c().a()));
    }

    /* compiled from: MyApplication */
    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return true;
        }
    }

    /* compiled from: MyApplication */
    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* compiled from: MyApplication */
    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return false;
        }
    }

    /* compiled from: MyApplication */
    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* compiled from: MyApplication */
    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* compiled from: MyApplication */
    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* compiled from: MyApplication */
    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: MyApplication */
    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // d1.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f23063a = str;
        this.f23064b = str2;
        f23062c.add(this);
    }

    public static Set e() {
        return Collections.unmodifiableSet(f23062c);
    }

    @Override // d1.h
    public String a() {
        return this.f23063a;
    }

    @Override // d1.h
    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return h7.a.b(C0082a.f23065a, this.f23064b);
    }
}
