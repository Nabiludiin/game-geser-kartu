package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MyApplication */
public abstract class u {
    public static boolean a(MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }
}
