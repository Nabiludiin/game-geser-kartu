package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.k;
import androidx.core.graphics.h;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public abstract class d {

    /* compiled from: MyApplication */
    private static class a implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        private h.b[] f2861a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h.b[] evaluate(float f8, h.b[] bVarArr, h.b[] bVarArr2) {
            if (!h.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!h.b(this.f2861a, bVarArr)) {
                this.f2861a = h.f(bVarArr);
            }
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                this.f2861a[i7].d(bVarArr[i7], bVarArr2[i7], f8);
            }
            return this.f2861a;
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f8) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i7, float f8) {
        int i8;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i8 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = n(context, resources, theme, attributeSet, f8, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = l(context, resources, theme, attributeSet, null, f8, xmlPullParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2843h);
                        b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, k.g(k7, xmlPullParser, "ordering", 0, 0), f8);
                        k7.recycle();
                        valueAnimator = animatorSet2;
                    } else {
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        PropertyValuesHolder[] p7 = p(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (p7 != null && (valueAnimator instanceof ValueAnimator)) {
                            valueAnimator.setValues(p7);
                        }
                        i8 = 1;
                    }
                    if (animatorSet != null && i8 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                animatorArr[i8] = (Animator) obj;
                i8++;
            }
            if (i7 == 0) {
                animatorSet.playTogether(animatorArr);
                return valueAnimator;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return valueAnimator;
    }

    private static Keyframe c(Keyframe keyframe, float f8) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f8) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f8) : Keyframe.ofObject(f8);
    }

    private static void d(Keyframe[] keyframeArr, float f8, int i7, int i8) {
        float f9 = f8 / ((i8 - i7) + 2);
        while (i7 <= i8) {
            keyframeArr[i7].setFraction(keyframeArr[i7 - 1].getFraction() + f9);
            i7++;
        }
    }

    private static PropertyValuesHolder e(TypedArray typedArray, int i7, int i8, int i9, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z7 = peekValue != null;
        int i10 = z7 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i9);
        boolean z8 = peekValue2 != null;
        int i11 = z8 ? peekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z7 && h(i10)) || (z8 && h(i11))) ? 3 : 0;
        }
        boolean z9 = i7 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 != 2) {
            e a8 = i7 == 3 ? e.a() : null;
            if (z9) {
                if (z7) {
                    float dimension = i10 == 5 ? typedArray.getDimension(i8, 0.0f) : typedArray.getFloat(i8, 0.0f);
                    if (z8) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z7) {
                int dimension2 = i10 == 5 ? (int) typedArray.getDimension(i8, 0.0f) : h(i10) ? typedArray.getColor(i8, 0) : typedArray.getInt(i8, 0);
                if (z8) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z8) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
            }
            if (propertyValuesHolder != null && a8 != null) {
                propertyValuesHolder.setEvaluator(a8);
            }
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i8);
        String string2 = typedArray.getString(i9);
        h.b[] d8 = h.d(string);
        h.b[] d9 = h.d(string2);
        if (d8 != null || d9 != null) {
            if (d8 != null) {
                a aVar = new a();
                if (d9 == null) {
                    return PropertyValuesHolder.ofObject(str, aVar, d8);
                }
                if (h.b(d8, d9)) {
                    return PropertyValuesHolder.ofObject(str, aVar, d8, d9);
                }
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            if (d9 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), d9);
            }
        }
        return null;
    }

    private static int f(TypedArray typedArray, int i7, int i8) {
        TypedValue peekValue = typedArray.peekValue(i7);
        boolean z7 = peekValue != null;
        int i9 = z7 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i8);
        boolean z8 = peekValue2 != null;
        int i10 = z8 ? peekValue2.type : 0;
        if (z7 && h(i9)) {
            return 3;
        }
        return (z8 && h(i10)) ? 3 : 0;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2845j);
        int i7 = 0;
        TypedValue l7 = k.l(k7, xmlPullParser, "value", 0);
        if (l7 != null && h(l7.type)) {
            i7 = 3;
        }
        k7.recycle();
        return i7;
    }

    private static boolean h(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    public static Animator i(Context context, int i7) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i7) : j(context, context.getResources(), context.getTheme(), i7);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i7) {
        return k(context, resources, theme, i7, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i7, float f8) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i7);
                    return a(context, resources, theme, xmlResourceParser, f8);
                } catch (IOException e8) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                    notFoundException.initCause(e8);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e9) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                notFoundException2.initCause(e9);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f8, XmlPullParser xmlPullParser) {
        TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2842g);
        TypedArray k8 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2846k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k7, k8, f8, xmlPullParser);
        int h8 = k.h(k7, xmlPullParser, "interpolator", 0, 0);
        if (h8 > 0) {
            valueAnimator.setInterpolator(c.a(context, h8));
        }
        k7.recycle();
        if (k8 != null) {
            k8.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i7, XmlPullParser xmlPullParser) {
        TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2845j);
        float f8 = k.f(k7, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l7 = k.l(k7, xmlPullParser, "value", 0);
        boolean z7 = l7 != null;
        if (i7 == 4) {
            i7 = (z7 && h(l7.type)) ? 3 : 0;
        }
        Keyframe ofInt = z7 ? i7 != 0 ? (i7 == 1 || i7 == 3) ? Keyframe.ofInt(f8, k.g(k7, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(f8, k.f(k7, xmlPullParser, "value", 0, 0.0f)) : i7 == 0 ? Keyframe.ofFloat(f8) : Keyframe.ofInt(f8);
        int h8 = k.h(k7, xmlPullParser, "interpolator", 1, 0);
        if (h8 > 0) {
            ofInt.setInterpolator(c.a(context, h8));
        }
        k7.recycle();
        return ofInt;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f8, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i7) {
        int size;
        Context context2;
        Resources.Theme theme2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i7 == 4) {
                    i7 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                int i8 = i7;
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
                Keyframe m7 = m(context2, resources, theme2, Xml.asAttributeSet(xmlPullParser), i8, xmlPullParser2);
                if (m7 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m7);
                }
                xmlPullParser2.next();
                i7 = i8;
            } else {
                context2 = context;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
            context = context2;
            theme = theme2;
            xmlPullParser = xmlPullParser2;
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        Keyframe keyframe = (Keyframe) arrayList.get(0);
        Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, c(keyframe, 0.0f));
                size++;
            }
        }
        Keyframe[] keyframeArr = new Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i9 = 0; i9 < size; i9++) {
            Keyframe keyframe3 = keyframeArr[i9];
            if (keyframe3.getFraction() < 0.0f) {
                if (i9 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i10 = size - 1;
                    if (i9 == i10) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i11 = i9;
                        for (int i12 = i9 + 1; i12 < i10 && keyframeArr[i12].getFraction() < 0.0f; i12++) {
                            i11 = i12;
                        }
                        d(keyframeArr, keyframeArr[i11 + 1].getFraction() - keyframeArr[i9 - 1].getFraction(), i9, i11);
                    }
                }
            }
        }
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i7 == 3) {
            ofKeyframe.setEvaluator(e.a());
        }
        return ofKeyframe;
    }

    private static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i7;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser2.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser2.next();
            } else {
                if (xmlPullParser2.getName().equals("propertyValuesHolder")) {
                    TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2844i);
                    String i8 = k.i(k7, xmlPullParser2, "propertyName", 3);
                    int g8 = k.g(k7, xmlPullParser2, "valueType", 2, 4);
                    PropertyValuesHolder o7 = o(context, resources, theme, xmlPullParser2, i8, g8);
                    if (o7 == null) {
                        o7 = e(k7, g8, 0, 1, i8);
                    }
                    if (o7 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o7);
                    }
                    k7.recycle();
                }
                xmlPullParser.next();
                xmlPullParser2 = xmlPullParser;
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i7 = 0; i7 < size; i7++) {
            propertyValuesHolderArr[i7] = (PropertyValuesHolder) arrayList.get(i7);
        }
        return propertyValuesHolderArr;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f8, XmlPullParser xmlPullParser) {
        long g8 = k.g(typedArray, xmlPullParser, "duration", 1, 300);
        long g9 = k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g10 = k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.j(xmlPullParser, "valueFrom") && k.j(xmlPullParser, "valueTo")) {
            if (g10 == 4) {
                g10 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e8 = e(typedArray, g10, 5, 6, "");
            if (e8 != null) {
                valueAnimator.setValues(e8);
            }
        }
        valueAnimator.setDuration(g8);
        valueAnimator.setStartDelay(g9);
        valueAnimator.setRepeatCount(k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g10, f8, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i7, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i8 = k.i(typedArray, xmlPullParser, "pathData", 1);
        if (i8 == null) {
            objectAnimator.setPropertyName(k.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String i9 = k.i(typedArray, xmlPullParser, "propertyXName", 2);
        String i10 = k.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i7 != 2) {
        }
        if (i9 != null || i10 != null) {
            s(h.e(i8), objectAnimator, f8 * 0.5f, i9, i10);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f8, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f9 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f10 = 0.0f;
        do {
            f10 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f10));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f10 / f8)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f11 = f10 / (min - 1);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i8)).floatValue(), fArr3, null);
            fArr[i7] = fArr3[0];
            fArr2[i7] = fArr3[1];
            f9 += f11;
            int i9 = i8 + 1;
            if (i9 < arrayList.size() && f9 > ((Float) arrayList.get(i9)).floatValue()) {
                pathMeasure2.nextContour();
                i8 = i9;
            }
            i7++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
