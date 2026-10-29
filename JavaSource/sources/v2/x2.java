package v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.i92;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.mr0;
import com.google.android.gms.internal.ads.ox;
import com.google.android.gms.internal.ads.yr0;
import java.io.InputStream;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class x2 {
    /* synthetic */ x2(byte[] bArr) {
    }

    public abstract CookieManager a(Context context);

    public abstract yr0 b(mr0 mr0Var, iu iuVar, boolean z7, i92 i92Var);

    public abstract WebResourceResponse c(String str, String str2, int i7, String str3, Map map, InputStream inputStream);

    public boolean d(Activity activity, Configuration configuration) {
        return false;
    }

    public ox e(Context context, TelephonyManager telephonyManager) {
        return ox.ENUM_UNKNOWN;
    }

    public boolean g(Context context, String str) {
        return false;
    }

    public Intent h(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int j(AudioManager audioManager) {
        return 0;
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void i(Activity activity) {
    }

    public void f(Context context, String str, String str2) {
    }
}
