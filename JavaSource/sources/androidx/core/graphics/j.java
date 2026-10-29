package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
class j extends o {

    /* renamed from: b, reason: collision with root package name */
    private static Class f1723b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f1724c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f1725d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f1726e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f1727f = false;

    j() {
    }

    private static boolean h(Object obj, String str, int i7, boolean z7) {
        k();
        try {
            try {
                return ((Boolean) f1725d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
            } catch (InvocationTargetException e8) {
                e = e8;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e9) {
            e = e9;
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f1723b, 1);
            Array.set(newInstance, 0, obj);
            try {
                return (Typeface) f1726e.invoke(null, newInstance);
            } catch (InvocationTargetException e8) {
                e = e8;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e9) {
            e = e9;
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1727f) {
            return;
        }
        f1727f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f1724c = constructor;
        f1723b = cls;
        f1725d = method2;
        f1726e = method;
    }

    private static Object l() {
        k();
        try {
            return f1724c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // androidx.core.graphics.o
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        Object l7 = l();
        for (e.d dVar : cVar.a()) {
            File e8 = p.e(context);
            if (e8 == null) {
                return null;
            }
            try {
                if (!p.c(e8, resources, dVar.b())) {
                    return null;
                }
                if (!h(l7, e8.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                e8.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e8.delete();
            }
        }
        return i(l7);
    }

    @Override // androidx.core.graphics.o
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        FileInputStream fileInputStream;
        Typeface c8;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b g8 = g(bVarArr, i7);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g8.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j7 = j(openFileDescriptor);
                try {
                    if (j7 != null && j7.canRead()) {
                        c8 = Typeface.createFromFile(j7);
                        openFileDescriptor.close();
                        return c8;
                    }
                    c8 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c8;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
