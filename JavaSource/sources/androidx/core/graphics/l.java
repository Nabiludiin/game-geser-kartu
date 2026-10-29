package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: MyApplication */
public class l extends j {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f1732g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f1733h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f1734i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f1735j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f1736k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f1737l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f1738m;

    public l() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e8.getClass().getName(), e8);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1732g = cls;
        this.f1733h = constructor;
        this.f1734i = method;
        this.f1735j = method2;
        this.f1736k = method3;
        this.f1737l = method4;
        this.f1738m = method5;
    }

    private Object l() {
        try {
            return this.f1733h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f1737l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1734i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f1735j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f1736k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f1734i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1734i != null;
    }

    @Override // androidx.core.graphics.j, androidx.core.graphics.o
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        if (!q()) {
            return super.a(context, cVar, resources, i7);
        }
        Object l7 = l();
        if (l7 == null) {
            return null;
        }
        e.d[] a8 = cVar.a();
        int length = a8.length;
        int i8 = 0;
        while (i8 < length) {
            e.d dVar = a8[i8];
            Context context2 = context;
            if (!n(context2, l7, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(l7);
                return null;
            }
            i8++;
            context = context2;
        }
        if (p(l7)) {
            return i(l7);
        }
        return null;
    }

    @Override // androidx.core.graphics.j, androidx.core.graphics.o
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        Typeface i8;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (q()) {
            Map h8 = p.h(context, bVarArr, cancellationSignal);
            Object l7 = l();
            if (l7 == null) {
                return null;
            }
            int length = bVarArr.length;
            int i9 = 0;
            boolean z7 = false;
            while (i9 < length) {
                g.b bVar = bVarArr[i9];
                ByteBuffer byteBuffer = (ByteBuffer) h8.get(bVar.d());
                if (byteBuffer == null) {
                    obj = l7;
                } else {
                    boolean o7 = o(l7, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = l7;
                    if (!o7) {
                        m(obj);
                        return null;
                    }
                    z7 = true;
                }
                i9++;
                l7 = obj;
                z7 = z7;
            }
            Object obj2 = l7;
            if (!z7) {
                m(obj2);
                return null;
            }
            if (p(obj2) && (i8 = i(obj2)) != null) {
                return Typeface.create(i8, i7);
            }
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
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g8.e()).setItalic(g8.f()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o
    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        if (!q()) {
            return super.d(context, resources, i7, str, i8);
        }
        Object l7 = l();
        if (l7 == null) {
            return null;
        }
        if (!n(context, l7, str, 0, -1, -1, null)) {
            m(l7);
            return null;
        }
        if (p(l7)) {
            return i(l7);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1732g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1738m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
