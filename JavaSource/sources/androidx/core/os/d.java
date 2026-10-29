package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: MyApplication */
public abstract class d {

    /* compiled from: MyApplication */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static g a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? g.d(a.a(configuration)) : g.a(configuration.locale);
    }
}
