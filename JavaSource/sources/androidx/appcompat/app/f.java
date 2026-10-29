package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.l;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.x;
import androidx.appcompat.widget.z;
import androidx.core.view.e0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f318b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f319c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f320d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f321e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f322f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f323g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final r.h f324h = new r.h();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f325a = new Object[2];

    /* compiled from: MyApplication */
    private static class a implements View.OnClickListener {

        /* renamed from: q, reason: collision with root package name */
        private final View f326q;

        /* renamed from: r, reason: collision with root package name */
        private final String f327r;

        /* renamed from: s, reason: collision with root package name */
        private Method f328s;

        /* renamed from: t, reason: collision with root package name */
        private Context f329t;

        public a(View view, String str) {
            this.f326q = view;
            this.f327r = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f327r, View.class)) != null) {
                        this.f328s = method;
                        this.f329t = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f326q.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f326q.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f327r + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f326q.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f328s == null) {
                a(this.f326q.getContext());
            }
            try {
                this.f328s.invoke(this.f329t, view);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("Could not execute method for android:onClick", e9);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f320d);
        if (obtainStyledAttributes.hasValue(0)) {
            e0.O(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f321e);
        if (obtainStyledAttributes2.hasValue(0)) {
            e0.P(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f322f);
        if (obtainStyledAttributes3.hasValue(0)) {
            e0.W(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && e0.y(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f319c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        r.h hVar = f324h;
        Constructor constructor = (Constructor) hVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f318b);
            hVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f325a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f325a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i7 = 0;
            while (true) {
                String[] strArr = f323g;
                if (i7 >= strArr.length) {
                    return null;
                }
                View s7 = s(context, str, strArr[i7]);
                if (s7 != null) {
                    return s7;
                }
                i7++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f325a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z7, boolean z8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23538s3, 0, 0);
        int resourceId = z7 ? obtainStyledAttributes.getResourceId(f.j.f23543t3, 0) : 0;
        if (z8 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(f.j.f23548u3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof k.d) && ((k.d) context).c() == resourceId)) ? context : new k.d(context, resourceId);
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected l g(Context context, AttributeSet attributeSet) {
        return new l(context, attributeSet);
    }

    protected p h(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected r j(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected u k(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    protected v l(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected x m(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    protected z n(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    protected n0 o(Context context, AttributeSet attributeSet) {
        return new n0(context, attributeSet);
    }

    protected r0 p(Context context, AttributeSet attributeSet) {
        return new r0(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z7, boolean z8, boolean z9, boolean z10) {
        Context context2;
        View l7;
        context2 = (!z7 || view == null) ? context : view.getContext();
        if (z8 || z9) {
            context2 = u(context2, attributeSet, z8, z9);
        }
        if (z10) {
            context2 = o1.b(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                l7 = l(context2, attributeSet);
                v(l7, str);
                break;
            case "CheckedTextView":
                l7 = f(context2, attributeSet);
                v(l7, str);
                break;
            case "MultiAutoCompleteTextView":
                l7 = j(context2, attributeSet);
                v(l7, str);
                break;
            case "TextView":
                l7 = o(context2, attributeSet);
                v(l7, str);
                break;
            case "ImageButton":
                l7 = h(context2, attributeSet);
                v(l7, str);
                break;
            case "SeekBar":
                l7 = m(context2, attributeSet);
                v(l7, str);
                break;
            case "Spinner":
                l7 = n(context2, attributeSet);
                v(l7, str);
                break;
            case "RadioButton":
                l7 = k(context2, attributeSet);
                v(l7, str);
                break;
            case "ToggleButton":
                l7 = p(context2, attributeSet);
                v(l7, str);
                break;
            case "ImageView":
                l7 = i(context2, attributeSet);
                v(l7, str);
                break;
            case "AutoCompleteTextView":
                l7 = c(context2, attributeSet);
                v(l7, str);
                break;
            case "CheckBox":
                l7 = e(context2, attributeSet);
                v(l7, str);
                break;
            case "EditText":
                l7 = g(context2, attributeSet);
                v(l7, str);
                break;
            case "Button":
                l7 = d(context2, attributeSet);
                v(l7, str);
                break;
            default:
                l7 = q(context2, str, attributeSet);
                break;
        }
        if (l7 == null && context != context2) {
            l7 = t(context2, str, attributeSet);
        }
        if (l7 != null) {
            b(l7, attributeSet);
            a(context2, l7, attributeSet);
        }
        return l7;
    }
}
