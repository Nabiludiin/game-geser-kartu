package v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;

/* compiled from: MyApplication */
public final class h1 {

    /* renamed from: b, reason: collision with root package name */
    private static h1 f26770b;

    /* renamed from: a, reason: collision with root package name */
    String f26771a;

    private h1() {
    }

    public static h1 a() {
        if (f26770b == null) {
            f26770b = new h1();
        }
        return f26770b;
    }

    public final void b(Context context) {
        n1.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f26771a)) {
            Context d8 = k3.k.d(context);
            if (!com.google.android.gms.common.util.d.a()) {
                if (d8 == null) {
                    d8 = null;
                }
                this.f26771a = defaultUserAgent;
            }
            SharedPreferences.Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
            if (d8 == null) {
                putString.apply();
            } else {
                com.google.android.gms.common.util.r.a(context, putString, "admob_user_agent");
            }
            this.f26771a = defaultUserAgent;
        }
        n1.k("User agent is updated.");
    }
}
