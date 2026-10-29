package v2;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.i92;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.mr0;
import com.google.android.gms.internal.ads.ox;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.yr0;

/* compiled from: MyApplication */
public class q2 extends i2 {
    @Override // v2.g2, v2.x2
    public final yr0 b(mr0 mr0Var, iu iuVar, boolean z7, i92 i92Var) {
        return new ft0(mr0Var, iuVar, z7, i92Var);
    }

    @Override // v2.x2
    public final ox e(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        r2.t.g();
        if (!f2.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return ox.ENUM_FALSE;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? ox.ENUM_TRUE : ox.ENUM_FALSE;
    }

    @Override // v2.x2
    public final void f(Context context, String str, String str2) {
        o2.a();
        NotificationChannel a8 = n2.a("offline_notification_channel", "AdMob Offline Notifications", ((Integer) s2.b0.c().d(uy.s9)).intValue());
        a8.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(a8);
    }

    @Override // v2.x2
    public final boolean g(Context context, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // v2.x2
    public final Intent h(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
