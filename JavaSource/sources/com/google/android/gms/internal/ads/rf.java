package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* compiled from: MyApplication */
public abstract class rf {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14884a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f14885b = Log.isLoggable(f14884a, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f14886c = rf.class.getName();

    public static void a(String str, Object... objArr) {
        if (f14885b) {
            Log.v(f14884a, e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d(f14884a, e(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f14884a, e(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f14884a, e(str, objArr), th);
    }

    private static String e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i7 = 2;
        while (true) {
            if (i7 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i7].getClassName().equals(f14886c)) {
                String className = stackTrace[i7].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i7].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            }
            i7++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
