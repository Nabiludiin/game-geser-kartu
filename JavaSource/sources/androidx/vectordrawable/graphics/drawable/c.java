package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: MyApplication */
public abstract class c {
    public static Interpolator a(Context context, int i7) {
        return AnimationUtils.loadInterpolator(context, i7);
    }
}
