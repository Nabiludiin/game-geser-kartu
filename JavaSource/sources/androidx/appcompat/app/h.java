package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* compiled from: MyApplication */
abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Field f331a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f332b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f333c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f334d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f335e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f336f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f337g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f338h;

    static void a(Resources resources) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return;
        }
        if (i7 >= 24) {
            c(resources);
        } else {
            b(resources);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.h.f332b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.h.f331a = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.h.f332b = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.h.f331a
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b(android.content.res.Resources):void");
    }

    private static void c(Resources resources) {
        Object obj;
        if (!f338h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f337g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
            }
            f338h = true;
        }
        Field field = f337g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e9) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f332b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f331a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
            }
            f332b = true;
        }
        Field field2 = f331a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
            }
        }
        if (obj2 != null) {
            d(obj2);
        }
    }

    private static void d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f334d) {
            try {
                f333c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f334d = true;
        }
        Class cls = f333c;
        if (cls == null) {
            return;
        }
        if (!f336f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f335e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
            }
            f336f = true;
        }
        Field field = f335e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
