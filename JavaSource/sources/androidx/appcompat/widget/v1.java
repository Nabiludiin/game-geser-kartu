package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* compiled from: MyApplication */
public abstract class v1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            w1.f(view, charSequence);
        }
    }
}
