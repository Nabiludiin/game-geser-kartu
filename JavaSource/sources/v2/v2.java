package v2;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.uy;
import java.util.List;
import java.util.Locale;

/* compiled from: MyApplication */
public class v2 extends q2 {
    static final /* synthetic */ WindowInsets m(Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (r2.t.l().q().t() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                p1 q7 = r2.t.l().q();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(format);
                }
                q7.i0(str);
            } else {
                r2.t.l().q().i0("");
            }
        }
        n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void n(boolean z7, Activity activity) {
        int i7;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i7 = attributes.layoutInDisplayCutoutMode;
        int i8 = true != z7 ? 2 : 1;
        if (i8 != i7) {
            attributes.layoutInDisplayCutoutMode = i8;
            window.setAttributes(attributes);
        }
    }

    @Override // v2.x2
    public final void i(final Activity activity) {
        boolean isInMultiWindowMode;
        if (((Boolean) s2.b0.c().d(uy.f17239x1)).booleanValue() && r2.t.l().q().t() == null) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return;
            }
            n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: v2.r2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return v2.m(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // v2.x2
    public final int j(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }
}
