package v2;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.uy;

/* compiled from: MyApplication */
public class i2 extends g2 {
    static final boolean l(int i7, int i8, int i9) {
        return Math.abs(i7 - i8) <= i9;
    }

    @Override // v2.x2
    public final boolean d(Activity activity, Configuration configuration) {
        boolean isInMultiWindowMode;
        if (!((Boolean) s2.b0.c().d(uy.E5)).booleanValue()) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.G5)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        s2.z.a();
        int c8 = w2.g.c(activity, configuration.screenHeightDp);
        int c9 = w2.g.c(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        r2.t.g();
        DisplayMetrics j02 = f2.j0(windowManager);
        int i7 = j02.heightPixels;
        int i8 = j02.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) s2.b0.c().d(uy.C5)).intValue();
        return (l(i7, c8 + dimensionPixelSize, round) && l(i8, c9, round)) ? false : true;
    }
}
