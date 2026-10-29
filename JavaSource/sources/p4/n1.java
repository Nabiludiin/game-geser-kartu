package p4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MyApplication */
public abstract class n1 {
    public static l1 a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new l1(str2, str3);
    }

    public static void b(Context context, Set set) {
        SharedPreferences.Editor f8;
        m1 m1Var = new m1(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l1 a8 = a(context, str);
            if (a8 == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                f8 = m1Var.f(a8.f25448a);
                f8.remove(a8.f25449b);
            }
        }
        m1Var.c();
    }
}
