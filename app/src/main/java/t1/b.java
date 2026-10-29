package t1;

import android.app.Activity;
import android.graphics.Typeface;
import com.nabil.R;

public abstract class b {
    public static Typeface a(Activity activity) {
        String string = activity.getString(R.string.prefix);
        string.getClass();
        switch (string) {
            case "ar":
                return Typeface.DEFAULT;
            case "ru":
                return Typeface.createFromAsset(activity.getAssets(), "code-new-roman.regular.otf");
            case "uk":
                return Typeface.createFromAsset(activity.getAssets(), "code-new-roman.regular.otf");
            case "vi":
                return Typeface.createFromAsset(activity.getAssets(), "vietnamese-regular.otf");
            default:
                return Typeface.createFromAsset(activity.getAssets(), "bptypewrite.regular.mine.ttf");
        }
    }
}
