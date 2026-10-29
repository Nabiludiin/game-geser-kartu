package a1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f1a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f2b;

    public static void a(String str) {
        c.a(str);
    }

    public static void b() {
        c.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        boolean isEnabled;
        try {
            if (f2b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f2b == null) {
                f1a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2b.invoke(null, Long.valueOf(f1a))).booleanValue();
        } catch (Exception e8) {
            c("isTagEnabled", e8);
            return false;
        }
    }
}
