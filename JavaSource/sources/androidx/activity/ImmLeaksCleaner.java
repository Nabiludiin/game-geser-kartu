package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.lang.reflect.Field;

/* compiled from: MyApplication */
final class ImmLeaksCleaner implements i {

    /* renamed from: b, reason: collision with root package name */
    private static int f124b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f125c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f126d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f127e;

    /* renamed from: a, reason: collision with root package name */
    private Activity f128a;

    ImmLeaksCleaner(Activity activity) {
        this.f128a = activity;
    }

    private static void h() {
        try {
            f124b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f126d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f127e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f125c = declaredField3;
            declaredField3.setAccessible(true);
            f124b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        if (bVar != g.b.ON_DESTROY) {
            return;
        }
        if (f124b == 0) {
            h();
        }
        if (f124b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f128a.getSystemService("input_method");
            try {
                Object obj = f125c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f126d.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f127e.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
