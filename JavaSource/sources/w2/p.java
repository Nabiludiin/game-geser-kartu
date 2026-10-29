package w2;

import android.util.Log;
import com.google.android.gms.internal.ads.gy3;

/* compiled from: MyApplication */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    protected static final gy3 f27094a = gy3.c(4000);

    public static void a(String str) {
        if (j(3)) {
            if (str.length() <= 4000) {
                Log.d("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f27094a.d(str)) {
                if (z7) {
                    Log.d("Ads", str2);
                } else {
                    Log.d("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void b(String str, Throwable th) {
        if (j(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static void c(String str) {
        if (j(6)) {
            if (str == null || str.length() <= 4000) {
                Log.e("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f27094a.d(str)) {
                if (z7) {
                    Log.e("Ads", str2);
                } else {
                    Log.e("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void d(String str, Throwable th) {
        if (j(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void e(String str) {
        if (j(4)) {
            if (str == null || str.length() <= 4000) {
                Log.i("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f27094a.d(str)) {
                if (z7) {
                    Log.i("Ads", str2);
                } else {
                    Log.i("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void f(String str) {
        if (j(5)) {
            if (str == null || str.length() <= 4000) {
                Log.w("Ads", str);
                return;
            }
            boolean z7 = true;
            for (String str2 : f27094a.d(str)) {
                if (z7) {
                    Log.w("Ads", str2);
                } else {
                    Log.w("Ads-cont", str2);
                }
                z7 = false;
            }
        }
    }

    public static void g(String str, Throwable th) {
        if (j(5)) {
            Log.w("Ads", str, th);
        }
    }

    static String h(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    public static void i(String str, Throwable th) {
        if (j(5)) {
            if (th != null) {
                g(h(str), th);
            } else {
                f(h(str));
            }
        }
    }

    public static boolean j(int i7) {
        return i7 >= 5 || Log.isLoggable("Ads", i7);
    }
}
