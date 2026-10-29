package p4;

import android.os.Build;

/* compiled from: MyApplication */
public abstract class s1 {
    public static boolean a(boolean z7) {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
