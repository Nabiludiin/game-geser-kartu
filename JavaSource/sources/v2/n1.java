package v2;

import android.util.Log;
import com.google.android.gms.internal.ads.y00;

/* compiled from: MyApplication */
public abstract class n1 extends w2.p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26802b = 0;

    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : w2.p.f27094a.d(str)) {
                if (z7) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return w2.p.j(2) && ((Boolean) y00.f19324a.e()).booleanValue();
    }
}
