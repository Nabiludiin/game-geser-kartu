package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: MyApplication */
public abstract class i0 {

    /* compiled from: MyApplication */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean z7) {
            return viewParent.onNestedFling(view, f8, f9, z7);
        }

        static boolean b(ViewParent viewParent, View view, float f8, float f9) {
            return viewParent.onNestedPreFling(view, f8, f9);
        }

        static void c(ViewParent viewParent, View view, int i7, int i8, int[] iArr) {
            viewParent.onNestedPreScroll(view, i7, i8, iArr);
        }

        static void d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10) {
            viewParent.onNestedScroll(view, i7, i8, i9, i10);
        }

        static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.onNestedScrollAccepted(view, view2, i7);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i7) {
            return viewParent.onStartNestedScroll(view, view2, i7);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean z7) {
        try {
            return a.a(viewParent, view, f8, f9, z7);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e8);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f8, float f9) {
        try {
            return a.b(viewParent, view, f8, f9);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e8);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i7, int i8, int[] iArr, int i9) {
        if (viewParent instanceof w) {
            ((w) viewParent).o(view, i7, i8, iArr, i9);
            return;
        }
        if (i9 == 0) {
            try {
                a.c(viewParent, view, i7, i8, iArr);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e8);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (viewParent instanceof x) {
            ((x) viewParent).j(view, i7, i8, i9, i10, i11, iArr);
            return;
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (viewParent instanceof w) {
            ((w) viewParent).k(view, i7, i8, i9, i10, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.d(viewParent, view, i7, i8, i9, i10);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e8);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i7, int i8) {
        if (viewParent instanceof w) {
            ((w) viewParent).m(view, view2, i7, i8);
            return;
        }
        if (i8 == 0) {
            try {
                a.e(viewParent, view, view2, i7);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e8);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i7, int i8) {
        if (viewParent instanceof w) {
            return ((w) viewParent).l(view, view2, i7, i8);
        }
        if (i8 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i7);
        } catch (AbstractMethodError e8) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e8);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i7) {
        if (viewParent instanceof w) {
            ((w) viewParent).n(view, i7);
            return;
        }
        if (i7 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e8) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e8);
            }
        }
    }
}
