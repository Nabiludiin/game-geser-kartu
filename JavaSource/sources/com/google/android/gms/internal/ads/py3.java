package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class py3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14158a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14159b = 0;

    static {
        Object a8 = a();
        f14158a = a8;
        if (a8 != null) {
            c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (a8 == null) {
            return;
        }
        b(a8);
    }

    private static Object a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e8) {
            throw e8;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b(Object obj) {
        try {
            Method c8 = c("getStackTraceDepth", Throwable.class);
            if (c8 == null) {
                return null;
            }
            c8.invoke(obj, new Throwable());
            return c8;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e8) {
            throw e8;
        } catch (Throwable unused) {
            return null;
        }
    }
}
