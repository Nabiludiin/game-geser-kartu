package v2;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.s00;

/* compiled from: MyApplication */
public abstract class m1 {
    public static void a(Context context) {
        int i7 = w2.m.f27085g;
        if (((Boolean) s00.f15413a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || w2.m.i()) {
                    return;
                }
                a5.d b8 = new c1(context).b();
                int i8 = n1.f26802b;
                w2.p.e("Updating ad debug logging enablement.");
                fm0.a(b8, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e8) {
                w2.p.g("Fail to determine debug setting.", e8);
            }
        }
    }
}
