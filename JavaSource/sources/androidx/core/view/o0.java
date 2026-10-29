package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: MyApplication */
public abstract class o0 {

    /* compiled from: MyApplication */
    static class a {
        static void a(Window window, boolean z7) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z7 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static void a(Window window, boolean z7) {
            window.setDecorFitsSystemWindows(z7);
        }
    }

    public static void a(Window window, boolean z7) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z7);
        } else {
            a.a(window, z7);
        }
    }
}
