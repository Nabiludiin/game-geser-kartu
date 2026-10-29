package androidx.core.graphics;

import android.graphics.Paint;

/* compiled from: MyApplication */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1715a = new ThreadLocal();

    /* compiled from: MyApplication */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
