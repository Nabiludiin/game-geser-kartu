package androidx.core.view;

import android.view.ViewGroup;

/* compiled from: MyApplication */
public abstract class r {

    /* compiled from: MyApplication */
    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.resolveLayoutDirection(i7);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.setLayoutDirection(i7);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.setMarginEnd(i7);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
            marginLayoutParams.setMarginStart(i7);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }
}
