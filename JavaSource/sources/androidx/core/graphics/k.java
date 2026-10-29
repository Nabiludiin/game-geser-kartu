package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: MyApplication */
class k extends o {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f1728b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f1729c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f1730d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f1731e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            cls = null;
            method = null;
            method2 = null;
        }
        f1729c = constructor;
        f1728b = cls;
        f1730d = method2;
        f1731e = method;
    }

    k() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z7) {
        try {
            return ((Boolean) f1730d.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f1728b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1731e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f1730d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f1729c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        Object k7 = k();
        if (k7 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b8 = p.b(context, resources, dVar.b());
            if (b8 == null || !h(k7, b8, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(k7);
    }

    @Override // androidx.core.graphics.o
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        Object k7 = k();
        if (k7 == null) {
            return null;
        }
        r.h hVar = new r.h();
        for (g.b bVar : bVarArr) {
            Uri d8 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(d8);
            if (byteBuffer == null) {
                byteBuffer = p.f(context, cancellationSignal, d8);
                hVar.put(d8, byteBuffer);
            }
            if (byteBuffer == null || !h(k7, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i8 = i(k7);
        if (i8 == null) {
            return null;
        }
        return Typeface.create(i8, i7);
    }
}
