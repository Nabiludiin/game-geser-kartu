package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* compiled from: MyApplication */
abstract class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final double f1075a = Math.cos(Math.toRadians(45.0d));

    static float a(float f8, float f9, boolean z7) {
        return z7 ? (float) (f8 + ((1.0d - f1075a) * f9)) : f8;
    }

    static float b(float f8, float f9, boolean z7) {
        return z7 ? (float) ((f8 * 1.5f) + ((1.0d - f1075a) * f9)) : f8 * 1.5f;
    }
}
