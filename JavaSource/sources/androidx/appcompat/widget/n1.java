package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: MyApplication */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f809a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f810b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f811c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f812d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f813e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f814f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f815g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f816h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f817i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f818j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.j.f23565y0);
        try {
            if (!obtainStyledAttributes.hasValue(f.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList e8 = e(context, i7);
        if (e8 != null && e8.isStateful()) {
            return e8.getColorForState(f810b, e8.getDefaultColor());
        }
        TypedValue f8 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f8, true);
        return d(context, i7, f8.getFloat());
    }

    public static int c(Context context, int i7) {
        int[] iArr = f818j;
        iArr[0] = i7;
        r1 t7 = r1.t(context, null, iArr);
        try {
            return t7.b(0, 0);
        } finally {
            t7.v();
        }
    }

    static int d(Context context, int i7, float f8) {
        return androidx.core.graphics.a.f(c(context, i7), Math.round(Color.alpha(r0) * f8));
    }

    public static ColorStateList e(Context context, int i7) {
        int[] iArr = f818j;
        iArr[0] = i7;
        r1 t7 = r1.t(context, null, iArr);
        try {
            return t7.c(0);
        } finally {
            t7.v();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f809a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
