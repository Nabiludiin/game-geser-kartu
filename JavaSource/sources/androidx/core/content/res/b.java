package androidx.core.content.res;

import android.graphics.Color;

/* compiled from: MyApplication */
abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final float[][] f1651a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    static final float[][] f1652b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    static final float[] f1653c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    static final float[][] f1654d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static int a(float f8) {
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f9 = (f8 + 16.0f) / 116.0f;
        float f10 = f8 > 8.0f ? f9 * f9 * f9 : f8 / 903.2963f;
        float f11 = f9 * f9 * f9;
        boolean z7 = f11 > 0.008856452f;
        float f12 = z7 ? f11 : ((f9 * 116.0f) - 16.0f) / 903.2963f;
        if (!z7) {
            f11 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1653c;
        return androidx.core.graphics.a.a(f12 * fArr[0], f10 * fArr[1], f11 * fArr[2]);
    }

    static float b(int i7) {
        return c(g(i7));
    }

    static float c(float f8) {
        float f9 = f8 / 100.0f;
        return f9 <= 0.008856452f ? f9 * 903.2963f : (((float) Math.cbrt(f9)) * 116.0f) - 16.0f;
    }

    static float d(float f8, float f9, float f10) {
        return f8 + ((f9 - f8) * f10);
    }

    static float e(int i7) {
        float f8 = i7 / 255.0f;
        return (f8 <= 0.04045f ? f8 / 12.92f : (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static float[] f(int i7) {
        float e8 = e(Color.red(i7));
        float e9 = e(Color.green(i7));
        float e10 = e(Color.blue(i7));
        float[][] fArr = f1654d;
        float[] fArr2 = fArr[0];
        float f8 = (fArr2[0] * e8) + (fArr2[1] * e9) + (fArr2[2] * e10);
        float[] fArr3 = fArr[1];
        float f9 = (fArr3[0] * e8) + (fArr3[1] * e9) + (fArr3[2] * e10);
        float[] fArr4 = fArr[2];
        return new float[]{f8, f9, (e8 * fArr4[0]) + (e9 * fArr4[1]) + (e10 * fArr4[2])};
    }

    static float g(int i7) {
        float e8 = e(Color.red(i7));
        float e9 = e(Color.green(i7));
        float e10 = e(Color.blue(i7));
        float[] fArr = f1654d[1];
        return (e8 * fArr[0]) + (e9 * fArr[1]) + (e10 * fArr[2]);
    }

    static float h(float f8) {
        return (f8 > 8.0f ? (float) Math.pow((f8 + 16.0d) / 116.0d, 3.0d) : f8 / 903.2963f) * 100.0f;
    }
}
