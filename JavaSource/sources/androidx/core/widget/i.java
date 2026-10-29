package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: MyApplication */
public abstract class i {

    /* compiled from: MyApplication */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
            popupWindow.showAsDropDown(view, i7, i8, i9);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z7) {
            popupWindow.setOverlapAnchor(z7);
        }

        static void d(PopupWindow popupWindow, int i7) {
            popupWindow.setWindowLayoutType(i7);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z7) {
        b.c(popupWindow, z7);
    }

    public static void b(PopupWindow popupWindow, int i7) {
        b.d(popupWindow, i7);
    }

    public static void c(PopupWindow popupWindow, View view, int i7, int i8, int i9) {
        a.a(popupWindow, view, i7, i8, i9);
    }
}
