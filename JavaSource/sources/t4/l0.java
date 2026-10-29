package t4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* compiled from: MyApplication */
public abstract class l0 {
    public static String a(Context context, String str, String str2) {
        p3.o.m(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = o.a(context);
        }
        return o.b("google_app_id", resources, str2);
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        p3.o.m(strArr);
        p3.o.m(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < min; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i7];
            }
        }
        return null;
    }
}
