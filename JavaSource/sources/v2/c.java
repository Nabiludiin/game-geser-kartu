package v2;

import android.view.View;
import android.view.ViewParent;

/* compiled from: MyApplication */
public abstract class c {
    public static boolean a(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                return true;
            }
        }
        return false;
    }
}
