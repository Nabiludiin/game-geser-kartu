package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: MyApplication */
public class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f1910b;

    /* renamed from: a, reason: collision with root package name */
    private final l f1911a;

    /* compiled from: MyApplication */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Field f1912a;

        /* renamed from: b, reason: collision with root package name */
        private static Field f1913b;

        /* renamed from: c, reason: collision with root package name */
        private static Field f1914c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1915d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1912a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1913b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1914c = declaredField3;
                declaredField3.setAccessible(true);
                f1915d = true;
            } catch (ReflectiveOperationException e8) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
            }
        }

        public static p0 a(View view) {
            if (f1915d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1912a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1913b.get(obj);
                        Rect rect2 = (Rect) f1914c.get(obj);
                        if (rect != null && rect2 != null) {
                            p0 a8 = new b().b(androidx.core.graphics.f.c(rect)).c(androidx.core.graphics.f.c(rect2)).a();
                            a8.r(a8);
                            a8.d(view.getRootView());
                            return a8;
                        }
                    }
                } catch (IllegalAccessException e8) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e8.getMessage(), e8);
                }
            }
            return null;
        }
    }

    /* compiled from: MyApplication */
    private static class e extends d {
        e() {
        }

        e(p0 p0Var) {
            super(p0Var);
        }
    }

    /* compiled from: MyApplication */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final p0 f1924a;

        /* renamed from: b, reason: collision with root package name */
        androidx.core.graphics.f[] f1925b;

        f() {
            this(new p0((p0) null));
        }

        protected final void a() {
            androidx.core.graphics.f[] fVarArr = this.f1925b;
            if (fVarArr != null) {
                androidx.core.graphics.f fVar = fVarArr[m.b(1)];
                androidx.core.graphics.f fVar2 = this.f1925b[m.b(2)];
                if (fVar2 == null) {
                    fVar2 = this.f1924a.f(2);
                }
                if (fVar == null) {
                    fVar = this.f1924a.f(1);
                }
                f(androidx.core.graphics.f.a(fVar, fVar2));
                androidx.core.graphics.f fVar3 = this.f1925b[m.b(16)];
                if (fVar3 != null) {
                    e(fVar3);
                }
                androidx.core.graphics.f fVar4 = this.f1925b[m.b(32)];
                if (fVar4 != null) {
                    c(fVar4);
                }
                androidx.core.graphics.f fVar5 = this.f1925b[m.b(64)];
                if (fVar5 != null) {
                    g(fVar5);
                }
            }
        }

        abstract p0 b();

        abstract void d(androidx.core.graphics.f fVar);

        abstract void f(androidx.core.graphics.f fVar);

        f(p0 p0Var) {
            this.f1924a = p0Var;
        }

        void c(androidx.core.graphics.f fVar) {
        }

        void e(androidx.core.graphics.f fVar) {
        }

        void g(androidx.core.graphics.f fVar) {
        }
    }

    /* compiled from: MyApplication */
    private static class i extends h {
        i(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
        }

        @Override // androidx.core.view.p0.l
        p0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f1931c.consumeDisplayCutout();
            return p0.u(consumeDisplayCutout);
        }

        @Override // androidx.core.view.p0.g, androidx.core.view.p0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f1931c, iVar.f1931c) && Objects.equals(this.f1935g, iVar.f1935g);
        }

        @Override // androidx.core.view.p0.l
        androidx.core.view.n f() {
            DisplayCutout displayCutout;
            displayCutout = this.f1931c.getDisplayCutout();
            return androidx.core.view.n.e(displayCutout);
        }

        @Override // androidx.core.view.p0.l
        public int hashCode() {
            return this.f1931c.hashCode();
        }

        i(p0 p0Var, i iVar) {
            super(p0Var, iVar);
        }
    }

    /* compiled from: MyApplication */
    private static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        static final p0 f1940q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f1940q = p0.u(windowInsets);
        }

        k(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
        }

        @Override // androidx.core.view.p0.g, androidx.core.view.p0.l
        public androidx.core.graphics.f g(int i7) {
            Insets insets;
            insets = this.f1931c.getInsets(n.a(i7));
            return androidx.core.graphics.f.d(insets);
        }

        k(p0 p0Var, k kVar) {
            super(p0Var, kVar);
        }

        @Override // androidx.core.view.p0.g, androidx.core.view.p0.l
        final void d(View view) {
        }
    }

    /* compiled from: MyApplication */
    public static final class m {
        public static int a() {
            return 128;
        }

        static int b(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == 128) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
        }

        public static int c() {
            return 7;
        }
    }

    /* compiled from: MyApplication */
    private static final class n {
        static int a(int i7) {
            int statusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= statusBars;
                }
            }
            return i8;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1910b = k.f1940q;
        } else {
            f1910b = l.f1941b;
        }
    }

    private p0(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f1911a = new k(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f1911a = new j(this, windowInsets);
        } else if (i7 >= 28) {
            this.f1911a = new i(this, windowInsets);
        } else {
            this.f1911a = new h(this, windowInsets);
        }
    }

    static androidx.core.graphics.f m(androidx.core.graphics.f fVar, int i7, int i8, int i9, int i10) {
        int max = Math.max(0, fVar.f1711a - i7);
        int max2 = Math.max(0, fVar.f1712b - i8);
        int max3 = Math.max(0, fVar.f1713c - i9);
        int max4 = Math.max(0, fVar.f1714d - i10);
        return (max == i7 && max2 == i8 && max3 == i9 && max4 == i10) ? fVar : androidx.core.graphics.f.b(max, max2, max3, max4);
    }

    public static p0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static p0 v(WindowInsets windowInsets, View view) {
        p0 p0Var = new p0((WindowInsets) androidx.core.util.e.f(windowInsets));
        if (view != null && e0.A(view)) {
            p0Var.r(e0.u(view));
            p0Var.d(view.getRootView());
        }
        return p0Var;
    }

    public p0 a() {
        return this.f1911a.a();
    }

    public p0 b() {
        return this.f1911a.b();
    }

    public p0 c() {
        return this.f1911a.c();
    }

    void d(View view) {
        this.f1911a.d(view);
    }

    public androidx.core.view.n e() {
        return this.f1911a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            return androidx.core.util.c.a(this.f1911a, ((p0) obj).f1911a);
        }
        return false;
    }

    public androidx.core.graphics.f f(int i7) {
        return this.f1911a.g(i7);
    }

    public androidx.core.graphics.f g() {
        return this.f1911a.i();
    }

    public int h() {
        return this.f1911a.k().f1714d;
    }

    public int hashCode() {
        l lVar = this.f1911a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f1911a.k().f1711a;
    }

    public int j() {
        return this.f1911a.k().f1713c;
    }

    public int k() {
        return this.f1911a.k().f1712b;
    }

    public p0 l(int i7, int i8, int i9, int i10) {
        return this.f1911a.m(i7, i8, i9, i10);
    }

    public boolean n() {
        return this.f1911a.n();
    }

    public p0 o(int i7, int i8, int i9, int i10) {
        return new b(this).c(androidx.core.graphics.f.b(i7, i8, i9, i10)).a();
    }

    void p(androidx.core.graphics.f[] fVarArr) {
        this.f1911a.p(fVarArr);
    }

    void q(androidx.core.graphics.f fVar) {
        this.f1911a.q(fVar);
    }

    void r(p0 p0Var) {
        this.f1911a.r(p0Var);
    }

    void s(androidx.core.graphics.f fVar) {
        this.f1911a.s(fVar);
    }

    public WindowInsets t() {
        l lVar = this.f1911a;
        if (lVar instanceof g) {
            return ((g) lVar).f1931c;
        }
        return null;
    }

    /* compiled from: MyApplication */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f1917e = null;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f1918f = false;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor f1919g = null;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f1920h = false;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f1921c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.f f1922d;

        c() {
            this.f1921c = h();
        }

        private static WindowInsets h() {
            if (!f1918f) {
                try {
                    f1917e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
                }
                f1918f = true;
            }
            Field field = f1917e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
                }
            }
            if (!f1920h) {
                try {
                    f1919g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
                }
                f1920h = true;
            }
            Constructor constructor = f1919g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
                }
            }
            return null;
        }

        @Override // androidx.core.view.p0.f
        p0 b() {
            a();
            p0 u7 = p0.u(this.f1921c);
            u7.p(this.f1925b);
            u7.s(this.f1922d);
            return u7;
        }

        @Override // androidx.core.view.p0.f
        void d(androidx.core.graphics.f fVar) {
            this.f1922d = fVar;
        }

        @Override // androidx.core.view.p0.f
        void f(androidx.core.graphics.f fVar) {
            WindowInsets windowInsets = this.f1921c;
            if (windowInsets != null) {
                this.f1921c = windowInsets.replaceSystemWindowInsets(fVar.f1711a, fVar.f1712b, fVar.f1713c, fVar.f1714d);
            }
        }

        c(p0 p0Var) {
            super(p0Var);
            this.f1921c = p0Var.t();
        }
    }

    /* compiled from: MyApplication */
    private static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f1923c;

        d() {
            this.f1923c = x0.a();
        }

        @Override // androidx.core.view.p0.f
        p0 b() {
            WindowInsets build;
            a();
            build = this.f1923c.build();
            p0 u7 = p0.u(build);
            u7.p(this.f1925b);
            return u7;
        }

        @Override // androidx.core.view.p0.f
        void c(androidx.core.graphics.f fVar) {
            this.f1923c.setMandatorySystemGestureInsets(fVar.e());
        }

        @Override // androidx.core.view.p0.f
        void d(androidx.core.graphics.f fVar) {
            this.f1923c.setStableInsets(fVar.e());
        }

        @Override // androidx.core.view.p0.f
        void e(androidx.core.graphics.f fVar) {
            this.f1923c.setSystemGestureInsets(fVar.e());
        }

        @Override // androidx.core.view.p0.f
        void f(androidx.core.graphics.f fVar) {
            this.f1923c.setSystemWindowInsets(fVar.e());
        }

        @Override // androidx.core.view.p0.f
        void g(androidx.core.graphics.f fVar) {
            this.f1923c.setTappableElementInsets(fVar.e());
        }

        d(p0 p0Var) {
            super(p0Var);
            WindowInsets.Builder a8;
            WindowInsets t7 = p0Var.t();
            if (t7 != null) {
                a8 = w0.a(t7);
            } else {
                a8 = x0.a();
            }
            this.f1923c = a8;
        }
    }

    /* compiled from: MyApplication */
    private static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.f f1936m;

        h(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
            this.f1936m = null;
        }

        @Override // androidx.core.view.p0.l
        p0 b() {
            return p0.u(this.f1931c.consumeStableInsets());
        }

        @Override // androidx.core.view.p0.l
        p0 c() {
            return p0.u(this.f1931c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.p0.l
        final androidx.core.graphics.f i() {
            if (this.f1936m == null) {
                this.f1936m = androidx.core.graphics.f.b(this.f1931c.getStableInsetLeft(), this.f1931c.getStableInsetTop(), this.f1931c.getStableInsetRight(), this.f1931c.getStableInsetBottom());
            }
            return this.f1936m;
        }

        @Override // androidx.core.view.p0.l
        boolean n() {
            return this.f1931c.isConsumed();
        }

        @Override // androidx.core.view.p0.l
        public void s(androidx.core.graphics.f fVar) {
            this.f1936m = fVar;
        }

        h(p0 p0Var, h hVar) {
            super(p0Var, hVar);
            this.f1936m = null;
            this.f1936m = hVar.f1936m;
        }
    }

    /* compiled from: MyApplication */
    private static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        private static boolean f1926h = false;

        /* renamed from: i, reason: collision with root package name */
        private static Method f1927i;

        /* renamed from: j, reason: collision with root package name */
        private static Class f1928j;

        /* renamed from: k, reason: collision with root package name */
        private static Field f1929k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f1930l;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f1931c;

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.f[] f1932d;

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.f f1933e;

        /* renamed from: f, reason: collision with root package name */
        private p0 f1934f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.graphics.f f1935g;

        g(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var);
            this.f1933e = null;
            this.f1931c = windowInsets;
        }

        private androidx.core.graphics.f t(int i7, boolean z7) {
            androidx.core.graphics.f fVar = androidx.core.graphics.f.f1710e;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    fVar = androidx.core.graphics.f.a(fVar, u(i8, z7));
                }
            }
            return fVar;
        }

        private androidx.core.graphics.f v() {
            p0 p0Var = this.f1934f;
            return p0Var != null ? p0Var.g() : androidx.core.graphics.f.f1710e;
        }

        private androidx.core.graphics.f w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1926h) {
                x();
            }
            Method method = f1927i;
            if (method != null && f1928j != null && f1929k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1929k.get(f1930l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.f.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }

        private static void x() {
            try {
                f1927i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1928j = cls;
                f1929k = cls.getDeclaredField("mVisibleInsets");
                f1930l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1929k.setAccessible(true);
                f1930l.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            f1926h = true;
        }

        @Override // androidx.core.view.p0.l
        void d(View view) {
            androidx.core.graphics.f w7 = w(view);
            if (w7 == null) {
                w7 = androidx.core.graphics.f.f1710e;
            }
            q(w7);
        }

        @Override // androidx.core.view.p0.l
        void e(p0 p0Var) {
            p0Var.r(this.f1934f);
            p0Var.q(this.f1935g);
        }

        @Override // androidx.core.view.p0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1935g, ((g) obj).f1935g);
            }
            return false;
        }

        @Override // androidx.core.view.p0.l
        public androidx.core.graphics.f g(int i7) {
            return t(i7, false);
        }

        @Override // androidx.core.view.p0.l
        final androidx.core.graphics.f k() {
            if (this.f1933e == null) {
                this.f1933e = androidx.core.graphics.f.b(this.f1931c.getSystemWindowInsetLeft(), this.f1931c.getSystemWindowInsetTop(), this.f1931c.getSystemWindowInsetRight(), this.f1931c.getSystemWindowInsetBottom());
            }
            return this.f1933e;
        }

        @Override // androidx.core.view.p0.l
        p0 m(int i7, int i8, int i9, int i10) {
            b bVar = new b(p0.u(this.f1931c));
            bVar.c(p0.m(k(), i7, i8, i9, i10));
            bVar.b(p0.m(i(), i7, i8, i9, i10));
            return bVar.a();
        }

        @Override // androidx.core.view.p0.l
        boolean o() {
            return this.f1931c.isRound();
        }

        @Override // androidx.core.view.p0.l
        public void p(androidx.core.graphics.f[] fVarArr) {
            this.f1932d = fVarArr;
        }

        @Override // androidx.core.view.p0.l
        void q(androidx.core.graphics.f fVar) {
            this.f1935g = fVar;
        }

        @Override // androidx.core.view.p0.l
        void r(p0 p0Var) {
            this.f1934f = p0Var;
        }

        protected androidx.core.graphics.f u(int i7, boolean z7) {
            androidx.core.graphics.f g8;
            int i8;
            if (i7 == 1) {
                return z7 ? androidx.core.graphics.f.b(0, Math.max(v().f1712b, k().f1712b), 0, 0) : androidx.core.graphics.f.b(0, k().f1712b, 0, 0);
            }
            if (i7 == 2) {
                if (z7) {
                    androidx.core.graphics.f v7 = v();
                    androidx.core.graphics.f i9 = i();
                    return androidx.core.graphics.f.b(Math.max(v7.f1711a, i9.f1711a), 0, Math.max(v7.f1713c, i9.f1713c), Math.max(v7.f1714d, i9.f1714d));
                }
                androidx.core.graphics.f k7 = k();
                p0 p0Var = this.f1934f;
                g8 = p0Var != null ? p0Var.g() : null;
                int i10 = k7.f1714d;
                if (g8 != null) {
                    i10 = Math.min(i10, g8.f1714d);
                }
                return androidx.core.graphics.f.b(k7.f1711a, 0, k7.f1713c, i10);
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return j();
                }
                if (i7 == 32) {
                    return h();
                }
                if (i7 == 64) {
                    return l();
                }
                if (i7 != 128) {
                    return androidx.core.graphics.f.f1710e;
                }
                p0 p0Var2 = this.f1934f;
                androidx.core.view.n e8 = p0Var2 != null ? p0Var2.e() : f();
                return e8 != null ? androidx.core.graphics.f.b(e8.b(), e8.d(), e8.c(), e8.a()) : androidx.core.graphics.f.f1710e;
            }
            androidx.core.graphics.f[] fVarArr = this.f1932d;
            g8 = fVarArr != null ? fVarArr[m.b(8)] : null;
            if (g8 != null) {
                return g8;
            }
            androidx.core.graphics.f k8 = k();
            androidx.core.graphics.f v8 = v();
            int i11 = k8.f1714d;
            if (i11 > v8.f1714d) {
                return androidx.core.graphics.f.b(0, 0, 0, i11);
            }
            androidx.core.graphics.f fVar = this.f1935g;
            return (fVar == null || fVar.equals(androidx.core.graphics.f.f1710e) || (i8 = this.f1935g.f1714d) <= v8.f1714d) ? androidx.core.graphics.f.f1710e : androidx.core.graphics.f.b(0, 0, 0, i8);
        }

        g(p0 p0Var, g gVar) {
            this(p0Var, new WindowInsets(gVar.f1931c));
        }
    }

    /* compiled from: MyApplication */
    private static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.f f1937n;

        /* renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.f f1938o;

        /* renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.f f1939p;

        j(p0 p0Var, WindowInsets windowInsets) {
            super(p0Var, windowInsets);
            this.f1937n = null;
            this.f1938o = null;
            this.f1939p = null;
        }

        @Override // androidx.core.view.p0.l
        androidx.core.graphics.f h() {
            Insets mandatorySystemGestureInsets;
            if (this.f1938o == null) {
                mandatorySystemGestureInsets = this.f1931c.getMandatorySystemGestureInsets();
                this.f1938o = androidx.core.graphics.f.d(mandatorySystemGestureInsets);
            }
            return this.f1938o;
        }

        @Override // androidx.core.view.p0.l
        androidx.core.graphics.f j() {
            Insets systemGestureInsets;
            if (this.f1937n == null) {
                systemGestureInsets = this.f1931c.getSystemGestureInsets();
                this.f1937n = androidx.core.graphics.f.d(systemGestureInsets);
            }
            return this.f1937n;
        }

        @Override // androidx.core.view.p0.l
        androidx.core.graphics.f l() {
            Insets tappableElementInsets;
            if (this.f1939p == null) {
                tappableElementInsets = this.f1931c.getTappableElementInsets();
                this.f1939p = androidx.core.graphics.f.d(tappableElementInsets);
            }
            return this.f1939p;
        }

        @Override // androidx.core.view.p0.g, androidx.core.view.p0.l
        p0 m(int i7, int i8, int i9, int i10) {
            WindowInsets inset;
            inset = this.f1931c.inset(i7, i8, i9, i10);
            return p0.u(inset);
        }

        j(p0 p0Var, j jVar) {
            super(p0Var, jVar);
            this.f1937n = null;
            this.f1938o = null;
            this.f1939p = null;
        }

        @Override // androidx.core.view.p0.h, androidx.core.view.p0.l
        public void s(androidx.core.graphics.f fVar) {
        }
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f1916a;

        public b() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.f1916a = new e();
            } else if (i7 >= 29) {
                this.f1916a = new d();
            } else {
                this.f1916a = new c();
            }
        }

        public p0 a() {
            return this.f1916a.b();
        }

        public b b(androidx.core.graphics.f fVar) {
            this.f1916a.d(fVar);
            return this;
        }

        public b c(androidx.core.graphics.f fVar) {
            this.f1916a.f(fVar);
            return this;
        }

        public b(p0 p0Var) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.f1916a = new e(p0Var);
            } else if (i7 >= 29) {
                this.f1916a = new d(p0Var);
            } else {
                this.f1916a = new c(p0Var);
            }
        }
    }

    public p0(p0 p0Var) {
        if (p0Var != null) {
            l lVar = p0Var.f1911a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && (lVar instanceof k)) {
                this.f1911a = new k(this, (k) lVar);
            } else if (i7 >= 29 && (lVar instanceof j)) {
                this.f1911a = new j(this, (j) lVar);
            } else if (i7 >= 28 && (lVar instanceof i)) {
                this.f1911a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f1911a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f1911a = new g(this, (g) lVar);
            } else {
                this.f1911a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f1911a = new l(this);
    }

    /* compiled from: MyApplication */
    private static class l {

        /* renamed from: b, reason: collision with root package name */
        static final p0 f1941b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final p0 f1942a;

        l(p0 p0Var) {
            this.f1942a = p0Var;
        }

        p0 a() {
            return this.f1942a;
        }

        p0 b() {
            return this.f1942a;
        }

        p0 c() {
            return this.f1942a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        androidx.core.view.n f() {
            return null;
        }

        androidx.core.graphics.f g(int i7) {
            return androidx.core.graphics.f.f1710e;
        }

        androidx.core.graphics.f h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.f i() {
            return androidx.core.graphics.f.f1710e;
        }

        androidx.core.graphics.f j() {
            return k();
        }

        androidx.core.graphics.f k() {
            return androidx.core.graphics.f.f1710e;
        }

        androidx.core.graphics.f l() {
            return k();
        }

        p0 m(int i7, int i8, int i9, int i10) {
            return f1941b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        void d(View view) {
        }

        void e(p0 p0Var) {
        }

        public void p(androidx.core.graphics.f[] fVarArr) {
        }

        void q(androidx.core.graphics.f fVar) {
        }

        void r(p0 p0Var) {
        }

        public void s(androidx.core.graphics.f fVar) {
        }
    }
}
