package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public final class g1 {

    /* renamed from: i, reason: collision with root package name */
    private static g1 f725i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f727a;

    /* renamed from: b, reason: collision with root package name */
    private r.h f728b;

    /* renamed from: c, reason: collision with root package name */
    private r.i f729c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f730d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f731e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f732f;

    /* renamed from: g, reason: collision with root package name */
    private f f733g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f724h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f726j = new c(6);

    /* compiled from: MyApplication */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e8);
                return null;
            }
        }
    }

    /* compiled from: MyApplication */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e8);
                return null;
            }
        }
    }

    /* compiled from: MyApplication */
    private static class c extends r.f {
        public c(int i7) {
            super(i7);
        }

        private static int j(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i7, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i7, mode)));
        }

        PorterDuffColorFilter l(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i7, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: MyApplication */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    j.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e8) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e8);
                }
            }
            return null;
        }
    }

    /* compiled from: MyApplication */
    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: MyApplication */
    public interface f {
        boolean a(Context context, int i7, Drawable drawable);

        PorterDuff.Mode b(int i7);

        Drawable c(g1 g1Var, Context context, int i7);

        ColorStateList d(Context context, int i7);

        boolean e(Context context, int i7, Drawable drawable);
    }

    /* compiled from: MyApplication */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e8);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f728b == null) {
            this.f728b = new r.h();
        }
        this.f728b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            r.e eVar = (r.e) this.f730d.get(context);
            if (eVar == null) {
                eVar = new r.e();
                this.f730d.put(context, eVar);
            }
            eVar.m(j7, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c(Context context, int i7, ColorStateList colorStateList) {
        if (this.f727a == null) {
            this.f727a = new WeakHashMap();
        }
        r.i iVar = (r.i) this.f727a.get(context);
        if (iVar == null) {
            iVar = new r.i();
            this.f727a.put(context, iVar);
        }
        iVar.a(i7, colorStateList);
    }

    private void d(Context context) {
        if (this.f732f) {
            return;
        }
        this.f732f = true;
        Drawable j7 = j(context, j.d.f24190a);
        if (j7 == null || !q(j7)) {
            this.f732f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i7) {
        if (this.f731e == null) {
            this.f731e = new TypedValue();
        }
        TypedValue typedValue = this.f731e;
        context.getResources().getValue(i7, typedValue, true);
        long e8 = e(typedValue);
        Drawable i8 = i(context, e8);
        if (i8 != null) {
            return i8;
        }
        f fVar = this.f733g;
        Drawable c8 = fVar == null ? null : fVar.c(this, context, i7);
        if (c8 != null) {
            c8.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e8, c8);
        }
        return c8;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized g1 h() {
        g1 g1Var;
        synchronized (g1.class) {
            try {
                if (f725i == null) {
                    g1 g1Var2 = new g1();
                    f725i = g1Var2;
                    p(g1Var2);
                }
                g1Var = f725i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g1Var;
    }

    private synchronized Drawable i(Context context, long j7) {
        r.e eVar = (r.e) this.f730d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.i(j7);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.n(j7);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter k7;
        synchronized (g1.class) {
            c cVar = f726j;
            k7 = cVar.k(i7, mode);
            if (k7 == null) {
                k7 = new PorterDuffColorFilter(i7, mode);
                cVar.l(i7, mode, k7);
            }
        }
        return k7;
    }

    private ColorStateList n(Context context, int i7) {
        r.i iVar;
        WeakHashMap weakHashMap = this.f727a;
        if (weakHashMap == null || (iVar = (r.i) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) iVar.i(i7);
    }

    private static void p(g1 g1Var) {
        if (Build.VERSION.SDK_INT < 24) {
            g1Var.a("vector", new g());
            g1Var.a("animated-vector", new b());
            g1Var.a("animated-selector", new a());
            g1Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i7) {
        int next;
        r.h hVar = this.f728b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        r.i iVar = this.f729c;
        if (iVar != null) {
            String str = (String) iVar.i(i7);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f728b.get(str) == null)) {
                return null;
            }
        } else {
            this.f729c = new r.i();
        }
        if (this.f731e == null) {
            this.f731e = new TypedValue();
        }
        TypedValue typedValue = this.f731e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long e8 = e(typedValue);
        Drawable i8 = i(context, e8);
        if (i8 != null) {
            return i8;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f729c.a(i7, name);
                e eVar = (e) this.f728b.get(name);
                if (eVar != null) {
                    i8 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i8 != null) {
                    i8.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e8, i8);
                }
            } catch (Exception e9) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e9);
            }
        }
        if (i8 == null) {
            this.f729c.a(i7, "appcompat_skip_skip");
        }
        return i8;
    }

    private Drawable v(Context context, int i7, boolean z7, Drawable drawable) {
        ColorStateList m7 = m(context, i7);
        if (m7 == null) {
            f fVar = this.f733g;
            if ((fVar == null || !fVar.e(context, i7, drawable)) && !x(context, i7, drawable) && z7) {
                return null;
            }
            return drawable;
        }
        if (u0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable p7 = androidx.core.graphics.drawable.a.p(drawable);
        androidx.core.graphics.drawable.a.n(p7, m7);
        PorterDuff.Mode o7 = o(i7);
        if (o7 != null) {
            androidx.core.graphics.drawable.a.o(p7, o7);
        }
        return p7;
    }

    static void w(Drawable drawable, p1 p1Var, int[] iArr) {
        if (u0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z7 = p1Var.f843d;
        if (z7 || p1Var.f842c) {
            drawable.setColorFilter(g(z7 ? p1Var.f840a : null, p1Var.f842c ? p1Var.f841b : f724h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i7) {
        return k(context, i7, false);
    }

    synchronized Drawable k(Context context, int i7, boolean z7) {
        Drawable r7;
        try {
            d(context);
            r7 = r(context, i7);
            if (r7 == null) {
                r7 = f(context, i7);
            }
            if (r7 == null) {
                r7 = androidx.core.content.a.e(context, i7);
            }
            if (r7 != null) {
                r7 = v(context, i7, z7, r7);
            }
            if (r7 != null) {
                u0.b(r7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r7;
    }

    synchronized ColorStateList m(Context context, int i7) {
        ColorStateList n7;
        n7 = n(context, i7);
        if (n7 == null) {
            f fVar = this.f733g;
            n7 = fVar == null ? null : fVar.d(context, i7);
            if (n7 != null) {
                c(context, i7, n7);
            }
        }
        return n7;
    }

    PorterDuff.Mode o(int i7) {
        f fVar = this.f733g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i7);
    }

    public synchronized void s(Context context) {
        r.e eVar = (r.e) this.f730d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    synchronized Drawable t(Context context, y1 y1Var, int i7) {
        try {
            Drawable r7 = r(context, i7);
            if (r7 == null) {
                r7 = y1Var.a(i7);
            }
            if (r7 == null) {
                return null;
            }
            return v(context, i7, false, r7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f733g = fVar;
    }

    boolean x(Context context, int i7, Drawable drawable) {
        f fVar = this.f733g;
        return fVar != null && fVar.a(context, i7, drawable);
    }
}
