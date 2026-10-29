package v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.oh3;
import com.google.android.gms.internal.ads.ph3;
import com.google.android.gms.internal.ads.qh3;
import com.google.android.gms.internal.ads.uy;
import java.io.IOException;

/* compiled from: MyApplication */
public abstract class d {
    public static void a(Context context) {
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            oh3 i7 = oh3.i(context);
            ph3 i8 = ph3.i(context);
            qh3 a8 = qh3.a(context);
            i7.l();
            i7.m();
            i8.k();
            a8.b(null);
        } catch (IOException e8) {
            r2.t.l().i(e8, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e9) {
            r2.t.l().i(e9, "clearStorageOnIdlessMode_scar");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle b(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.d.b(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static Bundle c(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }
}
