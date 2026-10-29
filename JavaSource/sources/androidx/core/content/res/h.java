package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1672a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f1673b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1674c = new Object();

    /* compiled from: MyApplication */
    static class a {
        static Drawable a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getDrawable(i7, theme);
        }

        static Drawable b(Resources resources, int i7, int i8, Resources.Theme theme) {
            return resources.getDrawableForDensity(i7, i8, theme);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static int a(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColor(i7, theme);
        }

        static ColorStateList b(Resources resources, int i7, Resources.Theme theme) {
            return resources.getColorStateList(i7, theme);
        }
    }

    /* compiled from: MyApplication */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f1675a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f1676b;

        /* renamed from: c, reason: collision with root package name */
        final int f1677c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f1675a = colorStateList;
            this.f1676b = configuration;
            this.f1677c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* compiled from: MyApplication */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f1678a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f1679b;

        d(Resources resources, Resources.Theme theme) {
            this.f1678a = resources;
            this.f1679b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f1678a.equals(dVar.f1678a) && androidx.core.util.c.a(this.f1679b, dVar.f1679b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f1678a, this.f1679b);
        }
    }

    /* compiled from: MyApplication */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i7, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.e.this.f(i7);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.e.this.g(typeface);
                }
            });
        }

        public abstract void f(int i7);

        public abstract void g(Typeface typeface);
    }

    /* compiled from: MyApplication */
    public static final class f {

        /* compiled from: MyApplication */
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f1680a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f1681b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f1682c;

            static void a(Resources.Theme theme) {
                synchronized (f1680a) {
                    if (!f1682c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f1681b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e8) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e8);
                        }
                        f1682c = true;
                    }
                    Method method = f1681b;
                    if (method != null) {
                        try {
                            method.invoke(theme, null);
                        } catch (IllegalAccessException | InvocationTargetException e9) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                            f1681b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: MyApplication */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f1674c) {
            try {
                WeakHashMap weakHashMap = f1673b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i7, new c(colorStateList, dVar.f1678a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f1677c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.d r5, int r6) {
        /*
            java.lang.Object r0 = androidx.core.content.res.h.f1674c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = androidx.core.content.res.h.f1673b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            androidx.core.content.res.h$c r2 = (androidx.core.content.res.h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f1676b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f1678a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f1679b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f1677c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f1677c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f1675a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$d, int):android.content.res.ColorStateList");
    }

    public static ColorStateList c(Resources resources, int i7, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b8 = b(dVar, i7);
        if (b8 != null) {
            return b8;
        }
        ColorStateList h8 = h(resources, i7, theme);
        if (h8 == null) {
            return b.b(resources, i7, theme);
        }
        a(dVar, i7, h8, theme);
        return h8;
    }

    public static Drawable d(Resources resources, int i7, Resources.Theme theme) {
        return a.a(resources, i7, theme);
    }

    public static Drawable e(Resources resources, int i7, int i8, Resources.Theme theme) {
        return a.b(resources, i7, i8, theme);
    }

    public static Typeface f(Context context, int i7, TypedValue typedValue, int i8, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return j(context, i7, typedValue, i8, eVar, null, true, false);
    }

    private static TypedValue g() {
        ThreadLocal threadLocal = f1672a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList h(Resources resources, int i7, Resources.Theme theme) {
        if (i(resources, i7)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i7), theme);
        } catch (Exception e8) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    private static boolean i(Resources resources, int i7) {
        TypedValue g8 = g();
        resources.getValue(i7, g8, true);
        int i8 = g8.type;
        return i8 >= 28 && i8 <= 31;
    }

    private static Typeface j(Context context, int i7, TypedValue typedValue, int i8, e eVar, Handler handler, boolean z7, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        Typeface k7 = k(context, resources, typedValue, i7, i8, eVar, handler, z7, z8);
        if (k7 != null || eVar != null || z8) {
            return k7;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i7) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface k(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, androidx.core.content.res.h.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.k(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
