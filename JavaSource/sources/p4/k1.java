package p4;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: MyApplication */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static String f25429a;

    public static synchronized String a(Context context) {
        String str;
        synchronized (k1.class) {
            try {
                if (f25429a == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                    if (string != null) {
                        if (s1.a(true)) {
                        }
                        f25429a = b(string);
                    }
                    string = "emulator";
                    f25429a = b(string);
                }
                str = f25429a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private static String b(String str) {
        for (int i7 = 0; i7 < 3; i7++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format("%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return "";
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return "";
    }
}
