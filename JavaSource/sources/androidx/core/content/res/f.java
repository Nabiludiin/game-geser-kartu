package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
abstract class f {
    private static a a(a aVar, int i7, int i8, boolean z7, int i9) {
        return aVar != null ? aVar : z7 ? new a(i7, i9, i8) : new a(i7, i8);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k7 = k.k(resources, theme, attributeSet, y.d.A);
        float f8 = k.f(k7, xmlPullParser, "startX", y.d.J, 0.0f);
        float f9 = k.f(k7, xmlPullParser, "startY", y.d.K, 0.0f);
        float f10 = k.f(k7, xmlPullParser, "endX", y.d.L, 0.0f);
        float f11 = k.f(k7, xmlPullParser, "endY", y.d.M, 0.0f);
        float f12 = k.f(k7, xmlPullParser, "centerX", y.d.E, 0.0f);
        float f13 = k.f(k7, xmlPullParser, "centerY", y.d.F, 0.0f);
        int g8 = k.g(k7, xmlPullParser, "type", y.d.D, 0);
        int b8 = k.b(k7, xmlPullParser, "startColor", y.d.B, 0);
        boolean j7 = k.j(xmlPullParser, "centerColor");
        int b9 = k.b(k7, xmlPullParser, "centerColor", y.d.I, 0);
        int b10 = k.b(k7, xmlPullParser, "endColor", y.d.C, 0);
        int g9 = k.g(k7, xmlPullParser, "tileMode", y.d.H, 0);
        float f14 = k.f(k7, xmlPullParser, "gradientRadius", y.d.G, 0.0f);
        k7.recycle();
        a a8 = a(c(resources, xmlPullParser, attributeSet, theme), b8, b10, j7, b9);
        if (g8 != 1) {
            return g8 != 2 ? new LinearGradient(f8, f9, f10, f11, a8.f1670a, a8.f1671b, d(g9)) : new SweepGradient(f12, f13, a8.f1670a, a8.f1671b);
        }
        if (f14 > 0.0f) {
            return new RadialGradient(f12, f13, f14, a8.f1670a, a8.f1671b, d(g9));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = y.d.N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.k(r9, r12, r11, r3)
            int r5 = y.d.O
            boolean r6 = r3.hasValue(r5)
            int r7 = y.d.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i7) {
        return i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* compiled from: MyApplication */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f1670a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f1671b;

        a(List list, List list2) {
            int size = list.size();
            this.f1670a = new int[size];
            this.f1671b = new float[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f1670a[i7] = ((Integer) list.get(i7)).intValue();
                this.f1671b[i7] = ((Float) list2.get(i7)).floatValue();
            }
        }

        a(int i7, int i8) {
            this.f1670a = new int[]{i7, i8};
            this.f1671b = new float[]{0.0f, 1.0f};
        }

        a(int i7, int i8, int i9) {
            this.f1670a = new int[]{i7, i8, i9};
            this.f1671b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
