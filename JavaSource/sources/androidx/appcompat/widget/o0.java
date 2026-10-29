package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
class o0 {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f819l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap f820m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap f821n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f822a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f823b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f824c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f825d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f826e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f827f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f828g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f829h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f830i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f831j;

    /* renamed from: k, reason: collision with root package name */
    private final c f832k;

    /* compiled from: MyApplication */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.o0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) o0.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: MyApplication */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.o0.a, androidx.appcompat.widget.o0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.o0.c
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* compiled from: MyApplication */
    private static class c {
        c() {
        }

        abstract void a(StaticLayout.Builder builder, TextView textView);

        boolean b(TextView textView) {
            return ((Boolean) o0.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    o0(TextView textView) {
        this.f830i = textView;
        this.f831j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f832k = new b();
        } else {
            this.f832k = new a();
        }
    }

    private void A(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        }
        if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f822a = 1;
        this.f825d = f8;
        this.f826e = f9;
        this.f824c = f10;
        this.f828g = false;
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr) {
                if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i8 = 0; i8 < size; i8++) {
                    iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f822a = 0;
        this.f825d = -1.0f;
        this.f826e = -1.0f;
        this.f824c = -1.0f;
        this.f827f = new int[0];
        this.f823b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f829h, i7);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f830i.getLineSpacingExtra(), this.f830i.getLineSpacingMultiplier()).setIncludePad(this.f830i.getIncludeFontPadding()).setBreakStrategy(this.f830i.getBreakStrategy()).setHyphenationFrequency(this.f830i.getHyphenationFrequency());
        if (i8 == -1) {
            i8 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i8);
        try {
            this.f832k.a(obtain, this.f830i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private int f(RectF rectF) {
        int length = this.f827f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = 1;
        int i8 = length - 1;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = (i7 + i8) / 2;
            if (y(this.f827f[i10], rectF)) {
                int i11 = i10 + 1;
                i9 = i7;
                i7 = i11;
            } else {
                i9 = i10 - 1;
                i8 = i9;
            }
        }
        return this.f827f[i9];
    }

    private static Method l(String str) {
        try {
            Method method = (Method) f820m.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            f820m.put(str, method);
            return method;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    static Object n(Object obj, String str, Object obj2) {
        try {
            return l(str).invoke(obj, null);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return obj2;
        }
    }

    private void t(float f8) {
        if (f8 != this.f830i.getPaint().getTextSize()) {
            this.f830i.getPaint().setTextSize(f8);
            boolean isInLayout = this.f830i.isInLayout();
            if (this.f830i.getLayout() != null) {
                this.f823b = false;
                try {
                    Method l7 = l("nullLayouts");
                    if (l7 != null) {
                        l7.invoke(this.f830i, null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (isInLayout) {
                    this.f830i.forceLayout();
                } else {
                    this.f830i.requestLayout();
                }
                this.f830i.invalidate();
            }
        }
    }

    private boolean v() {
        if (z() && this.f822a == 1) {
            if (!this.f828g || this.f827f.length == 0) {
                int floor = ((int) Math.floor((this.f826e - this.f825d) / this.f824c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round(this.f825d + (i7 * this.f824c));
                }
                this.f827f = b(iArr);
            }
            this.f823b = true;
        } else {
            this.f823b = false;
        }
        return this.f823b;
    }

    private void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f827f = b(iArr);
            x();
        }
    }

    private boolean x() {
        boolean z7 = this.f827f.length > 0;
        this.f828g = z7;
        if (z7) {
            this.f822a = 1;
            this.f825d = r0[0];
            this.f826e = r0[r1 - 1];
            this.f824c = -1.0f;
        }
        return z7;
    }

    private boolean y(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f830i.getText();
        TransformationMethod transformationMethod = this.f830i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f830i)) != null) {
            text = transformation;
        }
        int maxLines = this.f830i.getMaxLines();
        m(i7);
        StaticLayout d8 = d(text, (Layout.Alignment) n(this.f830i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d8.getLineCount() <= maxLines && d8.getLineEnd(d8.getLineCount() - 1) == text.length())) && ((float) d8.getHeight()) <= rectF.bottom;
    }

    private boolean z() {
        return !(this.f830i instanceof l);
    }

    void a() {
        if (o()) {
            if (this.f823b) {
                if (this.f830i.getMeasuredHeight() <= 0 || this.f830i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f832k.b(this.f830i) ? 1048576 : (this.f830i.getMeasuredWidth() - this.f830i.getTotalPaddingLeft()) - this.f830i.getTotalPaddingRight();
                int height = (this.f830i.getHeight() - this.f830i.getCompoundPaddingBottom()) - this.f830i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f819l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float f8 = f(rectF);
                        if (f8 != this.f830i.getTextSize()) {
                            u(0, f8);
                        }
                    } finally {
                    }
                }
            }
            this.f823b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        return e(charSequence, alignment, i7, i8);
    }

    int g() {
        return Math.round(this.f826e);
    }

    int h() {
        return Math.round(this.f825d);
    }

    int i() {
        return Math.round(this.f824c);
    }

    int[] j() {
        return this.f827f;
    }

    int k() {
        return this.f822a;
    }

    void m(int i7) {
        TextPaint textPaint = this.f829h;
        if (textPaint == null) {
            this.f829h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f829h.set(this.f830i.getPaint());
        this.f829h.setTextSize(i7);
    }

    boolean o() {
        return z() && this.f822a != 0;
    }

    void p(AttributeSet attributeSet, int i7) {
        int resourceId;
        Context context = this.f831j;
        int[] iArr = f.j.f23475g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        TextView textView = this.f830i;
        androidx.core.view.e0.L(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i7, 0);
        int i8 = f.j.f23500l0;
        if (obtainStyledAttributes.hasValue(i8)) {
            this.f822a = obtainStyledAttributes.getInt(i8, 0);
        }
        int i9 = f.j.f23495k0;
        float dimension = obtainStyledAttributes.hasValue(i9) ? obtainStyledAttributes.getDimension(i9, -1.0f) : -1.0f;
        int i10 = f.j.f23485i0;
        float dimension2 = obtainStyledAttributes.hasValue(i10) ? obtainStyledAttributes.getDimension(i10, -1.0f) : -1.0f;
        int i11 = f.j.f23480h0;
        float dimension3 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getDimension(i11, -1.0f) : -1.0f;
        int i12 = f.j.f23490j0;
        if (obtainStyledAttributes.hasValue(i12) && (resourceId = obtainStyledAttributes.getResourceId(i12, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z()) {
            this.f822a = 0;
            return;
        }
        if (this.f822a == 1) {
            if (!this.f828g) {
                DisplayMetrics displayMetrics = this.f831j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    void q(int i7, int i8, int i9, int i10) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f831j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    void r(int[] iArr, int i7) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f831j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f827f = b(iArr2);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f828g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    void s(int i7) {
        if (z()) {
            if (i7 == 0) {
                c();
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            }
            DisplayMetrics displayMetrics = this.f831j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    void u(int i7, float f8) {
        Context context = this.f831j;
        t(TypedValue.applyDimension(i7, f8, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
