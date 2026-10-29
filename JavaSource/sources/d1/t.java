package d1;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: MyApplication */
public abstract class t {

    /* compiled from: MyApplication */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final v f23115a = t.a();
    }

    static v a() {
        try {
            return new w((WebViewProviderFactoryBoundaryInterface) h7.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new i();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, d()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static v c() {
        return a.f23115a;
    }

    public static ClassLoader d() {
        return Build.VERSION.SDK_INT >= 28 ? g.a() : e().getClass().getClassLoader();
    }

    private static Object e() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }
}
