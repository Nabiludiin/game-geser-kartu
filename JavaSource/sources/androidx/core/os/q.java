package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static long f1763a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f1764b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f1765c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f1766d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f1767e;

    /* compiled from: MyApplication */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f1763a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f1764b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f1765c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f1766d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f1767e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e8) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e8);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
